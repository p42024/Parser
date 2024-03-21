// Generated from C:/Users/heyoa/Desktop/git/Parser/Grammar.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(GrammarParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(GrammarParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#increment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_stmt(GrammarParser.Increment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#increment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_stmt(GrammarParser.Increment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decrement_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_stmt(GrammarParser.Decrement_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decrement_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_stmt(GrammarParser.Decrement_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(GrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(GrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(GrammarParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(GrammarParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(GrammarParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(GrammarParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(GrammarParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(GrammarParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(GrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(GrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(GrammarParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(GrammarParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_term(GrammarParser.Arithmetic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_term(GrammarParser.Arithmetic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_factor(GrammarParser.Arithmetic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_factor(GrammarParser.Arithmetic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(GrammarParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(GrammarParser.Function_defContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#model_stmt}.
	 * @param ctx the parse tree
	 */
	void enterModel_stmt(GrammarParser.Model_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_stmt}.
	 * @param ctx the parse tree
	 */
	void exitModel_stmt(GrammarParser.Model_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#model_term}.
	 * @param ctx the parse tree
	 */
	void enterModel_term(GrammarParser.Model_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_term}.
	 * @param ctx the parse tree
	 */
	void exitModel_term(GrammarParser.Model_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#model_factor}.
	 * @param ctx the parse tree
	 */
	void enterModel_factor(GrammarParser.Model_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#model_factor}.
	 * @param ctx the parse tree
	 */
	void exitModel_factor(GrammarParser.Model_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(GrammarParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(GrammarParser.Binary_opContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_op(GrammarParser.Assignment_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_op(GrammarParser.Assignment_opContext ctx);
}