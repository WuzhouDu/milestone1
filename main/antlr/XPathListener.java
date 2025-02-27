// Generated from XPath.g4 by ANTLR 4.13.2
package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code XqComma}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqComma(XPathParser.XqCommaContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqComma}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqComma(XPathParser.XqCommaContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqAp(XPathParser.XqApContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqAp(XPathParser.XqApContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqVar}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqVar(XPathParser.XqVarContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqVar}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqVar(XPathParser.XqVarContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqDoubleSlash}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqDoubleSlash(XPathParser.XqDoubleSlashContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqDoubleSlash}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqDoubleSlash(XPathParser.XqDoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqSlash}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqSlash(XPathParser.XqSlashContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqSlash}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqSlash(XPathParser.XqSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqFLWR}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqFLWR(XPathParser.XqFLWRContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqFLWR}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqFLWR(XPathParser.XqFLWRContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqString(XPathParser.XqStringContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqString}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqString(XPathParser.XqStringContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqTag}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqTag(XPathParser.XqTagContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqTag}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqTag(XPathParser.XqTagContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqForceLet}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqForceLet(XPathParser.XqForceLetContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqForceLet}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqForceLet(XPathParser.XqForceLetContext ctx);

	/**
	 * Enter a parse tree produced by the {@code XqParenthesized}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterXqParenthesized(XPathParser.XqParenthesizedContext ctx);

	/**
	 * Exit a parse tree produced by the {@code XqParenthesized}
	 * labeled alternative in {@link XPathParser#xq}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitXqParenthesized(XPathParser.XqParenthesizedContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#forClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterForClause(XPathParser.ForClauseContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#forClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitForClause(XPathParser.ForClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#letClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterLetClause(XPathParser.LetClauseContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#letClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitLetClause(XPathParser.LetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#forceLetClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterForceLetClause(XPathParser.ForceLetClauseContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#forceLetClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitForceLetClause(XPathParser.ForceLetClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#whereClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XPathParser.WhereClauseContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#whereClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XPathParser.WhereClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#returnClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XPathParser.ReturnClauseContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#returnClause}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XPathParser.ReturnClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#varBinding}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterVarBinding(XPathParser.VarBindingContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#varBinding}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitVarBinding(XPathParser.VarBindingContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#letBinding}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterLetBinding(XPathParser.LetBindingContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#letBinding}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitLetBinding(XPathParser.LetBindingContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(XPathParser.CondEmptyContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condEmpty}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(XPathParser.CondEmptyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condEQ}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondEQ(XPathParser.CondEQContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condEQ}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondEQ(XPathParser.CondEQContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condDoubleEqual}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondDoubleEqual(XPathParser.CondDoubleEqualContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condDoubleEqual}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondDoubleEqual(XPathParser.CondDoubleEqualContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondIs(XPathParser.CondIsContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condIs}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondIs(XPathParser.CondIsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondSome(XPathParser.CondSomeContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condSome}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondSome(XPathParser.CondSomeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condEqSign}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondEqSign(XPathParser.CondEqSignContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condEqSign}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondEqSign(XPathParser.CondEqSignContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condAND}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondAND(XPathParser.CondANDContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condAND}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondAND(XPathParser.CondANDContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condOR}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondOR(XPathParser.CondORContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condOR}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondOR(XPathParser.CondORContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condNOT}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondNOT(XPathParser.CondNOTContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condNOT}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondNOT(XPathParser.CondNOTContext ctx);

	/**
	 * Enter a parse tree produced by the {@code condParenthesized}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCondParenthesized(XPathParser.CondParenthesizedContext ctx);

	/**
	 * Exit a parse tree produced by the {@code condParenthesized}
	 * labeled alternative in {@link XPathParser#cond}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCondParenthesized(XPathParser.CondParenthesizedContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#varInXQ}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterVarInXQ(XPathParser.VarInXQContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#varInXQ}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitVarInXQ(XPathParser.VarInXQContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AbsolutePathSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathSlash(XPathParser.AbsolutePathSlashContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AbsolutePathSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathSlash(XPathParser.AbsolutePathSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AbsolutePathDoubleSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx);

	/**
	 * Exit a parse tree produced by the {@code AbsolutePathDoubleSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code TagName_}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterTagName_(XPathParser.TagName_Context ctx);

	/**
	 * Exit a parse tree produced by the {@code TagName_}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitTagName_(XPathParser.TagName_Context ctx);

	/**
	 * Enter a parse tree produced by the {@code PathFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPathFilter(XPathParser.PathFilterContext ctx);

	/**
	 * Exit a parse tree produced by the {@code PathFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPathFilter(XPathParser.PathFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParenthesizedRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParenthesizedRP(XPathParser.ParenthesizedRPContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParenthesizedRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParenthesizedRP(XPathParser.ParenthesizedRPContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PathDoubleSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPathDoubleSlash(XPathParser.PathDoubleSlashContext ctx);

	/**
	 * Exit a parse tree produced by the {@code PathDoubleSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPathDoubleSlash(XPathParser.PathDoubleSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PathComma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPathComma(XPathParser.PathCommaContext ctx);

	/**
	 * Exit a parse tree produced by the {@code PathComma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPathComma(XPathParser.PathCommaContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterWildcard(XPathParser.WildcardContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitWildcard(XPathParser.WildcardContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParent(XPathParser.ParentContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParent(XPathParser.ParentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAttribute(XPathParser.AttributeContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAttribute(XPathParser.AttributeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterText(XPathParser.TextContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitText(XPathParser.TextContext ctx);

	/**
	 * Enter a parse tree produced by the {@code PathSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterPathSlash(XPathParser.PathSlashContext ctx);

	/**
	 * Exit a parse tree produced by the {@code PathSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitPathSlash(XPathParser.PathSlashContext ctx);

	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterCurrent(XPathParser.CurrentContext ctx);

	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitCurrent(XPathParser.CurrentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterEqual(XPathParser.FilterEqualContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterEqual(XPathParser.FilterEqualContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterNot(XPathParser.FilterNotContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterNot(XPathParser.FilterNotContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterOr(XPathParser.FilterOrContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterOr(XPathParser.FilterOrContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(XPathParser.FilterAndContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(XPathParser.FilterAndContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterRP}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterRP(XPathParser.FilterRPContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterRP}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterRP(XPathParser.FilterRPContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterEq(XPathParser.FilterEqContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterEq(XPathParser.FilterEqContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterDoubleEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterDoubleEqual(XPathParser.FilterDoubleEqualContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterDoubleEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterDoubleEqual(XPathParser.FilterDoubleEqualContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterIs(XPathParser.FilterIsContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterIs(XPathParser.FilterIsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ParenthesizedFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFilter(XPathParser.ParenthesizedFilterContext ctx);

	/**
	 * Exit a parse tree produced by the {@code ParenthesizedFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFilter(XPathParser.ParenthesizedFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code FilterStringConstant}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterFilterStringConstant(XPathParser.FilterStringConstantContext ctx);

	/**
	 * Exit a parse tree produced by the {@code FilterStringConstant}
	 * labeled alternative in {@link XPathParser#f}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitFilterStringConstant(XPathParser.FilterStringConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * 
	 * @param ctx the parse tree
	 */
	void enterAttName(XPathParser.AttNameContext ctx);

	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * 
	 * @param ctx the parse tree
	 */
	void exitAttName(XPathParser.AttNameContext ctx);
}