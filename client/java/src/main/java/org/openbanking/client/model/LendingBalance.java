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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * LendingBalance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class LendingBalance {
  public static final String SERIALIZED_NAME_ACCOUNT_BALANCE = "accountBalance";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BALANCE)
  private CurrencyAmount accountBalance = null;

  public static final String SERIALIZED_NAME_AVAILABLE_BALANCE = "availableBalance";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BALANCE)
  private CurrencyAmount availableBalance = null;

  public static final String SERIALIZED_NAME_CREDIT_LIMIT = "creditLimit";
  @SerializedName(SERIALIZED_NAME_CREDIT_LIMIT)
  private CurrencyAmount creditLimit = null;

  public static final String SERIALIZED_NAME_AMORTISED_LIMIT = "amortisedLimit";
  @SerializedName(SERIALIZED_NAME_AMORTISED_LIMIT)
  private CurrencyAmount amortisedLimit = null;

  public LendingBalance accountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

   /**
   * Get accountBalance
   * @return accountBalance
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAmount getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(CurrencyAmount accountBalance) {
    this.accountBalance = accountBalance;
  }

  public LendingBalance availableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Get availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAmount getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(CurrencyAmount availableBalance) {
    this.availableBalance = availableBalance;
  }

  public LendingBalance creditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(required = true, value = "")
  public CurrencyAmount getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(CurrencyAmount creditLimit) {
    this.creditLimit = creditLimit;
  }

  public LendingBalance amortisedLimit(CurrencyAmount amortisedLimit) {
    this.amortisedLimit = amortisedLimit;
    return this;
  }

   /**
   * Get amortisedLimit
   * @return amortisedLimit
  **/
  @ApiModelProperty(value = "")
  public CurrencyAmount getAmortisedLimit() {
    return amortisedLimit;
  }

  public void setAmortisedLimit(CurrencyAmount amortisedLimit) {
    this.amortisedLimit = amortisedLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LendingBalance lendingBalance = (LendingBalance) o;
    return Objects.equals(this.accountBalance, lendingBalance.accountBalance) &&
        Objects.equals(this.availableBalance, lendingBalance.availableBalance) &&
        Objects.equals(this.creditLimit, lendingBalance.creditLimit) &&
        Objects.equals(this.amortisedLimit, lendingBalance.amortisedLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBalance, availableBalance, creditLimit, amortisedLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LendingBalance {\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    amortisedLimit: ").append(toIndentedString(amortisedLimit)).append("\n");
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

