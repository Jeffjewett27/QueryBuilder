import java.util.HashMap;

public class SymbolTable {
    public HashMap<String,Terms> variables;
    public HashMap<String,String> builds;
    public String namespace;

    public SymbolTable(String namespace) {
        variables = new HashMap<>();
        builds = new HashMap<>();
        this.namespace = namespace;
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("{variables: ");
        b.append(variables);
        b.append(", builds: ");
        b.append(builds);
        b.append("}");
        return b.toString();
    }
}
