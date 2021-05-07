import grammar.regexToolBaseListener;
import grammar.regexToolParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.google.code.regexp.Matcher;
import com.google.code.regexp.Pattern;

public class QueryBuilderListener extends regexToolBaseListener {

    HashMap<String, SymbolTable> namespaces = new HashMap<>();
    String thisNamespace = "";

    Stack<Terms> termlists = new Stack();
    Stack<Term> looseterms = new Stack<>();

    public Path path;

    public QueryBuilderListener(Path path) {
        this.path = path;
    }

    public String[] splitIdentifier(String fulltext) {
        String ns = thisNamespace;
        String id = null;
        if (fulltext.indexOf('.') != -1) {
            var split = fulltext.split("\\.");
            ns = split[0];
            id = split[1];
        } else {
            id = fulltext;
        }
        return new String[] {ns, id};
    }

    public String stripQuotes(String str) {
        return str.substring(1,str.length()-1);
    }

    @Override public void enterStart(regexToolParser.StartContext ctx) {
        var namespace = new SymbolTable(path, thisNamespace);
        namespaces.put(thisNamespace, namespace);
    }

    @Override public void exitNamespace(regexToolParser.NamespaceContext ctx) {
        thisNamespace = ctx.name.getText();
        var ns = namespaces.get("");
        ns.namespace = thisNamespace;
        namespaces.remove("");
        namespaces.put(thisNamespace, ns);
    }

    @Override public void enterImportLE(regexToolParser.ImportLEContext ctx) {
        handleImport(stripQuotes(ctx.fname.getText()));
    }

    @Override public void enterImportFE(regexToolParser.ImportFEContext ctx) {
        handleImport(stripQuotes(ctx.fname.getText()));
    }

    public void handleImport(String filename) {
        Path newpath = Paths.get(filename);
        newpath = path.getParent().resolve(newpath);
        if (path.equals(newpath)) {
            System.out.println("Cannot import self-referential files");
            System.exit(1);
        }
        QueryBuilder qb = new QueryBuilder(newpath);
        var namespace = qb.parseFile();
        if (namespace.namespace == "") {
            System.out.println("Imported files must have a namespace: " + filename);
            System.exit(1);
        }
        namespaces.put(namespace.namespace, namespace);
    }

    @Override public void exitFuncTerm(regexToolParser.FuncTermContext ctx) {
        String fulltext = ctx.func.name.getText();
        String[] parts = splitIdentifier(fulltext);
        if (!namespaces.containsKey(parts[0])) {
            System.out.println("No namespace exists called " + parts[0] + " for " + fulltext);
            System.exit(1);
        }
        Terms terms = termlists.pop();
        List<Term> arguments = new ArrayList<>(terms.terms);
        Term t = new FuncTerm(parts[1], arguments, parts[0]);
        termlists.peek().terms.add(t);
    }

    @Override public void enterVarTerm(regexToolParser.VarTermContext ctx) {
        String fulltext = ctx.var.getText();
        String[] parts = splitIdentifier(fulltext);
        if (!namespaces.containsKey(parts[0])) {
            System.out.println("No namespace exists called " + parts[0] + " for " + fulltext);
            System.exit(1);
        }
        var captype = namespaces.get(parts[0]).captured.get(parts[1]);
        Term t = new VarTerm(parts[1], parts[0], captype);
        //looseterms.push(t);
        termlists.peek().terms.add(t);
    }

    @Override public void enterQuoteTerm(regexToolParser.QuoteTermContext ctx) {
        String fulltext = ctx.getText();
        String text = stripQuotes(fulltext);
        Term t = new QuoteTerm(text);
        //looseterms.push(t);
        termlists.peek().terms.add(t);
    }

    @Override public void enterArgHead(regexToolParser.ArgHeadContext ctx) {
        Terms terms = new Terms();
        termlists.add(terms);
        Term t = new QuoteTerm(ctx.val.getText());
        //terms.terms.add(t);
    }

    @Override public void enterLabel_stmt(regexToolParser.Label_stmtContext ctx) {
        String name = ctx.name.getText();
        Terms terms = new Terms();
        termlists.push(terms);
    }

    @Override public void exitLabel_stmt(regexToolParser.Label_stmtContext ctx) {
        Terms terms = termlists.pop();
        String name = ctx.name.getText();
        if (namespaces.get(thisNamespace).variables.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
            System.exit(1);
        }
        namespaces.get(thisNamespace).variables.put(name, terms);
    }

    @Override public void enterCaptureSingle(regexToolParser.CaptureSingleContext ctx) {
        String name = ctx.name.getText();
        Terms terms = new Terms();
        termlists.push(terms);
    }

    @Override public void enterCaptureArray(regexToolParser.CaptureArrayContext ctx) {
        String name = ctx.name.getText();
        Terms terms = new Terms();
        termlists.push(terms);
    }

    @Override public void exitCaptureSingle(regexToolParser.CaptureSingleContext ctx) {
        Terms terms = termlists.pop();
        String name = ctx.name.getText();
        if (namespaces.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
            System.exit(1);
        }
        SymbolTable ns = namespaces.get(thisNamespace);
        ns.variables.put(name, terms);
        ns.captured.put(name, VarTerm.CaptureType.Single);
    }

