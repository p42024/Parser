package org.g5.functions;

import org.g5.Visitor;
import org.g5.parser.GrammarParser;

public class MSE {
    //TODO: Proper type
    private Object predictions;
    //TODO: Proper type
    private Object labels;
    public MSE(GrammarParser.ExpressionMSEContext ctx, Visitor visitor) {
        this.predictions = visitor.visit(ctx.expression(0));
        this.labels      = visitor.visit(ctx.expression(1));
    }

    public Object getPredictions() {
        return this.predictions;
    }

    public Object getLabels() {
        return this.labels;
    }

    @Override
    public String toString() {
        return String.format("MSE - labels: %s, predictions: %s", this.labels, this.predictions);
    }
}
