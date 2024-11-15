package com.mycompany.myapp.ais;

import java.time.Instant;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// import java.time.Duration;
// import java.time.Instant;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
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
  int millisToWait;
  boolean appendZToDateTime;

  // SortedMap<Instant, AISDataPojo> sortedEventsByDatTimeButAheadOfTime = new
  // TreeMap<>();
  Long offsetInTimeBetweenImportedDataAndNow;

  public AISDataBasePojoListener(ApplicationEventPublisher applicationEventPublisher, boolean simulateRealtimeInserts, int millisToWait, boolean appendZToDateTime) {
    this.applicationEventPublisher = applicationEventPublisher;
    this.simulateRealtimeInserts = simulateRealtimeInserts;
    this.millisToWait = millisToWait;
    this.appendZToDateTime = appendZToDateTime;
  }

  private String getValue(String value) { 
    if(value == null || value.isEmpty() || value.equals("null")) { 
      return null;
    }
    return value;
  }

  @Override
  public void exitRow(com.mycompany.myapp.ais.parser.AISDataParser.RowContext ctx) {
      AISDataPojo aisDataPojo = ImmutableAISDataPojo.builder().
        mmsi(Integer.valueOf(ctx.mmsi().getText())).
        dateTime(appendZToDateTime ? Instant.parse(ctx.dateTime().getText()+"Z").toString() : ctx.dateTime().getText()).
        lat(Double.valueOf(ctx.lat().getText())).
        lon(Double.valueOf(ctx.lon().getText())).
        sog(Float.valueOf(ctx.sog().getText())).
        cog(Float.valueOf(ctx.cog().getText())).
        heading(Float.valueOf(ctx.heading().getText())).
        vesselName(ctx.vesselName() != null && !ctx.vesselName().isEmpty() ? getValue(ctx.vesselName().getText()) : null).
        imo(ctx.imo() != null && !ctx.imo().isEmpty() ? ctx.imo().getText() : null).
        callSign(ctx.callSign() != null && !ctx.callSign().isEmpty() ? getValue(ctx.callSign().getText()) : null).
        vesselType(ctx.vesselType() != null && !ctx.vesselType().getText().isEmpty() && !ctx.vesselType().getText().equals("-") ? Short.valueOf(ctx.vesselType().getText()) : null).
        status(ctx.status() != null && !ctx.status().getText().isEmpty() ? Short.valueOf(ctx.status().getText()) : null).
        length(ctx.length() != null && !ctx.length().getText().isEmpty() ? Short.valueOf(ctx.length().getText()) : null).
        width(ctx.width() != null && !ctx.width().getText().isEmpty() ? Short.valueOf(ctx.width().getText()) : null).
        draft(ctx.draft() != null && !ctx.draft().getText().isEmpty() ? Float.valueOf(ctx.draft().getText()) : null).
        cargo(ctx.cargo() != null && !ctx.cargo().getText().isEmpty() ? ctx.cargo().getText() : null).
        transceiverClass(ctx.transceiverClass() != null && !ctx.transceiverClass().isEmpty() ? ctx.transceiverClass().getText() : null).
        build();
        /*
        if(sleepOnTimeDifference) { 
          Instant timeOfEvent = Instant.parse(ctx.dateTime().getText()+"Z");
          if(offsetInTimeBetweenImportedDataAndNow == null) { 
            offsetInTimeBetweenImportedDataAndNow = Instant.now().getEpochSecond() - timeOfEvent.getEpochSecond();
            log.info("offsetInTimeBetweenImportedDataAndNow: {}", offsetInTimeBetweenImportedDataAndNow);
          }

          Instant nowButInThePast = Instant.now().minusSeconds(offsetInTimeBetweenImportedDataAndNow);
          int difference = timeOfEvent.compareTo(nowButInThePast);
          log.info("going to sleep for {}", difference);
          if(difference < 0) { 
            
            try {
                Thread.sleep(Duration.ofSeconds(difference));
            } catch (InterruptedException ex) {

            }
          }
          // sortedEventsByDatTimeButAheadOfTime.put(Instant.parse(ctx.dateTime().getText()), aisDataPojo);  
        } else if(simulateRealtimeInserts) { 
            try {
              Thread.sleep(millisToWait);
            } catch (InterruptedException e) {
               
            }
          }
        }
        */
        sendToKafka(aisDataPojo);

        if(simulateRealtimeInserts) { 
            try {
              Thread.sleep(millisToWait);
            } catch (InterruptedException e) {
               
            }
        }
    }

  private void sendToKafka(AISDataPojo aisDataPojo) {
    AISDataPojoEvent aisDataPojoEvent = new AISDataPojoEvent(this, aisDataPojo);
    applicationEventPublisher.publishEvent(aisDataPojoEvent);
  }
}