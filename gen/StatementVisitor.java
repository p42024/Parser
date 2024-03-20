// Generated from C:/Users/Andreas Hummelmose/OneDrive/Skrivebord/Git/Parser/src/Statement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StatementParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StatementParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(StatementParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(StatementParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#increment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_stmt(StatementParser.Increment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#decrement_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_stmt(StatementParser.Decrement_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(StatementParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(StatementParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(StatementParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(StatementParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(StatementParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(StatementParser.Arithmetic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#arithmetic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_term(StatementParser.Arithmetic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_factor(StatementParser.Arithmetic_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(StatementParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(StatementParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(StatementParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#model_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_stmt(StatementParser.Model_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#model_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_term(StatementParser.Model_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#model_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_factor(StatementParser.Model_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(StatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op(StatementParser.Binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(StatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StatementParser#assignment_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_op(StatementParser.Assignment_opContext ctx);
}