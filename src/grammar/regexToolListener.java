// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/grammar\regexTool.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link regexToolParser}.
 */
public interface regexToolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link regexToolParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(regexToolParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(regexToolParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(regexToolParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(regexToolParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(regexToolParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(regexToolParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(regexToolParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(regexToolParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(regexToolParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(regexToolParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLabel_stmt(regexToolParser.Label_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#label_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLabel_stmt(regexToolParser.Label_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCapture_stmt(regexToolParser.Capture_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCapture_stmt(regexToolParser.Capture_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#build_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBuild_stmt(regexToolParser.Build_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#build_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBuild_stmt(regexToolParser.Build_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(regexToolParser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(regexToolParser.Term_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(regexToolParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(regexToolParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(regexToolParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(regexToolParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#comma_list}.
	 * @param ctx the parse tree
	 */
	void enterComma_list(regexToolParser.Comma_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#comma_list}.
	 * @param ctx the parse tree
	 */
	void exitComma_list(regexToolParser.Comma_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#comma_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterComma_list_tail(regexToolParser.Comma_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#comma_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitComma_list_tail(regexToolParser.Comma_list_tailContext ctx);
}