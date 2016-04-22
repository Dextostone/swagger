# SwaggerClient::BookStatusApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**current_status_of_book**](BookStatusApi.md#current_status_of_book) | **GET** /book/status/{bookId} | Current status of the book


# **current_status_of_book**
> current_status_of_book(book_id, authorization, opts)

Current status of the book

Returns current status of the book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookStatusApi.new

book_id = "book_id_example" # String | The id of book which is requested.

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

opts = { 
  fields: ["fields_example"] # Array<String> | List of fields which you want as part of response instead of complete status
}

begin
  #Current status of the book
  api_instance.current_status_of_book(book_id, authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookStatusApi->current_status_of_book: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book which is requested. | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **fields** | [**Array&lt;String&gt;**](String.md)| List of fields which you want as part of response instead of complete status | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



