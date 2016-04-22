# Swagger\Client\BookApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBook**](BookApi.md#addBook) | **POST** /book | Creates a book
[**delete**](BookApi.md#delete) | **DELETE** /book/{bookId} | Deletes book details
[**getBookById**](BookApi.md#getBookById) | **GET** /book/{bookId} | Retrieves a book
[**getBooks**](BookApi.md#getBooks) | **GET** /books | Retrieves list of books
[**put**](BookApi.md#put) | **PUT** /book/{bookId} | Updates book details


# **addBook**
> addBook($body, $authorization)

Creates a book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookApi();
$body = new \Swagger\Client\Model\NewBook(); // \Swagger\Client\Model\NewBook | Book object which needs to be added to the library
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->addBook($body, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookApi->addBook: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NewBook**](\Swagger\Client\Model\NewBook.md)| Book object which needs to be added to the library | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete**
> delete($book_id, $authorization)

Deletes book details

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookApi();
$book_id = "book_id_example"; // string | Id of the book to be modified
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->delete($book_id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookApi->delete: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| Id of the book to be modified | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBookById**
> getBookById($book_id, $authorization)

Retrieves a book

Retrieves book details by id

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookApi();
$book_id = "book_id_example"; // string | The id of book to be retrieved
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->getBookById($book_id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookApi->getBookById: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book to be retrieved | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBooks**
> getBooks($authorization, $limit, $page)

Retrieves list of books

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookApi();
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books.

try { 
    $api_instance->getBooks($authorization, $limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling BookApi->getBooks: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**int**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put**
> put($book_id, $body, $authorization)

Updates book details

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookApi();
$book_id = "book_id_example"; // string | Id of the book to be modified
$body = new \Swagger\Client\Model\NewBook(); // \Swagger\Client\Model\NewBook | Book object details which needs to be updated
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->put($book_id, $body, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookApi->put: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| Id of the book to be modified | 
 **body** | [**\Swagger\Client\Model\NewBook**](\Swagger\Client\Model\NewBook.md)| Book object details which needs to be updated | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

