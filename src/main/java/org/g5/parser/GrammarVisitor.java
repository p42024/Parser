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
	 * Visit a parse tree produced by {@link GrammarParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(GrammarParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#activation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivation(GrammarParser.ActivationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_chaining_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_chaining_options(GrammarParser.Model_chaining_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_chaining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_chaining(GrammarParser.Model_chainingContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(GrammarParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_combiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_combiner(GrammarParser.Model_combinerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#break_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_return(GrammarParser.Break_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(GrammarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(GrammarParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(GrammarParser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(GrammarParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithmetic_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_operators(GrammarParser.Arithmetic_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(GrammarParser.BooleanContext ctx);
}