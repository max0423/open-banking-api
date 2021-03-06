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
    define(['ApiClient', 'model/PAFAddress', 'model/SimpleAddress'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./PAFAddress'), require('./SimpleAddress'));
  } else {
    // Browser globals (root is window)
    if (!root.ConsumerDataStandards) {
      root.ConsumerDataStandards = {};
    }
    root.ConsumerDataStandards.PhysicalAddress = factory(root.ConsumerDataStandards.ApiClient, root.ConsumerDataStandards.PAFAddress, root.ConsumerDataStandards.SimpleAddress);
  }
}(this, function(ApiClient, PAFAddress, SimpleAddress) {
  'use strict';



  /**
   * The PhysicalAddress model module.
   * @module model/PhysicalAddress
   * @version 1-oas3
   */

  /**
   * Constructs a new <code>PhysicalAddress</code>.
   * @alias module:model/PhysicalAddress
   * @class
   * @param addressUType {module:model/PhysicalAddress.AddressUTypeEnum} The type of address object present
   */
  var exports = function(addressUType) {
    var _this = this;

    _this['addressUType'] = addressUType;
  };

  /**
   * Constructs a <code>PhysicalAddress</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PhysicalAddress} obj Optional instance to populate.
   * @return {module:model/PhysicalAddress} The populated <code>PhysicalAddress</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('addressUType')) {
        obj['addressUType'] = ApiClient.convertToType(data['addressUType'], 'String');
      }
      if (data.hasOwnProperty('simple')) {
        obj['simple'] = SimpleAddress.constructFromObject(data['simple']);
      }
      if (data.hasOwnProperty('paf')) {
        obj['paf'] = PAFAddress.constructFromObject(data['paf']);
      }
    }
    return obj;
  }

  /**
   * The type of address object present
   * @member {module:model/PhysicalAddress.AddressUTypeEnum} addressUType
   */
  exports.prototype['addressUType'] = undefined;
  /**
   * @member {module:model/SimpleAddress} simple
   */
  exports.prototype['simple'] = undefined;
  /**
   * @member {module:model/PAFAddress} paf
   */
  exports.prototype['paf'] = undefined;


  /**
   * Allowed values for the <code>addressUType</code> property.
   * @enum {String}
   * @readonly
   */
  exports.AddressUTypeEnum = {
    /**
     * value: "simple"
     * @const
     */
    "simple": "simple",
    /**
     * value: "paf"
     * @const
     */
    "paf": "paf"  };


  return exports;
}));


