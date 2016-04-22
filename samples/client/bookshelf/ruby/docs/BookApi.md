# SwaggerClient::BookApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_book**](BookApi.md#add_book) | **POST** /book | Creates a book
[**delete**](BookApi.md#delete) | **DELETE** /book/{bookId} | Deletes book details
[**get_book_by_id**](BookApi.md#get_book_by_id) | **GET** /book/{bookId} | Retrieves a book
[**get_books**](BookApi.md#get_books) | **GET** /books | Retrieves list of books
[**put**](BookApi.md#put) | **PUT** /book/{bookId} | Updates book details


# **add_book**
> add_book(body, authorization)

Creates a book

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookApi.new

body = SwaggerClient::NewBook.new # NewBook | Book object which needs to be added to the library

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Creates a book
  api_instance.add_book(body, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookApi->add_book: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewBook**](NewBook.md)| Book object which needs to be added to the library | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete**
> delete(book_id, authorization)

Deletes book details

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookApi.new

book_id = "book_id_example" # String | Id of the book to be modified

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Deletes book details
  api_instance.delete(book_id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookApi->delete: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| Id of the book to be modified | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_book_by_id**
> get_book_by_id(book_id, authorization)

Retrieves a book

Retrieves book details by id

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookApi.new

book_id = "book_id_example" # String | The id of book to be retrieved

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Retrieves a book
  api_instance.get_book_by_id(book_id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookApi->get_book_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| The id of book to be retrieved | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_books**
> get_books(authorization, opts)

Retrieves list of books

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookApi.new

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

opts = { 
  limit: 56, # Integer | Number of books to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching books.
}

begin
  #Retrieves list of books
  api_instance.get_books(authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookApi->get_books: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**Integer**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **put**
> put(book_id, body, authorization)

Updates book details

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::BookApi.new

book_id = "book_id_example" # String | Id of the book to be modified

body = SwaggerClient::NewBook.new # NewBook | Book object details which needs to be updated

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Updates book details
  api_instance.put(book_id, body, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling BookApi->put: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **String**| Id of the book to be modified | 
 **body** | [**NewBook**](NewBook.md)| Book object details which needs to be updated | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



