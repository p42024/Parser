package org.g5;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.g5.parser.GrammarBaseListener;
import org.g5.parser.GrammarLexer;
import org.g5.parser.GrammarParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        readFile("test.nn");
    }

    public static void readFile(String path) {
        try {
            CharStream charStream = CharStreams.fromFileName(path);
            GrammarLexer lexer = new GrammarLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
    
            // Print out the tokens
            tokens.fill();
            for (Token token : tokens.getTokens()) {
                System.out.println(token.toString());
            }
    
            GrammarParser parser = new GrammarParser(tokens);
            ParseTree tree = parser.program();
    
            ParserListener listener = new ParserListener();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener, tree);
    
            // Get the Python code
            String pythonCode = listener.getPythonCode();
            System.out.println(pythonCode);
    
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}