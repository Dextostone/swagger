package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.NewBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class BookApi {
  private ApiClient apiClient;

  public BookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Creates a book
   * 
   * @param body Book object which needs to be added to the library (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void addBook(NewBook body, String authorization) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addBook");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling addBook");
    }
    
    // create path and map variables
    String localVarPath = "/book".replaceAll("\\{format\\}","json");

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

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Deletes book details
   * 
   * @param bookId Id of the book to be modified (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(String bookId, String authorization) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling delete");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/book/{bookId}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Retrieves a book
   * Retrieves book details by id
   * @param bookId The id of book to be retrieved (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void getBookById(String bookId, String authorization) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling getBookById");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getBookById");
    }
    
    // create path and map variables
    String localVarPath = "/book/{bookId}".replaceAll("\\{format\\}","json")
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

    
    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Retrieves list of books
   * 
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @param limit Number of books to be retrieved (optional)
   * @param page Page number from where we want to start fetching books. (optional)
   * @throws ApiException if fails to make API call
   */
  public void getBooks(String authorization, Integer limit, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling getBooks");
    }
    
    // create path and map variables
    String localVarPath = "/books".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    

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
  
  /**
   * Updates book details
   * 
   * @param bookId Id of the book to be modified (required)
   * @param body Book object details which needs to be updated (required)
   * @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
   * @throws ApiException if fails to make API call
   */
  public void put(String bookId, NewBook body, String authorization) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'bookId' is set
    if (bookId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookId' when calling put");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling put");
    }
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling put");
    }
    
    // create path and map variables
    String localVarPath = "/book/{bookId}".replaceAll("\\{format\\}","json")
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
