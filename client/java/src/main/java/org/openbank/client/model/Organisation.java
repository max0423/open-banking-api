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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Organisation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-02-17T21:56:09.632+11:00[Australia/Sydney]")
public class Organisation {
  public static final String SERIALIZED_NAME_LAST_UPDATE_TIME = "lastUpdateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_TIME)
  private String lastUpdateTime;

  public static final String SERIALIZED_NAME_AGENT_FIRST_NAME = "agentFirstName";
  @SerializedName(SERIALIZED_NAME_AGENT_FIRST_NAME)
  private String agentFirstName;

  public static final String SERIALIZED_NAME_AGENT_LAST_NAME = "agentLastName";
  @SerializedName(SERIALIZED_NAME_AGENT_LAST_NAME)
  private String agentLastName;

  public static final String SERIALIZED_NAME_AGENT_ROLE = "agentRole";
  @SerializedName(SERIALIZED_NAME_AGENT_ROLE)
  private String agentRole;

  public static final String SERIALIZED_NAME_BUSINESS_NAME = "businessName";
  @SerializedName(SERIALIZED_NAME_BUSINESS_NAME)
  private String businessName;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legalName";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_ABN = "abn";
  @SerializedName(SERIALIZED_NAME_ABN)
  private String abn;

  public static final String SERIALIZED_NAME_ACN = "acn";
  @SerializedName(SERIALIZED_NAME_ACN)
  private String acn;

  public static final String SERIALIZED_NAME_IS_A_C_N_C_REGISTERED = "isACNCRegistered";
  @SerializedName(SERIALIZED_NAME_IS_A_C_N_C_REGISTERED)
  private Boolean isACNCRegistered;

