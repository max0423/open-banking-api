package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CurrencyAmount;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-14T17:34:34.379921+11:00[Australia/Sydney]")

public class DepositBalance   {
  @JsonProperty("currentBalance")
  private CurrencyAmount currentBalance = null;

  @JsonProperty("availableBalance")
  private CurrencyAmount availableBalance = null;

  public DepositBalance currentBalance(CurrencyAmount currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Get currentBalance
   * @return currentBalance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CurrencyAmount getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(CurrencyAmount currentBalance) {
    this.currentBalance = currentBalance;
  }

  public DepositBalance availableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public CurrencyAmount getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositBalance depositBalance = (DepositBalance) o;
    return Objects.equals(this.currentBalance, depositBalance.currentBalance) &&
        Objects.equals(this.availableBalance, depositBalance.availableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentBalance, availableBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositBalance {\n");
    
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
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
