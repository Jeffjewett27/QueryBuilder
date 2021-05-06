import java.util.HashMap;

public class BuildContext {
    public String rawString;
    public HashMap<String, Integer> captureCounts;

    public BuildContext(String label, String namespace, HashMap<String, SymbolTable> namespaces) {
        captureCounts = new HashMap<>();

        Terms buildvar = namespaces.get(namespace).variables.get(label);
        if (buildvar == null) {
            System.out.println("Build label not found in local namespace: " + label);
            System.exit(1);
        }
        rawString = buildvar.getRawString(namespaces, this);
    }

    public String getCaptureIdent(String namespace, String id) {
        if (namespace.length() == 0) {
            return id;
        }
        return namespace + id;
    }

    public int incrementCapture(String ident) {
        int count = 0;
        if (captureCounts.containsKey(ident)) {
            count = captureCounts.get(ident);
        }
        captureCounts.put(ident, count + 1);
        return count;
    }
}
