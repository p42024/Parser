package org.g5;

import org.junit.Test;
import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.g5.parser.GrammarLexer;
import org.g5.parser.GrammarParser;

import java.io.IOException;

public class MainTest {
    @Test
    public void testSomething() {
        assertTrue(true);
    }

    @Test
    public void testSomethingElse() {
        try {
            CharStream charStream = CharStreams.fromFileName("testfiles/testmain");
            GrammarLexer lexer = new GrammarLexer(charStream);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        assertTrue(true);
    }
}
