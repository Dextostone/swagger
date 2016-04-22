# SwaggerClient::UserReportsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_borrowed_books_by_user**](UserReportsApi.md#get_borrowed_books_by_user) | **GET** /user/reports/borrowed-books | Returns list of books borrowed by the current logged-in user or list of books user is currently reading
[**get_lent_books_by_user**](UserReportsApi.md#get_lent_books_by_user) | **GET** /user/reports/lent-books | Returns list of books lent by the current logged-in user.
[**get_lost_books_by_user**](UserReportsApi.md#get_lost_books_by_user) | **GET** /user/reports/lost-books | Returns list of books lost by the current logged-in user
[**get_requested_books_by_user**](UserReportsApi.md#get_requested_books_by_user) | **GET** /user/reports/requested-books | Returns list of books requested by the current logged-in user
[**get_returned_books_by_user**](UserReportsApi.md#get_returned_books_by_user) | **GET** /user/reports/returned-books | Returns list of books read by the current logged-in user


# **get_borrowed_books_by_user**
> get_borrowed_books_by_user(opts)

Returns list of books borrowed by the current logged-in user or list of books user is currently reading

Returns list of books borrowed by the user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserReportsApi.new

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books
}

begin
  #Returns list of books borrowed by the current logged-in user or list of books user is currently reading
  api_instance.get_borrowed_books_by_user(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserReportsApi->get_borrowed_books_by_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_lent_books_by_user**
> get_lent_books_by_user(opts)

Returns list of books lent by the current logged-in user.

Returns list of books lent by the user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserReportsApi.new

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books.
}

begin
  #Returns list of books lent by the current logged-in user.
  api_instance.get_lent_books_by_user(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserReportsApi->get_lent_books_by_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_lost_books_by_user**
> get_lost_books_by_user(opts)

Returns list of books lost by the current logged-in user

Returns list of books lost by the user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserReportsApi.new

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books.
}

begin
  #Returns list of books lost by the current logged-in user
  api_instance.get_lost_books_by_user(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserReportsApi->get_lost_books_by_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_requested_books_by_user**
> get_requested_books_by_user(opts)

Returns list of books requested by the current logged-in user

Returns list of books requested by the user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserReportsApi.new

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books.
}

begin
  #Returns list of books requested by the current logged-in user
  api_instance.get_requested_books_by_user(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserReportsApi->get_requested_books_by_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_returned_books_by_user**
> get_returned_books_by_user(opts)

Returns list of books read by the current logged-in user

Returns list of books read by the user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserReportsApi.new

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books.
}

begin
  #Returns list of books read by the current logged-in user
  api_instance.get_returned_books_by_user(opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserReportsApi->get_returned_books_by_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



