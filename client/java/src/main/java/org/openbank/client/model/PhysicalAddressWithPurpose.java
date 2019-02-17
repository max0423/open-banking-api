/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbank.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PhysicalAddressWithPurpose
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class PhysicalAddressWithPurpose {
  /**
   * The type of address object present
   */
  @JsonAdapter(AddressUTypeEnum.Adapter.class)
  public enum AddressUTypeEnum {
    SIMPLE("simple"),
    
    PAF("paf");

    private String value;

    AddressUTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressUTypeEnum fromValue(String text) {
      for (AddressUTypeEnum b : AddressUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AddressUTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressUTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressUTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressUTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS_U_TYPE = "addressUType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_U_TYPE)
  private AddressUTypeEnum addressUType;

  public static final String SERIALIZED_NAME_SIMPLE = "simple";
  @SerializedName(SERIALIZED_NAME_SIMPLE)
  private SimpleAddress simple = null;

  public static final String SERIALIZED_NAME_PAF = "paf";
  @SerializedName(SERIALIZED_NAME_PAF)
  private PAFAddress paf = null;

  /**
   * Enumeration of values indicating the purpose of the physical address
   */
  @JsonAdapter(PurposeEnum.Adapter.class)
  public enum PurposeEnum {
    REGISTERED("REGISTERED"),
    
    MAIL("MAIL"),
    
    PHYSICAL("PHYSICAL"),
    
    WORK("WORK"),
    
    OTHER("OTHER");

    private String value;

    PurposeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurposeEnum fromValue(String text) {
      for (PurposeEnum b : PurposeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<PurposeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurposeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurposeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PurposeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private PurposeEnum purpose;

  public PhysicalAddressWithPurpose addressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
    return this;
  }

   /**
   * The type of address object present
   * @return addressUType
  **/
  @ApiModelProperty(required = true, value = "The type of address object present")
  public AddressUTypeEnum getAddressUType() {
    return addressUType;
  }

  public void setAddressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
  }

  public PhysicalAddressWithPurpose simple(SimpleAddress simple) {
    this.simple = simple;
    return this;
  }

   /**
   * Get simple
   * @return simple
  **/
  @ApiModelProperty(value = "")
  public SimpleAddress getSimple() {
    return simple;
  }

  public void setSimple(SimpleAddress simple) {
    this.simple = simple;
  }

  public PhysicalAddressWithPurpose paf(PAFAddress paf) {
    this.paf = paf;
    return this;
  }

   /**
   * Get paf
   * @return paf
  **/
  @ApiModelProperty(value = "")
  public PAFAddress getPaf() {
    return paf;
  }

  public void setPaf(PAFAddress paf) {
    this.paf = paf;
  }

  public PhysicalAddressWithPurpose purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Enumeration of values indicating the purpose of the physical address
   * @return purpose
  **/
  @ApiModelProperty(required = true, value = "Enumeration of values indicating the purpose of the physical address")
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalAddressWithPurpose physicalAddressWithPurpose = (PhysicalAddressWithPurpose) o;
    return Objects.equals(this.addressUType, physicalAddressWithPurpose.addressUType) &&
        Objects.equals(this.simple, physicalAddressWithPurpose.simple) &&
        Objects.equals(this.paf, physicalAddressWithPurpose.paf) &&
        Objects.equals(this.purpose, physicalAddressWithPurpose.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressUType, simple, paf, purpose);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalAddressWithPurpose {\n");
    sb.append("    addressUType: ").append(toIndentedString(addressUType)).append("\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
    sb.append("    paf: ").append(toIndentedString(paf)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

