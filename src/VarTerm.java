import java.util.HashMap;

public class VarTerm extends Term {

    public VarTerm(String id, String ns) {
        super(Type.VARIABLE, id, ns);
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('{');
        b.append(type);
        b.append(", ");
        b.append(id);
        b.append(',');
        b.append(namespace);
        b.append('}');
        return b.toString();

    }

    @Override public String getRawString(HashMap<String, SymbolTable> namespaces) {
        Terms terms = namespaces.get(namespace).variables.get(id);
        return terms.getRawString(namespaces);
    }
}
