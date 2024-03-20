// Generated from C:/Users/Andreas Hummelmose/OneDrive/Skrivebord/Git/Parser/src/Statement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StatementParser}.
 */
public interface StatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StatementParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(StatementParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(StatementParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(StatementParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(StatementParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(StatementParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(StatementParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#increment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_stmt(StatementParser.Increment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#increment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_stmt(StatementParser.Increment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#decrement_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecrement_stmt(StatementParser.Decrement_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#decrement_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecrement_stmt(StatementParser.Decrement_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(StatementParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(StatementParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stmt(StatementParser.Loop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#loop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stmt(StatementParser.Loop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(StatementParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(StatementParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(StatementParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(StatementParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(StatementParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(StatementParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(StatementParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(StatementParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_term(StatementParser.Arithmetic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_term(StatementParser.Arithmetic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_factor(StatementParser.Arithmetic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_factor(StatementParser.Arithmetic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(StatementParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(StatementParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(StatementParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(StatementParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StatementParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StatementParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#model_stmt}.
	 * @param ctx the parse tree
	 */
	void enterModel_stmt(StatementParser.Model_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#model_stmt}.
	 * @param ctx the parse tree
	 */
	void exitModel_stmt(StatementParser.Model_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#model_term}.
	 * @param ctx the parse tree
	 */
	void enterModel_term(StatementParser.Model_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#model_term}.
	 * @param ctx the parse tree
	 */
	void exitModel_term(StatementParser.Model_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#model_factor}.
	 * @param ctx the parse tree
	 */
	void enterModel_factor(StatementParser.Model_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#model_factor}.
	 * @param ctx the parse tree
	 */
	void exitModel_factor(StatementParser.Model_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(StatementParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(StatementParser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_op(StatementParser.Assignment_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_op(StatementParser.Assignment_opContext ctx);
}