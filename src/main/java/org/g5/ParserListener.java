package org.g5;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.g5.parser.GrammarBaseListener;
import org.g5.parser.GrammarParser;

import java.util.*;

public class ParserListener extends GrammarBaseListener {
    private StringBuilder pythonCode = new StringBuilder();

    public String getPythonCode() {
        return pythonCode.toString();
    }
}