    @Override public void exitCaptureArray(regexToolParser.CaptureArrayContext ctx) {
        Terms terms = termlists.pop();
        String name = ctx.name.getText();
        if (namespaces.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
            System.exit(1);
        }
        SymbolTable ns = namespaces.get(thisNamespace);
        ns.variables.put(name, terms);
        ns.captured.put(name, VarTerm.CaptureType.Array);
    }

    @Override public void enterParam_list(regexToolParser.Param_listContext ctx) {
        termlists.add(new Terms());
    }

    @Override public void exitParam_list(regexToolParser.Param_listContext ctx) {
        termlists.add(new Terms());
    }

    @Override public void enterParam(regexToolParser.ParamContext ctx) {
        Term t = new VarTerm(ctx.getText(), thisNamespace);
        termlists.peek().terms.add(t);
    }

    @Override public void exitFunc_stmt(regexToolParser.Func_stmtContext ctx) {
        Terms terms = termlists.pop();
        Terms paramTerms = termlists.pop();
        HashMap<String, Integer> params = new HashMap<>();
        int idx = 0;
        for (var term : paramTerms.terms) {
            params.put(term.id, idx++);
        }
        FuncTerms fterms = new FuncTerms(terms.terms, params);
        String name = ctx.name.getText();
        if (namespaces.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
            System.exit(1);
        }
        namespaces.get(thisNamespace).variables.put(name, fterms);
    }

    @Override public void exitBuild_stmt(regexToolParser.Build_stmtContext ctx) {
        String name = ctx.name.getText();
        String label = ctx.label.getText();
        String flags = "";
        if (ctx.flags != null) {
            flags = ctx.flags.getText();
        }
        //TODO flags are hard
        BuildContext buildContext = new BuildContext(label, thisNamespace, namespaces);
        namespaces.get(thisNamespace).builds.put(name, buildContext.rawString);
        namespaces.get(thisNamespace).buildContexts.put(name, buildContext);
    }

    @Override public void exitTestQuote(regexToolParser.TestQuoteContext ctx) {
        String inputfname = ctx.input.getText();
        String buildname = ctx.build.getText();
        var parts = splitIdentifier(buildname);
        String namespace = parts[0];
        buildname = parts[1];
        String output = ctx.output.getText();

        String absInput = getAbsolutePath(inputfname);
        String absOutput = getAbsolutePath(output);

        /*String newpathstr = null;
        if (output.length() > 0) {
            Path newpath = Paths.get(stripQuotes(output));
            newpath = path.getParent().resolve(newpath);
            if (path.equals(newpath)) {
                System.out.println("Cannot import self-referential files");
                System.exit(1);
            }
            newpathstr = newpath.toAbsolutePath().toString();
        }*/

        BufferedReader reader = null;
        String input = null;
        try {
            FileInputStream stream = new FileInputStream(absInput);
            reader = new BufferedReader(new InputStreamReader(stream));
            input = reader.lines().collect(Collectors.joining());
        } catch (Exception e){
            System.out.println("Could not open file " + inputfname);
            e.printStackTrace();
            System.exit(1);
        }
        BuildContext context = namespaces.get(namespace).buildContexts.get(buildname);
        Tester tester = new Tester(namespaces, namespaces.get(namespace), input, output, context);
    }

    @Override public void exitTestConst(regexToolParser.TestConstContext ctx) {
        String inputType = ctx.input.getText();
        if (!inputType.equals("@STDIN")) {
            System.out.println("Test input flag must refer to a valid input (i.e. @STDIN): " + inputType);
        }
        String buildname = ctx.build.getText();
        var parts = splitIdentifier(buildname);
        String namespace = parts[0];
        buildname = parts[1];
        String build = namespaces.get(namespace).builds.get(buildname);
        String output = ctx.output.getText();

        String absOutput = getAbsolutePath(output);
        /*String newpathstr = null;
        if (output.length() > 0) {
            Path newpath = Paths.get(stripQuotes(output));
            newpath = path.getParent().resolve(newpath);
            if (path.equals(newpath)) {
                System.out.println("Cannot import self-referential files");
                System.exit(1);
            }
            newpathstr = newpath.toAbsolutePath().toString();
        }*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            System.out.print("test string> ");
            input = br.readLine();
        } catch (Exception e) {
            System.out.println("Could not read input for test");
            e.printStackTrace();
            System.exit(1);
        }
        BuildContext context = namespaces.get(namespace).buildContexts.get(buildname);
        if (context == null) {
            System.out.println("Could not execute test without a recognized build: " + buildname);
            System.exit(1);
        }
        Tester tester = new Tester(namespaces, namespaces.get(namespace), input, absOutput, context);
    }

    public String getAbsolutePath(String relative) {
        String newpathstr = null;
        if (relative.length() > 0) {
            Path newpath = Paths.get(stripQuotes(relative));
            newpath = path.getParent().resolve(newpath);
            if (path.equals(newpath)) {
                System.out.println("Cannot import self-referential files");
                System.exit(1);
            }
            newpathstr = newpath.toAbsolutePath().toString();
        }
        return newpathstr;
    }
}
