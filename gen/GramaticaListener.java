// Generated from /home/cristian/Proyectos Git/compilador-antlr/src/main/antlr4/Gramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(GramaticaParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(GramaticaParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(GramaticaParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(GramaticaParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(GramaticaParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(GramaticaParser.PrintlnContext ctx);
}