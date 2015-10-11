// Generated from ModelParser.g4 by ANTLR 4.4

    package decimill.parser;
    import decimill.*;
    import decimill.expression.*;
    import decimill.model.*;
    import org.apache.commons.lang3.StringUtils;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ModelParser}.
 */
public interface ModelParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(@NotNull ModelParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(@NotNull ModelParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull ModelParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull ModelParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(@NotNull ModelParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(@NotNull ModelParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#num_procent}.
	 * @param ctx the parse tree
	 */
	void enterNum_procent(@NotNull ModelParser.Num_procentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#num_procent}.
	 * @param ctx the parse tree
	 */
	void exitNum_procent(@NotNull ModelParser.Num_procentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#dist}.
	 * @param ctx the parse tree
	 */
	void enterDist(@NotNull ModelParser.DistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#dist}.
	 * @param ctx the parse tree
	 */
	void exitDist(@NotNull ModelParser.DistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(@NotNull ModelParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(@NotNull ModelParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_gt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_gt(@NotNull ModelParser.Expr_gtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_gt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_gt(@NotNull ModelParser.Expr_gtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull ModelParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull ModelParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void enterExpr_div(@NotNull ModelParser.Expr_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void exitExpr_div(@NotNull ModelParser.Expr_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull ModelParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull ModelParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull ModelParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull ModelParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#assoc_array}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_array(@NotNull ModelParser.Assoc_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#assoc_array}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_array(@NotNull ModelParser.Assoc_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#refinement}.
	 * @param ctx the parse tree
	 */
	void enterRefinement(@NotNull ModelParser.RefinementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#refinement}.
	 * @param ctx the parse tree
	 */
	void exitRefinement(@NotNull ModelParser.RefinementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_pow}.
	 * @param ctx the parse tree
	 */
	void enterExpr_pow(@NotNull ModelParser.Expr_powContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_pow}.
	 * @param ctx the parse tree
	 */
	void exitExpr_pow(@NotNull ModelParser.Expr_powContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull ModelParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull ModelParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull ModelParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull ModelParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(@NotNull ModelParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(@NotNull ModelParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_sub}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sub(@NotNull ModelParser.Expr_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_sub}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sub(@NotNull ModelParser.Expr_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull ModelParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull ModelParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ModelParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ModelParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_lt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lt(@NotNull ModelParser.Expr_ltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_lt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lt(@NotNull ModelParser.Expr_ltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull ModelParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull ModelParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(@NotNull ModelParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(@NotNull ModelParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull ModelParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull ModelParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#nodeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNodeDeclaration(@NotNull ModelParser.NodeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#nodeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNodeDeclaration(@NotNull ModelParser.NodeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(@NotNull ModelParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(@NotNull ModelParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#num_double}.
	 * @param ctx the parse tree
	 */
	void enterNum_double(@NotNull ModelParser.Num_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#num_double}.
	 * @param ctx the parse tree
	 */
	void exitNum_double(@NotNull ModelParser.Num_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(@NotNull ModelParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(@NotNull ModelParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull ModelParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull ModelParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull ModelParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull ModelParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ModelParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ModelParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ModelParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void enterInlineCode(@NotNull ModelParser.InlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ModelParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void exitInlineCode(@NotNull ModelParser.InlineCodeContext ctx);
}