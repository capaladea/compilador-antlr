// Generated from Gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(GramaticaParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GramaticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(GramaticaParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(GramaticaParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(GramaticaParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GramaticaParser.TermContext ctx);
}