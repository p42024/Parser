package org.g5;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.g5.parser.GrammarLexer;
import org.g5.parser.GrammarParser;

import java.io.IOException;

public class Main {
    public static GrammarParser parser;
    public static void main(String[] args) {
         CharStream charStream = readFile("test.nn");
         parseCharStream(charStream);
    }

    public static void parseCharStream(CharStream charStream) {
        GrammarLexer lexer = new GrammarLexer(charStream);
        lexer.addErrorListener(new ErrorListener());
        parser = new GrammarParser(new CommonTokenStream(lexer));

        parser.addParseListener(new ParserListener());
        parser.addErrorListener(new ErrorListener());
        parser.program();
    }

    public static CharStream readFile(String path) {
        try {
            return CharStreams.fromFileName(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
