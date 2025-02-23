// Generated from /Users/dwz/study/25winter/CSE232B/project/milestone1/main/antlr/XPath.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XPathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, Var=17, 
		FOR=18, LET=19, WHERE=20, RETURN=21, IN=22, SATISFIES=23, AND=24, OR=25, 
		NOT=26, EMPTY=27, SOME=28, EQ=29, IS=30, DOC=31, L_PAREN=32, R_PAREN=33, 
		SLASH=34, DOUBLE_SLASH=35, FILENAME=36, STRING=37, ID=38, WS=39;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_letClause = 2, RULE_forceLetClause = 3, 
		RULE_whereClause = 4, RULE_returnClause = 5, RULE_varBinding = 6, RULE_letBinding = 7, 
		RULE_cond = 8, RULE_varInXQ = 9, RULE_ap = 10, RULE_rp = 11, RULE_f = 12, 
		RULE_tagName = 13, RULE_attName = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "letClause", "forceLetClause", "whereClause", "returnClause", 
			"varBinding", "letBinding", "cond", "varInXQ", "ap", "rp", "f", "tagName", 
			"attName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'<'", "'>'", "'{'", "'}'", "'</'", "':='", "'='", "'=='", 
			"'*'", "'.'", "'..'", "'text()'", "'@'", "'['", "']'", null, "'for'", 
			"'let'", "'where'", "'return'", "'in'", "'satisfies'", "'and'", "'or'", 
			"'not'", "'empty'", "'some'", "'eq'", "'is'", "'doc'", "'('", "')'", 
			"'/'", "'//'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "Var", "FOR", "LET", "WHERE", "RETURN", 
			"IN", "SATISFIES", "AND", "OR", "NOT", "EMPTY", "SOME", "EQ", "IS", "DOC", 
			"L_PAREN", "R_PAREN", "SLASH", "DOUBLE_SLASH", "FILENAME", "STRING", 
			"ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XPathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class XqContext extends ParserRuleContext {
		public TagNameContext open;
		public TagNameContext close;
		public TerminalNode Var() { return getToken(XPathParser.Var, 0); }
		public TerminalNode STRING() { return getToken(XPathParser.STRING, 0); }
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(XPathParser.L_PAREN, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode R_PAREN() { return getToken(XPathParser.R_PAREN, 0); }
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public ForceLetClauseContext forceLetClause() {
			return getRuleContext(ForceLetClauseContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode DOUBLE_SLASH() { return getToken(XPathParser.DOUBLE_SLASH, 0); }
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(31);
				match(Var);
				}
				break;
			case STRING:
				{
				setState(32);
				match(STRING);
				}
				break;
			case DOC:
				{
				setState(33);
				ap();
				}
				break;
			case L_PAREN:
				{
				setState(34);
				match(L_PAREN);
				setState(35);
				xq(0);
				setState(36);
				match(R_PAREN);
				}
				break;
			case T__1:
				{
				setState(38);
				match(T__1);
				setState(39);
				((XqContext)_localctx).open = tagName();
				setState(40);
				match(T__2);
				setState(41);
				match(T__3);
				setState(42);
				xq(0);
				setState(43);
				match(T__4);
				setState(44);
				match(T__5);
				setState(45);
				((XqContext)_localctx).close = tagName();
				setState(46);
				match(T__2);
				setState(47);
				if (!( (((XqContext)_localctx).open!=null?_input.getText(((XqContext)_localctx).open.start,((XqContext)_localctx).open.stop):null).equals((((XqContext)_localctx).close!=null?_input.getText(((XqContext)_localctx).close.start,((XqContext)_localctx).close.stop):null)) )) throw new FailedPredicateException(this, " $open.text.equals($close.text) ");
				}
				break;
			case FOR:
				{
				setState(49);
				forClause();
				setState(50);
				letClause();
				setState(51);
				whereClause();
				setState(52);
				returnClause();
				}
				break;
			case LET:
				{
				setState(54);
				forceLetClause();
				setState(55);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(59);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(60);
						match(T__0);
						setState(61);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(62);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(63);
						match(SLASH);
						setState(64);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						match(DOUBLE_SLASH);
						setState(67);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(XPathParser.FOR, 0); }
		public List<VarBindingContext> varBinding() {
			return getRuleContexts(VarBindingContext.class);
		}
		public VarBindingContext varBinding(int i) {
			return getRuleContext(VarBindingContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FOR);
			setState(74);
			varBinding();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(75);
				match(T__0);
				setState(76);
				varBinding();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(XPathParser.LET, 0); }
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(82);
				match(LET);
				setState(83);
				letBinding();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(84);
					match(T__0);
					setState(85);
					letBinding();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForceLetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(XPathParser.LET, 0); }
		public List<LetBindingContext> letBinding() {
			return getRuleContexts(LetBindingContext.class);
		}
		public LetBindingContext letBinding(int i) {
			return getRuleContext(LetBindingContext.class,i);
		}
		public ForceLetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forceLetClause; }
	}

	public final ForceLetClauseContext forceLetClause() throws RecognitionException {
		ForceLetClauseContext _localctx = new ForceLetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forceLetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LET);
			setState(94);
			letBinding();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(95);
				match(T__0);
				setState(96);
				letBinding();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(XPathParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(102);
				match(WHERE);
				setState(103);
				cond(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(XPathParser.RETURN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(RETURN);
			setState(107);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarBindingContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(XPathParser.Var, 0); }
		public TerminalNode IN() { return getToken(XPathParser.IN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public VarBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varBinding; }
	}

	public final VarBindingContext varBinding() throws RecognitionException {
		VarBindingContext _localctx = new VarBindingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(Var);
			setState(110);
			match(IN);
			setState(111);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LetBindingContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(XPathParser.Var, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBinding; }
	}

	public final LetBindingContext letBinding() throws RecognitionException {
		LetBindingContext _localctx = new LetBindingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_letBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Var);
			setState(114);
			match(T__6);
			setState(115);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XPathParser.EQ, 0); }
		public TerminalNode IS() { return getToken(XPathParser.IS, 0); }
		public TerminalNode EMPTY() { return getToken(XPathParser.EMPTY, 0); }
		public TerminalNode L_PAREN() { return getToken(XPathParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(XPathParser.R_PAREN, 0); }
		public TerminalNode SOME() { return getToken(XPathParser.SOME, 0); }
		public List<VarInXQContext> varInXQ() {
			return getRuleContexts(VarInXQContext.class);
		}
		public VarInXQContext varInXQ(int i) {
			return getRuleContext(VarInXQContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(XPathParser.SATISFIES, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode NOT() { return getToken(XPathParser.NOT, 0); }
		public TerminalNode AND() { return getToken(XPathParser.AND, 0); }
		public TerminalNode OR() { return getToken(XPathParser.OR, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
				xq(0);
				setState(119);
				match(T__7);
				setState(120);
				xq(0);
				}
				break;
			case 2:
				{
				setState(122);
				xq(0);
				setState(123);
				match(EQ);
				setState(124);
				xq(0);
				}
				break;
			case 3:
				{
				setState(126);
				xq(0);
				setState(127);
				match(T__8);
				setState(128);
				xq(0);
				}
				break;
			case 4:
				{
				setState(130);
				xq(0);
				setState(131);
				match(IS);
				setState(132);
				xq(0);
				}
				break;
			case 5:
				{
				setState(134);
				match(EMPTY);
				setState(135);
				match(L_PAREN);
				setState(136);
				xq(0);
				setState(137);
				match(R_PAREN);
				}
				break;
			case 6:
				{
				setState(139);
				match(SOME);
				setState(140);
				varInXQ();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(141);
					match(T__0);
					setState(142);
					varInXQ();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(SATISFIES);
				setState(149);
				cond(5);
				}
				break;
			case 7:
				{
				setState(151);
				match(L_PAREN);
				setState(152);
				cond(0);
				setState(153);
				match(R_PAREN);
				}
				break;
			case 8:
				{
				setState(155);
				match(NOT);
				setState(156);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(AND);
						setState(161);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(OR);
						setState(164);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarInXQContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(XPathParser.Var, 0); }
		public TerminalNode IN() { return getToken(XPathParser.IN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public VarInXQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInXQ; }
	}

	public final VarInXQContext varInXQ() throws RecognitionException {
		VarInXQContext _localctx = new VarInXQContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varInXQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(Var);
			setState(171);
			match(IN);
			setState(172);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AbsolutePathDoubleSlashContext extends ApContext {
		public TerminalNode DOC() { return getToken(XPathParser.DOC, 0); }
		public TerminalNode L_PAREN() { return getToken(XPathParser.L_PAREN, 0); }
		public TerminalNode FILENAME() { return getToken(XPathParser.FILENAME, 0); }
		public TerminalNode R_PAREN() { return getToken(XPathParser.R_PAREN, 0); }
		public TerminalNode DOUBLE_SLASH() { return getToken(XPathParser.DOUBLE_SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public AbsolutePathDoubleSlashContext(ApContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AbsolutePathSlashContext extends ApContext {
		public TerminalNode DOC() { return getToken(XPathParser.DOC, 0); }
		public TerminalNode L_PAREN() { return getToken(XPathParser.L_PAREN, 0); }
		public TerminalNode FILENAME() { return getToken(XPathParser.FILENAME, 0); }
		public TerminalNode R_PAREN() { return getToken(XPathParser.R_PAREN, 0); }
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public AbsolutePathSlashContext(ApContext ctx) { copyFrom(ctx); }
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ap);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AbsolutePathSlashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(DOC);
				setState(175);
				match(L_PAREN);
				setState(176);
				match(FILENAME);
				setState(177);
				match(R_PAREN);
				setState(178);
				match(SLASH);
				setState(179);
				rp(0);
				}
				break;
			case 2:
				_localctx = new AbsolutePathDoubleSlashContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(DOC);
				setState(181);
				match(L_PAREN);
				setState(182);
				match(FILENAME);
				setState(183);
				match(R_PAREN);
				setState(184);
				match(DOUBLE_SLASH);
				setState(185);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagName_Context extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagName_Context(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathFilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public PathFilterContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedRPContext extends RpContext {
		public TerminalNode L_PAREN() { return getToken(XPathParser.L_PAREN, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(XPathParser.R_PAREN, 0); }
		public ParenthesizedRPContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathDoubleSlashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DOUBLE_SLASH() { return getToken(XPathParser.DOUBLE_SLASH, 0); }
		public PathDoubleSlashContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathCommaContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public PathCommaContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildcardContext extends RpContext {
		public WildcardContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends RpContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextContext extends RpContext {
		public TextContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathSlashContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(XPathParser.SLASH, 0); }
		public PathSlashContext(RpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CurrentContext extends RpContext {
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TagName_Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				tagName();
				}
				break;
			case T__9:
				{
				_localctx = new WildcardContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__10);
				}
				break;
			case T__11:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__11);
				}
				break;
			case T__12:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(T__12);
				}
				break;
			case T__13:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__13);
				setState(195);
				attName();
				}
				break;
			case L_PAREN:
				{
				_localctx = new ParenthesizedRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(L_PAREN);
				setState(197);
				rp(0);
				setState(198);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new PathSlashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						match(SLASH);
						setState(204);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new PathDoubleSlashContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(DOUBLE_SLASH);
						setState(207);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new PathCommaContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						match(T__0);
						setState(210);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new PathFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(T__14);
						setState(213);
						f(0);
						setState(214);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterEqualContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterEqualContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterNotContext extends FContext {
		public TerminalNode NOT() { return getToken(XPathParser.NOT, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FilterNotContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterOrContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode OR() { return getToken(XPathParser.OR, 0); }
		public FilterOrContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterAndContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode AND() { return getToken(XPathParser.AND, 0); }
		public FilterAndContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterRPContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterRPContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterEqContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(XPathParser.EQ, 0); }
		public FilterEqContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterDoubleEqualContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilterDoubleEqualContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterIsContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IS() { return getToken(XPathParser.IS, 0); }
		public FilterIsContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedFilterContext extends FContext {
		public TerminalNode L_PAREN() { return getToken(XPathParser.L_PAREN, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(XPathParser.R_PAREN, 0); }
		public ParenthesizedFilterContext(FContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterStringConstantContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode STRING() { return getToken(XPathParser.STRING, 0); }
		public FilterStringConstantContext(FContext ctx) { copyFrom(ctx); }
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new FilterRPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new FilterEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				rp(0);
				setState(224);
				match(T__7);
				setState(225);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilterEqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				rp(0);
				setState(228);
				match(EQ);
				setState(229);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilterDoubleEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(231);
				rp(0);
				setState(232);
				match(T__8);
				setState(233);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FilterIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				rp(0);
				setState(236);
				match(IS);
				setState(237);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FilterStringConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				rp(0);
				setState(240);
				match(T__7);
				setState(241);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new ParenthesizedFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(L_PAREN);
				setState(244);
				f(0);
				setState(245);
				match(R_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new FilterNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(NOT);
				setState(248);
				f(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new FilterAndContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(251);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(252);
						match(AND);
						setState(253);
						f(4);
						}
						break;
					case 2:
						{
						_localctx = new FilterOrContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(254);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(255);
						match(OR);
						setState(256);
						f(3);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XPathParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(XPathParser.ID, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 8:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 11:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 12:
			return f_sempred((FContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  (((XqContext)_localctx).open!=null?_input.getText(((XqContext)_localctx).open.start,((XqContext)_localctx).open.stop):null).equals((((XqContext)_localctx).close!=null?_input.getText(((XqContext)_localctx).close.start,((XqContext)_localctx).close.stop):null)) ;
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 1);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u010b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000:\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001N\b\u0001\n\u0001\f\u0001Q\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002W\b\u0002"+
		"\n\u0002\f\u0002Z\t\u0002\u0003\u0002\\\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003e\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004i\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u0090\b\b\n\b\f\b\u0093\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u009e\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00a6"+
		"\b\b\n\b\f\b\u00a9\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00bb\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00d9\b\u000b\n\u000b\f\u000b\u00dc\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00fa\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0102\b\f\n\f\f\f\u0105\t\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0004\u0000\u0010\u0016\u0018\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000"+
		"\u0127\u00009\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004"+
		"[\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000\u0000\bh\u0001\u0000"+
		"\u0000\u0000\nj\u0001\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000e"+
		"q\u0001\u0000\u0000\u0000\u0010\u009d\u0001\u0000\u0000\u0000\u0012\u00aa"+
		"\u0001\u0000\u0000\u0000\u0014\u00ba\u0001\u0000\u0000\u0000\u0016\u00c8"+
		"\u0001\u0000\u0000\u0000\u0018\u00f9\u0001\u0000\u0000\u0000\u001a\u0106"+
		"\u0001\u0000\u0000\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0006\u0000\uffff\uffff\u0000\u001f:\u0005\u0011\u0000\u0000 :\u0005"+
		"%\u0000\u0000!:\u0003\u0014\n\u0000\"#\u0005 \u0000\u0000#$\u0003\u0000"+
		"\u0000\u0000$%\u0005!\u0000\u0000%:\u0001\u0000\u0000\u0000&\'\u0005\u0002"+
		"\u0000\u0000\'(\u0003\u001a\r\u0000()\u0005\u0003\u0000\u0000)*\u0005"+
		"\u0004\u0000\u0000*+\u0003\u0000\u0000\u0000+,\u0005\u0005\u0000\u0000"+
		",-\u0005\u0006\u0000\u0000-.\u0003\u001a\r\u0000./\u0005\u0003\u0000\u0000"+
		"/0\u0004\u0000\u0000\u00010:\u0001\u0000\u0000\u000012\u0003\u0002\u0001"+
		"\u000023\u0003\u0004\u0002\u000034\u0003\b\u0004\u000045\u0003\n\u0005"+
		"\u00005:\u0001\u0000\u0000\u000067\u0003\u0006\u0003\u000078\u0003\u0000"+
		"\u0000\u00018:\u0001\u0000\u0000\u00009\u001e\u0001\u0000\u0000\u0000"+
		"9 \u0001\u0000\u0000\u00009!\u0001\u0000\u0000\u00009\"\u0001\u0000\u0000"+
		"\u00009&\u0001\u0000\u0000\u000091\u0001\u0000\u0000\u000096\u0001\u0000"+
		"\u0000\u0000:F\u0001\u0000\u0000\u0000;<\n\u0006\u0000\u0000<=\u0005\u0001"+
		"\u0000\u0000=E\u0003\u0000\u0000\u0007>?\n\u0005\u0000\u0000?@\u0005\""+
		"\u0000\u0000@E\u0003\u0016\u000b\u0000AB\n\u0004\u0000\u0000BC\u0005#"+
		"\u0000\u0000CE\u0003\u0016\u000b\u0000D;\u0001\u0000\u0000\u0000D>\u0001"+
		"\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u0001\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0012\u0000\u0000JO\u0003"+
		"\f\u0006\u0000KL\u0005\u0001\u0000\u0000LN\u0003\f\u0006\u0000MK\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u0003\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0013\u0000\u0000SX\u0003\u000e\u0007\u0000TU\u0005"+
		"\u0001\u0000\u0000UW\u0003\u000e\u0007\u0000VT\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[R\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000"+
		"]^\u0005\u0013\u0000\u0000^c\u0003\u000e\u0007\u0000_`\u0005\u0001\u0000"+
		"\u0000`b\u0003\u000e\u0007\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0007"+
		"\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0014\u0000"+
		"\u0000gi\u0003\u0010\b\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000i\t\u0001\u0000\u0000\u0000jk\u0005\u0015\u0000\u0000kl\u0003\u0000"+
		"\u0000\u0000l\u000b\u0001\u0000\u0000\u0000mn\u0005\u0011\u0000\u0000"+
		"no\u0005\u0016\u0000\u0000op\u0003\u0000\u0000\u0000p\r\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0011\u0000\u0000rs\u0005\u0007\u0000\u0000st\u0003\u0000"+
		"\u0000\u0000t\u000f\u0001\u0000\u0000\u0000uv\u0006\b\uffff\uffff\u0000"+
		"vw\u0003\u0000\u0000\u0000wx\u0005\b\u0000\u0000xy\u0003\u0000\u0000\u0000"+
		"y\u009e\u0001\u0000\u0000\u0000z{\u0003\u0000\u0000\u0000{|\u0005\u001d"+
		"\u0000\u0000|}\u0003\u0000\u0000\u0000}\u009e\u0001\u0000\u0000\u0000"+
		"~\u007f\u0003\u0000\u0000\u0000\u007f\u0080\u0005\t\u0000\u0000\u0080"+
		"\u0081\u0003\u0000\u0000\u0000\u0081\u009e\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0003\u0000\u0000\u0000\u0083\u0084\u0005\u001e\u0000\u0000\u0084"+
		"\u0085\u0003\u0000\u0000\u0000\u0085\u009e\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u001b\u0000\u0000\u0087\u0088\u0005 \u0000\u0000\u0088\u0089"+
		"\u0003\u0000\u0000\u0000\u0089\u008a\u0005!\u0000\u0000\u008a\u009e\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005\u001c\u0000\u0000\u008c\u0091\u0003"+
		"\u0012\t\u0000\u008d\u008e\u0005\u0001\u0000\u0000\u008e\u0090\u0003\u0012"+
		"\t\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095\u0096\u0003\u0010\b\u0005"+
		"\u0096\u009e\u0001\u0000\u0000\u0000\u0097\u0098\u0005 \u0000\u0000\u0098"+
		"\u0099\u0003\u0010\b\u0000\u0099\u009a\u0005!\u0000\u0000\u009a\u009e"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001a\u0000\u0000\u009c\u009e"+
		"\u0003\u0010\b\u0001\u009du\u0001\u0000\u0000\u0000\u009dz\u0001\u0000"+
		"\u0000\u0000\u009d~\u0001\u0000\u0000\u0000\u009d\u0082\u0001\u0000\u0000"+
		"\u0000\u009d\u0086\u0001\u0000\u0000\u0000\u009d\u008b\u0001\u0000\u0000"+
		"\u0000\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u00a7\u0001\u0000\u0000\u0000\u009f\u00a0\n\u0003\u0000\u0000"+
		"\u00a0\u00a1\u0005\u0018\u0000\u0000\u00a1\u00a6\u0003\u0010\b\u0004\u00a2"+
		"\u00a3\n\u0002\u0000\u0000\u00a3\u00a4\u0005\u0019\u0000\u0000\u00a4\u00a6"+
		"\u0003\u0010\b\u0003\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u0011\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0011\u0000\u0000\u00ab\u00ac\u0005\u0016\u0000\u0000\u00ac\u00ad\u0003"+
		"\u0000\u0000\u0000\u00ad\u0013\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u001f\u0000\u0000\u00af\u00b0\u0005 \u0000\u0000\u00b0\u00b1\u0005$\u0000"+
		"\u0000\u00b1\u00b2\u0005!\u0000\u0000\u00b2\u00b3\u0005\"\u0000\u0000"+
		"\u00b3\u00bb\u0003\u0016\u000b\u0000\u00b4\u00b5\u0005\u001f\u0000\u0000"+
		"\u00b5\u00b6\u0005 \u0000\u0000\u00b6\u00b7\u0005$\u0000\u0000\u00b7\u00b8"+
		"\u0005!\u0000\u0000\u00b8\u00b9\u0005#\u0000\u0000\u00b9\u00bb\u0003\u0016"+
		"\u000b\u0000\u00ba\u00ae\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000"+
		"\u0000\u0000\u00bb\u0015\u0001\u0000\u0000\u0000\u00bc\u00bd\u0006\u000b"+
		"\uffff\uffff\u0000\u00bd\u00c9\u0003\u001a\r\u0000\u00be\u00c9\u0005\n"+
		"\u0000\u0000\u00bf\u00c9\u0005\u000b\u0000\u0000\u00c0\u00c9\u0005\f\u0000"+
		"\u0000\u00c1\u00c9\u0005\r\u0000\u0000\u00c2\u00c3\u0005\u000e\u0000\u0000"+
		"\u00c3\u00c9\u0003\u001c\u000e\u0000\u00c4\u00c5\u0005 \u0000\u0000\u00c5"+
		"\u00c6\u0003\u0016\u000b\u0000\u00c6\u00c7\u0005!\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8\u00be"+
		"\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000\u0000\u0000\u00c8\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000\u0000\u00c8\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c9\u00da"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\n\u0004\u0000\u0000\u00cb\u00cc\u0005"+
		"\"\u0000\u0000\u00cc\u00d9\u0003\u0016\u000b\u0005\u00cd\u00ce\n\u0003"+
		"\u0000\u0000\u00ce\u00cf\u0005#\u0000\u0000\u00cf\u00d9\u0003\u0016\u000b"+
		"\u0004\u00d0\u00d1\n\u0001\u0000\u0000\u00d1\u00d2\u0005\u0001\u0000\u0000"+
		"\u00d2\u00d9\u0003\u0016\u000b\u0002\u00d3\u00d4\n\u0002\u0000\u0000\u00d4"+
		"\u00d5\u0005\u000f\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d7"+
		"\u0005\u0010\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00ca"+
		"\u0001\u0000\u0000\u0000\u00d8\u00cd\u0001\u0000\u0000\u0000\u00d8\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d3\u0001\u0000\u0000\u0000\u00d9\u00dc"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u0017\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0006\f\uffff\uffff\u0000\u00de\u00fa"+
		"\u0003\u0016\u000b\u0000\u00df\u00e0\u0003\u0016\u000b\u0000\u00e0\u00e1"+
		"\u0005\b\u0000\u0000\u00e1\u00e2\u0003\u0016\u000b\u0000\u00e2\u00fa\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0003\u0016\u000b\u0000\u00e4\u00e5\u0005"+
		"\u001d\u0000\u0000\u00e5\u00e6\u0003\u0016\u000b\u0000\u00e6\u00fa\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0003\u0016\u000b\u0000\u00e8\u00e9\u0005"+
		"\t\u0000\u0000\u00e9\u00ea\u0003\u0016\u000b\u0000\u00ea\u00fa\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0003\u0016\u000b\u0000\u00ec\u00ed\u0005\u001e"+
		"\u0000\u0000\u00ed\u00ee\u0003\u0016\u000b\u0000\u00ee\u00fa\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0003\u0016\u000b\u0000\u00f0\u00f1\u0005\b\u0000"+
		"\u0000\u00f1\u00f2\u0005%\u0000\u0000\u00f2\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005 \u0000\u0000\u00f4\u00f5\u0003\u0018\f\u0000\u00f5"+
		"\u00f6\u0005!\u0000\u0000\u00f6\u00fa\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0005\u001a\u0000\u0000\u00f8\u00fa\u0003\u0018\f\u0001\u00f9\u00dd\u0001"+
		"\u0000\u0000\u0000\u00f9\u00df\u0001\u0000\u0000\u0000\u00f9\u00e3\u0001"+
		"\u0000\u0000\u0000\u00f9\u00e7\u0001\u0000\u0000\u0000\u00f9\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00ef\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u0103\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\n\u0003\u0000\u0000\u00fc\u00fd\u0005\u0018"+
		"\u0000\u0000\u00fd\u0102\u0003\u0018\f\u0004\u00fe\u00ff\n\u0002\u0000"+
		"\u0000\u00ff\u0100\u0005\u0019\u0000\u0000\u0100\u0102\u0003\u0018\f\u0003"+
		"\u0101\u00fb\u0001\u0000\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000"+
		"\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0019\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0005&\u0000\u0000\u0107"+
		"\u001b\u0001\u0000\u0000\u0000\u0108\u0109\u0005&\u0000\u0000\u0109\u001d"+
		"\u0001\u0000\u0000\u0000\u00139DFOX[ch\u0091\u009d\u00a5\u00a7\u00ba\u00c8"+
		"\u00d8\u00da\u00f9\u0101\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}