package grammar;

import java.util.HashMap;

public class queryBuilderListener extends regexToolBaseListener {

    HashMap<String,Integer> symbols = new HashMap<String,Integer>();

    @Override public void exitStart(regexToolParser.StartContext ctx) {
        System.out.println("EOF");
        System.out.println("Symbols: " + symbols);
    }
}
