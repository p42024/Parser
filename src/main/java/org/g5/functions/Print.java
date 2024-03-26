package org.g5.functions;

import org.g5.Visitor;
import org.g5.parser.GrammarParser;

public class Print {
    private String text;
    public Print(GrammarParser.StatementPrintContext ctx, Visitor visitor) {
        this.text = (String) visitor.visit(ctx.expression());
    }

    public String getText() {
        return this.text;
    }

    @Override
    public String toString() {
        return String.format("Print function - Text: %s", this.text);
    }
}
