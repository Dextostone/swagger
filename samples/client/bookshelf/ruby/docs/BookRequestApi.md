# SwaggerClient::BookRequestApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approve_book_request**](BookRequestApi.md#approve_book_request) | **PUT** /book/request/approve/{bookId}/{userId} | Lend a book
[**reject_book_request**](BookRequestApi.md#reject_book_request) | **PUT** /book/request/reject/{bookId}/{userId} | Reject the request for borrowing a book
[**request_book**](BookRequestApi.md#request_book) | **PUT** /book/request/{bookId} | Borrow a book


# **approve_book_request**
> approve_book_request(book_id, user_id, authorization)

Lend a book

Approve the request for borrowing book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookRequestApi.new

book_id = "book_id_example" # String | The id of book which is requested.

user_id = "user_id_example" # String | The id of user whose request needs to be approved.

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Lend a book
  api_instance.approve_book_request(book_id, user_id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookRequestApi->approve_book_request: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book which is requested. | 
 **user_id** | **String**| The id of user whose request needs to be approved. | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **reject_book_request**
> reject_book_request(book_id, user_id, authorization)

Reject the request for borrowing a book

Reject the request for borrowing book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookRequestApi.new

book_id = "book_id_example" # String | The id of book whose request needs to be rejected.

user_id = "user_id_example" # String | The id of user whose request needs to be rejected.

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Reject the request for borrowing a book
  api_instance.reject_book_request(book_id, user_id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookRequestApi->reject_book_request: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book whose request needs to be rejected. | 
 **user_id** | **String**| The id of user whose request needs to be rejected. | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **request_book**
> request_book(book_id, authorization)

Borrow a book

Send a request to borrow a book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookRequestApi.new

book_id = "book_id_example" # String | The id of book which is requested.

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Borrow a book
  api_instance.request_book(book_id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookRequestApi->request_book: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book which is requested. | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



