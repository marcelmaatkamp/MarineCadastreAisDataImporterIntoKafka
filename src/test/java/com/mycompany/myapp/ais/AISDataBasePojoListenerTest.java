package com.mycompany.myapp.ais;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.time.Instant;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;
import org.mockito.ArgumentCaptor;
import com.mycompany.myapp.ais.parser.AISDataLexer;
import com.mycompany.myapp.ais.parser.AISDataParser;
import com.mycompany.myapp.shared.events.AISDataPojoEvent;

@ExtendWith(MockitoExtension.class)
class AISDataBasePojoListenerTest {

    @Mock
    private ApplicationEventPublisher applicationEventPublisher;

    private ArgumentCaptor<AISDataPojoEvent> eventCaptor;
    private AISDataBasePojoListener listener;

    @BeforeEach
    void setUp() {
        listener = new AISDataBasePojoListener(applicationEventPublisher, false, 0, false);
        eventCaptor = ArgumentCaptor.forClass(AISDataPojoEvent.class);
    }

    private void parseAndWalk(String input) {
        AISDataLexer lexer = new AISDataLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AISDataParser parser = new AISDataParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.row());
    }

    @Test
    void testNormalRow() {
        String input = "368926035,2023-01-01T00:00:05,38.65165,90.17964,0.1,360.0,511.0,KIMMSWICK,,AENA,33,15,,,,33,A";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    @Test
    void testRowWithEmptyFields() {
        String input = "367321680,2023-01-01T00:00:04,30.72482,-88.05849,0.0,319.7,511.0,BEN R JOHNSON,,WDE2189,31,,17,6,,,B";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }


    @Test
    void testRowWithEmptyFieldss() {
        String input = "338488866,2024-01-01T00:00:07,47.30552,-122.51234,1.2,360.0,511.0,A,IMO0000000,,37,,12,4,,,B";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    @Test
    void testRowWithSpecialCharactersInName() {
        String input = "368233490,2023-01-01T00:00:06,41.17235,-72.81058,7.4,85.4,87.0,MISTAKES-+$&%WERE_MADE&MORE[1],,WDM7381,57,12,18,7,2.2,57,A\n";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    @Test
    void testRowWithZeroValues() {
        String input = "367099730,2023-01-01T00:00:02,26.53889,-97.40485,0.0,0.0,0.0,,,,0,0,0,0,0.0,0,A\n";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    @Test
    void testRowWithMaxValues() {
        String input = "999999999,2023-12-31T23:59:59,90.00000,180.00000,999.9,360.0,511.0,VERY LONG VESSEL NAME,IMO9999999,ABCD123,99,99,999,99,99.9,99,A\n";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    @Test
    void testRowWithNegativeValues() {
        String input = "368926035,2023-01-01T00:00:05,-38.65165,-90.17964,0.1,360.0,511.0,KIMMSWICK,,AENA,33,15,,,,33,A\n";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    /**
     * line 292:77 extraneous input '0000000' expecting {',', TEXT
     */
    @Test
    void testRowWithCallsignAsNumber() {
        String input = "360000000,2024-01-01T00:00:02,38.53997,-90.25006,0.0,94.2,511.0,INGRAM DUPO,,0000000,90,15,52,14,2.0,99,A\n";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    // 338488866,2024-01-01T00:00:07,47.30552,-122.51234,1.2,360.0,511.0,A,IMO0000000,,37,,12,4,,,B
    @Test
    void testRowWithVesselNameAsLetter() {
        String input = "338488866,2024-01-01T00:00:07,47.30552,-122.51234,1.2,360.0,511.0,A,IMO0000000,,37,,12,4,,,B";
        verifyPublishEventAndFieldsAreTheSameForInput(input);
    }

    private void verifyPublishEventAndFieldsAreTheSameForInput(String input) {
        var pojo = fromCSV(input);
        parseAndWalk(toCSVLine(pojo));
        verify(applicationEventPublisher).publishEvent(eventCaptor.capture());
        AISDataPojoEvent event = eventCaptor.getValue();
        AISDataPojo aisDataPojo = event.getAISDataPojo();
        compareFieldsOf(pojo, aisDataPojo);
    }

    private void compareFieldsOf(AISDataPojo pojo, AISDataPojo aisDataPojo) {
        assertEquals(pojo.mmsi(), aisDataPojo.mmsi(), "mmsi");
        assertEquals(pojo.dateTime(), aisDataPojo.dateTime(), "dateTime");
        assertEquals(pojo.lat(), aisDataPojo.lat(), "lat");
        assertEquals(pojo.lon(), aisDataPojo.lon(), "lon");
        assertEquals(pojo.sog(), aisDataPojo.sog(), "sog");
        assertEquals(pojo.cog(), aisDataPojo.cog(), "cog");
        assertEquals(pojo.heading(), aisDataPojo.heading(), "heading");
        assertEquals(pojo.vesselName(), aisDataPojo.vesselName(), "vesselName");
        assertEquals(pojo.imo(), aisDataPojo.imo(), "imo");
        assertEquals(pojo.callSign(), aisDataPojo.callSign(), "callSign");
        assertEquals(pojo.vesselType(), aisDataPojo.vesselType(), "vesselType");
        assertEquals(pojo.status(), aisDataPojo.status(), "status");
        assertEquals(pojo.length(), aisDataPojo.length(), "length");
        assertEquals(pojo.width(), aisDataPojo.width(), "width");
        assertEquals(pojo.draft(), aisDataPojo.draft(), "draft");
        assertEquals(pojo.cargo(), aisDataPojo.cargo(), "cargo");
        assertEquals(pojo.transceiverClass(), aisDataPojo.transceiverClass(), "transceiverClass");
    }

    private AISDataPojo fromCSV(String csvLine) {
        String[] fields = csvLine.trim().split(",");
        return ImmutableAISDataPojo.builder()
            .mmsi(Integer.valueOf(fields[0]))
            .dateTime(Instant.parse(fields[1] + "Z").toString())
            .lat(Double.valueOf(fields[2]))
            .lon(Double.valueOf(fields[3]))
            .sog(Float.valueOf(fields[4]))
            .cog(Float.valueOf(fields[5]))
            .heading(Float.valueOf(fields[6]))
            .vesselName(fields[7].isEmpty() ? null : fields[7])
            .imo(fields[8].isEmpty() ? null : fields[8])
            .callSign(fields[9].isEmpty() ? null : fields[9])
            .vesselType(fields[10].isEmpty() ? null : Short.valueOf(fields[10]))
            .status(fields[11].isEmpty() ? null : Short.valueOf(fields[11]))
            .length(fields[12].isEmpty() ? null : Short.valueOf(fields[12]))
            .width(fields[13].isEmpty() ? null : Short.valueOf(fields[13]))
            .draft(fields[14].isEmpty() ? null : Float.valueOf(fields[14]))
            .cargo(fields[15].isEmpty() ? null : fields[15])
            .transceiverClass(fields[16].trim())
            .build();
    }

    public String toCSVLine(AISDataPojo pojo) {
        StringBuffer buffer = new StringBuffer();
        buffer
        .append(pojo.mmsi()).append(',')
            .append(pojo.dateTime()).append(',')
            .append(String.format("%.5f", pojo.lat())).append(',')
            .append(String.format("%.5f", pojo.lon())).append(',')
            .append(String.format("%.1f", pojo.sog())).append(',')
            .append(String.format("%.1f", pojo.cog())).append(',')
            .append(String.format("%.1f", pojo.heading())).append(',')
            .append(pojo.vesselName()).append(',')
            .append(pojo.imo() != null ? pojo.imo() : "").append(',')
            .append(pojo.callSign()).append(',')
            .append(pojo.vesselType()).append(',')
            .append(pojo.status()).append(',')
            .append(pojo.length() != null ? pojo.length() : "").append(',')
            .append(pojo.width() != null ? pojo.width() : "").append(',')
            .append(pojo.draft() != null ? String.format("%.1f", pojo.draft()) : "").append(',')
            .append(pojo.cargo()).append(',')
            .append(pojo.transceiverClass()).append('\n');
        
        return buffer.toString();
    }
} 
