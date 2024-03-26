package org.g5;

import org.g5.functions.CalculateAccuracy;
import org.g5.functions.MSE;
import org.g5.functions.Print;
import org.g5.functions.SGD;

import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser;
import org.g5.parser.GrammarParser.ArithAdditionContext;
import org.g5.parser.GrammarParser.ArithDivisionContext;
import org.g5.parser.GrammarParser.ArithMultiplicationContext;
import org.g5.parser.GrammarParser.ArithSubtractionContext;
import org.g5.parser.GrammarParser.ChainedArithAdditionContext;
import org.g5.parser.GrammarParser.ChainedArithDivisionContext;
import org.g5.parser.GrammarParser.ChainedArithMultiplicationContext;
import org.g5.parser.GrammarParser.ChainedArithSubtractionContext;
import org.g5.parser.GrammarParser.StringContext;
import org.g5.types.SequentialContainer;
import org.g5.types.LinearLayer;

public class Visitor extends GrammarBaseVisitor<Object> {
     @Override
    public String visitString(StringContext ctx) {
        String txt = ctx.getText();

        txt = txt.substring(1, txt.length() - 1);

        return txt;
    }

    @Override
    public Float visitInt(GrammarParser.IntContext ctx) {
        Float parsedFloat = Float.parseFloat(ctx.getText());
        return parsedFloat;
    }

    @Override
    public Float visitFloat(GrammarParser.FloatContext ctx) {
        Float parsedFloat = Float.parseFloat(ctx.getText());
        return parsedFloat;
    }

    @Override
    public LinearLayer visitLinearLayer(GrammarParser.LinearLayerContext ctx) {
        return new LinearLayer(ctx, this);
    }

    @Override
    public Object visitStatementAssignment(GrammarParser.StatementAssignmentContext ctx) {
        /*
        System.out.print("---- Assignment ---- \n" +
                "Id: " + ctx.id().getText() + "\n" +
                "Expressions: " + visit(ctx.expression()) + "\n" +
                "Has child: " + ctx.expression().getChildCount() + "\n" +
                "String: " + ctx.expression().getText() + "\n" +
                "\n");
         */

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

    @Override
    public CalculateAccuracy visitExpressionAccuracy(GrammarParser.ExpressionAccuracyContext ctx) {
        return new CalculateAccuracy(ctx, this);
    }

    @Override
    public MSE visitExpressionMSE(GrammarParser.ExpressionMSEContext ctx) {
        return new MSE(ctx, this);
    }

    @Override
    public SGD visitStatementSGD(GrammarParser.StatementSGDContext ctx) {
        return new SGD(ctx, this);
    }

    @Override
    public Print visitStatementPrint(GrammarParser.StatementPrintContext ctx) {
        return new Print(ctx, this);
    }

    @Override
    public String visitActivationReLU(GrammarParser.ActivationReLUContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitActivationSigmoid(GrammarParser.ActivationSigmoidContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitActivationTanh(GrammarParser.ActivationTanhContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitSequentialContainerModel(GrammarParser.SequentialContainerModelContext ctx) {
        System.out.println(ctx.layer(0));
        return new SequentialContainer(ctx);
    }


}
