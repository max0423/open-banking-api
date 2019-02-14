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
 */import { EnumProductCategory } from './enumProductCategory';


export interface Account { 
    /**
     * A unique ID of the account adhering to the standards for ID permanence
     */
    accountId: string;
    /**
     * The display name of the account. If a customer provided nickname is available that value should be returned
     */
    displayName: string;
    /**
     * A customer supplied nick name for the account
     */
    nickname?: string;
    /**
     * A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
     */
    maskedNumber: string;
    /**
     * Open or closed status for the account.  If not present then OPEN is assumed
     */
    openStatus?: Account.OpenStatusEnum;
    /**
     * Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
     */
    isOwned?: boolean;
    productCategory: EnumProductCategory;
    /**
     * A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
     */
    productName: string;
}
export namespace Account {
    export type OpenStatusEnum = 'OPEN' | 'CLOSED';
    export const OpenStatusEnum = {
        OPEN: 'OPEN' as OpenStatusEnum,
        CLOSED: 'CLOSED' as OpenStatusEnum
    };
}