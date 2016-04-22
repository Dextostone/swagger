package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class BookReturnAndLostOperationsApi {
  private ApiClient apiClient;

  public BookReturnAndLostOperationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BookReturnAndLostOperationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Mark lost book
   * Mark borrowed book as lost
   * @param bookId The id of book which is returned (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @param userId The id of user who had borrowed the book. If not provided, the recent borrower will be used as default. (optional)
   * @throws ApiException if fails to make API call
   */
  public void markBookAsLost(String bookId, String authorization, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling markBookAsLost");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling markBookAsLost");
    }
    
    // create path and map variables
    String localVarPath = "/book/lost/{bookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookId" + "\\}", apiClient.escapeString(bookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Return Book
   * Return borrowed book
   * @param bookId The id of book which is returned (required)
   * @param userId The id of user who is returning the book. If not provided current logged in user is used (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void markBookAsReturned(String bookId, String userId, String authorization) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling markBookAsReturned");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling markBookAsReturned");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling markBookAsReturned");
    }
    
    // create path and map variables
    String localVarPath = "/book/return/{bookId}/{userId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookId" + "\\}", apiClient.escapeString(bookId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
