package io.swagger.model;

import io.swagger.model.Links;
import io.swagger.model.Meta;
import io.swagger.model.ResponseCommonCustomerData;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class ResponseCommonCustomer  {
  
  @Schema(required = true, description = "")
  private ResponseCommonCustomerData data = null;
  
  @Schema(required = true, description = "")
  private Links links = null;
  
  @Schema(required = true, description = "")
  private Meta meta = null;
 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public ResponseCommonCustomerData getData() {
    return data;
  }

  public void setData(ResponseCommonCustomerData data) {
    this.data = data;
  }

  public ResponseCommonCustomer data(ResponseCommonCustomerData data) {
    this.data = data;
    return this;
  }

 /**
   * Get links
   * @return links
  **/
  @JsonProperty("links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ResponseCommonCustomer links(Links links) {
    this.links = links;
    return this;
  }

 /**
   * Get meta
   * @return meta
  **/
  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  public ResponseCommonCustomer meta(Meta meta) {
    this.meta = meta;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCommonCustomer {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}