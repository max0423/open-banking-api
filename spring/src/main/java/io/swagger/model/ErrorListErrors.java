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
 * ErrorListErrors
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-14T03:26:14.367Z[GMT]")
public class ErrorListErrors   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("meta")
  private Object meta = null;

  public ErrorListErrors code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code of the error
   * @return code
  **/
  @ApiModelProperty(value = "The code of the error")

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorListErrors title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A displayable title of the error type
   * @return title
  **/
  @ApiModelProperty(value = "A displayable title of the error type")

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ErrorListErrors detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Detail of the error
   * @return detail
  **/
  @ApiModelProperty(value = "Detail of the error")

  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorListErrors meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Optional additional data for specific error types
   * @return meta
  **/
  @ApiModelProperty(value = "Optional additional data for specific error types")

  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorListErrors errorListErrors = (ErrorListErrors) o;
    return Objects.equals(this.code, errorListErrors.code) &&
        Objects.equals(this.title, errorListErrors.title) &&
        Objects.equals(this.detail, errorListErrors.detail) &&
        Objects.equals(this.meta, errorListErrors.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title, detail, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorListErrors {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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