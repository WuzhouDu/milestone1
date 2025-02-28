// Generated from XPath.g4 by ANTLR 4.13.2

	package main.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, Var=17, 
		FOR=18, LET=19, WHERE=20, RETURN=21, IN=22, SATISFIES=23, AND=24, OR=25, 
		NOT=26, EMPTY=27, SOME=28, EQ=29, IS=30, DOC=31, L_PAREN=32, R_PAREN=33, 
		SLASH=34, DOUBLE_SLASH=35, FILENAME=36, STRING=37, ID=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "Var", 
			"FOR", "LET", "WHERE", "RETURN", "IN", "SATISFIES", "AND", "OR", "NOT", 
			"EMPTY", "SOME", "EQ", "IS", "DOC", "L_PAREN", "R_PAREN", "SLASH", "DOUBLE_SLASH", 
			"FILENAME", "STRING", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'<'", "'>'", "'{'", "'}'", "'</'", "':='", "'='", "'=='", 
			"'*'", "'.'", "'..'", "'text()'", "'@'", "'['", "']'", null, "'for'", 
			"'let'", "'where'", "'return'", "'in'", "'satisfies'", "'and'", "'or'", 
			"'not'", "'empty'", "'some'", "'eq'", "'is'", null, "'('", "')'", "'/'", 
			"'//'"
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\'\u00f6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u00c5\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0004#\u00d2\b#\u000b#\f#\u00d3\u0001#\u0001#\u0004#\u00d8"+
		"\b#\u000b#\f#\u00d9\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u00e2"+
		"\b$\n$\f$\u00e5\t$\u0001$\u0001$\u0001%\u0001%\u0005%\u00eb\b%\n%\f%\u00ee"+
		"\t%\u0001&\u0004&\u00f1\b&\u000b&\f&\u00f2\u0001&\u0001&\u0000\u0000\'"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%"+
		"K&M\'\u0001\u0000\u0005\u0005\u0000--09AZ__az\u0003\u000009AZaz\u0002"+
		"\u0000\"\"\\\\\u0003\u0000AZ__az\u0003\u0000\t\n\r\r  \u00fc\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001"+
		"\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000"+
		"\u0000\u0000M\u0001\u0000\u0000\u0000\u0001O\u0001\u0000\u0000\u0000\u0003"+
		"Q\u0001\u0000\u0000\u0000\u0005S\u0001\u0000\u0000\u0000\u0007U\u0001"+
		"\u0000\u0000\u0000\tW\u0001\u0000\u0000\u0000\u000bY\u0001\u0000\u0000"+
		"\u0000\r\\\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000\u0011"+
		"a\u0001\u0000\u0000\u0000\u0013d\u0001\u0000\u0000\u0000\u0015f\u0001"+
		"\u0000\u0000\u0000\u0017h\u0001\u0000\u0000\u0000\u0019k\u0001\u0000\u0000"+
		"\u0000\u001br\u0001\u0000\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001f"+
		"v\u0001\u0000\u0000\u0000!x\u0001\u0000\u0000\u0000#{\u0001\u0000\u0000"+
		"\u0000%\u007f\u0001\u0000\u0000\u0000\'\u0083\u0001\u0000\u0000\u0000"+
		")\u0089\u0001\u0000\u0000\u0000+\u0090\u0001\u0000\u0000\u0000-\u0093"+
		"\u0001\u0000\u0000\u0000/\u009d\u0001\u0000\u0000\u00001\u00a1\u0001\u0000"+
		"\u0000\u00003\u00a4\u0001\u0000\u0000\u00005\u00a8\u0001\u0000\u0000\u0000"+
		"7\u00ae\u0001\u0000\u0000\u00009\u00b3\u0001\u0000\u0000\u0000;\u00b6"+
		"\u0001\u0000\u0000\u0000=\u00c4\u0001\u0000\u0000\u0000?\u00c6\u0001\u0000"+
		"\u0000\u0000A\u00c8\u0001\u0000\u0000\u0000C\u00ca\u0001\u0000\u0000\u0000"+
		"E\u00cc\u0001\u0000\u0000\u0000G\u00cf\u0001\u0000\u0000\u0000I\u00dd"+
		"\u0001\u0000\u0000\u0000K\u00e8\u0001\u0000\u0000\u0000M\u00f0\u0001\u0000"+
		"\u0000\u0000OP\u0005,\u0000\u0000P\u0002\u0001\u0000\u0000\u0000QR\u0005"+
		"<\u0000\u0000R\u0004\u0001\u0000\u0000\u0000ST\u0005>\u0000\u0000T\u0006"+
		"\u0001\u0000\u0000\u0000UV\u0005{\u0000\u0000V\b\u0001\u0000\u0000\u0000"+
		"WX\u0005}\u0000\u0000X\n\u0001\u0000\u0000\u0000YZ\u0005<\u0000\u0000"+
		"Z[\u0005/\u0000\u0000[\f\u0001\u0000\u0000\u0000\\]\u0005:\u0000\u0000"+
		"]^\u0005=\u0000\u0000^\u000e\u0001\u0000\u0000\u0000_`\u0005=\u0000\u0000"+
		"`\u0010\u0001\u0000\u0000\u0000ab\u0005=\u0000\u0000bc\u0005=\u0000\u0000"+
		"c\u0012\u0001\u0000\u0000\u0000de\u0005*\u0000\u0000e\u0014\u0001\u0000"+
		"\u0000\u0000fg\u0005.\u0000\u0000g\u0016\u0001\u0000\u0000\u0000hi\u0005"+
		".\u0000\u0000ij\u0005.\u0000\u0000j\u0018\u0001\u0000\u0000\u0000kl\u0005"+
		"t\u0000\u0000lm\u0005e\u0000\u0000mn\u0005x\u0000\u0000no\u0005t\u0000"+
		"\u0000op\u0005(\u0000\u0000pq\u0005)\u0000\u0000q\u001a\u0001\u0000\u0000"+
		"\u0000rs\u0005@\u0000\u0000s\u001c\u0001\u0000\u0000\u0000tu\u0005[\u0000"+
		"\u0000u\u001e\u0001\u0000\u0000\u0000vw\u0005]\u0000\u0000w \u0001\u0000"+
		"\u0000\u0000xy\u0005$\u0000\u0000yz\u0003K%\u0000z\"\u0001\u0000\u0000"+
		"\u0000{|\u0005f\u0000\u0000|}\u0005o\u0000\u0000}~\u0005r\u0000\u0000"+
		"~$\u0001\u0000\u0000\u0000\u007f\u0080\u0005l\u0000\u0000\u0080\u0081"+
		"\u0005e\u0000\u0000\u0081\u0082\u0005t\u0000\u0000\u0082&\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005w\u0000\u0000\u0084\u0085\u0005h\u0000\u0000"+
		"\u0085\u0086\u0005e\u0000\u0000\u0086\u0087\u0005r\u0000\u0000\u0087\u0088"+
		"\u0005e\u0000\u0000\u0088(\u0001\u0000\u0000\u0000\u0089\u008a\u0005r"+
		"\u0000\u0000\u008a\u008b\u0005e\u0000\u0000\u008b\u008c\u0005t\u0000\u0000"+
		"\u008c\u008d\u0005u\u0000\u0000\u008d\u008e\u0005r\u0000\u0000\u008e\u008f"+
		"\u0005n\u0000\u0000\u008f*\u0001\u0000\u0000\u0000\u0090\u0091\u0005i"+
		"\u0000\u0000\u0091\u0092\u0005n\u0000\u0000\u0092,\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005s\u0000\u0000\u0094\u0095\u0005a\u0000\u0000\u0095\u0096"+
		"\u0005t\u0000\u0000\u0096\u0097\u0005i\u0000\u0000\u0097\u0098\u0005s"+
		"\u0000\u0000\u0098\u0099\u0005f\u0000\u0000\u0099\u009a\u0005i\u0000\u0000"+
		"\u009a\u009b\u0005e\u0000\u0000\u009b\u009c\u0005s\u0000\u0000\u009c."+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005"+
		"n\u0000\u0000\u009f\u00a0\u0005d\u0000\u0000\u00a00\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2\u00a3\u0005r\u0000\u0000\u00a3"+
		"2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005n\u0000\u0000\u00a5\u00a6\u0005"+
		"o\u0000\u0000\u00a6\u00a7\u0005t\u0000\u0000\u00a74\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a9\u00aa\u0005m\u0000\u0000\u00aa"+
		"\u00ab\u0005p\u0000\u0000\u00ab\u00ac\u0005t\u0000\u0000\u00ac\u00ad\u0005"+
		"y\u0000\u0000\u00ad6\u0001\u0000\u0000\u0000\u00ae\u00af\u0005s\u0000"+
		"\u0000\u00af\u00b0\u0005o\u0000\u0000\u00b0\u00b1\u0005m\u0000\u0000\u00b1"+
		"\u00b2\u0005e\u0000\u0000\u00b28\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"e\u0000\u0000\u00b4\u00b5\u0005q\u0000\u0000\u00b5:\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005i\u0000\u0000\u00b7\u00b8\u0005s\u0000\u0000\u00b8"+
		"<\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005d\u0000\u0000\u00ba\u00bb\u0005"+
		"o\u0000\u0000\u00bb\u00c5\u0005c\u0000\u0000\u00bc\u00bd\u0005d\u0000"+
		"\u0000\u00bd\u00be\u0005o\u0000\u0000\u00be\u00bf\u0005c\u0000\u0000\u00bf"+
		"\u00c0\u0005u\u0000\u0000\u00c0\u00c1\u0005m\u0000\u0000\u00c1\u00c2\u0005"+
		"e\u0000\u0000\u00c2\u00c3\u0005n\u0000\u0000\u00c3\u00c5\u0005t\u0000"+
		"\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c4\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c5>\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005(\u0000\u0000\u00c7"+
		"@\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005)\u0000\u0000\u00c9B\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0005/\u0000\u0000\u00cbD\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0005/\u0000\u0000\u00cd\u00ce\u0005/\u0000\u0000\u00ce"+
		"F\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005\"\u0000\u0000\u00d0\u00d2"+
		"\u0007\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7"+
		"\u0005.\u0000\u0000\u00d6\u00d8\u0007\u0001\u0000\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\"\u0000\u0000\u00dcH\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e3\u0005\"\u0000\u0000\u00de\u00e2\b\u0002\u0000"+
		"\u0000\u00df\u00e0\u0005\\\u0000\u0000\u00e0\u00e2\t\u0000\u0000\u0000"+
		"\u00e1\u00de\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\"\u0000\u0000\u00e7"+
		"J\u0001\u0000\u0000\u0000\u00e8\u00ec\u0007\u0003\u0000\u0000\u00e9\u00eb"+
		"\u0007\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0001\u0000\u0000\u0000\u00edL\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f1\u0007\u0004\u0000\u0000\u00f0\u00ef\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0006&\u0000\u0000\u00f5N\u0001\u0000\u0000"+
		"\u0000\b\u0000\u00c4\u00d3\u00d9\u00e1\u00e3\u00ec\u00f2\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}