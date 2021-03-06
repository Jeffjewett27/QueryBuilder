import java.util.HashMap;
import java.util.List;

public class FuncTerm extends Term {
    public List<Term> arguments;

    public FuncTerm(String id, List<Term> args, String ns) {
        super(Type.FUNCTION, id, ns);
        if (args == null) {
            System.out.println("FuncTerm was passed null arguments");
            System.exit(1);
        }
        arguments = args;
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('{');
        b.append(type);
        b.append(", ");
        b.append(id);
        b.append(',');
        b.append(namespace);
        b.append(',');
        b.append(arguments);
        b.append('}');
        return b.toString();

    }

    @Override public String getRawString(HashMap<String, SymbolTable> namespaces, BuildContext buildContext) {
        Terms func = namespaces.get(namespace).variables.get(id);
        if (!(func instanceof FuncTerms)) {
            System.out.println("Attempted to call " + namespace + "." + id + " as a function");
            System.exit(1);
        }
        FuncTerms terms = (FuncTerms)func;
        return terms.getRawString(namespaces, buildContext, arguments);
    }
}
