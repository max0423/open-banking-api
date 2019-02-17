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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * InternationalPayeeBankDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class InternationalPayeeBankDetails {
  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_BANK_ADDRESS = "bankAddress";
  @SerializedName(SERIALIZED_NAME_BANK_ADDRESS)
  private InternationalPayeeBankDetailsBankAddress bankAddress = null;

  public static final String SERIALIZED_NAME_BENEFICIARY_BANK_B_I_C = "beneficiaryBankBIC";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_BANK_B_I_C)
  private String beneficiaryBankBIC;

  public static final String SERIALIZED_NAME_FED_WIRE_NUMBER = "fedWireNumber";
  @SerializedName(SERIALIZED_NAME_FED_WIRE_NUMBER)
  private String fedWireNumber;

  public static final String SERIALIZED_NAME_SORT_CODE = "sortCode";
  @SerializedName(SERIALIZED_NAME_SORT_CODE)
  private String sortCode;

  public static final String SERIALIZED_NAME_CHIP_NUMBER = "chipNumber";
  @SerializedName(SERIALIZED_NAME_CHIP_NUMBER)
  private String chipNumber;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routingNumber";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_IDENTIFIER = "legalEntityIdentifier";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_IDENTIFIER)
  private String legalEntityIdentifier;

  public InternationalPayeeBankDetails country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country of the recipient institution. A valid ISO 3166 Alpha-3 country code")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public InternationalPayeeBankDetails accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Account Targeted for payment
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Account Targeted for payment")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public InternationalPayeeBankDetails bankAddress(InternationalPayeeBankDetailsBankAddress bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

   /**
   * Get bankAddress
   * @return bankAddress
  **/
  @ApiModelProperty(value = "")
  public InternationalPayeeBankDetailsBankAddress getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(InternationalPayeeBankDetailsBankAddress bankAddress) {
    this.bankAddress = bankAddress;
  }

  public InternationalPayeeBankDetails beneficiaryBankBIC(String beneficiaryBankBIC) {
    this.beneficiaryBankBIC = beneficiaryBankBIC;
    return this;
  }

   /**
   * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
   * @return beneficiaryBankBIC
  **/
  @ApiModelProperty(value = "Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)")
  public String getBeneficiaryBankBIC() {
    return beneficiaryBankBIC;
  }

  public void setBeneficiaryBankBIC(String beneficiaryBankBIC) {
    this.beneficiaryBankBIC = beneficiaryBankBIC;
  }

  public InternationalPayeeBankDetails fedWireNumber(String fedWireNumber) {
    this.fedWireNumber = fedWireNumber;
    return this;
  }

   /**
   * Number for Fedwire payment (Federal Reserve Wire Network)
   * @return fedWireNumber
  **/
  @ApiModelProperty(value = "Number for Fedwire payment (Federal Reserve Wire Network)")
  public String getFedWireNumber() {
    return fedWireNumber;
  }

  public void setFedWireNumber(String fedWireNumber) {
    this.fedWireNumber = fedWireNumber;
  }

  public InternationalPayeeBankDetails sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

   /**
   * Sort code used for account identification in some jurisdictions
   * @return sortCode
  **/
  @ApiModelProperty(value = "Sort code used for account identification in some jurisdictions")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  public InternationalPayeeBankDetails chipNumber(String chipNumber) {
    this.chipNumber = chipNumber;
    return this;
  }

   /**
   * Number for the Clearing House Interbank Payments System
   * @return chipNumber
  **/
  @ApiModelProperty(value = "Number for the Clearing House Interbank Payments System")
  public String getChipNumber() {
    return chipNumber;
  }

  public void setChipNumber(String chipNumber) {
    this.chipNumber = chipNumber;
  }

  public InternationalPayeeBankDetails routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * International bank routing number
   * @return routingNumber
  **/
  @ApiModelProperty(value = "International bank routing number")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public InternationalPayeeBankDetails legalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
    return this;
  }

   /**
   * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
   * @return legalEntityIdentifier
  **/
  @ApiModelProperty(value = "The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)")
  public String getLegalEntityIdentifier() {
    return legalEntityIdentifier;
  }

  public void setLegalEntityIdentifier(String legalEntityIdentifier) {
    this.legalEntityIdentifier = legalEntityIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalPayeeBankDetails internationalPayeeBankDetails = (InternationalPayeeBankDetails) o;
    return Objects.equals(this.country, internationalPayeeBankDetails.country) &&
        Objects.equals(this.accountNumber, internationalPayeeBankDetails.accountNumber) &&
        Objects.equals(this.bankAddress, internationalPayeeBankDetails.bankAddress) &&
        Objects.equals(this.beneficiaryBankBIC, internationalPayeeBankDetails.beneficiaryBankBIC) &&
        Objects.equals(this.fedWireNumber, internationalPayeeBankDetails.fedWireNumber) &&
        Objects.equals(this.sortCode, internationalPayeeBankDetails.sortCode) &&
        Objects.equals(this.chipNumber, internationalPayeeBankDetails.chipNumber) &&
        Objects.equals(this.routingNumber, internationalPayeeBankDetails.routingNumber) &&
        Objects.equals(this.legalEntityIdentifier, internationalPayeeBankDetails.legalEntityIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, accountNumber, bankAddress, beneficiaryBankBIC, fedWireNumber, sortCode, chipNumber, routingNumber, legalEntityIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalPayeeBankDetails {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    beneficiaryBankBIC: ").append(toIndentedString(beneficiaryBankBIC)).append("\n");
    sb.append("    fedWireNumber: ").append(toIndentedString(fedWireNumber)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("    chipNumber: ").append(toIndentedString(chipNumber)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    legalEntityIdentifier: ").append(toIndentedString(legalEntityIdentifier)).append("\n");
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

