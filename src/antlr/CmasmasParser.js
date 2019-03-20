// Generated from Cmasmas.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
var CmasmasListener = require('./CmasmasListener').CmasmasListener;
var grammarFileName = "Cmasmas.g4";

var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u000fQ\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0003\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0003\u0003\u0003\u0006\u0003\u001a\n\u0003\r\u0003\u000e\u0003\u001b",
    "\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004",
    "\u0003\u0004\u0003\u0004\u0005\u0004&\n\u0004\u0003\u0004\u0003\u0004",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005",
    "5\n\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0007\u0006\u0007=\n\u0007\r\u0007\u000e\u0007>\u0003\b\u0003",
    "\b\u0007\bC\n\b\f\b\u000e\bF\u000b\b\u0003\b\u0003\b\u0003\t\u0003\t",
    "\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0003\n\u0002\u0002\u000b\u0002",
    "\u0004\u0006\b\n\f\u000e\u0010\u0012\u0002\u0004\u0004\u0002\b\t\u000e",
    "\u000e\u0003\u0002\u000b\f\u0002L\u0002\u0014\u0003\u0002\u0002\u0002",
    "\u0004\u0017\u0003\u0002\u0002\u0002\u0006%\u0003\u0002\u0002\u0002",
    "\b4\u0003\u0002\u0002\u0002\n8\u0003\u0002\u0002\u0002\f<\u0003\u0002",
    "\u0002\u0002\u000e@\u0003\u0002\u0002\u0002\u0010I\u0003\u0002\u0002",
    "\u0002\u0012N\u0003\u0002\u0002\u0002\u0014\u0015\u0005\u0004\u0003",
    "\u0002\u0015\u0016\u0007\u0002\u0002\u0003\u0016\u0003\u0003\u0002\u0002",
    "\u0002\u0017\u0019\u0005\u0006\u0004\u0002\u0018\u001a\u0005\u0010\t",
    "\u0002\u0019\u0018\u0003\u0002\u0002\u0002\u001a\u001b\u0003\u0002\u0002",
    "\u0002\u001b\u0019\u0003\u0002\u0002\u0002\u001b\u001c\u0003\u0002\u0002",
    "\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d\u001e\u0005\b\u0005",
    "\u0002\u001e\u0005\u0003\u0002\u0002\u0002\u001f \u0007\u0003\u0002",
    "\u0002 !\u0005\u000e\b\u0002!\"\u0007\u0004\u0002\u0002\"#\u0005\n\u0006",
    "\u0002#&\u0003\u0002\u0002\u0002$&\u0005\n\u0006\u0002%\u001f\u0003",
    "\u0002\u0002\u0002%$\u0003\u0002\u0002\u0002&\'\u0003\u0002\u0002\u0002",
    "\'(\u0007\u0004\u0002\u0002(\u0007\u0003\u0002\u0002\u0002)*\u0007\u0003",
    "\u0002\u0002*+\u0005\u000e\b\u0002+,\u0007\u0004\u0002\u0002,-\u0007",
    "\u0003\u0002\u0002-.\u0005\f\u0007\u0002.5\u0003\u0002\u0002\u0002/",
    "0\u0007\u0003\u0002\u000201\u0005\u000e\b\u000212\u0007\u0005\u0002",
    "\u000223\u0005\f\u0007\u000235\u0003\u0002\u0002\u00024)\u0003\u0002",
    "\u0002\u00024/\u0003\u0002\u0002\u000256\u0003\u0002\u0002\u000267\u0007",
    "\u0004\u0002\u00027\t\u0003\u0002\u0002\u000289\u0007\u0006\u0002\u0002",
    "9:\u0005\f\u0007\u0002:\u000b\u0003\u0002\u0002\u0002;=\u0007\t\u0002",
    "\u0002<;\u0003\u0002\u0002\u0002=>\u0003\u0002\u0002\u0002><\u0003\u0002",
    "\u0002\u0002>?\u0003\u0002\u0002\u0002?\r\u0003\u0002\u0002\u0002@D",
    "\u0007\u0007\u0002\u0002AC\t\u0002\u0002\u0002BA\u0003\u0002\u0002\u0002",
    "CF\u0003\u0002\u0002\u0002DB\u0003\u0002\u0002\u0002DE\u0003\u0002\u0002",
    "\u0002EG\u0003\u0002\u0002\u0002FD\u0003\u0002\u0002\u0002GH\u0007\u0007",
    "\u0002\u0002H\u000f\u0003\u0002\u0002\u0002IJ\u0005\u0012\n\u0002JK",
    "\u0007\n\u0002\u0002KL\u0005\u0012\n\u0002LM\u0007\u0004\u0002\u0002",
    "M\u0011\u0003\u0002\u0002\u0002NO\t\u0003\u0002\u0002O\u0013\u0003\u0002",
    "\u0002\u0002\u0007\u001b%4>D"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'cout<<'", "';'", "'<<'", "'cin>>'", "'\"'", 
                     "':'" ];

var symbolicNames = [ null, null, null, null, null, null, null, "LETRA", 
                      "OPERADORES", "VARIABLE", "CONSTANTE", "IGNORE", "ESPACIO", 
                      "SALTO" ];

