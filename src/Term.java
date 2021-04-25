public class Term {
    public enum Type {
        VARIABLE,
        FUNCTION,
        QUOTE
    }
    public Type type;
    public String id;
    public String namespace;

    public Term(Type type, String id, String namespace) {
        this.type = type;
        this.id = id;
        this.namespace = namespace;
    }

    public Term(Type type, String id) {
        this.type = type;
        this.id = id;
        this.namespace = "";
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
}
