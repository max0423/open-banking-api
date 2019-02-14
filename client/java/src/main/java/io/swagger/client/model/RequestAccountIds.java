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

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Meta;
import io.swagger.client.model.RequestAccountIdsData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * RequestAccountIds
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-02-14T03:38:22.905Z[GMT]")public class RequestAccountIds {

  @SerializedName("data")
  private RequestAccountIdsData data = null;

  @SerializedName("meta")
  private Meta meta = null;
  public RequestAccountIds data(RequestAccountIdsData data) {
    this.data = data;
    return this;
  }

  

  /**
  * Get data
  * @return data
  **/
  @Schema(required = true, description = "")
  public RequestAccountIdsData getData() {
    return data;
  }
  public void setData(RequestAccountIdsData data) {
    this.data = data;
  }
  public RequestAccountIds meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  

  /**
  * Get meta
  * @return meta
  **/
  @Schema(required = true, description = "")
  public Meta getMeta() {
    return meta;
  }
  public void setMeta(Meta meta) {
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
    RequestAccountIds requestAccountIds = (RequestAccountIds) o;
    return Objects.equals(this.data, requestAccountIds.data) &&
        Objects.equals(this.meta, requestAccountIds.meta);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestAccountIds {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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