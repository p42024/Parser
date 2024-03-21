package org.g5;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.g5.parser.GrammarLexer;
import org.g5.parser.GrammarParser;
import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class MainTest {
    private static void printArr(String[] s1, PrintStream stream) {
        boolean first = true;
        for (String string : s1) {
            if (first) {
                stream.print(string);
                first = false;
            }
            else stream.print(", " + string);
        }
    }
    private static void printArr(List<String> s1, PrintStream stream) {
        boolean first = true;
        for (String string : s1) {
            if (first) {
                stream.print(string);
                first = false;
            }
            else stream.print(", " + string);
        }
    }
    private static boolean compareStrings(String[] s1, String[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(s2[i])) continue;
            else return false;
        }
        return true;
    }
    private static boolean compareStrings(List<String> s1, List<String> s2) {
        for (int i = 0; i < s1.size(); i++) {
            if (s1.get(i).equals(s2.get(i))) continue;
            else return false;
        }
        return true;
    }

    public static class ErrorListener implements ANTLRErrorListener {
        private boolean hasFailed = false;

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
				String msg, RecognitionException e) {
            hasFailed = true;
		}

		@Override
		public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
				BitSet ambigAlts, ATNConfigSet configs) {
            hasFailed = true;
		}

		@Override
		public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
				BitSet conflictingAlts, ATNConfigSet configs) {
            hasFailed = true;
		}

		@Override
		public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
				ATNConfigSet configs) {
            hasFailed = true;
		}

    } 

    @Test
    public void maintest() {
        String[] expected = {"ID", "EQ", "RELU", "ARROW", "INT"};

        try {
            CharStream charStream = CharStreams.fromFileName("testfiles/testmain");
            GrammarLexer lexer = new GrammarLexer(charStream);

            List<String> names = new ArrayList<>();
            for (Token token : lexer.getAllTokens()) {
                int id = token.getType();
                names.add(GrammarLexer.VOCABULARY.getSymbolicName(id));
            }
            String[] name_arr = names.toArray(new String[0]);

            if (compareStrings(expected, name_arr)) {
                assertTrue(true);
                return;
            }
            else {
                System.err.println("The tokens received did not match the tokens expected!");
                System.err.println("Expected:");
                printArr(expected, System.err);
                System.err.println();

                System.err.println("Received:");
                printArr(name_arr, System.err);
                System.err.println();

                assertTrue(false);
                return;
            }
        } catch (IOException e) {
            System.err.println("Either couldn't read/find or parse the test file!");
            assertTrue(false);
            throw new RuntimeException(e);
        }

    }

    @Test
    public void failtest1() {
        try {
            ErrorListener errorListener = new ErrorListener();
            CharStream charStream = CharStreams.fromFileName("testfiles/failtest1");
            
            GrammarLexer lexer = new GrammarLexer(charStream);
            lexer.removeErrorListeners();
			lexer.addErrorListener(errorListener);


            List<String> names = new ArrayList<>();
            for (Token token : lexer.getAllTokens()) {
                int id = token.getType();
                names.add(GrammarLexer.VOCABULARY.getSymbolicName(id));
            }
            String[] name_arr = names.toArray(new String[0]);

            long timer = System.currentTimeMillis() + 2000;
            while (timer > System.currentTimeMillis()) {}

            if (errorListener.hasFailed) {
                assertTrue(true);
            }
            else {
                System.err.println("The test did not fail, which is not intended!");
                assertTrue(false);
            }
        }
        catch (Exception e) {
            System.err.println("Either couldn't read/find or parse the test file!");
            assertTrue(false);
            throw new RuntimeException(e);
        }


    }
}
