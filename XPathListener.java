// Generated from XPath.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code AbsolutePathSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathSlash(XPathParser.AbsolutePathSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsolutePathSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathSlash(XPathParser.AbsolutePathSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsolutePathDoubleSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsolutePathDoubleSlash}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePathDoubleSlash(XPathParser.AbsolutePathDoubleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName_}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName_(XPathParser.TagName_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName_}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName_(XPathParser.TagName_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PathFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPathFilter(XPathParser.PathFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPathFilter(XPathParser.PathFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedRP(XPathParser.ParenthesizedRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedRP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedRP(XPathParser.ParenthesizedRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathDoubleSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPathDoubleSlash(XPathParser.PathDoubleSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathDoubleSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPathDoubleSlash(XPathParser.PathDoubleSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathComma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPathComma(XPathParser.PathCommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathComma}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPathComma(XPathParser.PathCommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(XPathParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Wildcard}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(XPathParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XPathParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XPathParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XPathParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XPathParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PathSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPathSlash(XPathParser.PathSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PathSlash}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPathSlash(XPathParser.PathSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEqual(XPathParser.FilterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEqual(XPathParser.FilterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterNot(XPathParser.FilterNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterNot}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterNot(XPathParser.FilterNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterOr(XPathParser.FilterOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterOr}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterOr(XPathParser.FilterOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterAnd(XPathParser.FilterAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterAnd}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterAnd(XPathParser.FilterAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRP}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterRP(XPathParser.FilterRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRP}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterRP(XPathParser.FilterRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterEq(XPathParser.FilterEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterEq}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterEq(XPathParser.FilterEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterDoubleEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterDoubleEqual(XPathParser.FilterDoubleEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterDoubleEqual}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterDoubleEqual(XPathParser.FilterDoubleEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterIs(XPathParser.FilterIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterIs}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterIs(XPathParser.FilterIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFilter(XPathParser.ParenthesizedFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedFilter}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFilter(XPathParser.ParenthesizedFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterStringConstant}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFilterStringConstant(XPathParser.FilterStringConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterStringConstant}
	 * labeled alternative in {@link XPathParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFilterStringConstant(XPathParser.FilterStringConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XPathParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(XPathParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(XPathParser.AttNameContext ctx);
}