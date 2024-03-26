package org.g5.types;

import org.g5.Visitor;
import org.g5.parser.GrammarParser;

public class LinearLayer extends Layer {
    public LinearLayer(GrammarParser.LinearLayerContext ctx, Visitor visitor) {
        this.inputSize  = (Float) visitor.visit(ctx.linearLayerArith(0));
        this.outputSize = (Float) visitor.visit(ctx.linearLayerArith(1));
    }
}
