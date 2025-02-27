// Generated from XPath.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code XqComma}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqComma(XPathParser.XqCommaContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(XPathParser.XqApContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqVar}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqVar(XPathParser.XqVarContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqDoubleSlash}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqDoubleSlash(XPathParser.XqDoubleSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqSlash}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSlash(XPathParser.XqSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqFLWR}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqFLWR(XPathParser.XqFLWRContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqString(XPathParser.XqStringContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqTag}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqTag(XPathParser.XqTagContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqForceLet}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqForceLet(XPathParser.XqForceLetContext ctx);

	/**
	 * Visit a parse tree produced by the {@code XqParenthesized}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqParenthesized(XPathParser.XqParenthesizedContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#forClause}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XPathParser.ForClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#letClause}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XPathParser.LetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#forceLetClause}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForceLetClause(XPathParser.ForceLetClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#whereClause}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XPathParser.WhereClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#returnClause}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XPathParser.ReturnClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#varBinding}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBinding(XPathParser.VarBindingContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#letBinding}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetBinding(XPathParser.LetBindingContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEmpty(XPathParser.CondEmptyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condEQ}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEQ(XPathParser.CondEQContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condDoubleEqual}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondDoubleEqual(XPathParser.CondDoubleEqualContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIs(XPathParser.CondIsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondSome(XPathParser.CondSomeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condEqSign}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqSign(XPathParser.CondEqSignContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condAND}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAND(XPathParser.CondANDContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condOR}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOR(XPathParser.CondORContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condNOT}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNOT(XPathParser.CondNOTContext ctx);

	/**
	 * Visit a parse tree produced by the {@code condParenthesized}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParenthesized(XPathParser.CondParenthesizedContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#varInXQ}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInXQ(XPathParser.VarInXQContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AbsolutePathSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathSlash(XPathParser.AbsolutePathSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AbsolutePathDoubleSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code TagName_}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName_(XPathParser.TagName_Context ctx);

	/**
	 * Visit a parse tree produced by the {@code PathFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathFilter(XPathParser.PathFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParenthesizedRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedRP(XPathParser.ParenthesizedRPContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PathDoubleSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathDoubleSlash(XPathParser.PathDoubleSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PathComma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathComma(XPathParser.PathCommaContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(XPathParser.WildcardContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XPathParser.ParentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XPathParser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XPathParser.TextContext ctx);

	/**
	 * Visit a parse tree produced by the {@code PathSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathSlash(XPathParser.PathSlashContext ctx);

	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XPathParser.CurrentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEqual(XPathParser.FilterEqualContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterNot(XPathParser.FilterNotContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterOr(XPathParser.FilterOrContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterAnd(XPathParser.FilterAndContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterRP}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRP(XPathParser.FilterRPContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterEq(XPathParser.FilterEqContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterDoubleEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterDoubleEqual(XPathParser.FilterDoubleEqualContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterIs(XPathParser.FilterIsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ParenthesizedFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFilter(XPathParser.ParenthesizedFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code FilterStringConstant}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterStringConstant(XPathParser.FilterStringConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#tagName}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XPathParser.TagNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link XPathParser#attName}.
	 * 
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(XPathParser.AttNameContext ctx);
}