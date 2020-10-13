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


package org.openbanking.client.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EmailAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class EmailAddress {
  public static final String SERIALIZED_NAME_IS_PREFERRED = "isPreferred";
  @SerializedName(SERIALIZED_NAME_IS_PREFERRED)
  private Boolean isPreferred;

  /**
   * The purpose for the email, as specified by the customer (Enumeration)
   */
  @JsonAdapter(PurposeEnum.Adapter.class)
  public enum PurposeEnum {
    WORK("WORK"),
    
    HOME("HOME"),
    
    OTHER("OTHER"),
    
    UNSPECIFIED("UNSPECIFIED");

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

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public EmailAddress isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

   /**
   * Required for one and only one email record in the collection. Denotes the default email address
   * @return isPreferred
  **/
  @ApiModelProperty(required = true, value = "Required for one and only one email record in the collection. Denotes the default email address")
  public Boolean getIsPreferred() {
    return isPreferred;
  }

  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }

  public EmailAddress purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose for the email, as specified by the customer (Enumeration)
   * @return purpose
  **/
  @ApiModelProperty(required = true, value = "The purpose for the email, as specified by the customer (Enumeration)")
  public PurposeEnum getPurpose() {
    return purpose;
  }

  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }

  public EmailAddress address(String address) {
    this.address = address;
    return this;
  }

   /**
   * A correctly formatted email address, as defined by the addr_spec format in RFC_5322
   * @return address
  **/
  @ApiModelProperty(required = true, value = "A correctly formatted email address, as defined by the addr_spec format in RFC_5322")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailAddress emailAddress = (EmailAddress) o;
    return Objects.equals(this.isPreferred, emailAddress.isPreferred) &&
        Objects.equals(this.purpose, emailAddress.purpose) &&
        Objects.equals(this.address, emailAddress.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPreferred, purpose, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailAddress {\n");
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
