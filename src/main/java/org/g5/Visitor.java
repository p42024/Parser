package org.g5;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.g5.functions.CalculateAccuracy;
import org.g5.functions.MSE;
import org.g5.functions.Print;
import org.g5.functions.SGD;

import org.g5.parser.GrammarBaseVisitor;
import org.g5.parser.GrammarParser;
import org.g5.parser.GrammarParser.AddOpAddContext;
import org.g5.parser.GrammarParser.AddOpContext;
import org.g5.parser.GrammarParser.AddOpSubContext;
import org.g5.parser.GrammarParser.AdditiveContext;
import org.g5.parser.GrammarParser.ExpressionParenthesisContext;
import org.g5.parser.GrammarParser.MultOpContext;
import org.g5.parser.GrammarParser.MultOpDivisionContext;
import org.g5.parser.GrammarParser.MultOpMultiplicationContext;
import org.g5.parser.GrammarParser.MultiplicativeContext;
import org.g5.parser.GrammarParser.NumberConstantContext;
import org.g5.parser.GrammarParser.NumberConstantIntContext;
import org.g5.parser.GrammarParser.NumberConstantParenthesisContext;
import org.g5.parser.GrammarParser.StringContext;
import org.g5.types.SequentialContainer;
import org.g5.types.SubOperation;
import org.g5.types.AddOperation;
import org.g5.types.DivOperation;
import org.g5.types.LinearLayer;
import org.g5.types.MultOperation;

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

    @Override
    public Object visitAddOpAdd(AddOpAddContext ctx) {
        return new AddOperation();
    }

    @Override 
    public Object visitAddOpSub(AddOpSubContext ctx) {
        return new SubOperation();
    }

    @Override
    public Object visitMultOpDivision(MultOpDivisionContext ctx) {
        return new DivOperation();
    }

    @Override 
    public Object visitMultOpMultiplication(MultOpMultiplicationContext ctx) {
        return new MultOperation();
    }

    @Override 
    public Object visitNumberConstantParenthesis(NumberConstantParenthesisContext ctx) {
        return visit(ctx.number());
    }

    @Override
    public Object visitAdditive(AdditiveContext ctx) {
        Float base = (Float)visit(ctx.multiplicative(0));

        List<MultiplicativeContext> multiplications = ctx.multiplicative();
        List<AddOpContext> additives = ctx.addOp();

        for (int i = 0; i < additives.size(); i++) {
            Float num = (Float)visit(multiplications.get(i + 1));
            Class<?> addOrSub = visit(additives.get(i)).getClass();

            if (addOrSub.equals(AddOperation.class)) {
                System.out.println(base + " + " + num);
                base += num;
                continue;
            }
            else if (addOrSub.equals(SubOperation.class)) {
                System.out.println(base + " - " + num);
                base -= num;
                continue;
            }

            throw new RuntimeException("Neither subtraction or addition!");
        }

        return base;
    }
    
    @Override
    public Object visitMultiplicative(MultiplicativeContext ctx) {
        Float base = (Float)visit(ctx.numberConstant(0));

        List<NumberConstantContext> additions = ctx.numberConstant();
        List<MultOpContext> multiplicationOps = ctx.multOp();

        for (int i = 0; i < multiplicationOps.size(); i++) {
            Float num = (Float)visit(additions.get(i + 1));
            Class<?> multOrDiv = visit(multiplicationOps.get(i)).getClass();

            if (multOrDiv.equals(MultOperation.class)) {
                System.out.println(base + " * " + num);
                base *= num;
                continue;
            }
            else if (multOrDiv.equals(DivOperation.class)) {
                System.out.println(base + " / " + num);
                base /= num;
                continue;
            }

            throw new RuntimeException("Neither division or multiplication!");
        }

        return base;
    }
}
