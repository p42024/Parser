package org.g5;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.g5.parser.GrammarLexer;
import org.g5.parser.GrammarParser;

import java.io.IOException;
import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        readFile("test.nn");
    }

    public static void readFile(String path) {
        try {
            CharStream charStream = CharStreams.fromFileName(path);
            GrammarLexer lexer = new GrammarLexer(charStream);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));

            ParseTree topTree = parser.program();
            Visitor visitor = new Visitor();

            // Start the visitor
            visitor.visit(topTree);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
