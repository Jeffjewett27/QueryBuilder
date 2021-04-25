import org.antlr.v4.runtime.*;
import grammar.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.MissingFormatArgumentException;


public class QueryBuilder {
    public void parseFile(InputStream file) {
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(file);
        } catch (IOException error) {
            error.printStackTrace();
            return;
        }

        regexToolLexer lexer = new regexToolLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        regexToolParser parser = new regexToolParser(tokens);
        regexToolParser.StartContext startContext = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        queryBuilderListener listener = new queryBuilderListener();

        walker.walk(listener,startContext);
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { throw new MissingFormatArgumentException("Missing argument"); }

        InputStream stream = new FileInputStream(args[0]);
        QueryBuilder qb = new QueryBuilder();
        qb.parseFile(stream);
    }
}
