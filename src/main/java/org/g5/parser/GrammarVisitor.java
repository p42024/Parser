// Generated from C:/Users/mikke/IdeaProjects/Parser/Grammar.g4 by ANTLR 4.13.1
package org.g5.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementAssignment}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(GrammarParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementLoop}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementLoop(GrammarParser.StatementLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementBreak}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(GrammarParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementIf}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(GrammarParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementPrint}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrint(GrammarParser.StatementPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementSGD}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementSGD(GrammarParser.StatementSGDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatementExport}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExport(GrammarParser.StatementExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(GrammarParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionModel}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionModel(GrammarParser.ExpressionModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLayer}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLayer(GrammarParser.ExpressionLayerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionModelCall}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionModelCall(GrammarParser.ExpressionModelCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionInteger}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionInteger(GrammarParser.ExpressionIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLeq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLeq(GrammarParser.ExpressionLeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionEq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionEq(GrammarParser.ExpressionEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionBooleanOr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanOr(GrammarParser.ExpressionBooleanOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionParenthesis}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParenthesis(GrammarParser.ExpressionParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionAccuracy}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAccuracy(GrammarParser.ExpressionAccuracyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMSE}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMSE(GrammarParser.ExpressionMSEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionGeq}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGeq(GrammarParser.ExpressionGeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionFloat}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionFloat(GrammarParser.ExpressionFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionImportDigits}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionImportDigits(GrammarParser.ExpressionImportDigitsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionArith}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArith(GrammarParser.ExpressionArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionBooleanAnd}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBooleanAnd(GrammarParser.ExpressionBooleanAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionGe}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionGe(GrammarParser.ExpressionGeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLe}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLe(GrammarParser.ExpressionLeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionString}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionString(GrammarParser.ExpressionStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionImportDigitsTest}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionImportDigitsTest(GrammarParser.ExpressionImportDigitsTestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionId}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionId(GrammarParser.ExpressionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(GrammarParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SequentialContainerModel}
	 * labeled alternative in {@link GrammarParser#sequentialContainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialContainerModel(GrammarParser.SequentialContainerModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActivationReLU}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivationReLU(GrammarParser.ActivationReLUContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActivationTanh}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivationTanh(GrammarParser.ActivationTanhContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ActivationSigmoid}
	 * labeled alternative in {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivationSigmoid(GrammarParser.ActivationSigmoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#layer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayer(GrammarParser.LayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#linearLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearLayer(GrammarParser.LinearLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#linearLayerArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearLayerArith(GrammarParser.LinearLayerArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithDivision}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithDivision(GrammarParser.ArithDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithMultiplication}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithMultiplication(GrammarParser.ArithMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithAddition}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithAddition(GrammarParser.ArithAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithSubtraction}
	 * labeled alternative in {@link GrammarParser#arith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithSubtraction(GrammarParser.ArithSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithSubtraction}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithSubtraction(GrammarParser.ChainedArithSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithId}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithId(GrammarParser.ChainedArithIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithInt}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithInt(GrammarParser.ChainedArithIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithDivision}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithDivision(GrammarParser.ChainedArithDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithMultiplication}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithMultiplication(GrammarParser.ChainedArithMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithFloat}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithFloat(GrammarParser.ChainedArithFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedArithAddition}
	 * labeled alternative in {@link GrammarParser#chainedArith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedArithAddition(GrammarParser.ChainedArithAdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(GrammarParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(GrammarParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GrammarParser.StringContext ctx);
}