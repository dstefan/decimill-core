// Generated from ScenarioParser.g4 by ANTLR 4.4

    package decimill.parser;
    import decimill.*;
    import decimill.expression.*;
    import decimill.scenario.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ScenarioParser}.
 */
public interface ScenarioParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull ScenarioParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull ScenarioParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ScenarioParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ScenarioParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#num_double}.
	 * @param ctx the parse tree
	 */
	void enterNum_double(@NotNull ScenarioParser.Num_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#num_double}.
	 * @param ctx the parse tree
	 */
	void exitNum_double(@NotNull ScenarioParser.Num_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#change}.
	 * @param ctx the parse tree
	 */
	void enterChange(@NotNull ScenarioParser.ChangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#change}.
	 * @param ctx the parse tree
	 */
	void exitChange(@NotNull ScenarioParser.ChangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#num_procent}.
	 * @param ctx the parse tree
	 */
	void enterNum_procent(@NotNull ScenarioParser.Num_procentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#num_procent}.
	 * @param ctx the parse tree
	 */
	void exitNum_procent(@NotNull ScenarioParser.Num_procentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_sub}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sub(@NotNull ScenarioParser.Expr_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_sub}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sub(@NotNull ScenarioParser.Expr_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull ScenarioParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull ScenarioParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ScenarioParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ScenarioParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_pow}.
	 * @param ctx the parse tree
	 */
	void enterExpr_pow(@NotNull ScenarioParser.Expr_powContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_pow}.
	 * @param ctx the parse tree
	 */
	void exitExpr_pow(@NotNull ScenarioParser.Expr_powContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void enterInlineCode(@NotNull ScenarioParser.InlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void exitInlineCode(@NotNull ScenarioParser.InlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void enterExpr_div(@NotNull ScenarioParser.Expr_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void exitExpr_div(@NotNull ScenarioParser.Expr_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ScenarioParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ScenarioParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#assoc_array}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_array(@NotNull ScenarioParser.Assoc_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#assoc_array}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_array(@NotNull ScenarioParser.Assoc_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ScenarioParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ScenarioParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ScenarioParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ScenarioParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ScenarioParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ScenarioParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(@NotNull ScenarioParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(@NotNull ScenarioParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(@NotNull ScenarioParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(@NotNull ScenarioParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(@NotNull ScenarioParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(@NotNull ScenarioParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(@NotNull ScenarioParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(@NotNull ScenarioParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull ScenarioParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull ScenarioParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(@NotNull ScenarioParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(@NotNull ScenarioParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ScenarioParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ScenarioParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(@NotNull ScenarioParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(@NotNull ScenarioParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_gt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_gt(@NotNull ScenarioParser.Expr_gtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_gt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_gt(@NotNull ScenarioParser.Expr_gtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_lt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lt(@NotNull ScenarioParser.Expr_ltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_lt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lt(@NotNull ScenarioParser.Expr_ltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(@NotNull ScenarioParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(@NotNull ScenarioParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ScenarioParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ScenarioParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#dist}.
	 * @param ctx the parse tree
	 */
	void enterDist(@NotNull ScenarioParser.DistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#dist}.
	 * @param ctx the parse tree
	 */
	void exitDist(@NotNull ScenarioParser.DistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ScenarioParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull ScenarioParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ScenarioParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull ScenarioParser.ArrayContext ctx);
}