package org.g5;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.g5.parser.GrammarLexer;
import org.g5.parser.GrammarParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream charStream = CharStreams.fromFileName("testfiles/test_main");
            GrammarLexer lexer = new GrammarLexer(charStream);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));

            ParseTree topTree = parser.program();

            Visitor visitor = new Visitor();
            visitor.visit(topTree);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
