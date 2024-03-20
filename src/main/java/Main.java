import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a CharStream that reads from a file
        System.out.println(System.getProperty("user.dir"));
        CharStream input = CharStreams.fromFileName("test.txt");

        // Create a lexer that feeds off of input CharStream
        StatementLexer lexer = new StatementLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        StatementParser parser = new StatementParser(tokens);

        // Begin parsing at rule 'r', where 'r' is the name of a parser rule defined in your grammar
        ParseTree tree = parser.prog();

        // Walk the tree and trigger callbacks
        StatementBaseListener listener = new StatementBaseListener();
        ParseTreeWalker.DEFAULT.walk(listener, tree);

    }
}