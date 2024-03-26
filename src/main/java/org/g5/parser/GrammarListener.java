// Generated from C:/Users/mikke/IdeaProjects/Parser/Grammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code SSingleLine}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSSingleLine(GrammarParser.SSingleLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SSingleLine}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSSingleLine(GrammarParser.SSingleLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SMultiLine}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSMultiLine(GrammarParser.SMultiLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SMultiLine}
	 * labeled alternative in {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSMultiLine(GrammarParser.SMultiLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MLSLoop}
	 * labeled alternative in {@link GrammarParser#multi_line_statement}.
	 * @param ctx the parse tree
	 */
	void enterMLSLoop(GrammarParser.MLSLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MLSLoop}
	 * labeled alternative in {@link GrammarParser#multi_line_statement}.
	 * @param ctx the parse tree
	 */
	void exitMLSLoop(GrammarParser.MLSLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MLSIf}
	 * labeled alternative in {@link GrammarParser#multi_line_statement}.
	 * @param ctx the parse tree
	 */
	void enterMLSIf(GrammarParser.MLSIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MLSIf}
	 * labeled alternative in {@link GrammarParser#multi_line_statement}.
	 * @param ctx the parse tree
	 */
	void exitMLSIf(GrammarParser.MLSIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SLSAssignment}
	 * labeled alternative in {@link GrammarParser#single_line_statement}.
	 * @param ctx the parse tree
	 */
	void enterSLSAssignment(GrammarParser.SLSAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SLSAssignment}
	 * labeled alternative in {@link GrammarParser#single_line_statement}.
	 * @param ctx the parse tree
	 */
	void exitSLSAssignment(GrammarParser.SLSAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SLSBreak}
	 * labeled alternative in {@link GrammarParser#single_line_statement}.
	 * @param ctx the parse tree
	 */
	void enterSLSBreak(GrammarParser.SLSBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SLSBreak}
	 * labeled alternative in {@link GrammarParser#single_line_statement}.
	 * @param ctx the parse tree
	 */
	void exitSLSBreak(GrammarParser.SLSBreakContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#function_params}.
	 * @param ctx the parse tree
	 */
	void enterFunction_params(GrammarParser.Function_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_params}.
	 * @param ctx the parse tree
	 */
	void exitFunction_params(GrammarParser.Function_paramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignAssignable}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignAssignable(GrammarParser.AssignAssignableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignAssignable}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignAssignable(GrammarParser.AssignAssignableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignFunction(GrammarParser.AssignFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignFunction}
	 * labeled alternative in {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignFunction(GrammarParser.AssignFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsId}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAsId(GrammarParser.AsIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsId}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAsId(GrammarParser.AsIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsModel}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAsModel(GrammarParser.AsModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsModel}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAsModel(GrammarParser.AsModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsMath}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void enterAsMath(GrammarParser.AsMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsMath}
	 * labeled alternative in {@link GrammarParser#assignable}.
	 * @param ctx the parse tree
	 */
	void exitAsMath(GrammarParser.AsMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MExpChain}
	 * labeled alternative in {@link GrammarParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterMExpChain(GrammarParser.MExpChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MExpChain}
	 * labeled alternative in {@link GrammarParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitMExpChain(GrammarParser.MExpChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MExpCombiner}
	 * labeled alternative in {@link GrammarParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterMExpCombiner(GrammarParser.MExpCombinerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MExpCombiner}
	 * labeled alternative in {@link GrammarParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitMExpCombiner(GrammarParser.MExpCombinerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MChain}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 */
	void enterMChain(GrammarParser.MChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MChain}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 */
	void exitMChain(GrammarParser.MChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MVariables}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 */
	void enterMVariables(GrammarParser.MVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MVariables}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 */
	void exitMVariables(GrammarParser.MVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MScoping}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 */
	void enterMScoping(GrammarParser.MScopingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MScoping}
	 * labeled alternative in {@link GrammarParser#model_chain}.
	 * @param ctx the parse tree
	 */
	void exitMScoping(GrammarParser.MScopingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MChainId}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void enterMChainId(GrammarParser.MChainIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MChainId}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void exitMChainId(GrammarParser.MChainIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MChainActivation}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void enterMChainActivation(GrammarParser.MChainActivationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MChainActivation}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void exitMChainActivation(GrammarParser.MChainActivationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MChainInt}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void enterMChainInt(GrammarParser.MChainIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MChainInt}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void exitMChainInt(GrammarParser.MChainIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MChainCombiner}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void enterMChainCombiner(GrammarParser.MChainCombinerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MChainCombiner}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void exitMChainCombiner(GrammarParser.MChainCombinerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MChainMath}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void enterMChainMath(GrammarParser.MChainMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MChainMath}
	 * labeled alternative in {@link GrammarParser#model_chain_options}.
	 * @param ctx the parse tree
	 */
	void exitMChainMath(GrammarParser.MChainMathContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#model_combiner_options}.
	 * @param ctx the parse tree
	 */
	void enterModel_combiner_options(GrammarParser.Model_combiner_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_combiner_options}.
	 * @param ctx the parse tree
	 */
	void exitModel_combiner_options(GrammarParser.Model_combiner_optionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonOperatorChain}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperatorChain(GrammarParser.ComparisonOperatorChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonOperatorChain}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperatorChain(GrammarParser.ComparisonOperatorChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseOperatorChain}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOperatorChain(GrammarParser.BitwiseOperatorChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseOperatorChain}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOperatorChain(GrammarParser.BitwiseOperatorChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionScoping}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionScoping(GrammarParser.ConditionScopingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionScoping}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionScoping(GrammarParser.ConditionScopingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionNumberVariable}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionNumberVariable(GrammarParser.ConditionNumberVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionNumberVariable}
	 * labeled alternative in {@link GrammarParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionNumberVariable(GrammarParser.ConditionNumberVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condtional_options}.
	 * @param ctx the parse tree
	 */
	void enterCondtional_options(GrammarParser.Condtional_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condtional_options}.
	 * @param ctx the parse tree
	 */
	void exitCondtional_options(GrammarParser.Condtional_optionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathAddSubtract}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathAddSubtract(GrammarParser.MathAddSubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathAddSubtract}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathAddSubtract(GrammarParser.MathAddSubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathScoping}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathScoping(GrammarParser.MathScopingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathScoping}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathScoping(GrammarParser.MathScopingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathMultiplyDivide}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathMultiplyDivide(GrammarParser.MathMultiplyDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathMultiplyDivide}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathMultiplyDivide(GrammarParser.MathMultiplyDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathNumberVariable}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMathNumberVariable(GrammarParser.MathNumberVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathNumberVariable}
	 * labeled alternative in {@link GrammarParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMathNumberVariable(GrammarParser.MathNumberVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathId}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void enterMathId(GrammarParser.MathIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathId}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void exitMathId(GrammarParser.MathIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathNumber}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void enterMathNumber(GrammarParser.MathNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathNumber}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void exitMathNumber(GrammarParser.MathNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathModel}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void enterMathModel(GrammarParser.MathModelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathModel}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void exitMathModel(GrammarParser.MathModelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathFunc}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void enterMathFunc(GrammarParser.MathFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathFunc}
	 * labeled alternative in {@link GrammarParser#math_options}.
	 * @param ctx the parse tree
	 */
	void exitMathFunc(GrammarParser.MathFuncContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GrammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumInt}
	 * labeled alternative in {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumInt(GrammarParser.NumIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumInt}
	 * labeled alternative in {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumInt(GrammarParser.NumIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumFloat}
	 * labeled alternative in {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumFloat(GrammarParser.NumFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumFloat}
	 * labeled alternative in {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumFloat(GrammarParser.NumFloatContext ctx);
}