// Generated from /home/CS/users/oelliott/.linux/cos382/project/QueryBuilder/src/grammar/regexTool.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, QUOTE=15, IDENT=16, NS_IDENT=17, 
		WS=18, LINE_END=19, CONSTANT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "QUOTE", "IDENT", "NS_IDENT", 
			"WS", "LINE_END", "CONSTANT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\7\20y\n\20\f\20\16\20|\13\20\3\20\3\20\3\21\3\21\7\21\u0082\n"+
		"\21\f\21\16\21\u0085\13\21\3\22\3\22\3\22\3\22\3\23\6\23\u008c\n\23\r"+
		"\23\16\23\u008d\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25\u0097\n\25\f\25"+
		"\16\25\u009a\13\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\t\4\2$$))\7\2"+
		"\f\f\17\17$$))^^\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2\13\13\"\"\3\2C\\\5"+
		"\2\62;C\\aa\2\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2"+
		"\5\62\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2"+
		"\21P\3\2\2\2\23Z\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31n\3\2\2\2\33p\3\2\2"+
		"\2\35r\3\2\2\2\37t\3\2\2\2!\177\3\2\2\2#\u0086\3\2\2\2%\u008b\3\2\2\2"+
		"\'\u0091\3\2\2\2)\u0093\3\2\2\2+,\7k\2\2,-\7o\2\2-.\7r\2\2./\7q\2\2/\60"+
		"\7t\2\2\60\61\7v\2\2\61\4\3\2\2\2\62\63\7p\2\2\63\64\7c\2\2\64\65\7o\2"+
		"\2\65\66\7g\2\2\66\67\7u\2\2\678\7r\2\289\7c\2\29:\7e\2\2:;\7g\2\2;\6"+
		"\3\2\2\2<=\7%\2\2=\b\3\2\2\2>?\7\17\2\2?\n\3\2\2\2@A\7n\2\2AB\7c\2\2B"+
		"C\7d\2\2CD\7g\2\2DE\7n\2\2E\f\3\2\2\2FG\7?\2\2G\16\3\2\2\2HI\7e\2\2IJ"+
		"\7c\2\2JK\7r\2\2KL\7v\2\2LM\7w\2\2MN\7t\2\2NO\7g\2\2O\20\3\2\2\2PQ\7e"+
		"\2\2QR\7c\2\2RS\7r\2\2ST\7v\2\2TU\7w\2\2UV\7t\2\2VW\7g\2\2WX\7]\2\2XY"+
		"\7_\2\2Y\22\3\2\2\2Z[\7d\2\2[\\\7w\2\2\\]\7k\2\2]^\7n\2\2^_\7f\2\2_\24"+
		"\3\2\2\2`a\7v\2\2ab\7g\2\2bc\7u\2\2cd\7v\2\2d\26\3\2\2\2ef\7h\2\2fg\7"+
		"w\2\2gh\7p\2\2hi\7e\2\2ij\7v\2\2jk\7k\2\2kl\7q\2\2lm\7p\2\2m\30\3\2\2"+
		"\2no\7*\2\2o\32\3\2\2\2pq\7+\2\2q\34\3\2\2\2rs\7.\2\2s\36\3\2\2\2tz\t"+
		"\2\2\2uy\n\3\2\2vw\7^\2\2wy\13\2\2\2xu\3\2\2\2xv\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\t\2\2\2~ \3\2\2\2\177\u0083\t\4"+
		"\2\2\u0080\u0082\t\5\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\"\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0086\u0087\5!\21\2\u0087\u0088\7\60\2\2\u0088\u0089\5!\21\2\u0089$\3"+
		"\2\2\2\u008a\u008c\t\6\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\23"+
		"\2\2\u0090&\3\2\2\2\u0091\u0092\7\f\2\2\u0092(\3\2\2\2\u0093\u0094\7B"+
		"\2\2\u0094\u0098\t\7\2\2\u0095\u0097\t\b\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099*\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\b\2xz\u0083\u008d\u0098\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}