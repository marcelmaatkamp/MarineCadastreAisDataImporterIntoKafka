// Generated from com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.2
package com.mycompany.myapp.ais.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AISDataParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEADER_TEXT=1, COMMA=2, NEWLINE=3, IMO_NUMBER=4, DATETIME=5, FLOAT=6, 
		NUMBER=7, LETTER=8, STRING_FIELD=9, WS=10;
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
			null, "'MMSI,BaseDateTime,LAT,LON,SOG,COG,Heading,VesselName,IMO,CallSign,VesselType,Status,Length,Width,Draft,Cargo,TransceiverClass'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HEADER_TEXT", "COMMA", "NEWLINE", "IMO_NUMBER", "DATETIME", "FLOAT", 
			"NUMBER", "LETTER", "STRING_FIELD", "WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode HEADER_TEXT() { return getToken(AISDataParser.HEADER_TEXT, 0); }
		public TerminalNode NEWLINE() { return getToken(AISDataParser.NEWLINE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(HEADER_TEXT);
			setState(50);
			match(NEWLINE);
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
		public List<TerminalNode> COMMA() { return getTokens(AISDataParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AISDataParser.COMMA, i);
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
		public TransceiverClassContext transceiverClass() {
			return getRuleContext(TransceiverClassContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AISDataParser.NEWLINE, 0); }
		public VesselNameContext vesselName() {
			return getRuleContext(VesselNameContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			mmsi();
			setState(53);
			match(COMMA);
			setState(54);
			dateTime();
			setState(55);
			match(COMMA);
			setState(56);
			lat();
			setState(57);
			match(COMMA);
			setState(58);
			lon();
			setState(59);
			match(COMMA);
			setState(60);
			sog();
			setState(61);
			match(COMMA);
			setState(62);
			cog();
			setState(63);
			match(COMMA);
			setState(64);
			heading();
			setState(65);
			match(COMMA);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(66);
				vesselName();
				}
			}

			setState(69);
			match(COMMA);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMO_NUMBER) {
				{
				setState(70);
				imo();
				}
			}

			setState(73);
			match(COMMA);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(74);
				callSign();
				}
			}

			setState(77);
			match(COMMA);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(78);
				vesselType();
				}
			}

			setState(81);
			match(COMMA);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(82);
				status();
				}
			}

			setState(85);
			match(COMMA);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(86);
				length();
				}
			}

			setState(89);
			match(COMMA);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(90);
				width();
				}
			}

			setState(93);
			match(COMMA);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FLOAT) {
				{
				setState(94);
				draft();
				}
			}

			setState(97);
			match(COMMA);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(98);
				cargo();
				}
			}

			setState(101);
			match(COMMA);
			setState(102);
			transceiverClass();
			setState(103);
			match(NEWLINE);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitMmsi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MmsiContext mmsi() throws RecognitionException {
		MmsiContext _localctx = new MmsiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mmsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitDateTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitLat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatContext lat() throws RecognitionException {
		LatContext _localctx = new LatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitLon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LonContext lon() throws RecognitionException {
		LonContext _localctx = new LonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitSog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SogContext sog() throws RecognitionException {
		SogContext _localctx = new SogContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitCog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CogContext cog() throws RecognitionException {
		CogContext _localctx = new CogContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		public TerminalNode LETTER() { return getToken(AISDataParser.LETTER, 0); }
		public TerminalNode STRING_FIELD() { return getToken(AISDataParser.STRING_FIELD, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitVesselName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VesselNameContext vesselName() throws RecognitionException {
		VesselNameContext _localctx = new VesselNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vesselName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ImoContext extends ParserRuleContext {
		public TerminalNode IMO_NUMBER() { return getToken(AISDataParser.IMO_NUMBER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitImo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImoContext imo() throws RecognitionException {
		ImoContext _localctx = new ImoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IMO_NUMBER);
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
		public TerminalNode LETTER() { return getToken(AISDataParser.LETTER, 0); }
		public TerminalNode STRING_FIELD() { return getToken(AISDataParser.STRING_FIELD, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitCallSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSignContext callSign() throws RecognitionException {
		CallSignContext _localctx = new CallSignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callSign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class VesselTypeContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitVesselType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VesselTypeContext vesselType() throws RecognitionException {
		VesselTypeContext _localctx = new VesselTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vesselType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
	public static class StatusContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AISDataParser.NUMBER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitDraft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DraftContext draft() throws RecognitionException {
		DraftContext _localctx = new DraftContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_draft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitCargo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CargoContext cargo() throws RecognitionException {
		CargoContext _localctx = new CargoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cargo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AISDataVisitor ) return ((AISDataVisitor<? extends T>)visitor).visitTransceiverClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransceiverClassContext transceiverClass() throws RecognitionException {
		TransceiverClassContext _localctx = new TransceiverClassContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transceiverClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
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
		"\u0004\u0001\n\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002X\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002`\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"d\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0001\u0000\u0007"+
		"\t\u0081\u0000(\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000"+
		"\u00044\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\bk\u0001"+
		"\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000"+
		"\u000eq\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012u"+
		"\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016y\u0001\u0000"+
		"\u0000\u0000\u0018{\u0001\u0000\u0000\u0000\u001a}\u0001\u0000\u0000\u0000"+
		"\u001c\u007f\u0001\u0000\u0000\u0000\u001e\u0081\u0001\u0000\u0000\u0000"+
		" \u0083\u0001\u0000\u0000\u0000\"\u0085\u0001\u0000\u0000\u0000$\u0087"+
		"\u0001\u0000\u0000\u0000&\u0089\u0001\u0000\u0000\u0000(,\u0003\u0002"+
		"\u0001\u0000)+\u0003\u0004\u0002\u0000*)\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u0000\u0000"+
		"\u00010\u0001\u0001\u0000\u0000\u000012\u0005\u0001\u0000\u000023\u0005"+
		"\u0003\u0000\u00003\u0003\u0001\u0000\u0000\u000045\u0003\u0006\u0003"+
		"\u000056\u0005\u0002\u0000\u000067\u0003\b\u0004\u000078\u0005\u0002\u0000"+
		"\u000089\u0003\n\u0005\u00009:\u0005\u0002\u0000\u0000:;\u0003\f\u0006"+
		"\u0000;<\u0005\u0002\u0000\u0000<=\u0003\u000e\u0007\u0000=>\u0005\u0002"+
		"\u0000\u0000>?\u0003\u0010\b\u0000?@\u0005\u0002\u0000\u0000@A\u0003\u0012"+
		"\t\u0000AC\u0005\u0002\u0000\u0000BD\u0003\u0014\n\u0000CB\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0005"+
		"\u0002\u0000\u0000FH\u0003\u0016\u000b\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0005\u0002\u0000"+
		"\u0000JL\u0003\u0018\f\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MO\u0005\u0002\u0000\u0000NP\u0003\u001a"+
		"\r\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QS\u0005\u0002\u0000\u0000RT\u0003\u001c\u000e\u0000SR\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UW\u0005\u0002\u0000\u0000VX\u0003\u001e\u000f\u0000WV\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0005\u0002"+
		"\u0000\u0000Z\\\u0003 \u0010\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0005\u0002\u0000\u0000"+
		"^`\u0003\"\u0011\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0005\u0002\u0000\u0000bd\u0003$\u0012\u0000"+
		"cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0005\u0002\u0000\u0000fg\u0003&\u0013\u0000gh\u0005\u0003\u0000"+
		"\u0000h\u0005\u0001\u0000\u0000\u0000ij\u0005\u0007\u0000\u0000j\u0007"+
		"\u0001\u0000\u0000\u0000kl\u0005\u0005\u0000\u0000l\t\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0006\u0000\u0000n\u000b\u0001\u0000\u0000\u0000op\u0005"+
		"\u0006\u0000\u0000p\r\u0001\u0000\u0000\u0000qr\u0005\u0006\u0000\u0000"+
		"r\u000f\u0001\u0000\u0000\u0000st\u0005\u0006\u0000\u0000t\u0011\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0006\u0000\u0000v\u0013\u0001\u0000\u0000"+
		"\u0000wx\u0007\u0000\u0000\u0000x\u0015\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0004\u0000\u0000z\u0017\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000"+
		"\u0000|\u0019\u0001\u0000\u0000\u0000}~\u0005\u0007\u0000\u0000~\u001b"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u001d"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u001f"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084!\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086#\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088%\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\'\u0001\u0000\u0000\u0000"+
		"\n,CGKOSW[_c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}