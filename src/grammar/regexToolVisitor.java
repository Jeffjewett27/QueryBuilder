// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/grammar\regexTool.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link regexToolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface regexToolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link regexToolParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(regexToolParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(regexToolParser.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(regexToolParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(regexToolParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(regexToolParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#label_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stmt(regexToolParser.Label_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_stmt(regexToolParser.Capture_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#build_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_stmt(regexToolParser.Build_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(regexToolParser.Term_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(regexToolParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(regexToolParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#comma_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_list(regexToolParser.Comma_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#comma_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_list_tail(regexToolParser.Comma_list_tailContext ctx);
}