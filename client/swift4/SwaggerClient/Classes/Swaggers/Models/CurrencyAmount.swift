//
// CurrencyAmount.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct CurrencyAmount: Codable {


    /** The current balance of the account at this time. Should align to the current balance available via other channels such as ATM balance enquiry or Internet Banking */
    public var amount: String

    /** If not present assumes AUD */
    public var currency: String?
    public init(amount: String, currency: String?) { 
        self.amount = amount
        self.currency = currency
    }

}