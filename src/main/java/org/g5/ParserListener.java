package org.g5;

import org.g5.parser.GrammarBaseListener;
import org.g5.parser.GrammarParser;

import static org.g5.Main.parser;

public class ParserListener extends GrammarBaseListener {
    @Override
    public void exitSLSAssignment(GrammarParser.SLSAssignmentContext ctx) {
        System.out.println("----- Context Assignment -----");
        System.out.println(ctx.parent.getText());
        System.out.println(ctx.toStringTree(parser));
        System.out.println("-----/ Context Assignment /-----");
    }
}