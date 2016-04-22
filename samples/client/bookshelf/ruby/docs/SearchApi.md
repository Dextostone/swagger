# SwaggerClient::SearchApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search | Returns list of entities matching the searched query string


# **search**
> search(q, authorization, opts)

Returns list of entities matching the searched query string

Returns list of entities matching the searched query string

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::SearchApi.new

q = "q_example" # String | Search string

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

opts = { 
  limit: 56, # Integer | Number of searched records to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching searched  records
}

begin
  #Returns list of entities matching the searched query string
  api_instance.search(q, authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling SearchApi->search: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Search string | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**Integer**](.md)| Number of searched records to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching searched  records | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



