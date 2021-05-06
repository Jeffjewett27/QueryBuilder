import org.antlr.v4.runtime.*;
import grammar.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.MissingFormatArgumentException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class QueryBuilder {
    public Path path;
    public InputStream stream;

    public QueryBuilder(Path path) {
        this.path = path;

        stream = null;
        try {
            //TODO don't import self
            stream = new FileInputStream(path.toAbsolutePath().toFile());
        } catch (Exception e){
            System.out.println("Could not open file at " + path.toAbsolutePath().toString());
            e.printStackTrace();
            System.exit(1);
        }
    }
    public SymbolTable parseFile() {
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(stream);
        } catch (IOException error) {
            error.printStackTrace();
            return null;
        }

        regexToolLexer lexer = new regexToolLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        regexToolParser parser = new regexToolParser(tokens);
        regexToolParser.StartContext startContext = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        QueryBuilderListener listener = new QueryBuilderListener(path);

        walker.walk(listener,startContext);
        return listener.namespaces.get(listener.thisNamespace);
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { throw new MissingFormatArgumentException("Missing argument"); }

        InputStream stream = new FileInputStream(args[0]);
        QueryBuilder qb = new QueryBuilder(Paths.get(args[0]));
        qb.parseFile();
    }
}
