// Generated from C:/Users/jeffr/Documents/School/Language/RegexTool/src/grammar\regexTool.g4 by ANTLR 4.9.1
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
		T__9=10, T__10=11, T__11=12, QUOTE=13, IDENT=14, WS=15, LINE_END=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "QUOTE", "IDENT", "WS", "LINE_END"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16[\n\16\f\16\16\16^\13\16\3\16\3\16\3\17\3\17\7\17d\n\17\f\17"+
		"\16\17g\13\17\3\20\6\20j\n\20\r\20\16\20k\3\20\3\20\3\21\6\21q\n\21\r"+
		"\21\16\21r\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\7\6\2\f\f\17\17))^^\6\2&&C\\aac|\7\2&&\62"+
		";C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2x\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5*\3\2\2\2\7,\3\2\2\2\t.\3"+
		"\2\2\2\13\60\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21@\3\2\2\2\23J\3\2\2\2"+
		"\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35a\3\2\2\2\37i\3\2\2"+
		"\2!p\3\2\2\2#$\7k\2\2$%\7o\2\2%&\7r\2\2&\'\7q\2\2\'(\7t\2\2()\7v\2\2)"+
		"\4\3\2\2\2*+\7%\2\2+\6\3\2\2\2,-\7\17\2\2-\b\3\2\2\2./\7\f\2\2/\n\3\2"+
		"\2\2\60\61\7n\2\2\61\62\7c\2\2\62\63\7d\2\2\63\64\7g\2\2\64\65\7n\2\2"+
		"\65\f\3\2\2\2\66\67\7?\2\2\67\16\3\2\2\289\7e\2\29:\7c\2\2:;\7r\2\2;<"+
		"\7v\2\2<=\7w\2\2=>\7t\2\2>?\7g\2\2?\20\3\2\2\2@A\7e\2\2AB\7c\2\2BC\7r"+
		"\2\2CD\7v\2\2DE\7w\2\2EF\7t\2\2FG\7g\2\2GH\7]\2\2HI\7_\2\2I\22\3\2\2\2"+
		"JK\7d\2\2KL\7w\2\2LM\7k\2\2MN\7n\2\2NO\7f\2\2O\24\3\2\2\2PQ\7*\2\2Q\26"+
		"\3\2\2\2RS\7+\2\2S\30\3\2\2\2TU\7.\2\2U\32\3\2\2\2V\\\7)\2\2W[\n\2\2\2"+
		"XY\7^\2\2Y[\13\2\2\2ZW\3\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]_\3\2\2\2^\\\3\2\2\2_`\7)\2\2`\34\3\2\2\2ae\t\3\2\2bd\t\4\2\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\36\3\2\2\2ge\3\2\2\2hj\t\5\2\2ih\3"+
		"\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\20\2\2n \3\2\2\2oq"+
		"\t\6\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\"\3\2\2\2\b\2Z\\ekr"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}