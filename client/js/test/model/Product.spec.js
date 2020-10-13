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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ConsumerDataStandards);
  }
}(this, function(expect, ConsumerDataStandards) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ConsumerDataStandards.Product();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Product', function() {
    it('should create an instance of Product', function() {
      // uncomment below and update the code to test Product
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be.a(ConsumerDataStandards.Product);
    });

    it('should have the property productId (base name: "productId")', function() {
      // uncomment below and update the code to test the property productId
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property effectiveFrom (base name: "effectiveFrom")', function() {
      // uncomment below and update the code to test the property effectiveFrom
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property effectiveTo (base name: "effectiveTo")', function() {
      // uncomment below and update the code to test the property effectiveTo
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property lastUpdated (base name: "lastUpdated")', function() {
      // uncomment below and update the code to test the property lastUpdated
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property productCategory (base name: "productCategory")', function() {
      // uncomment below and update the code to test the property productCategory
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property brand (base name: "brand")', function() {
      // uncomment below and update the code to test the property brand
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property brandName (base name: "brandName")', function() {
      // uncomment below and update the code to test the property brandName
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property applicationUri (base name: "applicationUri")', function() {
      // uncomment below and update the code to test the property applicationUri
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property isTailored (base name: "isTailored")', function() {
      // uncomment below and update the code to test the property isTailored
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

    it('should have the property additionalInformation (base name: "additionalInformation")', function() {
      // uncomment below and update the code to test the property additionalInformation
      //var instance = new ConsumerDataStandards.Product();
      //expect(instance).to.be();
    });

  });

}));