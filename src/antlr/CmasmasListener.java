// Generated from Cmasmas.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmasmasParser}.
 */
public interface CmasmasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#evaluar}.
	 * @param ctx the parse tree
	 */
	void enterEvaluar(CmasmasParser.EvaluarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#evaluar}.
	 * @param ctx the parse tree
	 */
	void exitEvaluar(CmasmasParser.EvaluarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#cadena}.
	 * @param ctx the parse tree
	 */
	void enterCadena(CmasmasParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#cadena}.
	 * @param ctx the parse tree
	 */
	void exitCadena(CmasmasParser.CadenaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(CmasmasParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(CmasmasParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#pie}.
	 * @param ctx the parse tree
	 */
	void enterPie(CmasmasParser.PieContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#pie}.
	 * @param ctx the parse tree
	 */
	void exitPie(CmasmasParser.PieContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(CmasmasParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(CmasmasParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(CmasmasParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(CmasmasParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void enterMensaje(CmasmasParser.MensajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#mensaje}.
	 * @param ctx the parse tree
	 */
	void exitMensaje(CmasmasParser.MensajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(CmasmasParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(CmasmasParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmasmasParser#componente}.
	 * @param ctx the parse tree
	 */
	void enterComponente(CmasmasParser.ComponenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmasmasParser#componente}.
	 * @param ctx the parse tree
	 */
	void exitComponente(CmasmasParser.ComponenteContext ctx);
}