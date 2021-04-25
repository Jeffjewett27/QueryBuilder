/*import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;*/
import org.antlr.v4.runtime.*;
import grammar.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.MissingFormatArgumentException;

public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream(args[0]);
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        regexToolLexer lexer = new regexToolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        regexToolParser parser = new regexToolParser(tokens);
        parser.start();
        System.out.println("errors: " + parser.getNumberOfSyntaxErrors());
        //System.out.println(parser.getSerializedATN());


        //Assuming valid input, begin analysis

    };
}
