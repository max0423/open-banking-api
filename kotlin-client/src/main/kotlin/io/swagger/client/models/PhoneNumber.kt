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
package io.swagger.client.models


/**
 * 
 * @param isPreferred Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present
 * @param purpose The purpose of the number as specified by the customer
 * @param countryCode If absent, assumed to be Australia (+61). The + should be included
 * @param areaCode Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted.
 * @param number The actual phone number, with leading zeros as appropriate
 * @param extension An extension number (if applicable)
 * @param fullNumber Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966
 */
data class PhoneNumber (
    /* The purpose of the number as specified by the customer */
    val purpose: PhoneNumber.Purpose,
    /* The actual phone number, with leading zeros as appropriate */
    val number: kotlin.String,
    /* Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966 */
    val fullNumber: kotlin.String
,
    /* Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be 'false' if not present */
    val isPreferred: kotlin.Boolean? = null,
    /* If absent, assumed to be Australia (+61). The + should be included */
    val countryCode: kotlin.String? = null,
    /* Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted. */
    val areaCode: kotlin.String? = null,
    /* An extension number (if applicable) */
    val extension: kotlin.String? = null
) {
    /**
    * The purpose of the number as specified by the customer
    * Values: mOBILE,hOME,wORK,oTHER,iNTERNATIONAL,uNSPECIFIED
    */
    enum class Purpose(val value: kotlin.String){
        mOBILE("MOBILE"),
        hOME("HOME"),
        wORK("WORK"),
        oTHER("OTHER"),
        iNTERNATIONAL("INTERNATIONAL"),
        uNSPECIFIED("UNSPECIFIED");
    }
}