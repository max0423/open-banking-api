package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaInflectorServerCodegen", date = "2019-02-14T03:23:06.537Z[GMT]")public class TransactionDetailExtendedData   {
  @JsonProperty("payer")
  private String payer = null;
  @JsonProperty("payee")
  private String payee = null;
  /**
   * Optional extended data provided specific to transaction originated via NPP
   */
  public enum ExtensionUTypeEnum {
    EXTENDEDDESCRIPTION("extendedDescription");

    private String value;

    ExtensionUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExtensionUTypeEnum fromValue(String text) {
      for (ExtensionUTypeEnum b : ExtensionUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("extensionUType")
  private ExtensionUTypeEnum extensionUType = null;
  @JsonProperty("extendedDescription")
  private String extendedDescription = null;
  /**
   * Identifier of the applicable NPP payment service
   */
  public enum ServiceIdEnum {
    _01("X2P1.01");

    private String value;

    ServiceIdEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceIdEnum fromValue(String text) {
      for (ServiceIdEnum b : ServiceIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("serviceId")
  private ServiceIdEnum serviceId = null;
  /**
   * Name or description of the originating payer.  Mandatory for inbound payment
   **/
  public TransactionDetailExtendedData payer(String payer) {
    this.payer = payer;
    return this;
  }

  
  @Schema(description = "Name or description of the originating payer.  Mandatory for inbound payment")
  @JsonProperty("payer")
  public String getPayer() {
    return payer;
  }
  public void setPayer(String payer) {
    this.payer = payer;
  }

  /**
   * Name or description of the target payee. Mandatory for an outbound payment
   **/
  public TransactionDetailExtendedData payee(String payee) {
    this.payee = payee;
    return this;
  }

  
  @Schema(description = "Name or description of the target payee. Mandatory for an outbound payment")
  @JsonProperty("payee")
  public String getPayee() {
    return payee;
  }
  public void setPayee(String payee) {
    this.payee = payee;
  }

  /**
   * Optional extended data provided specific to transaction originated via NPP
   **/
  public TransactionDetailExtendedData extensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
    return this;
  }

  
  @Schema(description = "Optional extended data provided specific to transaction originated via NPP")
  @JsonProperty("extensionUType")
  public ExtensionUTypeEnum getExtensionUType() {
    return extensionUType;
  }
  public void setExtensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
  }

  /**
   * An extended string description. Only present if specified by the extensionUType field
   **/
  public TransactionDetailExtendedData extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
    return this;
  }

  
  @Schema(description = "An extended string description. Only present if specified by the extensionUType field")
  @JsonProperty("extendedDescription")
  public String getExtendedDescription() {
    return extendedDescription;
  }
  public void setExtendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
  }

  /**
   * Identifier of the applicable NPP payment service
   **/
  public TransactionDetailExtendedData serviceId(ServiceIdEnum serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  
  @Schema(description = "Identifier of the applicable NPP payment service")
  @JsonProperty("serviceId")
  public ServiceIdEnum getServiceId() {
    return serviceId;
  }
  public void setServiceId(ServiceIdEnum serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailExtendedData transactionDetailExtendedData = (TransactionDetailExtendedData) o;
    return Objects.equals(payer, transactionDetailExtendedData.payer) &&
        Objects.equals(payee, transactionDetailExtendedData.payee) &&
        Objects.equals(extensionUType, transactionDetailExtendedData.extensionUType) &&
        Objects.equals(extendedDescription, transactionDetailExtendedData.extendedDescription) &&
        Objects.equals(serviceId, transactionDetailExtendedData.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payer, payee, extensionUType, extendedDescription, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetailExtendedData {\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    extensionUType: ").append(toIndentedString(extensionUType)).append("\n");
    sb.append("    extendedDescription: ").append(toIndentedString(extendedDescription)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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