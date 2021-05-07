import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FuncTerms extends Terms {

    public HashMap<String, Integer> parameters;

    public FuncTerms(List<Term> terms, HashMap<String, Integer> params) {
        super(terms);
        parameters = params;
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('{');
        b.append(terms.toString());
        b.append(',');
        b.append(parameters);
        b.append('}');
        return b.toString();
    }

    public String getRawString(HashMap<String, SymbolTable> namespaces, BuildContext buildContext, List<Term> arguments) {
        if (parameters.size() != arguments.size()) {
            System.out.println("Function was called with " + arguments.size() + " arguments, but required " + parameters.size());
        }
        StringBuilder b = new StringBuilder();
        for (Term t : terms) {
            if (parameters.containsKey(t.id)) {
                Term argterm = arguments.get(parameters.get(t.id));
                b.append(argterm.getRawString(namespaces, buildContext));
            } else {
                b.append(t.getRawString(namespaces, buildContext));
            }
        }
        return b.toString();
    }
}
