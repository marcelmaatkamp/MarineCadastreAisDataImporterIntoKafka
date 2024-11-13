// Generated from com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
package com.mycompany.myapp.ais.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AISDataParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SIGN=4, NUMBER=5, FLOAT=6, MMSINUMBER=7, DATETIME=8, 
		DATE=9, TIME=10, YEAR=11, MONTH=12, DAY=13, HOUR=14, MINUTE=15, SECOND=16, 
		LETTER=17, TEXT=18, WS=19;
	public static final int
		RULE_file = 0, RULE_header = 1, RULE_row = 2, RULE_mmsi = 3, RULE_dateTime = 4, 
		RULE_lat = 5, RULE_lon = 6, RULE_sog = 7, RULE_cog = 8, RULE_heading = 9, 
		RULE_vesselName = 10, RULE_imo = 11, RULE_callSign = 12, RULE_vesselType = 13, 
		RULE_status = 14, RULE_length = 15, RULE_width = 16, RULE_draft = 17, 
		RULE_cargo = 18, RULE_transceiverClass = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "header", "row", "mmsi", "dateTime", "lat", "lon", "sog", "cog", 
			"heading", "vesselName", "imo", "callSign", "vesselType", "status", "length", 
			"width", "draft", "cargo", "transceiverClass"
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

	@Override
	public String getGrammarFileName() { return "AISData.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AISDataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AISDataParser.EOF, 0); }
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			header();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(41);
				row();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(EOF);
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
	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(AISDataParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(AISDataParser.TEXT, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(TEXT);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(50);
				match(T__0);
				setState(51);
				match(TEXT);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(57);
				match(T__1);
				}
			}

			setState(60);
			match(T__2);
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
	public static class RowContext extends ParserRuleContext {
		public MmsiContext mmsi() {
			return getRuleContext(MmsiContext.class,0);
		}
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public LatContext lat() {
			return getRuleContext(LatContext.class,0);
		}
		public LonContext lon() {
			return getRuleContext(LonContext.class,0);
		}
		public SogContext sog() {
			return getRuleContext(SogContext.class,0);
		}
		public CogContext cog() {
			return getRuleContext(CogContext.class,0);
		}
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public VesselNameContext vesselName() {
			return getRuleContext(VesselNameContext.class,0);
		}
		public TransceiverClassContext transceiverClass() {
			return getRuleContext(TransceiverClassContext.class,0);
		}
		public ImoContext imo() {
			return getRuleContext(ImoContext.class,0);
		}
		public CallSignContext callSign() {
			return getRuleContext(CallSignContext.class,0);
		}
		public VesselTypeContext vesselType() {
			return getRuleContext(VesselTypeContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public DraftContext draft() {
			return getRuleContext(DraftContext.class,0);
		}
		public CargoContext cargo() {
			return getRuleContext(CargoContext.class,0);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			mmsi();
			setState(63);
			match(T__0);
			setState(64);
			dateTime();
			setState(65);
			match(T__0);
			setState(66);
			lat();
			setState(67);
			match(T__0);
			setState(68);
			lon();
			setState(69);
			match(T__0);
			setState(70);
			sog();
			setState(71);
			match(T__0);
			setState(72);
			cog();
			setState(73);
			match(T__0);
			setState(74);
			heading();
			setState(75);
			match(T__0);
			setState(76);
			vesselName();
			setState(77);
			match(T__0);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
				imo();
				}
				break;
			}
			setState(81);
			match(T__0);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(82);
				callSign();
				}
				break;
			}
			setState(85);
			match(T__0);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				vesselType();
				}
				break;
			}
			setState(89);
			match(T__0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN || _la==NUMBER) {
				{
				setState(90);
				status();
				}
			}

			setState(93);
			match(T__0);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(94);
				length();
				}
			}

			setState(97);
			match(T__0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(98);
				width();
				}
			}

			setState(101);
			match(T__0);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FLOAT) {
				{
				setState(102);
				draft();
				}
			}

			setState(105);
			match(T__0);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(106);
				cargo();
				}
			}

			setState(109);
			match(T__0);
			setState(110);
			transceiverClass();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(111);
				match(T__1);
				}
			}

			setState(114);
			match(T__2);
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
	public static class MmsiContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public MmsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmsi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterMmsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitMmsi(this);
		}
	}

	public final MmsiContext mmsi() throws RecognitionException {
		MmsiContext _localctx = new MmsiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mmsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NUMBER);
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
	public static class DateTimeContext extends ParserRuleContext {
		public TerminalNode DATETIME() { return getToken(AISDataParser.DATETIME, 0); }
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitDateTime(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(DATETIME);
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
	public static class LatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AISDataParser.FLOAT, 0); }
		public LatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterLat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitLat(this);
		}
	}

	public final LatContext lat() throws RecognitionException {
		LatContext _localctx = new LatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(FLOAT);
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
	public static class LonContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AISDataParser.FLOAT, 0); }
		public LonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterLon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitLon(this);
		}
	}

	public final LonContext lon() throws RecognitionException {
		LonContext _localctx = new LonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(FLOAT);
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
	public static class SogContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AISDataParser.FLOAT, 0); }
		public SogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterSog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitSog(this);
		}
	}

	public final SogContext sog() throws RecognitionException {
		SogContext _localctx = new SogContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(FLOAT);
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
	public static class CogContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AISDataParser.FLOAT, 0); }
		public CogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterCog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitCog(this);
		}
	}

	public final CogContext cog() throws RecognitionException {
		CogContext _localctx = new CogContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FLOAT);
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
	public static class HeadingContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AISDataParser.FLOAT, 0); }
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitHeading(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FLOAT);
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
	public static class VesselNameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AISDataParser.TEXT, 0); }
		public TerminalNode LETTER() { return getToken(AISDataParser.LETTER, 0); }
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public VesselNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vesselName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterVesselName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitVesselName(this);
		}
	}

	public final VesselNameContext vesselName() throws RecognitionException {
		VesselNameContext _localctx = new VesselNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vesselName);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXT) {
					{
					setState(130);
					match(TEXT);
					}
				}

				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(LETTER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ImoContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AISDataParser.TEXT, 0); }
		public TerminalNode LETTER() { return getToken(AISDataParser.LETTER, 0); }
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public ImoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterImo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitImo(this);
		}
	}

	public final ImoContext imo() throws RecognitionException {
		ImoContext _localctx = new ImoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imo);
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXT) {
					{
					setState(137);
					match(TEXT);
					}
				}

				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(LETTER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CallSignContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AISDataParser.TEXT, 0); }
		public TerminalNode LETTER() { return getToken(AISDataParser.LETTER, 0); }
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public CallSignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterCallSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitCallSign(this);
		}
	}

	public final CallSignContext callSign() throws RecognitionException {
		CallSignContext _localctx = new CallSignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callSign);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEXT) {
					{
					setState(144);
					match(TEXT);
					}
				}

				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LETTER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class VesselTypeContext extends ParserRuleContext {
		public TerminalNode SIGN() { return getToken(AISDataParser.SIGN, 0); }
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public VesselTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vesselType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterVesselType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitVesselType(this);
		}
	}

	public final VesselTypeContext vesselType() throws RecognitionException {
		VesselTypeContext _localctx = new VesselTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vesselType);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIGN) {
					{
					setState(151);
					match(SIGN);
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class StatusContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public TerminalNode SIGN() { return getToken(AISDataParser.SIGN, 0); }
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitStatus(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_status);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(157);
				match(SIGN);
				}
			}

			setState(160);
			match(NUMBER);
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
	public static class LengthContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NUMBER);
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
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitWidth(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(NUMBER);
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
	public static class DraftContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(AISDataParser.FLOAT, 0); }
		public DraftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_draft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterDraft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitDraft(this);
		}
	}

	public final DraftContext draft() throws RecognitionException {
		DraftContext _localctx = new DraftContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_draft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(FLOAT);
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
	public static class CargoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
		public CargoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cargo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterCargo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitCargo(this);
		}
	}

	public final CargoContext cargo() throws RecognitionException {
		CargoContext _localctx = new CargoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cargo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(NUMBER);
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
	public static class TransceiverClassContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(AISDataParser.LETTER, 0); }
		public TransceiverClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transceiverClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).enterTransceiverClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AISDataListener ) ((AISDataListener)listener).exitTransceiverClass(this);
		}
	}

	public final TransceiverClassContext transceiverClass() throws RecognitionException {
		TransceiverClassContext _localctx = new TransceiverClassContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transceiverClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LETTER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u00ad\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b"+
		"\u0000\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001"+
		"\u0001\u0003\u0001;\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002X\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002`\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"d\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002l\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002q\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0003\n\u0084"+
		"\b\n\u0001\n\u0001\n\u0003\n\u0088\b\n\u0001\u000b\u0003\u000b\u008b\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008f\b\u000b\u0001\f\u0003"+
		"\f\u0092\b\f\u0001\f\u0001\f\u0003\f\u0096\b\f\u0001\r\u0003\r\u0099\b"+
		"\r\u0001\r\u0003\r\u009c\b\r\u0001\u000e\u0003\u000e\u009f\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0000\u00b0\u0000(\u0001"+
		"\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000"+
		"\u0000\u0006t\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\nx\u0001"+
		"\u0000\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000"+
		"\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000"+
		"\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000"+
		"\u0018\u0095\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000"+
		"\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a2\u0001\u0000\u0000\u0000"+
		" \u00a4\u0001\u0000\u0000\u0000\"\u00a6\u0001\u0000\u0000\u0000$\u00a8"+
		"\u0001\u0000\u0000\u0000&\u00aa\u0001\u0000\u0000\u0000(,\u0003\u0002"+
		"\u0001\u0000)+\u0003\u0004\u0002\u0000*)\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000"+
		"\u00010\u0001\u0001\u0000\u0000\u000016\u0005\u0012\u0000\u000023\u0005"+
		"\u0001\u0000\u000035\u0005\u0012\u0000\u000042\u0001\u0000\u0000\u0000"+
		"58\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0005\u0002"+
		"\u0000\u0000:9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0005\u0003\u0000\u0000=\u0003\u0001\u0000\u0000"+
		"\u0000>?\u0003\u0006\u0003\u0000?@\u0005\u0001\u0000\u0000@A\u0003\b\u0004"+
		"\u0000AB\u0005\u0001\u0000\u0000BC\u0003\n\u0005\u0000CD\u0005\u0001\u0000"+
		"\u0000DE\u0003\f\u0006\u0000EF\u0005\u0001\u0000\u0000FG\u0003\u000e\u0007"+
		"\u0000GH\u0005\u0001\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0005\u0001\u0000"+
		"\u0000JK\u0003\u0012\t\u0000KL\u0005\u0001\u0000\u0000LM\u0003\u0014\n"+
		"\u0000MO\u0005\u0001\u0000\u0000NP\u0003\u0016\u000b\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0005"+
		"\u0001\u0000\u0000RT\u0003\u0018\f\u0000SR\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0005\u0001\u0000\u0000"+
		"VX\u0003\u001a\r\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y[\u0005\u0001\u0000\u0000Z\\\u0003\u001c\u000e"+
		"\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]_\u0005\u0001\u0000\u0000^`\u0003\u001e\u000f\u0000_^\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ac\u0005\u0001\u0000\u0000bd\u0003 \u0010\u0000cb\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0005\u0001\u0000"+
		"\u0000fh\u0003\"\u0011\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ik\u0005\u0001\u0000\u0000jl\u0003$\u0012"+
		"\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0001\u0000\u0000np\u0003&\u0013\u0000oq\u0005\u0002"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rs\u0005\u0003\u0000\u0000s\u0005\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0005\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0005"+
		"\b\u0000\u0000w\t\u0001\u0000\u0000\u0000xy\u0005\u0006\u0000\u0000y\u000b"+
		"\u0001\u0000\u0000\u0000z{\u0005\u0006\u0000\u0000{\r\u0001\u0000\u0000"+
		"\u0000|}\u0005\u0006\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0006\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0006\u0000\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\u0012\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0088\u0001\u0000\u0000\u0000\u0085\u0088"+
		"\u0005\u0011\u0000\u0000\u0086\u0088\u0005\u0005\u0000\u0000\u0087\u0083"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0005\u0012\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008f\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0005\u0011\u0000\u0000\u008d\u008f\u0005\u0005\u0000\u0000\u008e\u008a"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0017\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u0005\u0012\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0096\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0005\u0011\u0000\u0000\u0094\u0096\u0005\u0005\u0000\u0000\u0095\u0091"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0005\u0004\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u009c"+
		"\u0005\u0005\u0000\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u001b\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0005\u0004\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0005\u0000\u0000\u00a1\u001d\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005\u0005\u0000\u0000\u00a3\u001f\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\u0005\u0000\u0000\u00a5!\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\u0006\u0000\u0000\u00a7#\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0005"+
		"\u0000\u0000\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0011\u0000"+
		"\u0000\u00ab\'\u0001\u0000\u0000\u0000\u0015,6:OSW[_cgkp\u0083\u0087\u008a"+
		"\u008e\u0091\u0095\u0098\u009b\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}