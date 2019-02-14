//
// PhoneNumber.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public struct PhoneNumber: Codable {

    public enum Purpose: String, Codable { 
        case mobile = "MOBILE"
        case home = "HOME"
        case work = "WORK"
        case other = "OTHER"
        case international = "INTERNATIONAL"
        case unspecified = "UNSPECIFIED"
    }
    /** Required to be true for one and only one entry to indicate the preferred phone number.  Assumed to be &#x27;false&#x27; if not present */
    public var isPreferred: Bool?
    /** The purpose of the number as specified by the customer */
    public var purpose: Purpose

    /** If absent, assumed to be Australia (+61). The + should be included */
    public var countryCode: String?

    /** Required for non Mobile Phones, if field is present and refers to Australian code - the leading 0 should be omitted. */
    public var areaCode: String?

    /** The actual phone number, with leading zeros as appropriate */
    public var number: String

    /** An extension number (if applicable) */
    public var _extension: String?

    /** Fully formatted phone number with country code, area code, number and extension incorporated. Formatted according to section 5.1.4. of RFC 3966 */
    public var fullNumber: String
    public init(isPreferred: Bool?, purpose: Purpose, countryCode: String?, areaCode: String?, number: String, _extension: String?, fullNumber: String) { 
        self.isPreferred = isPreferred
        self.purpose = purpose
        self.countryCode = countryCode
        self.areaCode = areaCode
        self.number = number
        self._extension = _extension
        self.fullNumber = fullNumber
    }
    public enum CodingKeys: String, CodingKey { 
        case isPreferred
        case purpose
        case countryCode
        case areaCode
        case number
        case _extension = "extension"
        case fullNumber
    }

}