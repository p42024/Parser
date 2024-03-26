package org.g5;

import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser;
import org.g5.parser.GrammarParser.StringContext;
import org.g5.types.Layer;

public class Visitor extends GrammarBaseVisitor<Object> {
    @Override
    public String visitString(StringContext ctx) {
        String txt = ctx.getText();

        txt = txt.substring(1, txt.length() - 1);

        return txt;
    }

    @Override
    public Integer visitInt(GrammarParser.IntContext ctx) {
        Integer parsedInteger = Integer.parseInt(ctx.getText());
        return parsedInteger;
    }

    @Override
    public Float visitFloat(GrammarParser.FloatContext ctx) {
        Float parsedFloat = Float.parseFloat(ctx.getText());
        return parsedFloat;
    }

    @Override
    public Layer visitLayer(GrammarParser.LayerContext ctx) {
        return new Layer(ctx);
    }

    @Override
    public Object visitStatementAssignment(GrammarParser.StatementAssignmentContext ctx) {
        System.out.print("---- Assignment ---- \nId: " + ctx.id().getText() + "\nExpressions: " + visitChildren(ctx.expression()) + "\n\n");
        return super.visitStatementAssignment(ctx);
    }
}