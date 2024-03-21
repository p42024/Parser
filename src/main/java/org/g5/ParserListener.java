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
        String id = ctx.ID(0).getText();
        code.append(id).append(" = ");
    }

    @Override
    public void exitAssignment(GrammarParser.AssignmentContext ctx) {
        code.append(";\n");
    }

    @Override
    public void enterArithmetic(GrammarParser.ArithmeticContext ctx) {
        code.append(ctx.getText());
    }

    public String getCode() {
        return code.toString();
    }
}