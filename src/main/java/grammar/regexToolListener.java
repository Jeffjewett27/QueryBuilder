// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/main/java/grammar\regexTool.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code importLE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportLE(regexToolParser.ImportLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importLE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportLE(regexToolParser.ImportLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importFE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportFE(regexToolParser.ImportFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importFE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportFE(regexToolParser.ImportFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importCommentLE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportCommentLE(regexToolParser.ImportCommentLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importCommentLE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportCommentLE(regexToolParser.ImportCommentLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importCommentFE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportCommentFE(regexToolParser.ImportCommentFEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importCommentFE}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportCommentFE(regexToolParser.ImportCommentFEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importEmpty}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportEmpty(regexToolParser.ImportEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importEmpty}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportEmpty(regexToolParser.ImportEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code importEnd}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImportEnd(regexToolParser.ImportEndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code importEnd}
	 * labeled alternative in {@link regexToolParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImportEnd(regexToolParser.ImportEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(regexToolParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(regexToolParser.NamespaceContext ctx);
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
	 * Enter a parse tree produced by the {@code captureSingle}
	 * labeled alternative in {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCaptureSingle(regexToolParser.CaptureSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code captureSingle}
	 * labeled alternative in {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCaptureSingle(regexToolParser.CaptureSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code captureArray}
	 * labeled alternative in {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCaptureArray(regexToolParser.CaptureArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code captureArray}
	 * labeled alternative in {@link regexToolParser#capture_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCaptureArray(regexToolParser.CaptureArrayContext ctx);
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
	 * Enter a parse tree produced by the {@code testQuote}
	 * labeled alternative in {@link regexToolParser#test_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTestQuote(regexToolParser.TestQuoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testQuote}
	 * labeled alternative in {@link regexToolParser#test_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTestQuote(regexToolParser.TestQuoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code testConst}
	 * labeled alternative in {@link regexToolParser#test_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTestConst(regexToolParser.TestConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code testConst}
	 * labeled alternative in {@link regexToolParser#test_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTestConst(regexToolParser.TestConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#test_output}.
	 * @param ctx the parse tree
	 */
	void enterTest_output(regexToolParser.Test_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#test_output}.
	 * @param ctx the parse tree
	 */
	void exitTest_output(regexToolParser.Test_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_stmt(regexToolParser.Func_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#func_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_stmt(regexToolParser.Func_stmtContext ctx);
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
	 * Enter a parse tree produced by the {@code funcTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFuncTerm(regexToolParser.FuncTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFuncTerm(regexToolParser.FuncTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quoteTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterQuoteTerm(regexToolParser.QuoteTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quoteTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitQuoteTerm(regexToolParser.QuoteTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVarTerm(regexToolParser.VarTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varTerm}
	 * labeled alternative in {@link regexToolParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVarTerm(regexToolParser.VarTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varIdent}
	 * labeled alternative in {@link regexToolParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarIdent(regexToolParser.VarIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varIdent}
	 * labeled alternative in {@link regexToolParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarIdent(regexToolParser.VarIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varNSIdent}
	 * labeled alternative in {@link regexToolParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarNSIdent(regexToolParser.VarNSIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varNSIdent}
	 * labeled alternative in {@link regexToolParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarNSIdent(regexToolParser.VarNSIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(regexToolParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(regexToolParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argHead}
	 * labeled alternative in {@link regexToolParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArgHead(regexToolParser.ArgHeadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argHead}
	 * labeled alternative in {@link regexToolParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArgHead(regexToolParser.ArgHeadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argEmpty}
	 * labeled alternative in {@link regexToolParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArgEmpty(regexToolParser.ArgEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argEmpty}
	 * labeled alternative in {@link regexToolParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArgEmpty(regexToolParser.ArgEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argListTail}
	 * labeled alternative in {@link regexToolParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterArgListTail(regexToolParser.ArgListTailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argListTail}
	 * labeled alternative in {@link regexToolParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitArgListTail(regexToolParser.ArgListTailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argListDone}
	 * labeled alternative in {@link regexToolParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterArgListDone(regexToolParser.ArgListDoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argListDone}
	 * labeled alternative in {@link regexToolParser#arg_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitArgListDone(regexToolParser.ArgListDoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(regexToolParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(regexToolParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link regexToolParser#param_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_list_tail(regexToolParser.Param_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link regexToolParser#param_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_list_tail(regexToolParser.Param_list_tailContext ctx);
}