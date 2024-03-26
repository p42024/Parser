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
	 * Visit a parse tree produced by the {@code SSingleLine}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSSingleLine(GrammarParser.SSingleLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SMultiLine}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSMultiLine(GrammarParser.SMultiLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MLSLoop}
	 * labeled alternative in {@link GrammarParser#multi_line_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMLSLoop(GrammarParser.MLSLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MLSIf}
	 * labeled alternative in {@link GrammarParser#multi_line_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMLSIf(GrammarParser.MLSIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SLSAssignment}
	 * labeled alternative in {@link GrammarParser#single_line_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSLSAssignment(GrammarParser.SLSAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SLSBreak}
	 * labeled alternative in {@link GrammarParser#single_line_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSLSBreak(GrammarParser.SLSBreakContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_params(GrammarParser.Function_paramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignAssignable}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignAssignable(GrammarParser.AssignAssignableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignFunction(GrammarParser.AssignFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsId}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsId(GrammarParser.AsIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsModel}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsModel(GrammarParser.AsModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsMath}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsMath(GrammarParser.AsMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MExpChain}
	 * labeled alternative in {@link GrammarParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMExpChain(GrammarParser.MExpChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MExpCombiner}
	 * labeled alternative in {@link GrammarParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMExpCombiner(GrammarParser.MExpCombinerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MChain}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChain(GrammarParser.MChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MVariables}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMVariables(GrammarParser.MVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MScoping}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMScoping(GrammarParser.MScopingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MChainId}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChainId(GrammarParser.MChainIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MChainActivation}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChainActivation(GrammarParser.MChainActivationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MChainInt}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChainInt(GrammarParser.MChainIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MChainCombiner}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChainCombiner(GrammarParser.MChainCombinerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MChainMath}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMChainMath(GrammarParser.MChainMathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_combiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_combiner(GrammarParser.Model_combinerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_combiner_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_combiner_options(GrammarParser.Model_combiner_optionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonOperatorChain}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperatorChain(GrammarParser.ComparisonOperatorChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseOperatorChain}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperatorChain(GrammarParser.BitwiseOperatorChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionScoping}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionScoping(GrammarParser.ConditionScopingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionNumberVariable}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionNumberVariable(GrammarParser.ConditionNumberVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condtional_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondtional_options(GrammarParser.Condtional_optionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathAddSubtract}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathAddSubtract(GrammarParser.MathAddSubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathScoping}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathScoping(GrammarParser.MathScopingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathMultiplyDivide}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathMultiplyDivide(GrammarParser.MathMultiplyDivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathNumberVariable}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathNumberVariable(GrammarParser.MathNumberVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathId}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathId(GrammarParser.MathIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathNumber}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathNumber(GrammarParser.MathNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathModel}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathModel(GrammarParser.MathModelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MathFunc}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFunc(GrammarParser.MathFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(GrammarParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumInt}
	 * labeled alternative in {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInt(GrammarParser.NumIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumFloat}
	 * labeled alternative in {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumFloat(GrammarParser.NumFloatContext ctx);
}