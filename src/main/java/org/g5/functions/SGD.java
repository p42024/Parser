package org.g5.functions;

import org.g5.Visitor;
import org.g5.parser.GrammarParser;
import org.g5.types.Model;

public class SGD {
    private Model model;
    //TODO: Proper type
    private Object loss;
    private Float  learningRate;
    public SGD(GrammarParser.StatementSGDContext ctx, Visitor visitor) {
        this.model         = (Model) visitor.visit(ctx.expression(0));
        this.loss          =         visitor.visit(ctx.expression(1));
        this.learningRate  = (Float) visitor.visit(ctx.expression(2));
    }

    public Model getModel() {
        return this.model;
    }

    public Object getLoss() {
        return this.loss;
    }

    public Float getLearningRate() {
        return this.learningRate;
    }

    @Override
    public String toString() {
        return String.format("Stochastic gradient descent function - model: %s, loss: %s, learning rate: %s", this.model, this.loss, this.learningRate);
    }
}
