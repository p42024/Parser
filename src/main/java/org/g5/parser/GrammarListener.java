// Generated from Grammar.g4 by ANTLR 4.13.1
package org.g5.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignment(GrammarParser.StatementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignment(GrammarParser.StatementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementLoop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementLoop(GrammarParser.StatementLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementLoop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementLoop(GrammarParser.StatementLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(GrammarParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(GrammarParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(GrammarParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(GrammarParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(GrammarParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExpression}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(GrammarParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(GrammarParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(GrammarParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionModel}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionModel(GrammarParser.ExpressionModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionModel}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionModel(GrammarParser.ExpressionModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLayer}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLayer(GrammarParser.ExpressionLayerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLayer}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLayer(GrammarParser.ExpressionLayerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionModelCall}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionModelCall(GrammarParser.ExpressionModelCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionModelCall}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionModelCall(GrammarParser.ExpressionModelCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionInteger}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInteger(GrammarParser.ExpressionIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionInteger}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInteger(GrammarParser.ExpressionIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionExport}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExport(GrammarParser.ExpressionExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionExport}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExport(GrammarParser.ExpressionExportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLeq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLeq(GrammarParser.ExpressionLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLeq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLeq(GrammarParser.ExpressionLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionEq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionEq(GrammarParser.ExpressionEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionEq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionEq(GrammarParser.ExpressionEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionBooleanOr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanOr(GrammarParser.ExpressionBooleanOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionBooleanOr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanOr(GrammarParser.ExpressionBooleanOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionPrint}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPrint(GrammarParser.ExpressionPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionPrint}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPrint(GrammarParser.ExpressionPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionParenthesis}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParenthesis(GrammarParser.ExpressionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionParenthesis}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParenthesis(GrammarParser.ExpressionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionAccuracy}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAccuracy(GrammarParser.ExpressionAccuracyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionAccuracy}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAccuracy(GrammarParser.ExpressionAccuracyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionMSE}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMSE(GrammarParser.ExpressionMSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionMSE}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMSE(GrammarParser.ExpressionMSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionSGD}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSGD(GrammarParser.ExpressionSGDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionSGD}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSGD(GrammarParser.ExpressionSGDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionGeq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGeq(GrammarParser.ExpressionGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionGeq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGeq(GrammarParser.ExpressionGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionFloat}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionFloat(GrammarParser.ExpressionFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionFloat}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionFloat(GrammarParser.ExpressionFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionImportDigits}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionImportDigits(GrammarParser.ExpressionImportDigitsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionImportDigits}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionImportDigits(GrammarParser.ExpressionImportDigitsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionArith}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArith(GrammarParser.ExpressionArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionArith}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArith(GrammarParser.ExpressionArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionBooleanAnd}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanAnd(GrammarParser.ExpressionBooleanAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionBooleanAnd}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanAnd(GrammarParser.ExpressionBooleanAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionGe}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionGe(GrammarParser.ExpressionGeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionGe}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionGe(GrammarParser.ExpressionGeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionLe}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionLe(GrammarParser.ExpressionLeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionLe}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionLe(GrammarParser.ExpressionLeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionString}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionString(GrammarParser.ExpressionStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionString}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionString(GrammarParser.ExpressionStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionImportDigitsTest}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionImportDigitsTest(GrammarParser.ExpressionImportDigitsTestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionImportDigitsTest}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionImportDigitsTest(GrammarParser.ExpressionImportDigitsTestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionId}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionId(GrammarParser.ExpressionIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionId}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionId(GrammarParser.ExpressionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(GrammarParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(GrammarParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sequentialContainer}.
	 * @param ctx the parse tree
	 */
	void enterSequentialContainer(GrammarParser.SequentialContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sequentialContainer}.
	 * @param ctx the parse tree
	 */
	void exitSequentialContainer(GrammarParser.SequentialContainerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActivationReLU}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void enterActivationReLU(GrammarParser.ActivationReLUContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActivationReLU}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void exitActivationReLU(GrammarParser.ActivationReLUContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActivationTanh}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void enterActivationTanh(GrammarParser.ActivationTanhContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActivationTanh}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void exitActivationTanh(GrammarParser.ActivationTanhContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ActivationSigmoid}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void enterActivationSigmoid(GrammarParser.ActivationSigmoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ActivationSigmoid}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void exitActivationSigmoid(GrammarParser.ActivationSigmoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(GrammarParser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(GrammarParser.LayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#linearLayer}.
	 * @param ctx the parse tree
	 */
	void enterLinearLayer(GrammarParser.LinearLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#linearLayer}.
	 * @param ctx the parse tree
	 */
	void exitLinearLayer(GrammarParser.LinearLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArith(GrammarParser.ArithContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArith(GrammarParser.ArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArith(GrammarParser.ChainedArithContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArith(GrammarParser.ChainedArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(GrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(GrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(GrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(GrammarParser.FloatContext ctx);
}