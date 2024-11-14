// Generated from com/mycompany/myapp/ais/parser/AISData.g4 by ANTLR 4.13.2
package com.mycompany.myapp.ais.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AISDataParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AISDataVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AISDataParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AISDataParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(AISDataParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(AISDataParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#mmsi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMmsi(AISDataParser.MmsiContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#dateTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTime(AISDataParser.DateTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#lat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLat(AISDataParser.LatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#lon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLon(AISDataParser.LonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#sog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSog(AISDataParser.SogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#cog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCog(AISDataParser.CogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeading(AISDataParser.HeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#vesselName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVesselName(AISDataParser.VesselNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#imo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImo(AISDataParser.ImoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#callSign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSign(AISDataParser.CallSignContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#vesselType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVesselType(AISDataParser.VesselTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(AISDataParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(AISDataParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(AISDataParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#draft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDraft(AISDataParser.DraftContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#cargo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargo(AISDataParser.CargoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AISDataParser#transceiverClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransceiverClass(AISDataParser.TransceiverClassContext ctx);
}