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

package io.swagger.client.model


/**
 * @param minPaymentAmount The minimum payment amount due for the next card payment
 * @param paymentDueAmount The amount due for the next card payment
 * @param paymentCurrency If absent assumes AUD
 * @param paymentDueDate Date that the next payment for the card is due
 */
case class CreditCardAccount (
  minPaymentAmount: String,
  paymentDueAmount: String,
  paymentCurrency: Option[String],
  paymentDueDate: String
)
