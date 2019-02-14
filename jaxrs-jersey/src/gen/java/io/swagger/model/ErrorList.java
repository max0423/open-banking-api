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
import io.swagger.model.ErrorListErrors;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * ErrorList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2019-02-14T03:28:57.169Z[GMT]")public class ErrorList   {
  @JsonProperty("errors")
  private List<ErrorListErrors> errors = new ArrayList<ErrorListErrors>();

  public ErrorList errors(List<ErrorListErrors> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorList addErrorsItem(ErrorListErrors errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   **/
  @JsonProperty("errors")
  @Schema(required = true, description = "")
  @NotNull
  public List<ErrorListErrors> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorListErrors> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorList errorList = (ErrorList) o;
    return Objects.equals(this.errors, errorList.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorList {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
