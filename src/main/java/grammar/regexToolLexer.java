// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/main/java/grammar\regexTool.g4 by ANTLR 4.9.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class regexToolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, COMMENT=7, LINE_END=8, LABEL_KEY=9, 
		TEST_KEY=10, BUILD_KEY=11, CAPTURE_KEY=12, FUNCTION_KEY=13, IMPORT_KEY=14, 
		NAMESPACE_KEY=15, QUOTE=16, IDENT=17, NS_IDENT=18, CONSTANT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "COMMENT", "LINE_END", 
			"LABEL_KEY", "TEST_KEY", "BUILD_KEY", "CAPTURE_KEY", "FUNCTION_KEY", 
			"IMPORT_KEY", "NAMESPACE_KEY", "QUOTE", "IDENT", "NS_IDENT", "CONSTANT"
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


	public regexToolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "regexTool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\6\7\66\n\7\r\7\16\7\67\3\7\3\7\3\b\3\b\7\b>\n\b\f\b\16\bA\13\b\3"+
		"\t\5\tD\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"\177\n\21\f\21\16\21\u0082\13\21\3\21\3\21\3\22\3\22\7\22\u0088\n\22\f"+
		"\22\16\22\u008b\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u0094\n"+
		"\24\f\24\16\24\u0097\13\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\n\5\2\13\13"+
		"\17\17\"\"\4\2\f\f\17\17\4\2$$))\7\2\f\f\17\17$$))^^\6\2&&C\\aac|\7\2"+
		"&&\62;C\\aac|\3\2C\\\5\2\62;C\\aa\2\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\3)\3\2\2\2\5+\3\2\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\65\3\2"+
		"\2\2\17;\3\2\2\2\21C\3\2\2\2\23G\3\2\2\2\25M\3\2\2\2\27R\3\2\2\2\31X\3"+
		"\2\2\2\33`\3\2\2\2\35i\3\2\2\2\37p\3\2\2\2!z\3\2\2\2#\u0085\3\2\2\2%\u008c"+
		"\3\2\2\2\'\u0090\3\2\2\2)*\7?\2\2*\4\3\2\2\2+,\7]\2\2,-\7_\2\2-\6\3\2"+
		"\2\2./\7*\2\2/\b\3\2\2\2\60\61\7+\2\2\61\n\3\2\2\2\62\63\7.\2\2\63\f\3"+
		"\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2"+
		"\2\289\3\2\2\29:\b\7\2\2:\16\3\2\2\2;?\7%\2\2<>\n\3\2\2=<\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\20\3\2\2\2A?\3\2\2\2BD\7\17\2\2CB\3\2\2\2"+
		"CD\3\2\2\2DE\3\2\2\2EF\7\f\2\2F\22\3\2\2\2GH\7n\2\2HI\7c\2\2IJ\7d\2\2"+
		"JK\7g\2\2KL\7n\2\2L\24\3\2\2\2MN\7v\2\2NO\7g\2\2OP\7u\2\2PQ\7v\2\2Q\26"+
		"\3\2\2\2RS\7d\2\2ST\7w\2\2TU\7k\2\2UV\7n\2\2VW\7f\2\2W\30\3\2\2\2XY\7"+
		"e\2\2YZ\7c\2\2Z[\7r\2\2[\\\7v\2\2\\]\7w\2\2]^\7t\2\2^_\7g\2\2_\32\3\2"+
		"\2\2`a\7h\2\2ab\7w\2\2bc\7p\2\2cd\7e\2\2de\7v\2\2ef\7k\2\2fg\7q\2\2gh"+
		"\7p\2\2h\34\3\2\2\2ij\7k\2\2jk\7o\2\2kl\7r\2\2lm\7q\2\2mn\7t\2\2no\7v"+
		"\2\2o\36\3\2\2\2pq\7p\2\2qr\7c\2\2rs\7o\2\2st\7g\2\2tu\7u\2\2uv\7r\2\2"+
		"vw\7c\2\2wx\7e\2\2xy\7g\2\2y \3\2\2\2z\u0080\t\4\2\2{\177\n\5\2\2|}\7"+
		"^\2\2}\177\13\2\2\2~{\3\2\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\t\4\2\2\u0084\"\3\2\2\2\u0085\u0089\t\6\2\2\u0086\u0088\t\7\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a$\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\5#\22\2\u008d\u008e"+
		"\7\60\2\2\u008e\u008f\5#\22\2\u008f&\3\2\2\2\u0090\u0091\7B\2\2\u0091"+
		"\u0095\t\b\2\2\u0092\u0094\t\t\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096(\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\n\2\67?C~\u0080\u0089\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}