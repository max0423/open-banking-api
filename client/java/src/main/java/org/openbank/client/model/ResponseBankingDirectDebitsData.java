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

import java.util.ArrayList;
import java.util.List;

/**
 * ResponseBankingDirectDebitsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class ResponseBankingDirectDebitsData {
  public static final String SERIALIZED_NAME_DIRECT_DEBIT_AUTHORISATIONS = "directDebitAuthorisations";
  @SerializedName(SERIALIZED_NAME_DIRECT_DEBIT_AUTHORISATIONS)
  private List<DirectDebits> directDebitAuthorisations = new ArrayList<DirectDebits>();

  public ResponseBankingDirectDebitsData directDebitAuthorisations(List<DirectDebits> directDebitAuthorisations) {
    this.directDebitAuthorisations = directDebitAuthorisations;
    return this;
  }

  public ResponseBankingDirectDebitsData addDirectDebitAuthorisationsItem(DirectDebits directDebitAuthorisationsItem) {
    this.directDebitAuthorisations.add(directDebitAuthorisationsItem);
    return this;
  }

   /**
   * The list of authorisations returned
   * @return directDebitAuthorisations
  **/
  @ApiModelProperty(required = true, value = "The list of authorisations returned")
  public List<DirectDebits> getDirectDebitAuthorisations() {
    return directDebitAuthorisations;
  }

  public void setDirectDebitAuthorisations(List<DirectDebits> directDebitAuthorisations) {
    this.directDebitAuthorisations = directDebitAuthorisations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingDirectDebitsData responseBankingDirectDebitsData = (ResponseBankingDirectDebitsData) o;
    return Objects.equals(this.directDebitAuthorisations, responseBankingDirectDebitsData.directDebitAuthorisations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directDebitAuthorisations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingDirectDebitsData {\n");
    sb.append("    directDebitAuthorisations: ").append(toIndentedString(directDebitAuthorisations)).append("\n");
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

