package org.g5.types;

import org.g5.parser.GrammarParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SequentialContainer extends Model{

    private List<Object> expressions = new ArrayList<>();
    public SequentialContainer (GrammarParser.SequentialContainerModelContext ctx) {
        this.expressions.add(ctx.layer());
        this.expressions.add(ctx.activation());
    }

    public ArrayList<Layer> getLayers() {
        return new ArrayList<>();
    }
}
