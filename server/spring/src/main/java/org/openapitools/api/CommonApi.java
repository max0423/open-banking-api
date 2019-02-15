/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0-beta2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ResponseCommonCustomer;
import org.openapitools.model.ResponseCommonCustomerDetailed;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-02-15T14:07:08.087118+11:00[Australia/Sydney]")

@Validated
@Api(value = "common", description = "the common API")
public interface CommonApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Get Customer", nickname = "getCustomer", notes = "Obtain basic information on the customer that has authorised the current session", response = ResponseCommonCustomer.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "accounts", description = "Read accounts information"),
            @AuthorizationScope(scope = "direct-debits", description = "Read direct debits information"),
            @AuthorizationScope(scope = "payees", description = "Read payees information"),
            @AuthorizationScope(scope = "products", description = "Read products information"),
            @AuthorizationScope(scope = "customer", description = "Read customer information")
            })
    }, tags={ "Customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ResponseCommonCustomer.class) })
    @RequestMapping(value = "/common/customer",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResponseCommonCustomer> getCustomer() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"data\" : {    \"person\" : {      \"middleNames\" : [ \"middleNames\", \"middleNames\" ],      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"occupationCode\" : \"occupationCode\",      \"prefix\" : \"prefix\",      \"suffix\" : \"suffix\",      \"lastUpdateTime\" : \"lastUpdateTime\"    },    \"organisation\" : {      \"agentRole\" : \"agentRole\",      \"agentLastName\" : \"agentLastName\",      \"establishmentDate\" : \"establishmentDate\",      \"businessName\" : \"businessName\",      \"registeredCountry\" : \"registeredCountry\",      \"abn\" : \"abn\",      \"acn\" : \"acn\",      \"industryCode\" : \"industryCode\",      \"organisationType\" : \"SOLE_TRADER\",      \"legalName\" : \"legalName\",      \"isACNCRegistered\" : true,      \"agentFirstName\" : \"agentFirstName\",      \"shortName\" : \"shortName\",      \"lastUpdateTime\" : \"lastUpdateTime\"    },    \"customerUType\" : \"person\"  },  \"meta\" : \"{}\",  \"links\" : {    \"self\" : \"self\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Get Customer Detail", nickname = "getCustomerDetail", notes = "Obtain detailed information on the authorised customer within the current session.", response = ResponseCommonCustomerDetailed.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = {
            @AuthorizationScope(scope = "accounts", description = "Read accounts information"),
            @AuthorizationScope(scope = "direct-debits", description = "Read direct debits information"),
            @AuthorizationScope(scope = "payees", description = "Read payees information"),
            @AuthorizationScope(scope = "products", description = "Read products information"),
            @AuthorizationScope(scope = "customer", description = "Read customer information")
            })
    }, tags={ "Customer", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ResponseCommonCustomerDetailed.class) })
    @RequestMapping(value = "/common/customer/detail",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ResponseCommonCustomerDetailed> getCustomerDetail() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"data\" : {    \"customerUType\" : \"person\"  },  \"meta\" : \"{}\",  \"links\" : {    \"self\" : \"self\"  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
