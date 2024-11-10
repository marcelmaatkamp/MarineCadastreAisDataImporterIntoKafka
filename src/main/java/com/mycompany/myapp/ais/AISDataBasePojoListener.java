package com.mycompany.myapp.ais;

import java.time.Duration;
import java.time.Instant;

import org.springframework.context.ApplicationEventPublisher;

import com.mycompany.myapp.ais.parser.AISDataBaseListener;
import com.mycompany.myapp.shared.events.AISDataPojoEvent;

/**
 * Listener
 */
public class AISDataBasePojoListener extends AISDataBaseListener {

  private final ApplicationEventPublisher applicationEventPublisher;
  private final boolean simulateRealtimeInserts;

  // SortedMap<Instant, AISDataPojo> sortedEventsByDatTimeButAheadOfTime = new TreeMap<>();
  Long offsetInTimeBetweenImportedDataAndNow;

  public AISDataBasePojoListener(ApplicationEventPublisher applicationEventPublisher, boolean simulateRealtimeInserts) {
    this.applicationEventPublisher = applicationEventPublisher;
    this.simulateRealtimeInserts = simulateRealtimeInserts;
  }

  @Override
  public void exitRow(com.mycompany.myapp.ais.parser.AISDataParser.RowContext ctx) {
    AISDataPojo aisDataPojo = ImmutableAISDataPojo.builder().
      mmsi(Integer.valueOf(ctx.mmsi().getText())).
      dateTime(ctx.dateTime().getText()+"Z").
      lat(Double.valueOf(ctx.lat().getText())).
      lon(Double.valueOf(ctx.lon().getText())).
      sog(Float.valueOf(ctx.sog().getText())).
      cog(Float.valueOf(ctx.cog().getText())).
      heading(Float.valueOf(ctx.heading().getText())).
      vesselName(ctx.vesselName().getText()).
      imo(ctx.imo() != null && !ctx.imo().isEmpty() ? ctx.imo().getText() : null).
      callSign(ctx.callSign() != null && !ctx.callSign().isEmpty() ? ctx.callSign().getText() : null).
      vesselType(ctx.vesselType() != null && !ctx.vesselType().isEmpty() ? Short.valueOf(ctx.vesselType().getText()) : null).
      status(ctx.status() != null && !ctx.status().getText().isEmpty() ? Short.valueOf(ctx.status().getText()) : null).
      length(ctx.length() != null && !ctx.length().isEmpty() ? Short.valueOf(ctx.length().getText()) : null).
      width(ctx.width() != null && !ctx.width().isEmpty() ? Short.valueOf(ctx.width().getText()) : null).
      draft(ctx.draft() != null && !ctx.draft().isEmpty() ? Float.valueOf(ctx.draft().getText()) : null).
      cargo(ctx.cargo() != null && !ctx.cargo().isEmpty() ? ctx.cargo().getText() : null).
      transceiverClass(ctx.transceiverClass() != null && !ctx.transceiverClass().isEmpty() ? ctx.transceiverClass().getText() : null).
      build();

      if(simulateRealtimeInserts) { 
      Instant timeOfEvent = Instant.parse(ctx.dateTime().getText()+"Z");
      if(offsetInTimeBetweenImportedDataAndNow == null) { 
        offsetInTimeBetweenImportedDataAndNow = Instant.now().getEpochSecond() - timeOfEvent.getEpochSecond();
      }

      // naive but 'good enough' implementation for now
      Instant nowButInThePast = Instant.now().minusSeconds(offsetInTimeBetweenImportedDataAndNow);
      int difference = timeOfEvent.compareTo(nowButInThePast);
      if(difference < 0) { 
        try {
            Thread.sleep(Duration.ofSeconds(difference));
        } catch (InterruptedException ex) {

        }
      }
    
      sendToKafka(aisDataPojo);
      // sortedEventsByDatTimeButAheadOfTime.put(Instant.parse(ctx.dateTime().getText()), aisDataPojo);  
    }
  }

  private void sendToKafka(AISDataPojo aisDataPojo) { 
    AISDataPojoEvent aisDataPojoEvent = new AISDataPojoEvent(this, aisDataPojo);
    applicationEventPublisher.publishEvent(aisDataPojoEvent);
  }
}
