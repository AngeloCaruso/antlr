// Generated from d:\u005Cuser-\Escritorio\automatas\src\antlr\Cmasmas.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmasmasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, LETRA=7, OPERADORES=8, 
		VARIABLE=9, CONSTANTE=10, IGNORE=11, ESPACIO=12, SALTO=13;
	public static final int
		RULE_evaluar = 0, RULE_cadena = 1, RULE_cabecera = 2, RULE_pie = 3, RULE_entrada = 4, 
		RULE_io = 5, RULE_mensaje = 6, RULE_instrucciones = 7, RULE_componente = 8;
	public static final String[] ruleNames = {
		"evaluar", "cadena", "cabecera", "pie", "entrada", "io", "mensaje", "instrucciones", 
		"componente"
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

	@Override
	public String getGrammarFileName() { return "Cmasmas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmasmasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EvaluarContext extends ParserRuleContext {
		public CadenaContext cadena() {
			return getRuleContext(CadenaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmasmasParser.EOF, 0); }
		public EvaluarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluar; }
	}

	public final EvaluarContext evaluar() throws RecognitionException {
		EvaluarContext _localctx = new EvaluarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_evaluar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			cadena();
			setState(19);
			match(EOF);
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

	public static class CadenaContext extends ParserRuleContext {
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public PieContext pie() {
			return getRuleContext(PieContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public CadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cadena; }
	}

	public final CadenaContext cadena() throws RecognitionException {
		CadenaContext _localctx = new CadenaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cadena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			cabecera();
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				instrucciones();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE || _la==CONSTANTE );
			setState(27);
			pie();
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

	public static class CabeceraContext extends ParserRuleContext {
		public MensajeContext mensaje() {
			return getRuleContext(MensajeContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(29);
				match(T__0);
				setState(30);
				mensaje();
				setState(31);
				match(T__1);
				setState(32);
				entrada();
				}
				break;
			case T__3:
				{
				setState(34);
				entrada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(37);
			match(T__1);
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

	public static class PieContext extends ParserRuleContext {
		public MensajeContext mensaje() {
			return getRuleContext(MensajeContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public PieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pie; }
	}

	public final PieContext pie() throws RecognitionException {
		PieContext _localctx = new PieContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(39);
				match(T__0);
				setState(40);
				mensaje();
				setState(41);
				match(T__1);
				setState(42);
				match(T__0);
				setState(43);
				io();
				}
				break;
			case 2:
				{
				setState(45);
				match(T__0);
				setState(46);
				mensaje();
				setState(47);
				match(T__2);
				setState(48);
				io();
				}
				break;
			}
			setState(52);
			match(T__1);
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

	public static class EntradaContext extends ParserRuleContext {
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			io();
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

	public static class IoContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(CmasmasParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(CmasmasParser.LETRA, i);
		}
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_io);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(LETRA);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
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

	public static class MensajeContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(CmasmasParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(CmasmasParser.LETRA, i);
		}
		public List<TerminalNode> ESPACIO() { return getTokens(CmasmasParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(CmasmasParser.ESPACIO, i);
		}
		public MensajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensaje; }
	}

	public final MensajeContext mensaje() throws RecognitionException {
		MensajeContext _localctx = new MensajeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mensaje);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__4);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LETRA) | (1L << ESPACIO))) != 0)) {
				{
				{
				setState(63);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << LETRA) | (1L << ESPACIO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__4);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public List<ComponenteContext> componente() {
			return getRuleContexts(ComponenteContext.class);
		}
		public ComponenteContext componente(int i) {
			return getRuleContext(ComponenteContext.class,i);
		}
		public TerminalNode OPERADORES() { return getToken(CmasmasParser.OPERADORES, 0); }
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			componente();
			setState(72);
			match(OPERADORES);
			setState(73);
			componente();
			setState(74);
			match(T__1);
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

	public static class ComponenteContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(CmasmasParser.VARIABLE, 0); }
		public TerminalNode CONSTANTE() { return getToken(CmasmasParser.CONSTANTE, 0); }
		public ComponenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componente; }
	}

	public final ComponenteContext componente() throws RecognitionException {
		ComponenteContext _localctx = new ComponenteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\6\7=\n\7\r\7\16\7>\3\b\3\b\7\bC\n\b\f\b\16\bF\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22"+
		"\2\4\4\2\b\t\16\16\3\2\13\f\2L\2\24\3\2\2\2\4\27\3\2\2\2\6%\3\2\2\2\b"+
		"\64\3\2\2\2\n8\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20I\3\2\2\2\22N\3\2\2\2"+
		"\24\25\5\4\3\2\25\26\7\2\2\3\26\3\3\2\2\2\27\31\5\6\4\2\30\32\5\20\t\2"+
		"\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2"+
		"\35\36\5\b\5\2\36\5\3\2\2\2\37 \7\3\2\2 !\5\16\b\2!\"\7\4\2\2\"#\5\n\6"+
		"\2#&\3\2\2\2$&\5\n\6\2%\37\3\2\2\2%$\3\2\2\2&\'\3\2\2\2\'(\7\4\2\2(\7"+
		"\3\2\2\2)*\7\3\2\2*+\5\16\b\2+,\7\4\2\2,-\7\3\2\2-.\5\f\7\2.\65\3\2\2"+
		"\2/\60\7\3\2\2\60\61\5\16\b\2\61\62\7\5\2\2\62\63\5\f\7\2\63\65\3\2\2"+
		"\2\64)\3\2\2\2\64/\3\2\2\2\65\66\3\2\2\2\66\67\7\4\2\2\67\t\3\2\2\289"+
		"\7\6\2\29:\5\f\7\2:\13\3\2\2\2;=\7\t\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2"+
		">?\3\2\2\2?\r\3\2\2\2@D\7\7\2\2AC\t\2\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\7\2\2H\17\3\2\2\2IJ\5\22\n\2JK\7"+
		"\n\2\2KL\5\22\n\2LM\7\4\2\2M\21\3\2\2\2NO\t\3\2\2O\23\3\2\2\2\7\33%\64"+
		">D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}