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
public class BookStatusApi {
  private ApiClient apiClient;

  public BookStatusApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BookStatusApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Current status of the book
   * Returns current status of the book
   * @param bookId The id of book which is requested. (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @param fields List of fields which you want as part of response instead of complete status (optional)
   * @throws ApiException if fails to make API call
   */
  public void currentStatusOfBook(String bookId, String authorization, List<String> fields) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling currentStatusOfBook");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling currentStatusOfBook");
    }
    
    // create path and map variables
    String localVarPath = "/book/status/{bookId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "bookId" + "\\}", apiClient.escapeString(bookId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));
    

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));
    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
