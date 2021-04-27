// Generated from /home/CS/users/oelliott/.linux/cos382/project/QueryBuilder/src/grammar/regexTool.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, QUOTE=15, IDENT=16, NS_IDENT=17, 
		WS=18, LINE_END=19, CONSTANT=20;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_namespace = 2, RULE_comment = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_label_stmt = 6, RULE_capture_stmt = 7, 
		RULE_build_stmt = 8, RULE_test_stmt = 9, RULE_func_stmt = 10, RULE_term_list = 11, 
		RULE_func_call = 12, RULE_term = 13, RULE_variable = 14, RULE_param = 15, 
		RULE_arg_list = 16, RULE_arg_list_tail = 17, RULE_param_list = 18, RULE_param_list_tail = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "namespace", "comment", "statements", "statement", 
			"label_stmt", "capture_stmt", "build_stmt", "test_stmt", "func_stmt", 
			"term_list", "func_call", "term", "variable", "param", "arg_list", "arg_list_tail", 
			"param_list", "param_list_tail"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'namespace'", "'#'", "'\r'", "'label'", "'='", "'capture'", 
			"'capture[]'", "'build'", "'test'", "'function'", "'('", "')'", "','", 
			null, null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "QUOTE", "IDENT", "NS_IDENT", "WS", "LINE_END", "CONSTANT"
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
			if (_la==T__1) {
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportLEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__0);
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
				match(T__0);
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
				comment();
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
				setState(57);
				comment();
				setState(58);
				match(EOF);
				}
				break;
			case 5:
				_localctx = new ImportEmptyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(LINE_END);
				setState(61);
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
			setState(65);
			match(T__1);
			setState(66);
			((NamespaceContext)_localctx).name = match(IDENT);
			setState(67);
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> LINE_END() { return getTokens(regexToolParser.LINE_END); }
		public TerminalNode LINE_END(int i) {
			return getToken(regexToolParser.LINE_END, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << QUOTE) | (1L << IDENT) | (1L << NS_IDENT) | (1L << WS) | (1L << CONSTANT))) != 0)) {
				{
				{
				setState(70);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==T__3 || _la==LINE_END) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(75);
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
		enterRule(_localctx, 8, RULE_statements);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				statement();
				setState(77);
				match(LINE_END);
				setState(78);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				statement();
				setState(81);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(LINE_END);
				setState(84);
				statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				label_stmt();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				capture_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				comment();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				build_stmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				test_stmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
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
		enterRule(_localctx, 12, RULE_label_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__4);
			setState(97);
			((Label_stmtContext)_localctx).name = match(IDENT);
			setState(98);
			match(T__5);
			setState(99);
			((Label_stmtContext)_localctx).val = term();
			setState(100);
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
		public Token name;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public Capture_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterCapture_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitCapture_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitCapture_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_stmtContext capture_stmt() throws RecognitionException {
		Capture_stmtContext _localctx = new Capture_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_capture_stmt);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__6);
				setState(103);
				((Capture_stmtContext)_localctx).name = match(IDENT);
				setState(104);
				match(T__5);
				setState(105);
				term();
				setState(106);
				term_list();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(T__7);
				setState(109);
				((Capture_stmtContext)_localctx).name = match(IDENT);
				setState(110);
				match(T__5);
				setState(111);
				term();
				setState(112);
				term_list();
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

	public static class Build_stmtContext extends ParserRuleContext {
		public Token name;
		public VariableContext label;
		public Token flags;
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
		enterRule(_localctx, 16, RULE_build_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__8);
			setState(117);
			((Build_stmtContext)_localctx).name = match(IDENT);
			setState(118);
			match(T__5);
			setState(119);
			((Build_stmtContext)_localctx).label = variable();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTANT) {
				{
				{
				setState(120);
				((Build_stmtContext)_localctx).flags = match(CONSTANT);
				}
				}
				setState(125);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(regexToolParser.CONSTANT, 0); }
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
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
		enterRule(_localctx, 18, RULE_test_stmt);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new TestQuoteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__9);
				setState(127);
				((TestQuoteContext)_localctx).build = variable();
				setState(128);
				((TestQuoteContext)_localctx).input = match(QUOTE);
				}
				break;
			case 2:
				_localctx = new TestConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__9);
				setState(131);
				((TestConstContext)_localctx).build = variable();
				setState(132);
				((TestConstContext)_localctx).input = match(CONSTANT);
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

	public static class Func_stmtContext extends ParserRuleContext {
		public Token name;
		public Param_listContext params;
		public Term_listContext terms;
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
			setState(136);
			match(T__10);
			setState(137);
			((Func_stmtContext)_localctx).name = match(IDENT);
			setState(138);
			match(T__11);
			setState(139);
			((Func_stmtContext)_localctx).params = param_list();
			setState(140);
			match(T__12);
			setState(141);
			match(T__5);
			setState(142);
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case IDENT:
			case NS_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				term();
				setState(145);
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
			setState(150);
			((Func_callContext)_localctx).name = variable();
			setState(151);
			match(T__11);
			setState(152);
			((Func_callContext)_localctx).args = arg_list();
			setState(153);
			match(T__12);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new FuncTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((FuncTermContext)_localctx).func = func_call();
				}
				break;
			case 2:
				_localctx = new QuoteTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(QUOTE);
				}
				break;
			case 3:
				_localctx = new VarTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
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
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new VarIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(IDENT);
				}
				break;
			case NS_IDENT:
				_localctx = new VarNSIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
			setState(164);
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
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case IDENT:
			case NS_IDENT:
				_localctx = new ArgHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				((ArgHeadContext)_localctx).val = term();
				setState(167);
				arg_list_tail();
				}
				break;
			case T__12:
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
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new ArgListTailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__13);
				setState(173);
				((ArgListTailContext)_localctx).val = term();
				setState(174);
				arg_list_tail();
				}
				break;
			case T__12:
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
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				((Param_listContext)_localctx).par = param();
				setState(180);
				param_list_tail();
				}
				break;
			case T__12:
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
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__13);
				setState(186);
				((Param_list_tailContext)_localctx).par = param();
				setState(187);
				param_list_tail();
				}
				break;
			case T__12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0089\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a1"+
		"\n\17\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00ad"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u00b4\n\23\3\24\3\24\3\24\3\24\5\24"+
		"\u00ba\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00c1\n\25\3\25\2\2\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\4\2\6\6\25\25\2\u00c8\2*\3"+
		"\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nX\3\2\2\2\f`\3\2\2\2\16b\3\2"+
		"\2\2\20t\3\2\2\2\22v\3\2\2\2\24\u0088\3\2\2\2\26\u008a\3\2\2\2\30\u0096"+
		"\3\2\2\2\32\u0098\3\2\2\2\34\u00a0\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2"+
		"\2\2\"\u00ac\3\2\2\2$\u00b3\3\2\2\2&\u00b9\3\2\2\2(\u00c0\3\2\2\2*,\5"+
		"\4\3\2+-\5\6\4\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2./\5\n\6\2/\3\3\2\2\2\60"+
		"\61\7\3\2\2\61\62\7\21\2\2\62\63\7\25\2\2\63B\5\4\3\2\64\65\7\3\2\2\65"+
		"\66\7\21\2\2\66B\7\2\2\3\678\5\b\5\289\7\25\2\29:\5\4\3\2:B\3\2\2\2;<"+
		"\5\b\5\2<=\7\2\2\3=B\3\2\2\2>?\7\25\2\2?B\5\4\3\2@B\3\2\2\2A\60\3\2\2"+
		"\2A\64\3\2\2\2A\67\3\2\2\2A;\3\2\2\2A>\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD"+
		"\7\4\2\2DE\7\22\2\2EF\7\25\2\2F\7\3\2\2\2GK\7\5\2\2HJ\n\2\2\2IH\3\2\2"+
		"\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\5\f\7\2OP\7\25"+
		"\2\2PQ\5\n\6\2QY\3\2\2\2RS\5\f\7\2ST\7\2\2\3TY\3\2\2\2UV\7\25\2\2VY\5"+
		"\n\6\2WY\7\2\2\3XN\3\2\2\2XR\3\2\2\2XU\3\2\2\2XW\3\2\2\2Y\13\3\2\2\2Z"+
		"a\5\16\b\2[a\5\20\t\2\\a\5\b\5\2]a\5\22\n\2^a\5\24\13\2_a\5\26\f\2`Z\3"+
		"\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\r\3\2\2\2b"+
		"c\7\7\2\2cd\7\22\2\2de\7\b\2\2ef\5\34\17\2fg\5\30\r\2g\17\3\2\2\2hi\7"+
		"\t\2\2ij\7\22\2\2jk\7\b\2\2kl\5\34\17\2lm\5\30\r\2mu\3\2\2\2no\7\n\2\2"+
		"op\7\22\2\2pq\7\b\2\2qr\5\34\17\2rs\5\30\r\2su\3\2\2\2th\3\2\2\2tn\3\2"+
		"\2\2u\21\3\2\2\2vw\7\13\2\2wx\7\22\2\2xy\7\b\2\2y}\5\36\20\2z|\7\26\2"+
		"\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177}\3\2\2\2"+
		"\u0080\u0081\7\f\2\2\u0081\u0082\5\36\20\2\u0082\u0083\7\21\2\2\u0083"+
		"\u0089\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7"+
		"\26\2\2\u0087\u0089\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0084\3\2\2\2\u0089"+
		"\25\3\2\2\2\u008a\u008b\7\r\2\2\u008b\u008c\7\22\2\2\u008c\u008d\7\16"+
		"\2\2\u008d\u008e\5&\24\2\u008e\u008f\7\17\2\2\u008f\u0090\7\b\2\2\u0090"+
		"\u0091\5\30\r\2\u0091\27\3\2\2\2\u0092\u0093\5\34\17\2\u0093\u0094\5\30"+
		"\r\2\u0094\u0097\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\31\3\2\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7\16"+
		"\2\2\u009a\u009b\5\"\22\2\u009b\u009c\7\17\2\2\u009c\33\3\2\2\2\u009d"+
		"\u00a1\5\32\16\2\u009e\u00a1\7\21\2\2\u009f\u00a1\5\36\20\2\u00a0\u009d"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\35\3\2\2\2\u00a2"+
		"\u00a5\7\22\2\2\u00a3\u00a5\7\23\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7!\3\2\2\2\u00a8\u00a9"+
		"\5\34\17\2\u00a9\u00aa\5$\23\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\3\2\2\2"+
		"\u00ac\u00a8\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad#\3\2\2\2\u00ae\u00af\7"+
		"\20\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\5$\23\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4%\3"+
		"\2\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\5(\25\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\'\3\2\2\2"+
		"\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be\5(\25\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		")\3\2\2\2\21,AKX`t}\u0088\u0096\u00a0\u00a4\u00ac\u00b3\u00b9\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}