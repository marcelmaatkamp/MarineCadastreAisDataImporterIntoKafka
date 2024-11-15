package com.mycompany.myapp.ais;

import org.immutables.value.Value;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import jakarta.annotation.Nullable;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Value.Immutable
public abstract class AISDataPojo {
  public abstract Integer mmsi();

  // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
  // "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
  public abstract String dateTime();

  public abstract Double lat();

  public abstract Double lon();

  public abstract Float sog();

  public abstract Float cog();

  public abstract Float heading();

  @Nullable
  public abstract String vesselName();

  @Nullable
  public abstract String imo();

  @Nullable
  public abstract String callSign();

  @Nullable
  public abstract Short vesselType();

  @Nullable
  public abstract Short status();

  @Nullable
  public abstract Short length();

  @Nullable
  public abstract Short width();

  @Nullable
  public abstract Float draft();

  @Nullable
  public abstract String cargo();

  @Nullable
  public abstract String transceiverClass();

  @Override
  public String toString() {
    return "AISDataPojo{" +
        "MMSI=" + mmsi() +
        ", DateTime='" + dateTime() + '\'' +
        ", LAT=" + lat() +
        ", LON=" + lon() +
        ", SOG=" + sog() +
        ", COG=" + cog() +
        ", Heading=" + heading() +
        ", VesselName='" + vesselName() + '\'' +
        ", IMO='" + imo() + '\'' +
        ", CallSign='" + callSign() + '\'' +
        ", VesselType=" + vesselType() +
        ", Status=" + status() +
        ", Length=" + length() +
        ", Width=" + width() +
        ", Draft=" + draft() +
        ", Cargo='" + cargo() + '\'' +
        ", TransceiverClass='" + transceiverClass() + '\'' +
        '}';
  }
}
