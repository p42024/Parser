package org.g5;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser;
import org.g5.parser.GrammarParser.ArithAdditionContext;
import org.g5.parser.GrammarParser.ArithDivisionContext;
import org.g5.parser.GrammarParser.ArithMultiplicationContext;
import org.g5.parser.GrammarParser.ArithSubtractionContext;
import org.g5.parser.GrammarParser.ChainedArithAdditionContext;
import org.g5.parser.GrammarParser.ChainedArithContext;
import org.g5.parser.GrammarParser.ChainedArithDivisionContext;
import org.g5.parser.GrammarParser.ChainedArithIdContext;
import org.g5.parser.GrammarParser.ChainedArithMultiplicationContext;
import org.g5.parser.GrammarParser.ChainedArithSubtractionContext;
import org.g5.parser.GrammarParser.StringContext;
import org.g5.types.Layer;

public class Visitor extends GrammarBaseVisitor<Object> {
    @Override
    public String visitString(StringContext ctx) {
        String txt = ctx.getText();

        txt = txt.substring(1, txt.length() - 1);

        return txt;
    }

    @Override
    public Float visitInt(GrammarParser.IntContext ctx) {
        Float parsedInteger = Float.parseFloat(ctx.getText());
        return parsedInteger;
    }

    @Override
    public Float visitFloat(GrammarParser.FloatContext ctx) {
        Float parsedFloat = Float.parseFloat(ctx.getText());
        return parsedFloat;
    }

    @Override
    public Layer visitLayer(GrammarParser.LayerContext ctx) {
        return new Layer(ctx);
    }

    @Override
    public Object visitStatementAssignment(GrammarParser.StatementAssignmentContext ctx) {
        return super.visitStatementAssignment(ctx);
    }

    // Vistors for ChainedArith
    // chainedArith
    //     : chainedArith op='*' chainedArith          #ChainedArithMultiplication
    //     | chainedArith op='/' chainedArith          #ChainedArithDivision
    //     | chainedArith op='+' chainedArith          #ChainedArithAddition
    //     | chainedArith op='-' chainedArith          #ChainedArithSubtraction
    //     | id                                        #ChainedArithId
    //     | int                                       #ChainedArithInt
    //     | float                                     #ChainedArithFloat
    //     ;

    //     : chainedArith op='*' chainedArith          #ChainedArithMultiplication
    @Override
    public Object visitChainedArithMultiplication(ChainedArithMultiplicationContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 * val2;
    }
    
    //     | chainedArith op='/' chainedArith          #ChainedArithDivision
    @Override
    public Object visitChainedArithDivision(ChainedArithDivisionContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 / val2;
    }
    
    //     | chainedArith op='+' chainedArith          #ChainedArithAddition
    @Override
    public Object visitChainedArithAddition(ChainedArithAdditionContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 + val2;
    }

    //     | chainedArith op='-' chainedArith          #ChainedArithSubtraction
    @Override
    public Object visitChainedArithSubtraction(ChainedArithSubtractionContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 - val2;
    }


    // arith
    //     : chainedArith op='*' chainedArith        #ArithMultiplication
    //     | chainedArith op='/' chainedArith        #ArithDivision
    //     | chainedArith op='+' chainedArith        #ArithAddition
    //     | chainedArith op='-' chainedArith        #ArithSubtraction
    //     ;

    //     : chainedArith op='*' chainedArith        #ArithMultiplication
    @Override
    public Object visitArithMultiplication(ArithMultiplicationContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 * val2;
    }

    //     | chainedArith op='/' chainedArith        #ArithDivision
    @Override
    public Object visitArithDivision(ArithDivisionContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 / val2;
    }

    //     | chainedArith op='+' chainedArith        #ArithAddition
    @Override
    public Object visitArithAddition(ArithAdditionContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 + val2;
    }
    @Override

    //     | chainedArith op='-' chainedArith        #ArithSubtraction
    public Object visitArithSubtraction(ArithSubtractionContext ctx) {
        Float val1 = (Float)this.visit(ctx.chainedArith(0));
        Float val2 = (Float)this.visit(ctx.chainedArith(1));

        return val1 - val2;
    }
}
