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
public class BookRequestApi {
  private ApiClient apiClient;

  public BookRequestApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BookRequestApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Lend a book
   * Approve the request for borrowing book
   * @param bookId The id of book which is requested. (required)
   * @param userId The id of user whose request needs to be approved. (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void approveBookRequest(String bookId, String userId, String authorization) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling approveBookRequest");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling approveBookRequest");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling approveBookRequest");
    }
    
    // create path and map variables
    String localVarPath = "/book/request/approve/{bookId}/{userId}".replaceAll("\\{format\\}","json")
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
  
  /**
   * Reject the request for borrowing a book
   * Reject the request for borrowing book
   * @param bookId The id of book whose request needs to be rejected. (required)
   * @param userId The id of user whose request needs to be rejected. (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void rejectBookRequest(String bookId, String userId, String authorization) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling rejectBookRequest");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling rejectBookRequest");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling rejectBookRequest");
    }
    
    // create path and map variables
    String localVarPath = "/book/request/reject/{bookId}/{userId}".replaceAll("\\{format\\}","json")
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
  
  /**
   * Borrow a book
   * Send a request to borrow a book
   * @param bookId The id of book which is requested. (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void requestBook(String bookId, String authorization) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling requestBook");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling requestBook");
    }
    
    // create path and map variables
    String localVarPath = "/book/request/{bookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookId" + "\\}", apiClient.escapeString(bookId.toString()));

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
