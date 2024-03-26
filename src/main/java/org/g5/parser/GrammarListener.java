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
	 * Enter a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrint(GrammarParser.StatementPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrint(GrammarParser.StatementPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementSGD}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementSGD(GrammarParser.StatementSGDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementSGD}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementSGD(GrammarParser.StatementSGDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatementExport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementExport(GrammarParser.StatementExportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatementExport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementExport(GrammarParser.StatementExportContext ctx);
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
	 * Enter a parse tree produced by the {@code ArithMultiplication}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArithMultiplication(GrammarParser.ArithMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithMultiplication}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArithMultiplication(GrammarParser.ArithMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithDivision}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArithDivision(GrammarParser.ArithDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithDivision}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArithDivision(GrammarParser.ArithDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithAddition}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArithAddition(GrammarParser.ArithAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithAddition}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArithAddition(GrammarParser.ArithAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithSubtraction}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArithSubtraction(GrammarParser.ArithSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithSubtraction}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArithSubtraction(GrammarParser.ArithSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithSubtraction}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithSubtraction(GrammarParser.ChainedArithSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithSubtraction}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithSubtraction(GrammarParser.ChainedArithSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithId}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithId(GrammarParser.ChainedArithIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithId}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithId(GrammarParser.ChainedArithIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithInt}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithInt(GrammarParser.ChainedArithIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithInt}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithInt(GrammarParser.ChainedArithIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithMultiplication}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithMultiplication(GrammarParser.ChainedArithMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithMultiplication}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithMultiplication(GrammarParser.ChainedArithMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithDivision}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithDivision(GrammarParser.ChainedArithDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithDivision}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithDivision(GrammarParser.ChainedArithDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithFloat}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithFloat(GrammarParser.ChainedArithFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithFloat}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithFloat(GrammarParser.ChainedArithFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedArithAddition}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void enterChainedArithAddition(GrammarParser.ChainedArithAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedArithAddition}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 */
	void exitChainedArithAddition(GrammarParser.ChainedArithAdditionContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(GrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(GrammarParser.FloatContext ctx);
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
}