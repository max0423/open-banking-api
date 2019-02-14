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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CurrencyAmount;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.*;

/**
 * DepositBalance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public class DepositBalance   {
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
   **/
  @JsonProperty("currentBalance")
  @Schema(required = true, description = "")
  @NotNull
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
   **/
  @JsonProperty("availableBalance")
  @Schema(required = true, description = "")
  @NotNull
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
