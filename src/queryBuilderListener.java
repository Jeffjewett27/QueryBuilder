import grammar.regexToolBaseListener;
import grammar.regexToolParser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class queryBuilderListener extends regexToolBaseListener {

    HashMap<String,Terms> labels = new HashMap<String,Terms>();

    Stack<Terms> termlists = new Stack();
    Stack<Term> looseterms = new Stack<>();

    public String[] splitIdentifier(String fulltext) {
        String ns = "";
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

    @Override public void exitStart(regexToolParser.StartContext ctx) {
        System.out.println("EOF");
        System.out.println("Symbols: " + labels);
    }

    @Override public void exitFuncTerm(regexToolParser.FuncTermContext ctx) {
        System.out.println("func: " + ctx.func.name.getText());
        String fulltext = ctx.func.name.getText();
        String[] parts = splitIdentifier(fulltext);
        Terms terms = termlists.pop();
        Term t = new FuncTerm(parts[1], terms, parts[0]);
        termlists.peek().terms.add(t);
    }

    @Override public void enterVarTerm(regexToolParser.VarTermContext ctx) {
        System.out.println("var: " + ctx.getText());
        String fulltext = ctx.var.getText();
        String[] parts = splitIdentifier(fulltext);
        Term t = new Term(Term.Type.VARIABLE, parts[1], parts[0]);
        //looseterms.push(t);
        termlists.peek().terms.add(t);
    }

    @Override public void enterQuoteTerm(regexToolParser.QuoteTermContext ctx) {
        System.out.println("quote: " + ctx.getText());
        Term t = new Term(Term.Type.QUOTE, ctx.getText());
        //looseterms.push(t);
        termlists.peek().terms.add(t);
    }

    @Override public void enterArgHead(regexToolParser.ArgHeadContext ctx) {
        Terms terms = new Terms();
        termlists.add(terms);
        Term t = new Term(Term.Type.QUOTE, ctx.val.getText());
        //terms.terms.add(t);
    }

    /*@Override public void enterArgListTail(regexToolParser.ArgListTailContext ctx) {
        Terms terms = termlists.peek();
        Term t = new Term(Term.Type.QUOTE, ctx.val.getText());
        terms.terms.add(t);
    }*/

    @Override public void exitArgListDone(regexToolParser.ArgListDoneContext ctx) {
        System.out.println(termlists.peek().terms);
    }

    @Override public void enterLabel_stmt(regexToolParser.Label_stmtContext ctx) {
        String name = ctx.name.getText();
        Terms terms = new Terms();
        termlists.push(terms);
    }

    @Override public void exitLabel_stmt(regexToolParser.Label_stmtContext ctx) {
        Terms terms = termlists.pop();
        String name = ctx.name.getText();
        if (labels.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
        }
        labels.put(name, terms);
    }

    @Override public void enterCapture_stmt(regexToolParser.Capture_stmtContext ctx) {
        String name = ctx.name.getText();
        Terms terms = new Terms();
        termlists.push(terms);
    }

    @Override public void exitCapture_stmt(regexToolParser.Capture_stmtContext ctx) {
        Terms terms = termlists.pop();
        String name = ctx.name.getText();
        if (labels.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
        }
        labels.put(name, terms);
    }

    @Override public void enterParam_list(regexToolParser.Param_listContext ctx) {
        termlists.add(new Terms());
    }

    @Override public void exitParam_list(regexToolParser.Param_listContext ctx) {
        termlists.add(new Terms());
    }

    @Override public void enterParam(regexToolParser.ParamContext ctx) {
        Term t = new Term(Term.Type.VARIABLE, ctx.getText());
        termlists.peek().terms.add(t);
    }

    @Override public void exitFunc_stmt(regexToolParser.Func_stmtContext ctx) {
        Terms terms = termlists.pop();
        Terms paramTerms = termlists.pop();
        HashSet<String> params = new HashSet<>();
        for (var term : paramTerms.terms) {
            params.add(term.id);
        }
        terms.parameters = params;
        String name = ctx.name.getText();
        if (labels.containsKey(name)) {
            System.out.println("Cannot overwrite an existing label or function name: " + name);
        }
        var test = labels.put(name, terms);
    }
}
