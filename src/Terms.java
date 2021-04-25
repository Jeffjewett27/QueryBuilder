import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Terms {
    public List<Term> terms;
    public HashSet<String> parameters;

    public Terms(List<Term> terms) {
        this.terms = terms;
    }

    public Terms() {
        this.terms = new ArrayList<>();
        parameters = new HashSet<>();
    }

    public Terms(HashSet<String> params) {
        parameters = params;
    }

    @Override public String toString() {
        StringBuilder b = new StringBuilder();
        b.append('{');
        b.append(terms.toString());
        b.append(',');
        b.append(parameters);
        b.append('}');
        return b.toString();
    }
}