var ruleNames =  [ "evaluar", "cadena", "cabecera", "pie", "entrada", "io", 
                   "mensaje", "instrucciones", "componente" ];

function CmasmasParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

CmasmasParser.prototype = Object.create(antlr4.Parser.prototype);
CmasmasParser.prototype.constructor = CmasmasParser;

Object.defineProperty(CmasmasParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

CmasmasParser.EOF = antlr4.Token.EOF;
CmasmasParser.T__0 = 1;
CmasmasParser.T__1 = 2;
CmasmasParser.T__2 = 3;
CmasmasParser.T__3 = 4;
CmasmasParser.T__4 = 5;
CmasmasParser.T__5 = 6;
CmasmasParser.LETRA = 7;
CmasmasParser.OPERADORES = 8;
CmasmasParser.VARIABLE = 9;
CmasmasParser.CONSTANTE = 10;
CmasmasParser.IGNORE = 11;
CmasmasParser.ESPACIO = 12;
CmasmasParser.SALTO = 13;

CmasmasParser.RULE_evaluar = 0;
CmasmasParser.RULE_cadena = 1;
CmasmasParser.RULE_cabecera = 2;
CmasmasParser.RULE_pie = 3;
CmasmasParser.RULE_entrada = 4;
CmasmasParser.RULE_io = 5;
CmasmasParser.RULE_mensaje = 6;
CmasmasParser.RULE_instrucciones = 7;
CmasmasParser.RULE_componente = 8;

function EvaluarContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_evaluar;
    return this;
}

EvaluarContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EvaluarContext.prototype.constructor = EvaluarContext;

EvaluarContext.prototype.cadena = function() {
    return this.getTypedRuleContext(CadenaContext,0);
};

EvaluarContext.prototype.EOF = function() {
    return this.getToken(CmasmasParser.EOF, 0);
};

EvaluarContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterEvaluar(this);
	}
};

EvaluarContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitEvaluar(this);
	}
};




CmasmasParser.EvaluarContext = EvaluarContext;

CmasmasParser.prototype.evaluar = function() {

    var localctx = new EvaluarContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, CmasmasParser.RULE_evaluar);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 18;
        this.cadena();
        this.state = 19;
        this.match(CmasmasParser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function CadenaContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_cadena;
    return this;
}

CadenaContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CadenaContext.prototype.constructor = CadenaContext;

CadenaContext.prototype.cabecera = function() {
    return this.getTypedRuleContext(CabeceraContext,0);
};

CadenaContext.prototype.pie = function() {
    return this.getTypedRuleContext(PieContext,0);
};

CadenaContext.prototype.instrucciones = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(InstruccionesContext);
    } else {
        return this.getTypedRuleContext(InstruccionesContext,i);
    }
};

CadenaContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterCadena(this);
	}
};

CadenaContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitCadena(this);
	}
};




CmasmasParser.CadenaContext = CadenaContext;

CmasmasParser.prototype.cadena = function() {

    var localctx = new CadenaContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, CmasmasParser.RULE_cadena);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 21;
        this.cabecera();
        this.state = 23; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 22;
            this.instrucciones();
            this.state = 25; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while(_la===CmasmasParser.VARIABLE || _la===CmasmasParser.CONSTANTE);
        this.state = 27;
        this.pie();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function CabeceraContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_cabecera;
    return this;
}

CabeceraContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CabeceraContext.prototype.constructor = CabeceraContext;

CabeceraContext.prototype.mensaje = function() {
    return this.getTypedRuleContext(MensajeContext,0);
};

CabeceraContext.prototype.entrada = function() {
    return this.getTypedRuleContext(EntradaContext,0);
};

CabeceraContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterCabecera(this);
	}
};

CabeceraContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitCabecera(this);
	}
};




CmasmasParser.CabeceraContext = CabeceraContext;

CmasmasParser.prototype.cabecera = function() {

    var localctx = new CabeceraContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, CmasmasParser.RULE_cabecera);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 35;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case CmasmasParser.T__0:
            this.state = 29;
            this.match(CmasmasParser.T__0);
            this.state = 30;
            this.mensaje();
            this.state = 31;
            this.match(CmasmasParser.T__1);
            this.state = 32;
            this.entrada();
            break;
        case CmasmasParser.T__3:
            this.state = 34;
            this.entrada();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
        this.state = 37;
        this.match(CmasmasParser.T__1);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function PieContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_pie;
    return this;
}

PieContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
PieContext.prototype.constructor = PieContext;

PieContext.prototype.mensaje = function() {
    return this.getTypedRuleContext(MensajeContext,0);
};

PieContext.prototype.io = function() {
    return this.getTypedRuleContext(IoContext,0);
};

PieContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterPie(this);
	}
};

PieContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitPie(this);
	}
};




CmasmasParser.PieContext = PieContext;

