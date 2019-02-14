package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.CurrencyAmount;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2019-02-14T03:32:56.456Z[GMT]")public class DepositBalance   {
  private CurrencyAmount currentBalance = null;  private CurrencyAmount availableBalance = null;

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("currentBalance")
  @NotNull
  public CurrencyAmount getCurrentBalance() {
    return currentBalance;
  }
  public void setCurrentBalance(CurrencyAmount currentBalance) {
    this.currentBalance = currentBalance;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("availableBalance")
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
    return Objects.equals(currentBalance, depositBalance.currentBalance) &&
        Objects.equals(availableBalance, depositBalance.availableBalance);
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