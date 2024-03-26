package org.g5;

import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser;
import org.g5.parser.GrammarParser.ExpressionContext;
import org.g5.parser.GrammarParser.ExpressionStringContext;
import org.g5.parser.GrammarParser.StringContext;

import java.awt.*;

public class Visitor extends GrammarBaseVisitor<Object> {
    @Override
    public String visitExpressionString(ExpressionStringContext ctx) {
        //System.out.println(visitChildren(ctx));
        return null;
    }

    public String visitString(StringContext ctx) {
        String txt = ctx.getText();
        txt = txt.substring(1, txt.length() - 1);

        return txt;
    }

    @Override
    public Integer visitInt(GrammarParser.IntContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Float visitFloat(GrammarParser.FloatContext ctx) {
        return Float.parseFloat(ctx.getText());
    }

    @Override
    public String visitLinearLayer(GrammarParser.LinearLayerContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSequentialContainer(GrammarParser.SequentialContainerContext ctx) {
        return ctx.getText();
    }
}
