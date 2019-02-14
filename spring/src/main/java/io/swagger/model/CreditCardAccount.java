package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreditCardAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class CreditCardAccount   {
  @JsonProperty("minPaymentAmount")
  private String minPaymentAmount = null;

  @JsonProperty("paymentDueAmount")
  private String paymentDueAmount = null;

  @JsonProperty("paymentCurrency")
  private String paymentCurrency = null;

  @JsonProperty("paymentDueDate")
  private String paymentDueDate = null;

  public CreditCardAccount minPaymentAmount(String minPaymentAmount) {
    this.minPaymentAmount = minPaymentAmount;
    return this;
  }

  /**
   * The minimum payment amount due for the next card payment
   * @return minPaymentAmount
  **/
  @ApiModelProperty(required = true, value = "The minimum payment amount due for the next card payment")
  @NotNull

  public String getMinPaymentAmount() {
    return minPaymentAmount;
  }

  public void setMinPaymentAmount(String minPaymentAmount) {
    this.minPaymentAmount = minPaymentAmount;
  }

  public CreditCardAccount paymentDueAmount(String paymentDueAmount) {
    this.paymentDueAmount = paymentDueAmount;
    return this;
  }

  /**
   * The amount due for the next card payment
   * @return paymentDueAmount
  **/
  @ApiModelProperty(required = true, value = "The amount due for the next card payment")
  @NotNull

  public String getPaymentDueAmount() {
    return paymentDueAmount;
  }

  public void setPaymentDueAmount(String paymentDueAmount) {
    this.paymentDueAmount = paymentDueAmount;
  }

  public CreditCardAccount paymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

  /**
   * If absent assumes AUD
   * @return paymentCurrency
  **/
  @ApiModelProperty(value = "If absent assumes AUD")

  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }

  public CreditCardAccount paymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }

  /**
   * Date that the next payment for the card is due
   * @return paymentDueDate
  **/
  @ApiModelProperty(required = true, value = "Date that the next payment for the card is due")
  @NotNull

  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditCardAccount creditCardAccount = (CreditCardAccount) o;
    return Objects.equals(this.minPaymentAmount, creditCardAccount.minPaymentAmount) &&
        Objects.equals(this.paymentDueAmount, creditCardAccount.paymentDueAmount) &&
        Objects.equals(this.paymentCurrency, creditCardAccount.paymentCurrency) &&
        Objects.equals(this.paymentDueDate, creditCardAccount.paymentDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minPaymentAmount, paymentDueAmount, paymentCurrency, paymentDueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditCardAccount {\n");
    
    sb.append("    minPaymentAmount: ").append(toIndentedString(minPaymentAmount)).append("\n");
    sb.append("    paymentDueAmount: ").append(toIndentedString(paymentDueAmount)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
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
