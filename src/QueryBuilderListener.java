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
    }

    @Override public void exitTestQuote(regexToolParser.TestQuoteContext ctx) {
        String filename = stripQuotes(ctx.input.getText());
        String buildname = ctx.build.getText();
        BufferedReader reader = null;
        try {
            FileInputStream stream = new FileInputStream(filename);
            reader = new BufferedReader(new InputStreamReader(stream));
        } catch (Exception e){
            System.out.println("Could not open file " + filename);
            e.printStackTrace();
            System.exit(1);
        }
        String build = namespaces.get(thisNamespace).builds.get(buildname);
        String input = reader.lines().collect(Collectors.joining());

        testRegex(build,input);
    }

    @Override public void exitTestConst(regexToolParser.TestConstContext ctx) {
        String inputType = ctx.input.getText();
        if (!inputType.equals("@STDIN")) {
            System.out.println("Test input flag must refer to a valid input (i.e. @STDIN): " + inputType);
        }
        String buildname = ctx.build.getText();
        String build = namespaces.get(thisNamespace).builds.get(buildname);

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
        testRegex(build,input);
    }

    public void testRegex(String build, String input) {
        Pattern pattern = Pattern.compile(build);
        Matcher matcher = pattern.matcher(input);

        int count = 1;
        System.out.println("Showing matches for query: " + build);
        if (matcher.find()) {
            System.out.println("Match " + count + ": " + matcher.group());

            var namedGroups = matcher.namedGroups();
            System.out.println(namedGroups);
            count++;
        }
    }

    @SuppressWarnings("unchecked")
    private static Map<String, Integer> getNamedGroups(Pattern regex) {
        try {
            Method namedGroupsMethod = Pattern.class.getDeclaredMethod("namedGroups");
            namedGroupsMethod.setAccessible(true);

            Map<String, Integer> namedGroups = null;
            namedGroups = (Map<String, Integer>) namedGroupsMethod.invoke(regex);

            if (namedGroups == null) {
                throw new InternalError();
            }

            return Collections.unmodifiableMap(namedGroups);

        } catch (Exception e) {
            // Just an example here. You need to handle the Exception properly
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
