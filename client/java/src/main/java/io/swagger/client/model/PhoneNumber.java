/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * PhoneNumber
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class PhoneNumber {

  @SerializedName("isPreferred")
  private Boolean isPreferred = null;
  /**
   * The purpose of the number as specified by the customer
   */
  @JsonAdapter(PurposeEnum.Adapter.class)
  public enum PurposeEnum {
    MOBILE("MOBILE"),
    HOME("HOME"),
    WORK("WORK"),
    OTHER("OTHER"),
    INTERNATIONAL("INTERNATIONAL"),
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
      return null;
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
  @SerializedName("purpose")
  private PurposeEnum purpose = null;

  @SerializedName("countryCode")
  private String countryCode = null;

  @SerializedName("areaCode")
  private String areaCode = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fullNumber")
  private String fullNumber = null;
  public PhoneNumber isPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
    return this;
  }

  

  /**
  * Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#x27;false&#x27; if not present
  * @return isPreferred
  **/
  @Schema(description = "Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present")
  public Boolean isIsPreferred() {
    return isPreferred;
  }
  public void setIsPreferred(Boolean isPreferred) {
    this.isPreferred = isPreferred;
  }
  public PhoneNumber purpose(PurposeEnum purpose) {
    this.purpose = purpose;
    return this;
  }

  

  /**
  * The purpose of the number as specified by the customer
  * @return purpose
  **/
  @Schema(required = true, description = "The purpose of the number as specified by the customer")
  public PurposeEnum getPurpose() {
    return purpose;
  }
  public void setPurpose(PurposeEnum purpose) {
    this.purpose = purpose;
  }
  public PhoneNumber countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  

  /**
  * If absent, assumed to be Australia (+61). The + should be included
  * @return countryCode
  **/
  @Schema(description = "If absent, assumed to be Australia (+61). The + should be included")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }
  public PhoneNumber areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  

  /**
  * Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
  * @return areaCode
  **/
  @Schema(description = "Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.")
  public String getAreaCode() {
    return areaCode;
  }
  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }
  public PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

  

  /**
  * The actual phone number, with leading zeros as appropriate
  * @return number
  **/
  @Schema(required = true, description = "The actual phone number, with leading zeros as appropriate")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  public PhoneNumber extension(String extension) {
    this.extension = extension;
    return this;
  }

  

  /**
  * An extension number (if applicable)
  * @return extension
  **/
  @Schema(description = "An extension number (if applicable)")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public PhoneNumber fullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
    return this;
  }

  

  /**
  * Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
  * @return fullNumber
  **/
  @Schema(required = true, description = "Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966")
  public String getFullNumber() {
    return fullNumber;
  }
  public void setFullNumber(String fullNumber) {
    this.fullNumber = fullNumber;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.isPreferred, phoneNumber.isPreferred) &&
        Objects.equals(this.purpose, phoneNumber.purpose) &&
        Objects.equals(this.countryCode, phoneNumber.countryCode) &&
        Objects.equals(this.areaCode, phoneNumber.areaCode) &&
        Objects.equals(this.number, phoneNumber.number) &&
        Objects.equals(this.extension, phoneNumber.extension) &&
        Objects.equals(this.fullNumber, phoneNumber.fullNumber);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(isPreferred, purpose, countryCode, areaCode, number, extension, fullNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    
    sb.append("    isPreferred: ").append(toIndentedString(isPreferred)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fullNumber: ").append(toIndentedString(fullNumber)).append("\n");
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