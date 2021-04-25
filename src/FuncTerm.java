public class FuncTerm extends Term {
    public Terms arguments;

    public FuncTerm(String id, Terms terms) {
        super(Type.FUNCTION, id);
        arguments = terms;
    }

    public FuncTerm(String id, Terms terms, String ns) {
        super(Type.FUNCTION, id, ns);
        arguments = terms;
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
}
