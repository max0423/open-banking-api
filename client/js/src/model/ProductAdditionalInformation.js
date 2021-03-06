/**
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 4.0.0-beta2
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ProductAdditionalInformation = factory(root.ConsumerDataStandards.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The ProductAdditionalInformation model module.
   * @module model/ProductAdditionalInformation
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ProductAdditionalInformation</code>.
   * @alias module:model/ProductAdditionalInformation
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>ProductAdditionalInformation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ProductAdditionalInformation} obj Optional instance to populate.
   * @return {module:model/ProductAdditionalInformation} The populated <code>ProductAdditionalInformation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('overviewUri')) {
        obj['overviewUri'] = ApiClient.convertToType(data['overviewUri'], 'String');
      }
      if (data.hasOwnProperty('termsUri')) {
        obj['termsUri'] = ApiClient.convertToType(data['termsUri'], 'String');
      }
      if (data.hasOwnProperty('eligibilityUri')) {
        obj['eligibilityUri'] = ApiClient.convertToType(data['eligibilityUri'], 'String');
      }
      if (data.hasOwnProperty('feesAndPricingUri')) {
        obj['feesAndPricingUri'] = ApiClient.convertToType(data['feesAndPricingUri'], 'String');
      }
      if (data.hasOwnProperty('bundleUri')) {
        obj['bundleUri'] = ApiClient.convertToType(data['bundleUri'], 'String');
      }
    }
    return obj;
  }

  /**
   * General overview of the product
   * @member {String} overviewUri
   */
  exports.prototype['overviewUri'] = undefined;
  /**
   * Terms and conditions for the product
   * @member {String} termsUri
   */
  exports.prototype['termsUri'] = undefined;
  /**
   * Eligibility rules and criteria for the product
   * @member {String} eligibilityUri
   */
  exports.prototype['eligibilityUri'] = undefined;
  /**
   * Description of fees, pricing, discounts, exemptions and bonuses for the product
   * @member {String} feesAndPricingUri
   */
  exports.prototype['feesAndPricingUri'] = undefined;
  /**
   * Description of a bundle that this product can be part of
   * @member {String} bundleUri
   */
  exports.prototype['bundleUri'] = undefined;



  return exports;
}));


