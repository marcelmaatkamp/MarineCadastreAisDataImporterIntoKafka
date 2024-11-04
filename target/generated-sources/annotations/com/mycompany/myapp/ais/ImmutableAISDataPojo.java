package com.mycompany.myapp.ais;

import jakarta.annotation.Nullable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AISDataPojo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAISDataPojo.builder()}.
 */
@Generated(from = "AISDataPojo", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableAISDataPojo extends AISDataPojo {
  private final Integer mmsi;
  private final LocalDateTime dateTime;
  private final Double lat;
  private final Double lon;
  private final Float sog;
  private final Float cog;
  private final Float heading;
  private final String vesselName;
  private final @Nullable String imo;
  private final @Nullable String callSign;
  private final @Nullable Short vesselType;
  private final @Nullable Short status;
  private final @Nullable Short length;
  private final @Nullable Short width;
  private final @Nullable Float draft;
  private final @Nullable String cargo;
  private final @Nullable String transceiverClass;

  private ImmutableAISDataPojo(
      Integer mmsi,
      LocalDateTime dateTime,
      Double lat,
      Double lon,
      Float sog,
      Float cog,
      Float heading,
      String vesselName,
      @Nullable String imo,
      @Nullable String callSign,
      @Nullable Short vesselType,
      @Nullable Short status,
      @Nullable Short length,
      @Nullable Short width,
      @Nullable Float draft,
      @Nullable String cargo,
      @Nullable String transceiverClass) {
    this.mmsi = mmsi;
    this.dateTime = dateTime;
    this.lat = lat;
    this.lon = lon;
    this.sog = sog;
    this.cog = cog;
    this.heading = heading;
    this.vesselName = vesselName;
    this.imo = imo;
    this.callSign = callSign;
    this.vesselType = vesselType;
    this.status = status;
    this.length = length;
    this.width = width;
    this.draft = draft;
    this.cargo = cargo;
    this.transceiverClass = transceiverClass;
  }

  /**
   * @return The value of the {@code mmsi} attribute
   */
  @Override
  public Integer mmsi() {
    return mmsi;
  }

  /**
   * @return The value of the {@code dateTime} attribute
   */
  @Override
  public LocalDateTime dateTime() {
    return dateTime;
  }

  /**
   * @return The value of the {@code lat} attribute
   */
  @Override
  public Double lat() {
    return lat;
  }

  /**
   * @return The value of the {@code lon} attribute
   */
  @Override
  public Double lon() {
    return lon;
  }

  /**
   * @return The value of the {@code sog} attribute
   */
  @Override
  public Float sog() {
    return sog;
  }

  /**
   * @return The value of the {@code cog} attribute
   */
  @Override
  public Float cog() {
    return cog;
  }

  /**
   * @return The value of the {@code heading} attribute
   */
  @Override
  public Float heading() {
    return heading;
  }

  /**
   * @return The value of the {@code vesselName} attribute
   */
  @Override
  public String vesselName() {
    return vesselName;
  }

  /**
   * @return The value of the {@code imo} attribute
   */
  @Override
  public @Nullable String imo() {
    return imo;
  }

  /**
   * @return The value of the {@code callSign} attribute
   */
  @Override
  public @Nullable String callSign() {
    return callSign;
  }

  /**
   * @return The value of the {@code vesselType} attribute
   */
  @Override
  public @Nullable Short vesselType() {
    return vesselType;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @Override
  public @Nullable Short status() {
    return status;
  }

  /**
   * @return The value of the {@code length} attribute
   */
  @Override
  public @Nullable Short length() {
    return length;
  }

  /**
   * @return The value of the {@code width} attribute
   */
  @Override
  public @Nullable Short width() {
    return width;
  }

  /**
   * @return The value of the {@code draft} attribute
   */
  @Override
  public @Nullable Float draft() {
    return draft;
  }

  /**
   * @return The value of the {@code cargo} attribute
   */
  @Override
  public @Nullable String cargo() {
    return cargo;
  }

  /**
   * @return The value of the {@code transceiverClass} attribute
   */
  @Override
  public @Nullable String transceiverClass() {
    return transceiverClass;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#mmsi() mmsi} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for mmsi
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withMmsi(Integer value) {
    Integer newValue = Objects.requireNonNull(value, "mmsi");
    if (this.mmsi.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        newValue,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#dateTime() dateTime} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dateTime
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withDateTime(LocalDateTime value) {
    if (this.dateTime == value) return this;
    LocalDateTime newValue = Objects.requireNonNull(value, "dateTime");
    return new ImmutableAISDataPojo(
        this.mmsi,
        newValue,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#lat() lat} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lat
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withLat(Double value) {
    Double newValue = Objects.requireNonNull(value, "lat");
    if (this.lat.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        newValue,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#lon() lon} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for lon
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withLon(Double value) {
    Double newValue = Objects.requireNonNull(value, "lon");
    if (this.lon.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        newValue,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#sog() sog} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sog
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withSog(Float value) {
    Float newValue = Objects.requireNonNull(value, "sog");
    if (this.sog.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        newValue,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#cog() cog} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cog
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withCog(Float value) {
    Float newValue = Objects.requireNonNull(value, "cog");
    if (this.cog.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        newValue,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#heading() heading} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for heading
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withHeading(Float value) {
    Float newValue = Objects.requireNonNull(value, "heading");
    if (this.heading.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        newValue,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#vesselName() vesselName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vesselName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withVesselName(String value) {
    String newValue = Objects.requireNonNull(value, "vesselName");
    if (this.vesselName.equals(newValue)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        newValue,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#imo() imo} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for imo (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withImo(@Nullable String value) {
    if (Objects.equals(this.imo, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        value,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#callSign() callSign} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for callSign (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withCallSign(@Nullable String value) {
    if (Objects.equals(this.callSign, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        value,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#vesselType() vesselType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for vesselType (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withVesselType(@Nullable Short value) {
    if (Objects.equals(this.vesselType, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        value,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#status() status} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withStatus(@Nullable Short value) {
    if (Objects.equals(this.status, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        value,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#length() length} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for length (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withLength(@Nullable Short value) {
    if (Objects.equals(this.length, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        value,
        this.width,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#width() width} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for width (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withWidth(@Nullable Short value) {
    if (Objects.equals(this.width, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        value,
        this.draft,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#draft() draft} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for draft (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withDraft(@Nullable Float value) {
    if (Objects.equals(this.draft, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        value,
        this.cargo,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#cargo() cargo} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cargo (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withCargo(@Nullable String value) {
    if (Objects.equals(this.cargo, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        value,
        this.transceiverClass);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AISDataPojo#transceiverClass() transceiverClass} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for transceiverClass (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAISDataPojo withTransceiverClass(@Nullable String value) {
    if (Objects.equals(this.transceiverClass, value)) return this;
    return new ImmutableAISDataPojo(
        this.mmsi,
        this.dateTime,
        this.lat,
        this.lon,
        this.sog,
        this.cog,
        this.heading,
        this.vesselName,
        this.imo,
        this.callSign,
        this.vesselType,
        this.status,
        this.length,
        this.width,
        this.draft,
        this.cargo,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAISDataPojo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAISDataPojo
        && equalTo(0, (ImmutableAISDataPojo) another);
  }

  private boolean equalTo(int synthetic, ImmutableAISDataPojo another) {
    return mmsi.equals(another.mmsi)
        && dateTime.equals(another.dateTime)
        && lat.equals(another.lat)
        && lon.equals(another.lon)
        && sog.equals(another.sog)
        && cog.equals(another.cog)
        && heading.equals(another.heading)
        && vesselName.equals(another.vesselName)
        && Objects.equals(imo, another.imo)
        && Objects.equals(callSign, another.callSign)
        && Objects.equals(vesselType, another.vesselType)
        && Objects.equals(status, another.status)
        && Objects.equals(length, another.length)
        && Objects.equals(width, another.width)
        && Objects.equals(draft, another.draft)
        && Objects.equals(cargo, another.cargo)
        && Objects.equals(transceiverClass, another.transceiverClass);
  }

  /**
   * Computes a hash code from attributes: {@code mmsi}, {@code dateTime}, {@code lat}, {@code lon}, {@code sog}, {@code cog}, {@code heading}, {@code vesselName}, {@code imo}, {@code callSign}, {@code vesselType}, {@code status}, {@code length}, {@code width}, {@code draft}, {@code cargo}, {@code transceiverClass}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + mmsi.hashCode();
    h += (h << 5) + dateTime.hashCode();
    h += (h << 5) + lat.hashCode();
    h += (h << 5) + lon.hashCode();
    h += (h << 5) + sog.hashCode();
    h += (h << 5) + cog.hashCode();
    h += (h << 5) + heading.hashCode();
    h += (h << 5) + vesselName.hashCode();
    h += (h << 5) + Objects.hashCode(imo);
    h += (h << 5) + Objects.hashCode(callSign);
    h += (h << 5) + Objects.hashCode(vesselType);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(length);
    h += (h << 5) + Objects.hashCode(width);
    h += (h << 5) + Objects.hashCode(draft);
    h += (h << 5) + Objects.hashCode(cargo);
    h += (h << 5) + Objects.hashCode(transceiverClass);
    return h;
  }

  /**
   * Creates an immutable copy of a {@link AISDataPojo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AISDataPojo instance
   */
  public static ImmutableAISDataPojo copyOf(AISDataPojo instance) {
    if (instance instanceof ImmutableAISDataPojo) {
      return (ImmutableAISDataPojo) instance;
    }
    return ImmutableAISDataPojo.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableAISDataPojo ImmutableAISDataPojo}.
   * <pre>
   * ImmutableAISDataPojo.builder()
   *    .mmsi(Integer) // required {@link AISDataPojo#mmsi() mmsi}
   *    .dateTime(java.time.LocalDateTime) // required {@link AISDataPojo#dateTime() dateTime}
   *    .lat(Double) // required {@link AISDataPojo#lat() lat}
   *    .lon(Double) // required {@link AISDataPojo#lon() lon}
   *    .sog(Float) // required {@link AISDataPojo#sog() sog}
   *    .cog(Float) // required {@link AISDataPojo#cog() cog}
   *    .heading(Float) // required {@link AISDataPojo#heading() heading}
   *    .vesselName(String) // required {@link AISDataPojo#vesselName() vesselName}
   *    .imo(String | null) // nullable {@link AISDataPojo#imo() imo}
   *    .callSign(String | null) // nullable {@link AISDataPojo#callSign() callSign}
   *    .vesselType(Short | null) // nullable {@link AISDataPojo#vesselType() vesselType}
   *    .status(Short | null) // nullable {@link AISDataPojo#status() status}
   *    .length(Short | null) // nullable {@link AISDataPojo#length() length}
   *    .width(Short | null) // nullable {@link AISDataPojo#width() width}
   *    .draft(Float | null) // nullable {@link AISDataPojo#draft() draft}
   *    .cargo(String | null) // nullable {@link AISDataPojo#cargo() cargo}
   *    .transceiverClass(String | null) // nullable {@link AISDataPojo#transceiverClass() transceiverClass}
   *    .build();
   * </pre>
   * @return A new ImmutableAISDataPojo builder
   */
  public static ImmutableAISDataPojo.Builder builder() {
    return new ImmutableAISDataPojo.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableAISDataPojo ImmutableAISDataPojo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AISDataPojo", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_MMSI = 0x1L;
    private static final long INIT_BIT_DATE_TIME = 0x2L;
    private static final long INIT_BIT_LAT = 0x4L;
    private static final long INIT_BIT_LON = 0x8L;
    private static final long INIT_BIT_SOG = 0x10L;
    private static final long INIT_BIT_COG = 0x20L;
    private static final long INIT_BIT_HEADING = 0x40L;
    private static final long INIT_BIT_VESSEL_NAME = 0x80L;
    private long initBits = 0xffL;

    private Integer mmsi;
    private LocalDateTime dateTime;
    private Double lat;
    private Double lon;
    private Float sog;
    private Float cog;
    private Float heading;
    private String vesselName;
    private String imo;
    private String callSign;
    private Short vesselType;
    private Short status;
    private Short length;
    private Short width;
    private Float draft;
    private String cargo;
    private String transceiverClass;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AISDataPojo} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AISDataPojo instance) {
      Objects.requireNonNull(instance, "instance");
      this.mmsi(instance.mmsi());
      this.dateTime(instance.dateTime());
      this.lat(instance.lat());
      this.lon(instance.lon());
      this.sog(instance.sog());
      this.cog(instance.cog());
      this.heading(instance.heading());
      this.vesselName(instance.vesselName());
      @Nullable String imoValue = instance.imo();
      if (imoValue != null) {
        imo(imoValue);
      }
      @Nullable String callSignValue = instance.callSign();
      if (callSignValue != null) {
        callSign(callSignValue);
      }
      @Nullable Short vesselTypeValue = instance.vesselType();
      if (vesselTypeValue != null) {
        vesselType(vesselTypeValue);
      }
      @Nullable Short statusValue = instance.status();
      if (statusValue != null) {
        status(statusValue);
      }
      @Nullable Short lengthValue = instance.length();
      if (lengthValue != null) {
        length(lengthValue);
      }
      @Nullable Short widthValue = instance.width();
      if (widthValue != null) {
        width(widthValue);
      }
      @Nullable Float draftValue = instance.draft();
      if (draftValue != null) {
        draft(draftValue);
      }
      @Nullable String cargoValue = instance.cargo();
      if (cargoValue != null) {
        cargo(cargoValue);
      }
      @Nullable String transceiverClassValue = instance.transceiverClass();
      if (transceiverClassValue != null) {
        transceiverClass(transceiverClassValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#mmsi() mmsi} attribute.
     * @param mmsi The value for mmsi 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder mmsi(Integer mmsi) {
      this.mmsi = Objects.requireNonNull(mmsi, "mmsi");
      initBits &= ~INIT_BIT_MMSI;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#dateTime() dateTime} attribute.
     * @param dateTime The value for dateTime 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dateTime(LocalDateTime dateTime) {
      this.dateTime = Objects.requireNonNull(dateTime, "dateTime");
      initBits &= ~INIT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#lat() lat} attribute.
     * @param lat The value for lat 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lat(Double lat) {
      this.lat = Objects.requireNonNull(lat, "lat");
      initBits &= ~INIT_BIT_LAT;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#lon() lon} attribute.
     * @param lon The value for lon 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder lon(Double lon) {
      this.lon = Objects.requireNonNull(lon, "lon");
      initBits &= ~INIT_BIT_LON;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#sog() sog} attribute.
     * @param sog The value for sog 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sog(Float sog) {
      this.sog = Objects.requireNonNull(sog, "sog");
      initBits &= ~INIT_BIT_SOG;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#cog() cog} attribute.
     * @param cog The value for cog 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cog(Float cog) {
      this.cog = Objects.requireNonNull(cog, "cog");
      initBits &= ~INIT_BIT_COG;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#heading() heading} attribute.
     * @param heading The value for heading 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder heading(Float heading) {
      this.heading = Objects.requireNonNull(heading, "heading");
      initBits &= ~INIT_BIT_HEADING;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#vesselName() vesselName} attribute.
     * @param vesselName The value for vesselName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder vesselName(String vesselName) {
      this.vesselName = Objects.requireNonNull(vesselName, "vesselName");
      initBits &= ~INIT_BIT_VESSEL_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#imo() imo} attribute.
     * @param imo The value for imo (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder imo(@Nullable String imo) {
      this.imo = imo;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#callSign() callSign} attribute.
     * @param callSign The value for callSign (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder callSign(@Nullable String callSign) {
      this.callSign = callSign;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#vesselType() vesselType} attribute.
     * @param vesselType The value for vesselType (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder vesselType(@Nullable Short vesselType) {
      this.vesselType = vesselType;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#status() status} attribute.
     * @param status The value for status (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder status(@Nullable Short status) {
      this.status = status;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#length() length} attribute.
     * @param length The value for length (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder length(@Nullable Short length) {
      this.length = length;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#width() width} attribute.
     * @param width The value for width (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder width(@Nullable Short width) {
      this.width = width;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#draft() draft} attribute.
     * @param draft The value for draft (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder draft(@Nullable Float draft) {
      this.draft = draft;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#cargo() cargo} attribute.
     * @param cargo The value for cargo (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cargo(@Nullable String cargo) {
      this.cargo = cargo;
      return this;
    }

    /**
     * Initializes the value for the {@link AISDataPojo#transceiverClass() transceiverClass} attribute.
     * @param transceiverClass The value for transceiverClass (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transceiverClass(@Nullable String transceiverClass) {
      this.transceiverClass = transceiverClass;
      return this;
    }

    /**
     * Builds a new {@link ImmutableAISDataPojo ImmutableAISDataPojo}.
     * @return An immutable instance of AISDataPojo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableAISDataPojo build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAISDataPojo(
          mmsi,
          dateTime,
          lat,
          lon,
          sog,
          cog,
          heading,
          vesselName,
          imo,
          callSign,
          vesselType,
          status,
          length,
          width,
          draft,
          cargo,
          transceiverClass);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_MMSI) != 0) attributes.add("mmsi");
      if ((initBits & INIT_BIT_DATE_TIME) != 0) attributes.add("dateTime");
      if ((initBits & INIT_BIT_LAT) != 0) attributes.add("lat");
      if ((initBits & INIT_BIT_LON) != 0) attributes.add("lon");
      if ((initBits & INIT_BIT_SOG) != 0) attributes.add("sog");
      if ((initBits & INIT_BIT_COG) != 0) attributes.add("cog");
      if ((initBits & INIT_BIT_HEADING) != 0) attributes.add("heading");
      if ((initBits & INIT_BIT_VESSEL_NAME) != 0) attributes.add("vesselName");
      return "Cannot build AISDataPojo, some of required attributes are not set " + attributes;
    }
  }
}
