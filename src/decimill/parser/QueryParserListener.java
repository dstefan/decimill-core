// Generated from QueryParser.g4 by ANTLR 4.4

    package decimill.parser;
    import decimill.*;
    import decimill.lang.*;
    import decimill.query.*;
    import decimill.expression.*;
    import org.apache.commons.lang3.StringUtils;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull QueryParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull QueryParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull QueryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull QueryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#evaluate}.
	 * @param ctx the parse tree
	 */
	void enterEvaluate(@NotNull QueryParser.EvaluateContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#evaluate}.
	 * @param ctx the parse tree
	 */
	void exitEvaluate(@NotNull QueryParser.EvaluateContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull QueryParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull QueryParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#num_double}.
	 * @param ctx the parse tree
	 */
	void enterNum_double(@NotNull QueryParser.Num_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#num_double}.
	 * @param ctx the parse tree
	 */
	void exitNum_double(@NotNull QueryParser.Num_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#refAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRefAssignment(@NotNull QueryParser.RefAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#refAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRefAssignment(@NotNull QueryParser.RefAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(@NotNull QueryParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(@NotNull QueryParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#num_procent}.
	 * @param ctx the parse tree
	 */
	void enterNum_procent(@NotNull QueryParser.Num_procentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#num_procent}.
	 * @param ctx the parse tree
	 */
	void exitNum_procent(@NotNull QueryParser.Num_procentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_sub}.
	 * @param ctx the parse tree
	 */
	void enterExpr_sub(@NotNull QueryParser.Expr_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_sub}.
	 * @param ctx the parse tree
	 */
	void exitExpr_sub(@NotNull QueryParser.Expr_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull QueryParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull QueryParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull QueryParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull QueryParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_pow}.
	 * @param ctx the parse tree
	 */
	void enterExpr_pow(@NotNull QueryParser.Expr_powContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_pow}.
	 * @param ctx the parse tree
	 */
	void exitExpr_pow(@NotNull QueryParser.Expr_powContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void enterInlineCode(@NotNull QueryParser.InlineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#inlineCode}.
	 * @param ctx the parse tree
	 */
	void exitInlineCode(@NotNull QueryParser.InlineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void enterExpr_div(@NotNull QueryParser.Expr_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_div}.
	 * @param ctx the parse tree
	 */
	void exitExpr_div(@NotNull QueryParser.Expr_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull QueryParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull QueryParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#assoc_array}.
	 * @param ctx the parse tree
	 */
	void enterAssoc_array(@NotNull QueryParser.Assoc_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#assoc_array}.
	 * @param ctx the parse tree
	 */
	void exitAssoc_array(@NotNull QueryParser.Assoc_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#assignAndPrint}.
	 * @param ctx the parse tree
	 */
	void enterAssignAndPrint(@NotNull QueryParser.AssignAndPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#assignAndPrint}.
	 * @param ctx the parse tree
	 */
	void exitAssignAndPrint(@NotNull QueryParser.AssignAndPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull QueryParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull QueryParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull QueryParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull QueryParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull QueryParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull QueryParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(@NotNull QueryParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(@NotNull QueryParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(@NotNull QueryParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(@NotNull QueryParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(@NotNull QueryParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(@NotNull QueryParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#period}.
	 * @param ctx the parse tree
	 */
	void enterPeriod(@NotNull QueryParser.PeriodContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#period}.
	 * @param ctx the parse tree
	 */
	void exitPeriod(@NotNull QueryParser.PeriodContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#num_int}.
	 * @param ctx the parse tree
	 */
	void enterNum_int(@NotNull QueryParser.Num_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#num_int}.
	 * @param ctx the parse tree
	 */
	void exitNum_int(@NotNull QueryParser.Num_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(@NotNull QueryParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(@NotNull QueryParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(@NotNull QueryParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(@NotNull QueryParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(@NotNull QueryParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(@NotNull QueryParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull QueryParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull QueryParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(@NotNull QueryParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(@NotNull QueryParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_gt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_gt(@NotNull QueryParser.Expr_gtContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_gt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_gt(@NotNull QueryParser.Expr_gtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull QueryParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull QueryParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_lt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_lt(@NotNull QueryParser.Expr_ltContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_lt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_lt(@NotNull QueryParser.Expr_ltContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#evalAndPrint}.
	 * @param ctx the parse tree
	 */
	void enterEvalAndPrint(@NotNull QueryParser.EvalAndPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#evalAndPrint}.
	 * @param ctx the parse tree
	 */
	void exitEvalAndPrint(@NotNull QueryParser.EvalAndPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(@NotNull QueryParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(@NotNull QueryParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull QueryParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull QueryParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#dist}.
	 * @param ctx the parse tree
	 */
	void enterDist(@NotNull QueryParser.DistContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#dist}.
	 * @param ctx the parse tree
	 */
	void exitDist(@NotNull QueryParser.DistContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull QueryParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull QueryParser.ArrayContext ctx);
}