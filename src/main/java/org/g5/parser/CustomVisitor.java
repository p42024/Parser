package org.g5.parser;

import java.util.HashMap;
import java.util.Map;

public class CustomVisitor extends GrammarBaseVisitor<String> {
    Map<String, String> memory = new HashMap<>();

    @Override
    public String visitAssignment(GrammarParser.AssignmentContext ctx) {
        String id = ctx.ID().get(0).getText();
        String activation = ctx.expression().model().model_chaining().model_chaining_options(0).ACTIVATION().getText();
        String layerSize = ctx.expression().model().model_chaining().model_chaining_options(1).INT().getText();
        String assignmentString = id + " = " + activation + " -> " + layerSize;
        System.out.println(assignmentString);
        memory.put(id, activation + "->" + layerSize);
        System.out.println(memory);
        return assignmentString;
    }

    public String toPython(String string) {
        String pythonString;

        //Translate to python
        pythonString = string;
        return pythonString;
    }
}
