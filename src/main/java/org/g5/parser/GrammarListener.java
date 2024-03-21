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
	 * Enter a parse tree produced by {@link GrammarParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(GrammarParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(GrammarParser.Block_statementContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(GrammarParser.Function_callContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#model_chaining_options}.
	 * @param ctx the parse tree
	 */
	void enterModel_chaining_options(GrammarParser.Model_chaining_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_chaining_options}.
	 * @param ctx the parse tree
	 */
	void exitModel_chaining_options(GrammarParser.Model_chaining_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#model_chaining}.
	 * @param ctx the parse tree
	 */
	void enterModel_chaining(GrammarParser.Model_chainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_chaining}.
	 * @param ctx the parse tree
	 */
	void exitModel_chaining(GrammarParser.Model_chainingContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#model_combiner}.
	 * @param ctx the parse tree
	 */
	void enterModel_combiner(GrammarParser.Model_combinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_combiner}.
	 * @param ctx the parse tree
	 */
	void exitModel_combiner(GrammarParser.Model_combinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#break_return}.
	 * @param ctx the parse tree
	 */
	void enterBreak_return(GrammarParser.Break_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#break_return}.
	 * @param ctx the parse tree
	 */
	void exitBreak_return(GrammarParser.Break_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(GrammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(GrammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(GrammarParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(GrammarParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void enterConditional_operator(GrammarParser.Conditional_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditional_operator}.
	 * @param ctx the parse tree
	 */
	void exitConditional_operator(GrammarParser.Conditional_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(GrammarParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(GrammarParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithmetic_operators}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operators(GrammarParser.Arithmetic_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithmetic_operators}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operators(GrammarParser.Arithmetic_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(GrammarParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(GrammarParser.BooleanContext ctx);
}