// Generated from com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
package com.mycompany.myapp.ais.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AISDataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SIGN=4, NUMBER=5, FLOAT=6, MMSINUMBER=7, DATETIME=8, 
		DATE=9, TIME=10, YEAR=11, MONTH=12, DAY=13, HOUR=14, MINUTE=15, SECOND=16, 
		LETTER=17, TEXT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "SIGN", "NUMBER", "FLOAT", "MMSINUMBER", "DATETIME", 
			"DATE", "TIME", "YEAR", "MONTH", "DAY", "HOUR", "MINUTE", "SECOND", "DIGIT", 
			"LETTER", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'\\r'", "'\\n'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SIGN", "NUMBER", "FLOAT", "MMSINUMBER", "DATETIME", 
			"DATE", "TIME", "YEAR", "MONTH", "DAY", "HOUR", "MINUTE", "SECOND", "LETTER", 
			"TEXT", "WS"
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


	public AISDataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AISData.g4"; }

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
		"\u0004\u0000\u0013{\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0003\u00043\b\u0004\u0001\u0004\u0004\u00046\b\u0004\u000b\u0004"+
		"\f\u00047\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0004\u0012q\b\u0012\u000b\u0012\f\u0012r\u0001\u0013\u0004\u0013"+
		"v\b\u0013\u000b\u0013\f\u0013w\u0001\u0013\u0001\u0013\u0000\u0000\u0014"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0000#\u0011%\u0012\'\u0013\u0001\u0000\u0004"+
		"\u0001\u000009\u0002\u0000AZaz\u0004\u0000  09AZaz\u0002\u0000\t\t  }"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000"+
		"\u0005-\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t2\u0001"+
		"\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000"+
		"\u0000\u000fG\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000\u0013"+
		"Q\u0001\u0000\u0000\u0000\u0015W\u0001\u0000\u0000\u0000\u0017\\\u0001"+
		"\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001bb\u0001\u0000\u0000"+
		"\u0000\u001de\u0001\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000!"+
		"k\u0001\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%p\u0001\u0000\u0000"+
		"\u0000\'u\u0001\u0000\u0000\u0000)*\u0005,\u0000\u0000*\u0002\u0001\u0000"+
		"\u0000\u0000+,\u0005\r\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005"+
		"\n\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005-\u0000\u00000\b"+
		"\u0001\u0000\u0000\u000013\u0003\u0007\u0003\u000021\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000046\u0007\u0000"+
		"\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u00008\n\u0001\u0000\u0000\u0000"+
		"9:\u0003\t\u0004\u0000:;\u0005.\u0000\u0000;<\u0003\t\u0004\u0000<\f\u0001"+
		"\u0000\u0000\u0000=>\u0003!\u0010\u0000>?\u0003!\u0010\u0000?@\u0003!"+
		"\u0010\u0000@A\u0003!\u0010\u0000AB\u0003!\u0010\u0000BC\u0003!\u0010"+
		"\u0000CD\u0003!\u0010\u0000DE\u0003!\u0010\u0000EF\u0003!\u0010\u0000"+
		"F\u000e\u0001\u0000\u0000\u0000GH\u0003\u0011\b\u0000HI\u0005T\u0000\u0000"+
		"IJ\u0003\u0013\t\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0003\u0015\n"+
		"\u0000LM\u0005-\u0000\u0000MN\u0003\u0017\u000b\u0000NO\u0005-\u0000\u0000"+
		"OP\u0003\u0019\f\u0000P\u0012\u0001\u0000\u0000\u0000QR\u0003\u001b\r"+
		"\u0000RS\u0005:\u0000\u0000ST\u0003\u001d\u000e\u0000TU\u0005:\u0000\u0000"+
		"UV\u0003\u001f\u000f\u0000V\u0014\u0001\u0000\u0000\u0000WX\u0003!\u0010"+
		"\u0000XY\u0003!\u0010\u0000YZ\u0003!\u0010\u0000Z[\u0003!\u0010\u0000"+
		"[\u0016\u0001\u0000\u0000\u0000\\]\u0003!\u0010\u0000]^\u0003!\u0010\u0000"+
		"^\u0018\u0001\u0000\u0000\u0000_`\u0003!\u0010\u0000`a\u0003!\u0010\u0000"+
		"a\u001a\u0001\u0000\u0000\u0000bc\u0003!\u0010\u0000cd\u0003!\u0010\u0000"+
		"d\u001c\u0001\u0000\u0000\u0000ef\u0003!\u0010\u0000fg\u0003!\u0010\u0000"+
		"g\u001e\u0001\u0000\u0000\u0000hi\u0003!\u0010\u0000ij\u0003!\u0010\u0000"+
		"j \u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\"\u0001\u0000\u0000"+
		"\u0000mn\u0007\u0001\u0000\u0000n$\u0001\u0000\u0000\u0000oq\u0007\u0002"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s&\u0001\u0000\u0000\u0000"+
		"tv\u0007\u0003\u0000\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0006\u0013\u0000\u0000z(\u0001\u0000\u0000\u0000\u0005"+
		"\u000027rw\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}