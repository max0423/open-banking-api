package io.swagger.server.model


/**
 * @param accountId A unique ID of the account adhering to the standards for ID permanence
 * @param displayName The display name of the account. If a customer provided nickname is available that value should be returned
 * @param nickname A customer supplied nick name for the account
 * @param maskedNumber A masked version of the account. Whether BSB/Account Number, Credit Card PAN or another number this should be formatted with each digit masked and the last three digits unmasked
 * @param openStatus Open or closed status for the account.  If not present then OPEN is assumed
 * @param isOwned Flag indicating that the customer associated with the authorisation is an owner of the account.  Does not indicate sole ownership, however.  If no present then 'true' is assumed
 * @param productCategory 
 * @param productName A unique name or identifier for the account class for this account as defined by the account provider.  Not expected to be used for display
 * @param bsb The unmasked BSB for the account.  Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
 * @param accountNumber The unmasked account number for the account.  Should not be supplied if the account number is a PAN requiring PCI compliance. Is expected to be formatted as digits only with leading zeros included and no punctuation or spaces
 * @param bundleName Optional field to indicate if this account is part of a bundle that is providing additional benefit for to the customer
 * @param specificAccountUType The type of structure to present account specific fields.
 * @param termDeposit 
 * @param creditCard 
 * @param loan 
 * @param features 
 * @param fees 
 * @param depositRates 
 * @param lendingRates 
 * @param address 
 */
case class AccountDetail (
  accountId: String,
  displayName: String,
  nickname: Option[String],
  maskedNumber: String,
  openStatus: Option[String],
  isOwned: Option[Boolean],
  productCategory: EnumProductCategory,
  productName: String,
  bsb: Option[String],
  accountNumber: Option[String],
  bundleName: Option[String],
  specificAccountUType: Option[String],
  termDeposit: Option[TermDepositAccount],
  creditCard: Option[CreditCardAccount],
  loan: Option[LoanAccount],
  features: Option[List[AccountFeatures]],
  fees: Option[List[AccountFees]],
  depositRates: Option[List[AccountDepositRates]],
  lendingRates: Option[List[AccountLendingRates]],
  address: Option[PhysicalAddress]
)
