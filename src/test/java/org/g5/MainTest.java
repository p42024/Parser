package org.g5;

import org.antlr.v4.runtime.Token;
import org.g5.parser.GrammarLexer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    public void AssignmentTestOne() {
        // The expected tokens from the file.
        String[] expected = {"ID", "ASSIGN", "RELU", "ARROW", "INT"};

        try {
            // Get the lexer
            CharStream charStream = CharStreams.fromFileName("testfiles/AssignmentTestOne");
            GrammarLexer lexer = new GrammarLexer(charStream);
            
            // Add an error listener.
            TestErrorListener errorListener = new TestErrorListener();
			lexer.addErrorListener(errorListener);

            // Convert the names from the lexer to an array of strings.
            List<String> names = new ArrayList<>();
            for (Token token : lexer.getAllTokens()) {
                int id = token.getType();
                names.add(GrammarLexer.VOCABULARY.getSymbolicName(id));
            }
            String[] received = names.toArray(new String[0]);
                
            // Fail if any errors were generated.
            if (errorListener.HasFailed()) {
                System.err.println("The test generated errors!");
                assertTrue(false);
            }

            // Test if the expected and received strings actually match.
            if (TestUtil.compareStrings(expected, received)) {
                assertTrue(true);
                return;
            }
            else {
                // Print some useful information to the error log.
                System.err.println("The tokens received did not match the tokens expected!");
                System.err.println("Expected:");
                TestUtil.printArr(expected, System.err);
                System.err.println();
                System.err.println("Received:");
                TestUtil.printArr(received, System.err);
                System.err.println();

                // Make sure the test fails!
                assertTrue(false);
            }
        } catch (IOException e) {
            System.err.println("Either couldn't read/find or parse the test file!");
            assertTrue(false);
            throw new RuntimeException(e);
        }
    }

    @Test
    public void FailTestOne() {
        try {
            // Get the lexer
            CharStream charStream = CharStreams.fromFileName("testfiles/FailTestOne");
            GrammarLexer lexer = new GrammarLexer(charStream);

            // Attach an error listener to the lexer.
            TestErrorListener errorListener = new TestErrorListener();
            lexer.removeErrorListeners(); // Silence the errors. We mean it to fail
			lexer.addErrorListener(errorListener);

            // Invoke the lexer, so it actually parses the file.
            lexer.getAllTokens();

            if (errorListener.HasFailed()) {
                assertTrue(true);
            }
            else {
                System.err.println("The test did not generate any errors, which is not intended!");
                assertTrue(false);
            }
        }
        catch (Exception e) {
            System.err.println("Either couldn't read/find or parse the test file!");
            assertTrue(false);
            throw new RuntimeException(e);
        }
    }

    @Test
    public void IfTestOne() {
        // The expected tokens from the file.
        String[] expected = {
            "IF", "NOT", "OPEN_PAREN",
            "TRUE", "AND",
            "FALSE", "CLOSED_PAREN", "OPEN_BRACK",
            "ID", "ASSIGN", "SIGMOID",
            "ARROW", "INT", "DELIMITER",
            "CLOSE_BRACK", "ELSE", "OPEN_BRACK",
            "ID", "ASSIGN", "TANH",
            "ARROW", "INT", "DELIMITER",
            "CLOSE_BRACK"
        };

        try {
            // Get the lexer
            CharStream charStream = CharStreams.fromFileName("testfiles/IfTestOne");
            GrammarLexer lexer = new GrammarLexer(charStream);
            
            // Add an error listener.
            TestErrorListener errorListener = new TestErrorListener();
			lexer.addErrorListener(errorListener);

            // Convert the names from the lexer to an array of strings.
            List<String> names = new ArrayList<>();
            for (Token token : lexer.getAllTokens()) {
                int id = token.getType();
                names.add(GrammarLexer.VOCABULARY.getSymbolicName(id));
            }
            String[] received = names.toArray(new String[0]);
                
            // Fail if any errors were generated.
            if (errorListener.HasFailed()) {
                System.err.println("The test generated errors!");
                assertTrue(false);
            }

            // Test if the expected and received strings actually match.
            if (TestUtil.compareStrings(expected, received)) {
                assertTrue(true);
                return;
            }
            else {
                // Print some useful information to the error log.
                System.err.println("The tokens received did not match the tokens expected!");
                System.err.println("Expected:");
                TestUtil.printArr(expected, System.err);
                System.err.println();
                System.err.println("Received:");
                TestUtil.printArr(received, System.err);
                System.err.println();

                // Make sure the test fails!
                assertTrue(false);
            }
        } catch (IOException e) {
            System.err.println("Either couldn't read/find or parse the test file!");
            assertTrue(false);
            throw new RuntimeException(e);
        }
    }
}
