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
 */import { InternationalPayeeBankDetailsBankAddress } from './internationalPayeeBankDetailsBankAddress';


export interface InternationalPayeeBankDetails { 
    /**
     * Country of the recipient institution. A valid ISO 3166 Alpha-3 country code
     */
    country?: string;
    /**
     * Account Targeted for payment
     */
    accountNumber?: string;
    bankAddress?: InternationalPayeeBankDetailsBankAddress;
    /**
     * Swift bank code.  Aligns with standard [ISO 9362](https://www.iso.org/standard/60390.html)
     */
    beneficiaryBankBIC?: string;
    /**
     * Number for Fedwire payment (Federal Reserve Wire Network)
     */
    fedWireNumber?: string;
    /**
     * Sort code used for account identification in some jurisdictions
     */
    sortCode?: string;
    /**
     * Number for the Clearing House Interbank Payments System
     */
    chipNumber?: string;
    /**
     * International bank routing number
     */
    routingNumber?: string;
    /**
     * The legal entity identifier (LEI) for the beneficiary.  Aligns with [ISO 17442](https://www.iso.org/standard/59771.html)
     */
    legalEntityIdentifier?: string;
}