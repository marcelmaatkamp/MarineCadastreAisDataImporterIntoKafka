package com.mycompany.myapp.ais;

import com.mycompany.myapp.ais.parser.AISDataBaseListener;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationEventPublisher;

import com.mycompany.myapp.shared.events.AISDataPojoEvent;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class AISDataBasePojoListener extends AISDataBaseListener {
  private final List<AISDataPojo> aisDataPojos = new ArrayList<>();

  DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public List<AISDataPojo> getAisDataPojos() {
    return aisDataPojos;
  }

  @Override
  public void exitRow(com.mycompany.myapp.ais.parser.AISDataParser.RowContext ctx) {
    AISDataPojo aisDataPojo = ImmutableAISDataPojo.builder().
      mmsi(Integer.parseInt(ctx.mmsi().getText())).
      dateTime(LocalDateTime.parse(ctx.dateTime().getText(), parser)).
      lat(Double.parseDouble(ctx.lat().getText())).
      lon(Double.parseDouble(ctx.lon().getText())).
      sog(Float.parseFloat(ctx.sog().getText())).
      cog(Float.parseFloat(ctx.cog().getText())).
      heading(Float.parseFloat(ctx.heading().getText())).
      vesselName(ctx.vesselName().getText()).
      imo(ctx.imo() != null && !ctx.imo().isEmpty() ? ctx.imo().getText() : null).
      callSign(ctx.callSign() != null && !ctx.callSign().isEmpty() ? ctx.callSign().getText() : null).
      vesselType(ctx.vesselType() != null && !ctx.vesselType().isEmpty() ? Short.parseShort(ctx.vesselType().getText()) : null).
      status(ctx.status() != null && !ctx.status().getText().isEmpty() ? Short.parseShort(ctx.status().getText()) : null).
      length(ctx.length() != null && !ctx.length().isEmpty() ? Short.parseShort(ctx.length().getText()) : null).
      width(ctx.width() != null && !ctx.width().isEmpty() ? Short.parseShort(ctx.width().getText()) : null).
      draft(ctx.draft() != null && !ctx.draft().isEmpty() ? Float.parseFloat(ctx.draft().getText()) : null).
      cargo(ctx.cargo() != null && !ctx.cargo().isEmpty() ? ctx.cargo().getText() : null).
      transceiverClass(ctx.transceiverClass() != null && !ctx.transceiverClass().isEmpty() ? ctx.transceiverClass().getText() : null).
      build();
    aisDataPojos.add(aisDataPojo);
    sendToKafka(aisDataPojo);
  }

  private void sendToKafka(AISDataPojo aisDataPojo) { 
    AISDataPojoEvent aisDataPojoEvent = new AISDataPojoEvent(this, aisDataPojo);
    applicationEventPublisher.publishEvent(aisDataPojoEvent);
  }
}
