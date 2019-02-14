package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PAFAddress;
import io.swagger.model.SimpleAddress;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhysicalAddress
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class PhysicalAddress   {
  /**
   * The type of address object present
   */
  public enum AddressUTypeEnum {
    SIMPLE("simple"),
    
    PAF("paf");

    private String value;

    AddressUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AddressUTypeEnum fromValue(String text) {
      for (AddressUTypeEnum b : AddressUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("addressUType")
  private AddressUTypeEnum addressUType = null;

  @JsonProperty("simple")
  private SimpleAddress simple = null;

  @JsonProperty("paf")
  private PAFAddress paf = null;

  public PhysicalAddress addressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
    return this;
  }

  /**
   * The type of address object present
   * @return addressUType
  **/
  @ApiModelProperty(required = true, value = "The type of address object present")
  @NotNull

  public AddressUTypeEnum getAddressUType() {
    return addressUType;
  }

  public void setAddressUType(AddressUTypeEnum addressUType) {
    this.addressUType = addressUType;
  }

  public PhysicalAddress simple(SimpleAddress simple) {
    this.simple = simple;
    return this;
  }

  /**
   * Get simple
   * @return simple
  **/
  @ApiModelProperty(value = "")

  @Valid
  public SimpleAddress getSimple() {
    return simple;
  }

  public void setSimple(SimpleAddress simple) {
    this.simple = simple;
  }

  public PhysicalAddress paf(PAFAddress paf) {
    this.paf = paf;
    return this;
  }

  /**
   * Get paf
   * @return paf
  **/
  @ApiModelProperty(value = "")

  @Valid
  public PAFAddress getPaf() {
    return paf;
  }

  public void setPaf(PAFAddress paf) {
    this.paf = paf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalAddress physicalAddress = (PhysicalAddress) o;
    return Objects.equals(this.addressUType, physicalAddress.addressUType) &&
        Objects.equals(this.simple, physicalAddress.simple) &&
        Objects.equals(this.paf, physicalAddress.paf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressUType, simple, paf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalAddress {\n");
    
    sb.append("    addressUType: ").append(toIndentedString(addressUType)).append("\n");
    sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
    sb.append("    paf: ").append(toIndentedString(paf)).append("\n");
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
