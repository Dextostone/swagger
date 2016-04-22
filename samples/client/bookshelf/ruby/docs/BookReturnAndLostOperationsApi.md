# SwaggerClient::BookReturnAndLostOperationsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**mark_book_as_lost**](BookReturnAndLostOperationsApi.md#mark_book_as_lost) | **PUT** /book/lost/{bookId} | Mark lost book
[**mark_book_as_returned**](BookReturnAndLostOperationsApi.md#mark_book_as_returned) | **PUT** /book/return/{bookId}/{userId} | Return Book


# **mark_book_as_lost**
> mark_book_as_lost(book_id, authorization, opts)

Mark lost book

Mark borrowed book as lost

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookReturnAndLostOperationsApi.new

book_id = "book_id_example" # String | The id of book which is returned

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

opts = { 
  user_id: "user_id_example" # String | The id of user who had borrowed the book. If not provided, the recent borrower will be used as default.
}

begin
  #Mark lost book
  api_instance.mark_book_as_lost(book_id, authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookReturnAndLostOperationsApi->mark_book_as_lost: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book which is returned | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **user_id** | **String**| The id of user who had borrowed the book. If not provided, the recent borrower will be used as default. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **mark_book_as_returned**
> mark_book_as_returned(book_id, user_id, authorization)

Return Book

Return borrowed book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookReturnAndLostOperationsApi.new

book_id = "book_id_example" # String | The id of book which is returned

user_id = "user_id_example" # String | The id of user who is returning the book. If not provided current logged in user is used

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Return Book
  api_instance.mark_book_as_returned(book_id, user_id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookReturnAndLostOperationsApi->mark_book_as_returned: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book which is returned | 
 **user_id** | **String**| The id of user who is returning the book. If not provided current logged in user is used | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



