import grammar.regexToolBaseListener;
import grammar.regexToolParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class queryBuilderListener extends regexToolBaseListener {

    HashMap<String, SymbolTable> namespaces = new HashMap<>();
    String thisNamespace = "";

    Stack<Terms> termlists = new Stack();
    Stack<Term> looseterms = new Stack<>();

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
        var namespace = new SymbolTable(thisNamespace);
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
        InputStream stream = null;
        try {
            //TODO don't import self
            stream = new FileInputStream(filename);
        } catch (Exception e){
            System.out.println("Could not open file " + filename);
            e.printStackTrace();
            System.exit(1);
        }
        QueryBuilder qb = new QueryBuilder();
        var namespace = qb.parseFile(stream);
        if (namespace.namespace == "") {
            System.out.println("Imported files must have a namespace: " + filename);
            System.exit(1);
        }
        namespaces.put(namespace.namespace, namespace);
    }

    @Override public void exitFuncTerm(regexToolParser.FuncTermContext ctx) {
        String fulltext = ctx.func.name.getText();
        String[] parts = splitIdentifier(fulltext);
        Terms terms = termlists.pop();
        List<Term> arguments = new ArrayList<>(terms.terms);
        Term t = new FuncTerm(parts[1], arguments, parts[0]);
        termlists.peek().terms.add(t);
    }

    @Override public void enterVarTerm(regexToolParser.VarTermContext ctx) {
        String fulltext = ctx.var.getText();
        String[] parts = splitIdentifier(fulltext);
        Term t = new VarTerm(parts[1], parts[0]);
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

    @Override public void enterCapture_stmt(regexToolParser.Capture_stmtContext ctx) {
        String name = ctx.name.getText();
        Terms terms = new Terms();
        termlists.push(terms);
    }

    @Override public void exitCapture_stmt(regexToolParser.Capture_stmtContext ctx) {
        Terms terms = termlists.pop();
        String name = ctx.name.getText();
        if (namespaces.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
            System.exit(1);
        }
        namespaces.get(thisNamespace).variables.put(name, terms);
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
        String raw = namespaces.get(thisNamespace).variables.get(label).getRawString(namespaces);
        namespaces.get(thisNamespace).builds.put(name, raw);
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
        while(matcher.find()) {
            System.out.println("Match " + count + ": " + matcher.group());
            count++;
        }
    }
}
