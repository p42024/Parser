package org.g5;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.g5.parser.GrammarBaseListener;
import org.g5.parser.GrammarParser;

import java.util.*;

public class ParserListener extends GrammarBaseListener {
    private StringBuilder pythonCode = new StringBuilder();
    private ArrayList<String> processedFunctions = new ArrayList<>();

    @Override
    public void enterFunction_def(GrammarParser.Function_defContext ctx) {
        String functionName = ctx.ID(0).getText();
        if (!processedFunctions.contains(functionName)) {
            processedFunctions.add(functionName);
            processFunction(ctx, 0);
        }
    }

    @Override
    public void exitFunction_def(GrammarParser.Function_defContext ctx) {
        String functionName = ctx.ID(0).getText();
        if (processedFunctions.contains(functionName)) {
            return;
        }
        processedFunctions.add(functionName);
        processFunction(ctx, 0);
    }


    private void processFunction(GrammarParser.Function_defContext ctx, int indentLevel) {
        generatePythonCode("def " + ctx.ID(0).getText() + "(", indentLevel);
        for (int i = 1; i < ctx.ID().size(); i++) {
            generatePythonCode(ctx.ID(i).getText(), 0);
            if (i < ctx.ID().size() - 1) {
                generatePythonCode(", ", 0);
            }
        }
        generatePythonCode("):\n", 0);
        for (GrammarParser.StmtContext stmt : ctx.stmt()) {
            enterStmt(stmt, indentLevel + 1);
        }
    }

    public void enterStmt(GrammarParser.StmtContext ctx, int indentLevel) {
        String stmtText = ctx.getText();
        GrammarParser.Function_defContext nestedCtx = ctx.function_def();
        if (stmtText.startsWith("return")) {
            generatePythonCode("return " + stmtText.substring(6) + "\n", indentLevel);
        } else if (nestedCtx != null) {
            String functionName = nestedCtx.ID(0).getText();
            if (!processedFunctions.contains(functionName) || ctx.getParent() instanceof GrammarParser.Function_defContext) {
                processedFunctions.add(functionName);
                processFunction(nestedCtx, indentLevel + 1);
            }
        } else {
            generatePythonCode(stmtText + "\n", indentLevel);
        }
    }

    private void generatePythonCode(String code, int indentLevel) {
        String indent = "\t".repeat(indentLevel);
        pythonCode.append(indent).append(code);
    }

    public String getPythonCode() {
        return pythonCode.toString();
    }
}