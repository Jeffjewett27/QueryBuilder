// Generated from /home/CS/users/oelliott/.linux/cos382/project/QueryBuilder/src/grammar/regexTool.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by the {@code importLE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportLE(regexToolParser.ImportLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importFE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFE(regexToolParser.ImportFEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importCommentLE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportCommentLE(regexToolParser.ImportCommentLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importCommentFE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportCommentFE(regexToolParser.ImportCommentFEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importEmpty}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportEmpty(regexToolParser.ImportEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importEnd}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportEnd(regexToolParser.ImportEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(regexToolParser.NamespaceContext ctx);
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
	 * Visit a parse tree produced by the {@code testQuote}
	 * labeled alternative in {@link regexToolParser#test_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestQuote(regexToolParser.TestQuoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code testConst}
	 * labeled alternative in {@link regexToolParser#test_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestConst(regexToolParser.TestConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#func_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_stmt(regexToolParser.Func_stmtContext ctx);
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
	 * Visit a parse tree produced by the {@code funcTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncTerm(regexToolParser.FuncTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quoteTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoteTerm(regexToolParser.QuoteTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTerm(regexToolParser.VarTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varIdent}
	 * labeled alternative in {@link regexToolParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarIdent(regexToolParser.VarIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varNSIdent}
	 * labeled alternative in {@link regexToolParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNSIdent(regexToolParser.VarNSIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(regexToolParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argHead}
	 * labeled alternative in {@link regexToolParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgHead(regexToolParser.ArgHeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argEmpty}
	 * labeled alternative in {@link regexToolParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgEmpty(regexToolParser.ArgEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListTail}
	 * labeled alternative in {@link regexToolParser#arg_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListTail(regexToolParser.ArgListTailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListDone}
	 * labeled alternative in {@link regexToolParser#arg_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListDone(regexToolParser.ArgListDoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(regexToolParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link regexToolParser#param_list_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list_tail(regexToolParser.Param_list_tailContext ctx);
}