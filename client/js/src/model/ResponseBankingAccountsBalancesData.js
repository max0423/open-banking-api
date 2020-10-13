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
    define(['ApiClient', 'model/Balance'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Balance'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ResponseBankingAccountsBalancesData = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.Balance);
  }
}(this, function(ApiClient, Balance) {
  'use strict';



  /**
   * The ResponseBankingAccountsBalancesData model module.
   * @module model/ResponseBankingAccountsBalancesData
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ResponseBankingAccountsBalancesData</code>.
   * @alias module:model/ResponseBankingAccountsBalancesData
   * @class
   * @param balances {Array.<module:model/Balance>} 
   */
  var exports = function(balances) {
    var _this = this;

    _this['balances'] = balances;
  };

  /**
   * Constructs a <code>ResponseBankingAccountsBalancesData</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResponseBankingAccountsBalancesData} obj Optional instance to populate.
   * @return {module:model/ResponseBankingAccountsBalancesData} The populated <code>ResponseBankingAccountsBalancesData</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('balances')) {
        obj['balances'] = ApiClient.convertToType(data['balances'], [Balance]);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:model/Balance>} balances
   */
  exports.prototype['balances'] = undefined;



  return exports;
}));

