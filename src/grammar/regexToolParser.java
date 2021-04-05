// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/grammar\regexTool.g4 by ANTLR 4.9.1
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
		T__9=10, T__10=11, T__11=12, QUOTE=13, IDENT=14, WS=15, LINE_END=16;
	public static final int
		RULE_start = 0, RULE_imports = 1, RULE_comment = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_label_stmt = 5, RULE_capture_stmt = 6, RULE_build_stmt = 7, 
		RULE_term_list = 8, RULE_func_call = 9, RULE_term = 10, RULE_comma_list = 11, 
		RULE_comma_list_tail = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "imports", "comment", "statements", "statement", "label_stmt", 
			"capture_stmt", "build_stmt", "term_list", "func_call", "term", "comma_list", 
			"comma_list_tail"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'#'", "'\r'", "'\n'", "'label'", "'='", "'capture'", 
			"'capture[]'", "'build'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "QUOTE", "IDENT", "WS", "LINE_END"
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			imports();
			setState(27);
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
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public TerminalNode LINE_END() { return getToken(regexToolParser.LINE_END, 0); }
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imports);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(QUOTE);
				setState(31);
				match(LINE_END);
				setState(32);
				imports();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				comment();
				setState(34);
				match(LINE_END);
				setState(35);
				imports();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	public static class CommentContext extends ParserRuleContext {
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
		enterRule(_localctx, 4, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__2 || _la==T__3) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				statement();
				setState(48);
				match(LINE_END);
				setState(49);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				statement();
				setState(52);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				match(LINE_END);
				setState(55);
				statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				label_stmt();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				capture_stmt();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				comment();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				build_stmt();
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
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
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
			setState(65);
			match(T__4);
			setState(66);
			match(IDENT);
			setState(67);
			match(T__5);
			setState(68);
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
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_capture_stmt);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__6);
				setState(71);
				match(IDENT);
				setState(72);
				match(T__5);
				setState(73);
				term_list();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__7);
				setState(75);
				match(IDENT);
				setState(76);
				match(T__5);
				setState(77);
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
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__8);
			setState(81);
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
		enterRule(_localctx, 16, RULE_term_list);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				term();
				setState(84);
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
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public Comma_listContext comma_list() {
			return getRuleContext(Comma_listContext.class,0);
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
		enterRule(_localctx, 18, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENT);
			setState(90);
			match(T__9);
			setState(91);
			comma_list();
			setState(92);
			match(T__10);
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
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode QUOTE() { return getToken(regexToolParser.QUOTE, 0); }
		public TerminalNode IDENT() { return getToken(regexToolParser.IDENT, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				func_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(QUOTE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(IDENT);
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

	public static class Comma_listContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Comma_list_tailContext comma_list_tail() {
			return getRuleContext(Comma_list_tailContext.class,0);
		}
		public Comma_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterComma_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitComma_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitComma_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_listContext comma_list() throws RecognitionException {
		Comma_listContext _localctx = new Comma_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comma_list);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				term();
				setState(100);
				comma_list_tail();
				}
				break;
			case T__10:
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

	public static class Comma_list_tailContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Comma_list_tailContext comma_list_tail() {
			return getRuleContext(Comma_list_tailContext.class,0);
		}
		public Comma_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).enterComma_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof regexToolListener ) ((regexToolListener)listener).exitComma_list_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof regexToolVisitor ) return ((regexToolVisitor<? extends T>)visitor).visitComma_list_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_list_tailContext comma_list_tail() throws RecognitionException {
		Comma_list_tailContext _localctx = new Comma_list_tailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comma_list_tail);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__11);
				setState(106);
				term();
				setState(107);
				comma_list_tail();
				}
				break;
			case T__10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22s\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3)\n\3\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\5\nZ\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fd\n\f\3\r\3\r\3\r\3"+
		"\r\5\rj\n\r\3\16\3\16\3\16\3\16\3\16\5\16q\n\16\3\16\2\2\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\3\3\2\5\6\2t\2\34\3\2\2\2\4(\3\2\2\2\6*\3\2"+
		"\2\2\b;\3\2\2\2\nA\3\2\2\2\fC\3\2\2\2\16P\3\2\2\2\20R\3\2\2\2\22Y\3\2"+
		"\2\2\24[\3\2\2\2\26c\3\2\2\2\30i\3\2\2\2\32p\3\2\2\2\34\35\5\4\3\2\35"+
		"\36\5\b\5\2\36\3\3\2\2\2\37 \7\3\2\2 !\7\17\2\2!\"\7\22\2\2\")\5\4\3\2"+
		"#$\5\6\4\2$%\7\22\2\2%&\5\4\3\2&)\3\2\2\2\')\3\2\2\2(\37\3\2\2\2(#\3\2"+
		"\2\2(\'\3\2\2\2)\5\3\2\2\2*.\7\4\2\2+-\n\2\2\2,+\3\2\2\2-\60\3\2\2\2."+
		",\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\62\5\n\6\2\62\63\7\22\2"+
		"\2\63\64\5\b\5\2\64<\3\2\2\2\65\66\5\n\6\2\66\67\7\2\2\3\67<\3\2\2\28"+
		"9\7\22\2\29<\5\b\5\2:<\7\2\2\3;\61\3\2\2\2;\65\3\2\2\2;8\3\2\2\2;:\3\2"+
		"\2\2<\t\3\2\2\2=B\5\f\7\2>B\5\16\b\2?B\5\6\4\2@B\5\20\t\2A=\3\2\2\2A>"+
		"\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CD\7\7\2\2DE\7\20\2\2EF\7\b\2"+
		"\2FG\5\22\n\2G\r\3\2\2\2HI\7\t\2\2IJ\7\20\2\2JK\7\b\2\2KQ\5\22\n\2LM\7"+
		"\n\2\2MN\7\20\2\2NO\7\b\2\2OQ\5\22\n\2PH\3\2\2\2PL\3\2\2\2Q\17\3\2\2\2"+
		"RS\7\13\2\2ST\7\20\2\2T\21\3\2\2\2UV\5\26\f\2VW\5\22\n\2WZ\3\2\2\2XZ\3"+
		"\2\2\2YU\3\2\2\2YX\3\2\2\2Z\23\3\2\2\2[\\\7\20\2\2\\]\7\f\2\2]^\5\30\r"+
		"\2^_\7\r\2\2_\25\3\2\2\2`d\5\24\13\2ad\7\17\2\2bd\7\20\2\2c`\3\2\2\2c"+
		"a\3\2\2\2cb\3\2\2\2d\27\3\2\2\2ef\5\26\f\2fg\5\32\16\2gj\3\2\2\2hj\3\2"+
		"\2\2ie\3\2\2\2ih\3\2\2\2j\31\3\2\2\2kl\7\16\2\2lm\5\26\f\2mn\5\32\16\2"+
		"nq\3\2\2\2oq\3\2\2\2pk\3\2\2\2po\3\2\2\2q\33\3\2\2\2\13(.;APYcip";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}