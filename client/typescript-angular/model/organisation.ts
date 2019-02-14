/**
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

export interface Organisation { 
    /**
     * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
     */
    lastUpdateTime: string;
    /**
     * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
     */
    agentFirstName?: string;
    /**
     * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
     */
    agentLastName: string;
    /**
     * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display.  Default to “Unspecified” if the role is not known
     */
    agentRole: string;
    /**
     * Name of the organisation
     */
    businessName: string;
    /**
     * Legal name, if different to the business name
     */
    legalName?: string;
    /**
     * Short name used for communication, if  different to the business name
     */
    shortName?: string;
    /**
     * Australian Business Number for the organisation
     */
    abn?: string;
    /**
     * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
     */
    acn?: string;
    /**
     * True if registered with the ACNC.  False if not. Absent or null if not confirmed.
     */
    isACNCRegistered?: boolean;
    /**
     * [ANZSIC (2006)](http://www.abs.gov.au/anzsic) code for the organisation.
     */
    industryCode?: string;
    /**
     * Legal organisation type
     */
    organisationType: Organisation.OrganisationTypeEnum;
    /**
     * Enumeration with values from ISO 3166 Alpha-3 country codes.  Assumed to be AUS if absent
     */
    registeredCountry?: string;
    /**
     * The date the organisation described was established
     */
    establishmentDate?: string;
}
export namespace Organisation {
    export type OrganisationTypeEnum = 'SOLE_TRADER' | 'COMPANY' | 'PARTNERSHIP' | 'TRUST' | 'GOVERNMENT_ENTITY' | 'OTHER';
    export const OrganisationTypeEnum = {
        SOLETRADER: 'SOLE_TRADER' as OrganisationTypeEnum,
        COMPANY: 'COMPANY' as OrganisationTypeEnum,
        PARTNERSHIP: 'PARTNERSHIP' as OrganisationTypeEnum,
        TRUST: 'TRUST' as OrganisationTypeEnum,
        GOVERNMENTENTITY: 'GOVERNMENT_ENTITY' as OrganisationTypeEnum,
        OTHER: 'OTHER' as OrganisationTypeEnum
    };
}