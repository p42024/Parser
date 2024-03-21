// Generated from C:/Users/heyoa/Desktop/git/Parser/Grammar.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(GrammarParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#increment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_stmt(GrammarParser.Increment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#decrement_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement_stmt(GrammarParser.Decrement_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(GrammarParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#loop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stmt(GrammarParser.Loop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(GrammarParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(GrammarParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(GrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(GrammarParser.Arithmetic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithmetic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_term(GrammarParser.Arithmetic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_factor(GrammarParser.Arithmetic_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(GrammarParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(GrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(GrammarParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_stmt(GrammarParser.Model_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_term(GrammarParser.Model_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#model_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_factor(GrammarParser.Model_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op(GrammarParser.Binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#assignment_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_op(GrammarParser.Assignment_opContext ctx);
}