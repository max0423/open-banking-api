package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Payee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingPayeesData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class ResponseBankingPayeesData   {
  @JsonProperty("payees")
  @Valid
  private List<Payee> payees = null;

  public ResponseBankingPayeesData payees(List<Payee> payees) {
    this.payees = payees;
    return this;
  }

  public ResponseBankingPayeesData addPayeesItem(Payee payeesItem) {
    if (this.payees == null) {
      this.payees = new ArrayList<Payee>();
    }
    this.payees.add(payeesItem);
    return this;
  }

  /**
   * The list of payees returned
   * @return payees
  **/
  @ApiModelProperty(value = "The list of payees returned")
  @Valid
  public List<Payee> getPayees() {
    return payees;
  }

  public void setPayees(List<Payee> payees) {
    this.payees = payees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingPayeesData responseBankingPayeesData = (ResponseBankingPayeesData) o;
    return Objects.equals(this.payees, responseBankingPayeesData.payees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingPayeesData {\n");
    
    sb.append("    payees: ").append(toIndentedString(payees)).append("\n");
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
