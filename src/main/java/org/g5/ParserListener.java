package org.g5;

import org.g5.parser.GrammarBaseListener;
import org.g5.parser.GrammarParser;

public class ParserListener extends GrammarBaseListener {
    @Override public void enterAssignment(GrammarParser.AssignmentContext ctx) {
        System.out.println(ctx.start);
        System.out.println(ctx.stop);
    }

    @Override public void exitAssignment(GrammarParser.AssignmentContext ctx) {
        System.out.println(ctx.expression().start);
    }
}
