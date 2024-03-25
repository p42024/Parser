// Generated from C:/Users/Mads Byriel/projects/Parser/Grammar.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#modelLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelLayer(GrammarParser.ModelLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#linearLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinearLayer(GrammarParser.LinearLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#recurrentLayer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurrentLayer(GrammarParser.RecurrentLayerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#modelContainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelContainer(GrammarParser.ModelContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sequentialContainer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialContainer(GrammarParser.SequentialContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivation(GrammarParser.ActivationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#relu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelu(GrammarParser.ReluContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#tanh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTanh(GrammarParser.TanhContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#sigmoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigmoid(GrammarParser.SigmoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(GrammarParser.IntContext ctx);
}
