package org.g5;

import org.g5.parser.GrammarBaseListener;
import org.g5.parser.GrammarParser;

public class ParserListener extends GrammarBaseListener {
    private StringBuilder code = new StringBuilder();

    @Override
    public void enterStatement(GrammarParser.StatementContext ctx) {

    }

    @Override
    public void enterAssignment(GrammarParser.AssignmentContext ctx) {

    }

    @Override
    public void exitAssignment(GrammarParser.AssignmentContext ctx) {
    }

    @Override
    public void enterArithmetic(GrammarParser.ArithmeticContext ctx) {

    }

    public String getCode() {
        return code.toString();
    }
}