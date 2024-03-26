package org.g5;

import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser;
import org.g5.parser.GrammarParser.StringContext;
import org.g5.types.Layer;
import org.g5.types.Model;
import org.g5.types.SequentialContainer;

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
        //System.out.print("---- Assignment ---- \nId: " + ctx.id().getText() + "\nExpressions: " + visitChildren(ctx.expression()) + "\n\n");
        return super.visitStatementAssignment(ctx);
    }

    @Override
    public String visitActivationReLU(GrammarParser.ActivationReLUContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitActivationSigmoid(GrammarParser.ActivationSigmoidContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitActivationTanh(GrammarParser.ActivationTanhContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitSequentialContainerModel(GrammarParser.SequentialContainerModelContext ctx) {
        System.out.println(ctx.layer(0));
        return new Model(new SequentialContainer(ctx));
    }


}