import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Terms {
    public List<Term> terms;

    public Terms(List<Term> terms) {
        this.terms = terms;
    }

    public Terms() {
        this.terms = new ArrayList<>();
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('{');
        b.append(terms.toString());
        b.append('}');
        return b.toString();
    }

    public String getRawString(HashMap<String, SymbolTable> namespaces, BuildContext buildContext) {
        StringBuilder b = new StringBuilder();
        for (Term t : terms) {
            b.append(t.getRawString(namespaces, buildContext));
        }
        return b.toString();
    }
}
