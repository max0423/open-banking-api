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
 */import { ProductDiscounts } from './productDiscounts';


export interface ProductFees { 
    /**
     * Name of the fee
     */
    name: string;
    /**
     * The type of fee
     */
    feeType: ProductFees.FeeTypeEnum;
    /**
     * The amount charged for the fee. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
     */
    amount?: string;
    /**
     * A fee rate calculated based on a proportion of the balance. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
     */
    balanceRate?: string;
    /**
     * A fee rate calculated based on a proportion of a transaction. Assumed to be in AUD. One of amount, balanceRate and transactionRate is mandatory
     */
    transactionRate?: string;
    /**
     * The currency the fee will be charged in. Assumes AUD if absent
     */
    currency?: string;
    /**
     * Generic field containing additional information relevant to the feeType specified. Whether mandatory or not is dependent on the value of feeType
     */
    additionalValue?: string;
    /**
     * Display text providing more information on the fee
     */
    additionalInfo?: string;
    /**
     * Link to a web page with more information on this fee
     */
    additionalInfoUri?: string;
    discounts?: Array<ProductDiscounts>;
}
export namespace ProductFees {
    export type FeeTypeEnum = 'PERIODIC' | 'TRANSACTION' | 'ESTABLISHMENT' | 'EXIT' | 'OVERDRAW' | 'MIN_BALANCE' | 'REDRAW' | 'CHEQUE_CASH' | 'CHEQUE_STOP' | 'CHEQUE_BOOK' | 'CARD_REPLACE' | 'PAPER_STATEMENT' | 'OTHER_EVENT';
    export const FeeTypeEnum = {
        PERIODIC: 'PERIODIC' as FeeTypeEnum,
        TRANSACTION: 'TRANSACTION' as FeeTypeEnum,
        ESTABLISHMENT: 'ESTABLISHMENT' as FeeTypeEnum,
        EXIT: 'EXIT' as FeeTypeEnum,
        OVERDRAW: 'OVERDRAW' as FeeTypeEnum,
        MINBALANCE: 'MIN_BALANCE' as FeeTypeEnum,
        REDRAW: 'REDRAW' as FeeTypeEnum,
        CHEQUECASH: 'CHEQUE_CASH' as FeeTypeEnum,
        CHEQUESTOP: 'CHEQUE_STOP' as FeeTypeEnum,
        CHEQUEBOOK: 'CHEQUE_BOOK' as FeeTypeEnum,
        CARDREPLACE: 'CARD_REPLACE' as FeeTypeEnum,
        PAPERSTATEMENT: 'PAPER_STATEMENT' as FeeTypeEnum,
        OTHEREVENT: 'OTHER_EVENT' as FeeTypeEnum
    };
}