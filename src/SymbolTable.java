import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;

public class SymbolTable {
    public HashMap<String,Terms> variables;
    public HashMap<String,String> builds;
    public HashMap<String, VarTerm.CaptureType> captured;
    public HashMap<String, BuildContext> buildContexts;
    public String namespace;
    public Path path;
    public boolean isMainTable;

    public SymbolTable(Path path, String namespace) {
        variables = new HashMap<>();
        builds = new HashMap<>();
        buildContexts = new HashMap<>();
        captured = new HashMap<>();
        this.namespace = namespace;
        this.path = path;
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
