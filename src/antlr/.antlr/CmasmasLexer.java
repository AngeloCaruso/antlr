// Generated from d:\u005Cuser-\Escritorio\automatas\src\antlr\Cmasmas.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmasmasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LETRA=7, OPERADORES=8, 
		VARIABLE=9, CONSTANTE=10, IGNORE=11, ESPACIO=12, SALTO=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "MINUSCULAS", "MAYUSCULAS", 
		"DIGITO", "SIGNO", "SEPARADOR", "LETRA", "OPERADORES", "VARIABLE", "CONSTANTE", 
		"IGNORE", "ESPACIO", "SALTO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cout<<'", "';'", "'<<'", "'cin>>'", "'\"'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "LETRA", "OPERADORES", "VARIABLE", 
		"CONSTANTE", "IGNORE", "ESPACIO", "SALTO"
	};
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


	public CmasmasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmasmas.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\5\rJ\n\r\3\16\3\16\5\16N\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17W\n\17\f\17\16\17Z\13\17\3\17\7\17]\n\17\f\17\16\17`\13"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17h\n\17\f\17\16\17k\13\17\3\17\3"+
		"\17\3\20\6\20p\n\20\r\20\16\20q\3\20\3\20\6\20v\n\20\r\20\16\20w\5\20"+
		"z\n\20\3\21\3\21\5\21~\n\21\3\21\3\21\3\22\3\22\3\23\5\23\u0085\n\23\3"+
		"\23\3\23\5\23\u0089\n\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23"+
		"\2\25\2\27\2\31\t\33\n\35\13\37\f!\r#\16%\17\3\2\t\3\2c|\3\2C\\\3\2\62"+
		";\4\2--//\4\2..\60\60\4\2,,\61\61\4\2\13\13\"\"\2\u0095\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\3\'\3\2\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\63\3\2\2\2\139\3\2\2\2\r;\3"+
		"\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31"+
		"I\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37o\3\2\2\2!}\3\2\2\2#\u0081\3\2\2\2"+
		"%\u0088\3\2\2\2\'(\7e\2\2()\7q\2\2)*\7w\2\2*+\7v\2\2+,\7>\2\2,-\7>\2\2"+
		"-\4\3\2\2\2./\7=\2\2/\6\3\2\2\2\60\61\7>\2\2\61\62\7>\2\2\62\b\3\2\2\2"+
		"\63\64\7e\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67\7@\2\2\678\7@\2\28\n\3\2"+
		"\2\29:\7$\2\2:\f\3\2\2\2;<\7<\2\2<\16\3\2\2\2=>\t\2\2\2>\20\3\2\2\2?@"+
		"\t\3\2\2@\22\3\2\2\2AB\t\4\2\2B\24\3\2\2\2CD\t\5\2\2D\26\3\2\2\2EF\t\6"+
		"\2\2F\30\3\2\2\2GJ\5\17\b\2HJ\5\21\t\2IG\3\2\2\2IH\3\2\2\2J\32\3\2\2\2"+
		"KN\5\25\13\2LN\t\7\2\2MK\3\2\2\2ML\3\2\2\2N\34\3\2\2\2OX\5\31\r\2PW\5"+
		"\23\n\2QW\5\31\r\2RS\7a\2\2SW\5\23\n\2TU\7a\2\2UW\5\31\r\2VP\3\2\2\2V"+
		"Q\3\2\2\2VR\3\2\2\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y^\3\2\2\2"+
		"ZX\3\2\2\2[]\7a\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_i\3\2\2"+
		"\2`^\3\2\2\2ah\5\23\n\2bh\5\31\r\2cd\7a\2\2dh\5\23\n\2ef\7a\2\2fh\5\31"+
		"\r\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2"+
		"\2\2jl\3\2\2\2ki\3\2\2\2lm\7a\2\2m\36\3\2\2\2np\5\23\n\2on\3\2\2\2pq\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2ry\3\2\2\2su\5\27\f\2tv\5\23\n\2ut\3\2\2\2v"+
		"w\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2ys\3\2\2\2yz\3\2\2\2z \3\2\2\2"+
		"{~\5#\22\2|~\5%\23\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0080\b\21\2"+
		"\2\u0080\"\3\2\2\2\u0081\u0082\t\b\2\2\u0082$\3\2\2\2\u0083\u0085\7\17"+
		"\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0089\7\f\2\2\u0087\u0089\7\17\2\2\u0088\u0084\3\2\2\2\u0088\u0087\3"+
		"\2\2\2\u0089&\3\2\2\2\20\2IMVX^giqwy}\u0084\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}