// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/main/java/grammar\regexTool.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regexToolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, COMMENT=7, LINE_END=8, LABEL_KEY=9, 
		TEST_KEY=10, BUILD_KEY=11, CAPTURE_KEY=12, FUNCTION_KEY=13, IMPORT_KEY=14, 
		NAMESPACE_KEY=15, QUOTE=16, IDENT=17, NS_IDENT=18, CONSTANT=19;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_namespace = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_label_stmt = 5, RULE_capture_stmt = 6, RULE_build_stmt = 7, 
		RULE_test_stmt = 8, RULE_test_output = 9, RULE_func_stmt = 10, RULE_term_list = 11, 
		RULE_func_call = 12, RULE_term = 13, RULE_variable = 14, RULE_param = 15, 
		RULE_arg_list = 16, RULE_arg_list_tail = 17, RULE_param_list = 18, RULE_param_list_tail = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "namespace", "statements", "statement", "label_stmt", 
			"capture_stmt", "build_stmt", "test_stmt", "test_output", "func_stmt", 
			"term_list", "func_call", "term", "variable", "param", "arg_list", "arg_list_tail", 
			"param_list", "param_list_tail"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'[]'", "'('", "')'", "','", null, null, null, "'label'", 
			"'test'", "'build'", "'capture'", "'function'", "'import'", "'namespace'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "COMMENT", "LINE_END", "LABEL_KEY", 
			"TEST_KEY", "BUILD_KEY", "CAPTURE_KEY", "FUNCTION_KEY", "IMPORT_KEY", 
			"NAMESPACE_KEY", "QUOTE", "IDENT", "NS_IDENT", "CONSTANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "regexTool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public regexToolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			imports();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMESPACE_KEY) {
				{
				setState(41);
				namespace();
				}
			}

			setState(44);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportCommentFEContext extends ImportsContext {
		public TerminalNode COMMENT() { return getToken(regexToolParser.COMMENT, 0); }
		public TerminalNode EOF() { return getToken(regexToolParser.EOF, 0); }
		public ImportCommentFEContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImportCommentFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImportCommentFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImportCommentFE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportEmptyContext extends ImportsContext {
		public TerminalNode LINE_END() { return getToken(regexToolParser.LINE_END, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ImportEmptyContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImportEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImportEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImportEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportFEContext extends ImportsContext {
		public Token fname;
		public TerminalNode IMPORT_KEY() { return getToken(regexToolParser.IMPORT_KEY, 0); }
		public TerminalNode EOF() { return getToken(regexToolParser.EOF, 0); }
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public ImportFEContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImportFE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImportFE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImportFE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportEndContext extends ImportsContext {
		public ImportEndContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImportEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImportEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImportEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportCommentLEContext extends ImportsContext {
		public TerminalNode COMMENT() { return getToken(regexToolParser.COMMENT, 0); }
		public TerminalNode LINE_END() { return getToken(regexToolParser.LINE_END, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public ImportCommentLEContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImportCommentLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImportCommentLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImportCommentLE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportLEContext extends ImportsContext {
		public Token fname;
		public TerminalNode IMPORT_KEY() { return getToken(regexToolParser.IMPORT_KEY, 0); }
		public TerminalNode LINE_END() { return getToken(regexToolParser.LINE_END, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public ImportLEContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImportLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImportLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImportLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportLEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(IMPORT_KEY);
				setState(47);
				((ImportLEContext)_localctx).fname = match(QUOTE);
				setState(48);
				match(LINE_END);
				setState(49);
				imports();
				}
				break;
			case 2:
				_localctx = new ImportFEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(IMPORT_KEY);
				setState(51);
				((ImportFEContext)_localctx).fname = match(QUOTE);
				setState(52);
				match(EOF);
				}
				break;
			case 3:
				_localctx = new ImportCommentLEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				match(COMMENT);
				setState(54);
				match(LINE_END);
				setState(55);
				imports();
				}
				break;
			case 4:
				_localctx = new ImportCommentFEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(COMMENT);
				setState(57);
				match(EOF);
				}
				break;
			case 5:
				_localctx = new ImportEmptyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(LINE_END);
				setState(59);
				imports();
				}
				break;
			case 6:
				_localctx = new ImportEndContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public Token name;
		public TerminalNode NAMESPACE_KEY() { return getToken(regexToolParser.NAMESPACE_KEY, 0); }
		public TerminalNode LINE_END() { return getToken(regexToolParser.LINE_END, 0); }
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(NAMESPACE_KEY);
			setState(64);
			((NamespaceContext)_localctx).name = match(IDENT);
			setState(65);
			match(LINE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(regexToolParser.LINE_END, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(regexToolParser.EOF, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				statement();
				setState(68);
				match(LINE_END);
				setState(69);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				statement();
				setState(72);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(LINE_END);
				setState(75);
				statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Label_stmtContext label_stmt() {
			return getRuleContext(Label_stmtContext.class,0);
		}
		public Capture_stmtContext capture_stmt() {
			return getRuleContext(Capture_stmtContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(regexToolParser.COMMENT, 0); }
		public Build_stmtContext build_stmt() {
			return getRuleContext(Build_stmtContext.class,0);
		}
		public Test_stmtContext test_stmt() {
			return getRuleContext(Test_stmtContext.class,0);
		}
		public Func_stmtContext func_stmt() {
			return getRuleContext(Func_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL_KEY:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				label_stmt();
				}
				break;
			case CAPTURE_KEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				capture_stmt();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(COMMENT);
				}
				break;
			case BUILD_KEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				build_stmt();
				}
				break;
			case TEST_KEY:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				test_stmt();
				}
				break;
			case FUNCTION_KEY:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				func_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Label_stmtContext extends ParserRuleContext {
		public Token name;
		public TermContext val;
		public TerminalNode LABEL_KEY() { return getToken(regexToolParser.LABEL_KEY, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Label_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterLabel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitLabel_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitLabel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_stmtContext label_stmt() throws RecognitionException {
		Label_stmtContext _localctx = new Label_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LABEL_KEY);
			setState(88);
			((Label_stmtContext)_localctx).name = match(IDENT);
			setState(89);
			match(T__0);
			setState(90);
			((Label_stmtContext)_localctx).val = term();
			setState(91);
			term_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capture_stmtContext extends ParserRuleContext {
		public Capture_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_stmt; }
	 
		public Capture_stmtContext() { }
		public void copyFrom(Capture_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaptureArrayContext extends Capture_stmtContext {
		public Token name;
		public TerminalNode CAPTURE_KEY() { return getToken(regexToolParser.CAPTURE_KEY, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public CaptureArrayContext(Capture_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterCaptureArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitCaptureArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitCaptureArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaptureSingleContext extends Capture_stmtContext {
		public Token name;
		public TerminalNode CAPTURE_KEY() { return getToken(regexToolParser.CAPTURE_KEY, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public CaptureSingleContext(Capture_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterCaptureSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitCaptureSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitCaptureSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_stmtContext capture_stmt() throws RecognitionException {
		Capture_stmtContext _localctx = new Capture_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_capture_stmt);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new CaptureSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(CAPTURE_KEY);
				setState(94);
				((CaptureSingleContext)_localctx).name = match(IDENT);
				setState(95);
				match(T__0);
				setState(96);
				term();
				setState(97);
				term_list();
				}
				break;
			case 2:
				_localctx = new CaptureArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(CAPTURE_KEY);
				setState(100);
				match(T__1);
				setState(101);
				((CaptureArrayContext)_localctx).name = match(IDENT);
				setState(102);
				match(T__0);
				setState(103);
				term();
				setState(104);
				term_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Build_stmtContext extends ParserRuleContext {
		public Token name;
		public VariableContext label;
		public Token flags;
		public TerminalNode BUILD_KEY() { return getToken(regexToolParser.BUILD_KEY, 0); }
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> CONSTANT() { return getTokens(regexToolParser.CONSTANT); }
		public TerminalNode CONSTANT(int i) {
			return getToken(regexToolParser.CONSTANT, i);
		}
		public Build_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterBuild_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitBuild_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitBuild_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Build_stmtContext build_stmt() throws RecognitionException {
		Build_stmtContext _localctx = new Build_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_build_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(BUILD_KEY);
			setState(109);
			((Build_stmtContext)_localctx).name = match(IDENT);
			setState(110);
			match(T__0);
			setState(111);
			((Build_stmtContext)_localctx).label = variable();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTANT) {
				{
				{
				setState(112);
				((Build_stmtContext)_localctx).flags = match(CONSTANT);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Test_stmtContext extends ParserRuleContext {
		public Test_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_stmt; }
	 
		public Test_stmtContext() { }
		public void copyFrom(Test_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TestConstContext extends Test_stmtContext {
		public VariableContext build;
		public Token input;
		public Test_outputContext output;
		public TerminalNode TEST_KEY() { return getToken(regexToolParser.TEST_KEY, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(regexToolParser.CONSTANT, 0); }
		public Test_outputContext test_output() {
			return getRuleContext(Test_outputContext.class,0);
		}
		public TestConstContext(Test_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterTestConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitTestConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitTestConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TestQuoteContext extends Test_stmtContext {
		public VariableContext build;
		public Token input;
		public Test_outputContext output;
		public TerminalNode TEST_KEY() { return getToken(regexToolParser.TEST_KEY, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public Test_outputContext test_output() {
			return getRuleContext(Test_outputContext.class,0);
		}
		public TestQuoteContext(Test_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterTestQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitTestQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitTestQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_stmtContext test_stmt() throws RecognitionException {
		Test_stmtContext _localctx = new Test_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_test_stmt);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new TestQuoteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(TEST_KEY);
				setState(119);
				((TestQuoteContext)_localctx).build = variable();
				setState(120);
				((TestQuoteContext)_localctx).input = match(QUOTE);
				setState(121);
				((TestQuoteContext)_localctx).output = test_output();
				}
				break;
			case 2:
				_localctx = new TestConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(TEST_KEY);
				setState(124);
				((TestConstContext)_localctx).build = variable();
				setState(125);
				((TestConstContext)_localctx).input = match(CONSTANT);
				setState(126);
				((TestConstContext)_localctx).output = test_output();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Test_outputContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public Test_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterTest_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitTest_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitTest_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_outputContext test_output() throws RecognitionException {
		Test_outputContext _localctx = new Test_outputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_test_output);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(QUOTE);
				}
				break;
			case EOF:
			case LINE_END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_stmtContext extends ParserRuleContext {
		public Token name;
		public Param_listContext params;
		public Term_listContext terms;
		public TerminalNode FUNCTION_KEY() { return getToken(regexToolParser.FUNCTION_KEY, 0); }
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public Func_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterFunc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitFunc_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitFunc_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_stmtContext func_stmt() throws RecognitionException {
		Func_stmtContext _localctx = new Func_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FUNCTION_KEY);
			setState(135);
			((Func_stmtContext)_localctx).name = match(IDENT);
			setState(136);
			match(T__2);
			setState(137);
			((Func_stmtContext)_localctx).params = param_list();
			setState(138);
			match(T__3);
			setState(139);
			match(T__0);
			setState(140);
			((Func_stmtContext)_localctx).terms = term_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_listContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public Term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterTerm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitTerm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitTerm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_listContext term_list() throws RecognitionException {
		Term_listContext _localctx = new Term_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term_list);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case IDENT:
			case NS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				term();
				setState(143);
				term_list();
				}
				break;
			case EOF:
			case LINE_END:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public VariableContext name;
		public Arg_listContext args;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((Func_callContext)_localctx).name = variable();
			setState(149);
			match(T__2);
			setState(150);
			((Func_callContext)_localctx).args = arg_list();
			setState(151);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncTermContext extends TermContext {
		public Func_callContext func;
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterFuncTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitFuncTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitFuncTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarTermContext extends TermContext {
		public VariableContext var;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterVarTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitVarTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitVarTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuoteTermContext extends TermContext {
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public QuoteTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterQuoteTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitQuoteTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitQuoteTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FuncTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((FuncTermContext)_localctx).func = func_call();
				}
				break;
			case 2:
				_localctx = new QuoteTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(QUOTE);
				}
				break;
			case 3:
				_localctx = new VarTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				((VarTermContext)_localctx).var = variable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarIdentContext extends VariableContext {
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public VarIdentContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterVarIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitVarIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitVarIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNSIdentContext extends VariableContext {
		public TerminalNode NS_IDENT() { return getToken(regexToolParser.NS_IDENT, 0); }
		public VarNSIdentContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterVarNSIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitVarNSIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitVarNSIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new VarIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(IDENT);
				}
				break;
			case NS_IDENT:
				_localctx = new VarNSIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(NS_IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_listContext extends ParserRuleContext {
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	 
		public Arg_listContext() { }
		public void copyFrom(Arg_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgHeadContext extends Arg_listContext {
		public TermContext val;
		public Arg_list_tailContext arg_list_tail() {
			return getRuleContext(Arg_list_tailContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArgHeadContext(Arg_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterArgHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitArgHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitArgHead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgEmptyContext extends Arg_listContext {
		public ArgEmptyContext(Arg_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterArgEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitArgEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitArgEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg_list);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case IDENT:
			case NS_IDENT:
				_localctx = new ArgHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((ArgHeadContext)_localctx).val = term();
				setState(165);
				arg_list_tail();
				}
				break;
			case T__3:
				_localctx = new ArgEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_list_tailContext extends ParserRuleContext {
		public Arg_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list_tail; }
	 
		public Arg_list_tailContext() { }
		public void copyFrom(Arg_list_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgListTailContext extends Arg_list_tailContext {
		public TermContext val;
		public Arg_list_tailContext arg_list_tail() {
			return getRuleContext(Arg_list_tailContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArgListTailContext(Arg_list_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterArgListTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitArgListTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitArgListTail(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgListDoneContext extends Arg_list_tailContext {
		public ArgListDoneContext(Arg_list_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterArgListDone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitArgListDone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitArgListDone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_list_tailContext arg_list_tail() throws RecognitionException {
		Arg_list_tailContext _localctx = new Arg_list_tailContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arg_list_tail);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new ArgListTailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__4);
				setState(171);
				((ArgListTailContext)_localctx).val = term();
				setState(172);
				arg_list_tail();
				}
				break;
			case T__3:
				_localctx = new ArgListDoneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_listContext extends ParserRuleContext {
		public ParamContext par;
		public Param_list_tailContext param_list_tail() {
			return getRuleContext(Param_list_tailContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_param_list);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((Param_listContext)_localctx).par = param();
				setState(178);
				param_list_tail();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_list_tailContext extends ParserRuleContext {
		public ParamContext par;
		public Param_list_tailContext param_list_tail() {
			return getRuleContext(Param_list_tailContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterParam_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitParam_list_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitParam_list_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_list_tailContext param_list_tail() throws RecognitionException {
		Param_list_tailContext _localctx = new Param_list_tailContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param_list_tail);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__4);
				setState(184);
				((Param_list_tailContext)_localctx).par = param();
				setState(185);
				param_list_tail();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\7\tt\n\t\f\t\16\t"+
		"w\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0083\n\n\3\13\3\13"+
		"\5\13\u0087\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0095"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u009f\n\17\3\20\3\20"+
		"\5\20\u00a3\n\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00ab\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\24\3\24\5\24\u00b8\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00bf\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\2\2\u00c6\2*\3\2\2\2\4?\3\2\2\2\6A\3\2\2"+
		"\2\bO\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22\u0082\3"+
		"\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u0094\3\2\2\2\32\u0096\3\2"+
		"\2\2\34\u009e\3\2\2\2\36\u00a2\3\2\2\2 \u00a4\3\2\2\2\"\u00aa\3\2\2\2"+
		"$\u00b1\3\2\2\2&\u00b7\3\2\2\2(\u00be\3\2\2\2*,\5\4\3\2+-\5\6\4\2,+\3"+
		"\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\b\5\2/\3\3\2\2\2\60\61\7\20\2\2\61\62\7"+
		"\22\2\2\62\63\7\n\2\2\63@\5\4\3\2\64\65\7\20\2\2\65\66\7\22\2\2\66@\7"+
		"\2\2\3\678\7\t\2\289\7\n\2\29@\5\4\3\2:;\7\t\2\2;@\7\2\2\3<=\7\n\2\2="+
		"@\5\4\3\2>@\3\2\2\2?\60\3\2\2\2?\64\3\2\2\2?\67\3\2\2\2?:\3\2\2\2?<\3"+
		"\2\2\2?>\3\2\2\2@\5\3\2\2\2AB\7\21\2\2BC\7\23\2\2CD\7\n\2\2D\7\3\2\2\2"+
		"EF\5\n\6\2FG\7\n\2\2GH\5\b\5\2HP\3\2\2\2IJ\5\n\6\2JK\7\2\2\3KP\3\2\2\2"+
		"LM\7\n\2\2MP\5\b\5\2NP\7\2\2\3OE\3\2\2\2OI\3\2\2\2OL\3\2\2\2ON\3\2\2\2"+
		"P\t\3\2\2\2QX\5\f\7\2RX\5\16\b\2SX\7\t\2\2TX\5\20\t\2UX\5\22\n\2VX\5\26"+
		"\f\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\13\3"+
		"\2\2\2YZ\7\13\2\2Z[\7\23\2\2[\\\7\3\2\2\\]\5\34\17\2]^\5\30\r\2^\r\3\2"+
		"\2\2_`\7\16\2\2`a\7\23\2\2ab\7\3\2\2bc\5\34\17\2cd\5\30\r\2dm\3\2\2\2"+
		"ef\7\16\2\2fg\7\4\2\2gh\7\23\2\2hi\7\3\2\2ij\5\34\17\2jk\5\30\r\2km\3"+
		"\2\2\2l_\3\2\2\2le\3\2\2\2m\17\3\2\2\2no\7\r\2\2op\7\23\2\2pq\7\3\2\2"+
		"qu\5\36\20\2rt\7\25\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\21\3"+
		"\2\2\2wu\3\2\2\2xy\7\f\2\2yz\5\36\20\2z{\7\22\2\2{|\5\24\13\2|\u0083\3"+
		"\2\2\2}~\7\f\2\2~\177\5\36\20\2\177\u0080\7\25\2\2\u0080\u0081\5\24\13"+
		"\2\u0081\u0083\3\2\2\2\u0082x\3\2\2\2\u0082}\3\2\2\2\u0083\23\3\2\2\2"+
		"\u0084\u0087\7\22\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7\17\2\2\u0089\u008a\7\23\2\2\u008a"+
		"\u008b\7\5\2\2\u008b\u008c\5&\24\2\u008c\u008d\7\6\2\2\u008d\u008e\7\3"+
		"\2\2\u008e\u008f\5\30\r\2\u008f\27\3\2\2\2\u0090\u0091\5\34\17\2\u0091"+
		"\u0092\5\30\r\2\u0092\u0095\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0090\3"+
		"\2\2\2\u0094\u0093\3\2\2\2\u0095\31\3\2\2\2\u0096\u0097\5\36\20\2\u0097"+
		"\u0098\7\5\2\2\u0098\u0099\5\"\22\2\u0099\u009a\7\6\2\2\u009a\33\3\2\2"+
		"\2\u009b\u009f\5\32\16\2\u009c\u009f\7\22\2\2\u009d\u009f\5\36\20\2\u009e"+
		"\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\35\3\2\2"+
		"\2\u00a0\u00a3\7\23\2\2\u00a1\u00a3\7\24\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\7\23\2\2\u00a5!\3\2\2\2\u00a6"+
		"\u00a7\5\34\17\2\u00a7\u00a8\5$\23\2\u00a8\u00ab\3\2\2\2\u00a9\u00ab\3"+
		"\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab#\3\2\2\2\u00ac\u00ad"+
		"\7\7\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\5$\23\2\u00af\u00b2\3\2\2\2"+
		"\u00b0\u00b2\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2%\3"+
		"\2\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5(\25\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\'\3\2\2\2"+
		"\u00b9\u00ba\7\7\2\2\u00ba\u00bb\5 \21\2\u00bb\u00bc\5(\25\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		")\3\2\2\2\21,?OWlu\u0082\u0086\u0094\u009e\u00a2\u00aa\u00b1\u00b7\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}