CmasmasParser.prototype.pie = function() {

    var localctx = new PieContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, CmasmasParser.RULE_pie);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 50;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
        switch(la_) {
        case 1:
            this.state = 39;
            this.match(CmasmasParser.T__0);
            this.state = 40;
            this.mensaje();
            this.state = 41;
            this.match(CmasmasParser.T__1);
            this.state = 42;
            this.match(CmasmasParser.T__0);
            this.state = 43;
            this.io();
            break;

        case 2:
            this.state = 45;
            this.match(CmasmasParser.T__0);
            this.state = 46;
            this.mensaje();
            this.state = 47;
            this.match(CmasmasParser.T__2);
            this.state = 48;
            this.io();
            break;

        }
        this.state = 52;
        this.match(CmasmasParser.T__1);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function EntradaContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_entrada;
    return this;
}

EntradaContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EntradaContext.prototype.constructor = EntradaContext;

EntradaContext.prototype.io = function() {
    return this.getTypedRuleContext(IoContext,0);
};

EntradaContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterEntrada(this);
	}
};

EntradaContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitEntrada(this);
	}
};




CmasmasParser.EntradaContext = EntradaContext;

CmasmasParser.prototype.entrada = function() {

    var localctx = new EntradaContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, CmasmasParser.RULE_entrada);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 54;
        this.match(CmasmasParser.T__3);
        this.state = 55;
        this.io();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function IoContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_io;
    return this;
}

IoContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
IoContext.prototype.constructor = IoContext;

IoContext.prototype.LETRA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(CmasmasParser.LETRA);
    } else {
        return this.getToken(CmasmasParser.LETRA, i);
    }
};


IoContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterIo(this);
	}
};

IoContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitIo(this);
	}
};




CmasmasParser.IoContext = IoContext;

CmasmasParser.prototype.io = function() {

    var localctx = new IoContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, CmasmasParser.RULE_io);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 58; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 57;
            this.match(CmasmasParser.LETRA);
            this.state = 60; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while(_la===CmasmasParser.LETRA);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function MensajeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_mensaje;
    return this;
}

MensajeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MensajeContext.prototype.constructor = MensajeContext;

MensajeContext.prototype.LETRA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(CmasmasParser.LETRA);
    } else {
        return this.getToken(CmasmasParser.LETRA, i);
    }
};


MensajeContext.prototype.ESPACIO = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(CmasmasParser.ESPACIO);
    } else {
        return this.getToken(CmasmasParser.ESPACIO, i);
    }
};


MensajeContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterMensaje(this);
	}
};

MensajeContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitMensaje(this);
	}
};




CmasmasParser.MensajeContext = MensajeContext;

CmasmasParser.prototype.mensaje = function() {

    var localctx = new MensajeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, CmasmasParser.RULE_mensaje);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 62;
        this.match(CmasmasParser.T__4);
        this.state = 66;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CmasmasParser.T__5) | (1 << CmasmasParser.LETRA) | (1 << CmasmasParser.ESPACIO))) !== 0)) {
            this.state = 63;
            _la = this._input.LA(1);
            if(!((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << CmasmasParser.T__5) | (1 << CmasmasParser.LETRA) | (1 << CmasmasParser.ESPACIO))) !== 0))) {
            this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 68;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 69;
        this.match(CmasmasParser.T__4);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function InstruccionesContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_instrucciones;
    return this;
}

InstruccionesContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
InstruccionesContext.prototype.constructor = InstruccionesContext;

InstruccionesContext.prototype.componente = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ComponenteContext);
    } else {
        return this.getTypedRuleContext(ComponenteContext,i);
    }
};

InstruccionesContext.prototype.OPERADORES = function() {
    return this.getToken(CmasmasParser.OPERADORES, 0);
};

InstruccionesContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterInstrucciones(this);
	}
};

InstruccionesContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitInstrucciones(this);
	}
};




CmasmasParser.InstruccionesContext = InstruccionesContext;

CmasmasParser.prototype.instrucciones = function() {

    var localctx = new InstruccionesContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, CmasmasParser.RULE_instrucciones);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 71;
        this.componente();
        this.state = 72;
        this.match(CmasmasParser.OPERADORES);
        this.state = 73;
        this.componente();
        this.state = 74;
        this.match(CmasmasParser.T__1);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function ComponenteContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = CmasmasParser.RULE_componente;
    return this;
}

ComponenteContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ComponenteContext.prototype.constructor = ComponenteContext;

ComponenteContext.prototype.VARIABLE = function() {
    return this.getToken(CmasmasParser.VARIABLE, 0);
};

ComponenteContext.prototype.CONSTANTE = function() {
    return this.getToken(CmasmasParser.CONSTANTE, 0);
};

ComponenteContext.prototype.enterRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.enterComponente(this);
	}
};

ComponenteContext.prototype.exitRule = function(listener) {
    if(listener instanceof CmasmasListener ) {
        listener.exitComponente(this);
	}
};




CmasmasParser.ComponenteContext = ComponenteContext;

CmasmasParser.prototype.componente = function() {

    var localctx = new ComponenteContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, CmasmasParser.RULE_componente);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 76;
        _la = this._input.LA(1);
        if(!(_la===CmasmasParser.VARIABLE || _la===CmasmasParser.CONSTANTE)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.CmasmasParser = CmasmasParser;
