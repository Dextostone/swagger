# SwaggerClient::BookReportsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_most_read_book**](BookReportsApi.md#get_most_read_book) | **GET** /book/reports/most-read | Returns most read book
[**get_recently_added_book**](BookReportsApi.md#get_recently_added_book) | **GET** /book/reports/recently-added | Returns recently added book


# **get_most_read_book**
> get_most_read_book(authorization, opts)

Returns most read book

Returns most read book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookReportsApi.new

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

opts = { 
  limit: 56, # Integer | Number of books to be retrieved per page
  number_of_books: 56, # Integer | Total number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books.
}

begin
  #Returns most read book
  api_instance.get_most_read_book(authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookReportsApi->get_most_read_book: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**Integer**](.md)| Number of books to be retrieved per page | [optional] 
 **number_of_books** | [**Integer**](.md)| Total number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_recently_added_book**
> get_recently_added_book

Returns recently added book

Returns recently added book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookReportsApi.new

begin
  #Returns recently added book
  api_instance.get_recently_added_book
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookReportsApi->get_recently_added_book: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



