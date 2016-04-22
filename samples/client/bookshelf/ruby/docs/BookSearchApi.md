# SwaggerClient::BookSearchApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_by_author**](BookSearchApi.md#search_by_author) | **GET** /book/search/by-author | Returns list of books written by the requested author{s}
[**search_by_tags**](BookSearchApi.md#search_by_tags) | **GET** /book/search/by-tags | Returns list of books having the requested tag{s}
[**search_like_name**](BookSearchApi.md#search_like_name) | **GET** /book/search/like-name/{name} | Returns list of books which have similar requested name


# **search_by_author**
> search_by_author(author, opts)

Returns list of books written by the requested author{s}

Returns list of books written by the requested author{s}

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookSearchApi.new

author = ["author_example"] # Array<String> | Name of the author by which books can be searched

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books
}

begin
  #Returns list of books written by the requested author{s}
  api_instance.search_by_author(author, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookSearchApi->search_by_author: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **author** | [**Array&lt;String&gt;**](String.md)| Name of the author by which books can be searched | 
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **search_by_tags**
> search_by_tags(tags, opts)

Returns list of books having the requested tag{s}

Returns list of books having the requested tag{s}

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookSearchApi.new

tags = ["tags_example"] # Array<String> | List of tags by which books can be searched

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books
}

begin
  #Returns list of books having the requested tag{s}
  api_instance.search_by_tags(tags, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookSearchApi->search_by_tags: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**Array&lt;String&gt;**](String.md)| List of tags by which books can be searched | 
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **search_like_name**
> search_like_name(name, opts)

Returns list of books which have similar requested name

Returns list of books which have similar requested name

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookSearchApi.new

name = "name_example" # String | Name of the book by which books can be searched

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books
}

begin
  #Returns list of books which have similar requested name
  api_instance.search_like_name(name, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookSearchApi->search_like_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the book by which books can be searched | 
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



