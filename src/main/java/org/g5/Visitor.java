package org.g5;

import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser.ExpressionContext;
import org.g5.parser.GrammarParser.ExpressionStringContext;
import org.g5.parser.GrammarParser.StringContext;

public class Visitor extends GrammarBaseVisitor<Object> {
    @Override
    public String visitExpressionString(ExpressionStringContext ctx) {
        System.out.println(visitChildren(ctx));
        return null;
    }

    public String visitString(StringContext ctx) {
        String txt = ctx.getText();
        txt = txt.substring(1, txt.length() - 1);

        return txt;
    }
}
