import java.util.HashMap;

public class QuoteTerm extends Term {

    public QuoteTerm(String id) {
        super(Type.QUOTE, id, "");
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('{');
        b.append(type);
        b.append(", ");
        b.append(id);
        b.append('}');
        return b.toString();

    }

    @Override public String getRawString(HashMap<String, SymbolTable> namespaces, BuildContext buildContext) {
        return id;
    }
}