  public static final String SERIALIZED_NAME_INDUSTRY_CODE = "industryCode";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_CODE)
  private String industryCode;

  /**
   * Legal organisation type
   */
  @JsonAdapter(OrganisationTypeEnum.Adapter.class)
  public enum OrganisationTypeEnum {
    SOLE_TRADER("SOLE_TRADER"),
    
    COMPANY("COMPANY"),
    
    PARTNERSHIP("PARTNERSHIP"),
    
    TRUST("TRUST"),
    
    GOVERNMENT_ENTITY("GOVERNMENT_ENTITY"),
    
    OTHER("OTHER");

    private String value;

    OrganisationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrganisationTypeEnum fromValue(String text) {
      for (OrganisationTypeEnum b : OrganisationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<OrganisationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrganisationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrganisationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrganisationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_ORGANISATION_TYPE = "organisationType";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_TYPE)
  private OrganisationTypeEnum organisationType;

  public static final String SERIALIZED_NAME_REGISTERED_COUNTRY = "registeredCountry";
  @SerializedName(SERIALIZED_NAME_REGISTERED_COUNTRY)
  private String registeredCountry;

  public static final String SERIALIZED_NAME_ESTABLISHMENT_DATE = "establishmentDate";
  @SerializedName(SERIALIZED_NAME_ESTABLISHMENT_DATE)
  private String establishmentDate;

  public Organisation lastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
   * @return lastUpdateTime
  **/
  @ApiModelProperty(required = true, value = "The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data")
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public Organisation agentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
    return this;
  }

   /**
   * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
   * @return agentFirstName
  **/
  @ApiModelProperty(value = "The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field")
  public String getAgentFirstName() {
    return agentFirstName;
  }

  public void setAgentFirstName(String agentFirstName) {
    this.agentFirstName = agentFirstName;
  }

  public Organisation agentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
    return this;
  }

   /**
   * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
   * @return agentLastName
  **/
  @ApiModelProperty(required = true, value = "The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field")
  public String getAgentLastName() {
    return agentLastName;
  }

  public void setAgentLastName(String agentLastName) {
    this.agentLastName = agentLastName;
  }

  public Organisation agentRole(String agentRole) {
    this.agentRole = agentRole;
    return this;
  }

   /**
   * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
   * @return agentRole
  **/
  @ApiModelProperty(required = true, value = "The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known")
  public String getAgentRole() {
    return agentRole;
  }

  public void setAgentRole(String agentRole) {
    this.agentRole = agentRole;
  }

  public Organisation businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Name of the organisation
   * @return businessName
  **/
  @ApiModelProperty(required = true, value = "Name of the organisation")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Organisation legalName(String legalName) {
    this.legalName = legalName;
    return this;
  }

   /**
   * Legal name, if different to the business name
   * @return legalName
  **/
  @ApiModelProperty(value = "Legal name, if different to the business name")
  public String getLegalName() {
    return legalName;
  }

  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  public Organisation shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Short name used for communication, if  different to the business name
   * @return shortName
  **/
  @ApiModelProperty(value = "Short name used for communication, if  different to the business name")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public Organisation abn(String abn) {
    this.abn = abn;
    return this;
  }

   /**
   * Australian Business Number for the organisation
   * @return abn
  **/
  @ApiModelProperty(value = "Australian Business Number for the organisation")
  public String getAbn() {
    return abn;
  }

  public void setAbn(String abn) {
    this.abn = abn;
  }

  public Organisation acn(String acn) {
    this.acn = acn;
    return this;
  }

   /**
   * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
   * @return acn
  **/
  @ApiModelProperty(value = "Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type")
  public String getAcn() {
    return acn;
  }

  public void setAcn(String acn) {
    this.acn = acn;
  }

  public Organisation isACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
    return this;
  }

   /**
   * True if registered with the ACNC.  False if not. Absent or null if not confirmed.
   * @return isACNCRegistered
  **/
  @ApiModelProperty(value = "True if registered with the ACNC.  False if not. Absent or null if not confirmed.")
  public Boolean getIsACNCRegistered() {
    return isACNCRegistered;
  }

  public void setIsACNCRegistered(Boolean isACNCRegistered) {
    this.isACNCRegistered = isACNCRegistered;
  }

  public Organisation industryCode(String industryCode) {
    this.industryCode = industryCode;
    return this;
  }

   /**
   * [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
   * @return industryCode
  **/
  @ApiModelProperty(value = "[ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.")
  public String getIndustryCode() {
    return industryCode;
  }

  public void setIndustryCode(String industryCode) {
    this.industryCode = industryCode;
  }

  public Organisation organisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
    return this;
  }

   /**
   * Legal organisation type
   * @return organisationType
  **/
  @ApiModelProperty(required = true, value = "Legal organisation type")
  public OrganisationTypeEnum getOrganisationType() {
    return organisationType;
  }

  public void setOrganisationType(OrganisationTypeEnum organisationType) {
    this.organisationType = organisationType;
  }

  public Organisation registeredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
    return this;
  }

   /**
   * Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
   * @return registeredCountry
  **/
  @ApiModelProperty(value = "Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent")
  public String getRegisteredCountry() {
    return registeredCountry;
  }

  public void setRegisteredCountry(String registeredCountry) {
    this.registeredCountry = registeredCountry;
  }

  public Organisation establishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
    return this;
  }

   /**
   * The date the organisation described was established
   * @return establishmentDate
  **/
  @ApiModelProperty(value = "The date the organisation described was established")
  public String getEstablishmentDate() {
    return establishmentDate;
  }

  public void setEstablishmentDate(String establishmentDate) {
    this.establishmentDate = establishmentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organisation organisation = (Organisation) o;
    return Objects.equals(this.lastUpdateTime, organisation.lastUpdateTime) &&
        Objects.equals(this.agentFirstName, organisation.agentFirstName) &&
        Objects.equals(this.agentLastName, organisation.agentLastName) &&
        Objects.equals(this.agentRole, organisation.agentRole) &&
        Objects.equals(this.businessName, organisation.businessName) &&
        Objects.equals(this.legalName, organisation.legalName) &&
        Objects.equals(this.shortName, organisation.shortName) &&
        Objects.equals(this.abn, organisation.abn) &&
        Objects.equals(this.acn, organisation.acn) &&
        Objects.equals(this.isACNCRegistered, organisation.isACNCRegistered) &&
        Objects.equals(this.industryCode, organisation.industryCode) &&
        Objects.equals(this.organisationType, organisation.organisationType) &&
        Objects.equals(this.registeredCountry, organisation.registeredCountry) &&
        Objects.equals(this.establishmentDate, organisation.establishmentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, agentFirstName, agentLastName, agentRole, businessName, legalName, shortName, abn, acn, isACNCRegistered, industryCode, organisationType, registeredCountry, establishmentDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organisation {\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    agentFirstName: ").append(toIndentedString(agentFirstName)).append("\n");
    sb.append("    agentLastName: ").append(toIndentedString(agentLastName)).append("\n");
    sb.append("    agentRole: ").append(toIndentedString(agentRole)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    abn: ").append(toIndentedString(abn)).append("\n");
    sb.append("    acn: ").append(toIndentedString(acn)).append("\n");
    sb.append("    isACNCRegistered: ").append(toIndentedString(isACNCRegistered)).append("\n");
    sb.append("    industryCode: ").append(toIndentedString(industryCode)).append("\n");
    sb.append("    organisationType: ").append(toIndentedString(organisationType)).append("\n");
    sb.append("    registeredCountry: ").append(toIndentedString(registeredCountry)).append("\n");
    sb.append("    establishmentDate: ").append(toIndentedString(establishmentDate)).append("\n");
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

