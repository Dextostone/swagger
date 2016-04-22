# Swagger\Client\BookRequestApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveBookRequest**](BookRequestApi.md#approveBookRequest) | **PUT** /book/request/approve/{bookId}/{userId} | Lend a book
[**rejectBookRequest**](BookRequestApi.md#rejectBookRequest) | **PUT** /book/request/reject/{bookId}/{userId} | Reject the request for borrowing a book
[**requestBook**](BookRequestApi.md#requestBook) | **PUT** /book/request/{bookId} | Borrow a book


# **approveBookRequest**
> approveBookRequest($book_id, $user_id, $authorization)

Lend a book

Approve the request for borrowing book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookRequestApi();
$book_id = "book_id_example"; // string | The id of book which is requested.
$user_id = "user_id_example"; // string | The id of user whose request needs to be approved.
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->approveBookRequest($book_id, $user_id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookRequestApi->approveBookRequest: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book which is requested. | 
 **user_id** | **string**| The id of user whose request needs to be approved. | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **rejectBookRequest**
> rejectBookRequest($book_id, $user_id, $authorization)

Reject the request for borrowing a book

Reject the request for borrowing book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookRequestApi();
$book_id = "book_id_example"; // string | The id of book whose request needs to be rejected.
$user_id = "user_id_example"; // string | The id of user whose request needs to be rejected.
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->rejectBookRequest($book_id, $user_id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookRequestApi->rejectBookRequest: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book whose request needs to be rejected. | 
 **user_id** | **string**| The id of user whose request needs to be rejected. | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **requestBook**
> requestBook($book_id, $authorization)

Borrow a book

Send a request to borrow a book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookRequestApi();
$book_id = "book_id_example"; // string | The id of book which is requested.
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->requestBook($book_id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookRequestApi->requestBook: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book which is requested. | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

