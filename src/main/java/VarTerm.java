import grammar.regexToolParser;

import java.util.HashMap;

public class VarTerm extends Term {
    public enum CaptureType {
        None,
        Single,
        Array
    }

    public CaptureType captureType;

    public VarTerm(String id, String ns) {
        super(Type.VARIABLE, id, ns);
        captureType = CaptureType.None;
    }

    public VarTerm(String id, String ns, CaptureType captureType) {
        super(Type.VARIABLE, id, ns);
        this.captureType = (captureType != null) ? captureType : CaptureType.None;
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

    @Override public String getRawString(HashMap<String, SymbolTable> namespaces, BuildContext buildContext) {
        SymbolTable ns = namespaces.get(namespace);
        Terms terms = ns.variables.get(id);
        if (terms == null) {
            System.out.println("Attempted use of undefined variable: " + namespace + "." + id);
            System.exit(1);
        }
        String prefix = "";
        String suffix = "";
        if (captureType != CaptureType.None) {
            String capid = buildContext.getCaptureIdent(ns.isMainTable ? "" : namespace, id);
            int capcount = buildContext.incrementCapture(capid);
            if (captureType == CaptureType.Single) {
                if (capcount > 1) {
                    return "\\k<" + capid + ">";
                }
            } else {
                capid += capcount;
            }
            prefix = "(?<" + capid + ">";
            suffix = ")";
        }
        String contents = terms.getRawString(namespaces, buildContext);
        return prefix + contents + suffix;
    }
}
