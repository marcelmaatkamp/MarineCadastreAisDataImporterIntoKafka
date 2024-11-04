// Generated from com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.1
package com.mycompany.myapp.ais.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AISDataParser}.
 */
public interface AISDataListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AISDataParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AISDataParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AISDataParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(AISDataParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(AISDataParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(AISDataParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(AISDataParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#mmsi}.
	 * @param ctx the parse tree
	 */
	void enterMmsi(AISDataParser.MmsiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#mmsi}.
	 * @param ctx the parse tree
	 */
	void exitMmsi(AISDataParser.MmsiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void enterDateTime(AISDataParser.DateTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#dateTime}.
	 * @param ctx the parse tree
	 */
	void exitDateTime(AISDataParser.DateTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#lat}.
	 * @param ctx the parse tree
	 */
	void enterLat(AISDataParser.LatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#lat}.
	 * @param ctx the parse tree
	 */
	void exitLat(AISDataParser.LatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#lon}.
	 * @param ctx the parse tree
	 */
	void enterLon(AISDataParser.LonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#lon}.
	 * @param ctx the parse tree
	 */
	void exitLon(AISDataParser.LonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#sog}.
	 * @param ctx the parse tree
	 */
	void enterSog(AISDataParser.SogContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#sog}.
	 * @param ctx the parse tree
	 */
	void exitSog(AISDataParser.SogContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#cog}.
	 * @param ctx the parse tree
	 */
	void enterCog(AISDataParser.CogContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#cog}.
	 * @param ctx the parse tree
	 */
	void exitCog(AISDataParser.CogContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(AISDataParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(AISDataParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#vesselName}.
	 * @param ctx the parse tree
	 */
	void enterVesselName(AISDataParser.VesselNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#vesselName}.
	 * @param ctx the parse tree
	 */
	void exitVesselName(AISDataParser.VesselNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#imo}.
	 * @param ctx the parse tree
	 */
	void enterImo(AISDataParser.ImoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#imo}.
	 * @param ctx the parse tree
	 */
	void exitImo(AISDataParser.ImoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#callSign}.
	 * @param ctx the parse tree
	 */
	void enterCallSign(AISDataParser.CallSignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#callSign}.
	 * @param ctx the parse tree
	 */
	void exitCallSign(AISDataParser.CallSignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#vesselType}.
	 * @param ctx the parse tree
	 */
	void enterVesselType(AISDataParser.VesselTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#vesselType}.
	 * @param ctx the parse tree
	 */
	void exitVesselType(AISDataParser.VesselTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(AISDataParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(AISDataParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(AISDataParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(AISDataParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(AISDataParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(AISDataParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#draft}.
	 * @param ctx the parse tree
	 */
	void enterDraft(AISDataParser.DraftContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#draft}.
	 * @param ctx the parse tree
	 */
	void exitDraft(AISDataParser.DraftContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#cargo}.
	 * @param ctx the parse tree
	 */
	void enterCargo(AISDataParser.CargoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#cargo}.
	 * @param ctx the parse tree
	 */
	void exitCargo(AISDataParser.CargoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AISDataParser#transceiverClass}.
	 * @param ctx the parse tree
	 */
	void enterTransceiverClass(AISDataParser.TransceiverClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AISDataParser#transceiverClass}.
	 * @param ctx the parse tree
	 */
	void exitTransceiverClass(AISDataParser.TransceiverClassContext ctx);
}