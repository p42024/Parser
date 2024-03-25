// Generated from C:/Users/Mads Byriel/projects/Parser/Grammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#modelLayer}.
	 * @param ctx the parse tree
	 */
	void enterModelLayer(GrammarParser.ModelLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#modelLayer}.
	 * @param ctx the parse tree
	 */
	void exitModelLayer(GrammarParser.ModelLayerContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#recurrentLayer}.
	 * @param ctx the parse tree
	 */
	void enterRecurrentLayer(GrammarParser.RecurrentLayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#recurrentLayer}.
	 * @param ctx the parse tree
	 */
	void exitRecurrentLayer(GrammarParser.RecurrentLayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#modelContainer}.
	 * @param ctx the parse tree
	 */
	void enterModelContainer(GrammarParser.ModelContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#modelContainer}.
	 * @param ctx the parse tree
	 */
	void exitModelContainer(GrammarParser.ModelContainerContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void enterActivation(GrammarParser.ActivationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 */
	void exitActivation(GrammarParser.ActivationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#relu}.
	 * @param ctx the parse tree
	 */
	void enterRelu(GrammarParser.ReluContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#relu}.
	 * @param ctx the parse tree
	 */
	void exitRelu(GrammarParser.ReluContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tanh}.
	 * @param ctx the parse tree
	 */
	void enterTanh(GrammarParser.TanhContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tanh}.
	 * @param ctx the parse tree
	 */
	void exitTanh(GrammarParser.TanhContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sigmoid}.
	 * @param ctx the parse tree
	 */
	void enterSigmoid(GrammarParser.SigmoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sigmoid}.
	 * @param ctx the parse tree
	 */
	void exitSigmoid(GrammarParser.SigmoidContext ctx);
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
}