package com.mycompany.myapp.ais;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;

import com.mycompany.myapp.ais.parser.AISDataBaseListener;
import com.mycompany.myapp.shared.events.AISDataPojoEvent;

/**
 * Listener
 */
public class AISDataBasePojoListener extends AISDataBaseListener {
  private static final Logger log = LoggerFactory.getLogger(AISDataBasePojoListener.class);

  private final ApplicationEventPublisher applicationEventPublisher;
  private final boolean simulateRealtimeInserts;
  @Value("${application.simulateRealtimeInserts.millisToWait}") int millisToWait;

  // SortedMap<Instant, AISDataPojo> sortedEventsByDatTimeButAheadOfTime = new
  // TreeMap<>();
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
        vesselType( ctx.vesselType() != null && !ctx.vesselType().getText().isEmpty() && !ctx.vesselType().getText().equals("-") ? Short.valueOf(ctx.vesselType().getText()) : null).
        status(ctx.status() != null && !ctx.status().getText().isEmpty() ? Short.valueOf(ctx.status().getText()) : null).
        length(ctx.length() != null && !ctx.length().getText().isEmpty() ? Short.valueOf(ctx.length().getText()) : null).
        width(ctx.width() != null && !ctx.width().getText().isEmpty() ? Short.valueOf(ctx.width().getText()) : null).
        draft(ctx.draft() != null && !ctx.draft().getText().isEmpty() ? Float.valueOf(ctx.draft().getText()) : null).
        cargo(ctx.cargo() != null && !ctx.cargo().getText().isEmpty() ? ctx.cargo().getText() : null).
        transceiverClass(ctx.transceiverClass() != null && !ctx.transceiverClass().isEmpty() ? ctx.transceiverClass().getText() : null).
        build();

        sendToKafka(aisDataPojo);

        if(simulateRealtimeInserts) { 
            try {
              TimeUnit.MICROSECONDS.sleep(millisToWait);
            } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
        }
    }

  private void sendToKafka(AISDataPojo aisDataPojo) {
    AISDataPojoEvent aisDataPojoEvent = new AISDataPojoEvent(this, aisDataPojo);
    applicationEventPublisher.publishEvent(aisDataPojoEvent);
  }
}
