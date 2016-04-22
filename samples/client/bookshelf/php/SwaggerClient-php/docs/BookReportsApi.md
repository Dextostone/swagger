# Swagger\Client\BookReportsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMostReadBook**](BookReportsApi.md#getMostReadBook) | **GET** /book/reports/most-read | Returns most read book
[**getRecentlyAddedBook**](BookReportsApi.md#getRecentlyAddedBook) | **GET** /book/reports/recently-added | Returns recently added book


# **getMostReadBook**
> getMostReadBook($authorization, $limit, $number_of_books, $page)

Returns most read book

Returns most read book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookReportsApi();
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 
$limit = 56; // int | Number of books to be retrieved per page
$number_of_books = 56; // int | Total number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books.

try { 
    $api_instance->getMostReadBook($authorization, $limit, $number_of_books, $page);
} catch (Exception $e) {
    echo 'Exception when calling BookReportsApi->getMostReadBook: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**int**](.md)| Number of books to be retrieved per page | [optional] 
 **number_of_books** | [**int**](.md)| Total number of books to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching books. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getRecentlyAddedBook**
> getRecentlyAddedBook()

Returns recently added book

Returns recently added book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookReportsApi();

try { 
    $api_instance->getRecentlyAddedBook();
} catch (Exception $e) {
    echo 'Exception when calling BookReportsApi->getRecentlyAddedBook: ', $e->getMessage(), "\n";
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

