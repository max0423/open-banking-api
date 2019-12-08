/*
 * Consumer Data Standards
 * API sets created by the Australian Consumer Data Standards to meet the needs of the Consumer Data Right
 *
 * OpenAPI spec version: 1-oas3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openbanking.client.api;

import org.openbanking.client.ApiException;
import org.openbanking.client.api.PayeesApi;
import org.openbanking.client.model.ResponseBankingPayeeDetails;
import org.openbanking.client.model.ResponseBankingPayees;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for PayeesApi
 */
@Ignore
public class PayeesApiTest {

    private final PayeesApi api = new PayeesApi();

    
    /**
     * Get Payee Detail
     *
     * Obtain detailed information on a single payee
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPayeeDetailTest() throws ApiException {
        String payeeId = null;
        ResponseBankingPayeeDetails response = api.getPayeeDetail(payeeId);

        // TODO: test validations
    }
    
    /**
     * Get Payees
     *
     * Obtain a list of pre-registered payees
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPayeesTest() throws ApiException {
        String type = null;
        Integer page = null;
        Integer pageSize = null;
        ResponseBankingPayees response = api.listPayees(type, page, pageSize);

        // TODO: test validations
    }
    
}
