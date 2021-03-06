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
    define(['ApiClient', 'model/AccountDetail', 'model/Links'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AccountDetail'), require('./Links'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.ResponseBankingAccount = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.AccountDetail, root.ConsumerDataStandards.Links);
  }
}(this, function(ApiClient, AccountDetail, Links) {
  'use strict';



  /**
   * The ResponseBankingAccount model module.
   * @module model/ResponseBankingAccount
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>ResponseBankingAccount</code>.
   * @alias module:model/ResponseBankingAccount
   * @class
   * @param data {module:model/AccountDetail} 
   * @param links {module:model/Links} 
   * @param meta {Object} 
   */
  var exports = function(data, links, meta) {
    var _this = this;

    _this['data'] = data;
    _this['links'] = links;
    _this['meta'] = meta;
  };

  /**
   * Constructs a <code>ResponseBankingAccount</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ResponseBankingAccount} obj Optional instance to populate.
   * @return {module:model/ResponseBankingAccount} The populated <code>ResponseBankingAccount</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('data')) {
        obj['data'] = AccountDetail.constructFromObject(data['data']);
      }
      if (data.hasOwnProperty('links')) {
        obj['links'] = Links.constructFromObject(data['links']);
      }
      if (data.hasOwnProperty('meta')) {
        obj['meta'] = ApiClient.convertToType(data['meta'], Object);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/AccountDetail} data
   */
  exports.prototype['data'] = undefined;
  /**
   * @member {module:model/Links} links
   */
  exports.prototype['links'] = undefined;
  /**
   * @member {Object} meta
   */
  exports.prototype['meta'] = undefined;



  return exports;
}));


