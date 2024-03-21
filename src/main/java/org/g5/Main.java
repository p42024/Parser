package org.g5;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));

            parser.addParseListener(new ParserListener());
            parser.program();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
