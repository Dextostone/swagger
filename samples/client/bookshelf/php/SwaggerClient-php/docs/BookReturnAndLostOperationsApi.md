# Swagger\Client\BookReturnAndLostOperationsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**markBookAsLost**](BookReturnAndLostOperationsApi.md#markBookAsLost) | **PUT** /book/lost/{bookId} | Mark lost book
[**markBookAsReturned**](BookReturnAndLostOperationsApi.md#markBookAsReturned) | **PUT** /book/return/{bookId}/{userId} | Return Book


# **markBookAsLost**
> markBookAsLost($book_id, $authorization, $user_id)

Mark lost book

Mark borrowed book as lost

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookReturnAndLostOperationsApi();
$book_id = "book_id_example"; // string | The id of book which is returned
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 
$user_id = "user_id_example"; // string | The id of user who had borrowed the book. If not provided, the recent borrower will be used as default.

try { 
    $api_instance->markBookAsLost($book_id, $authorization, $user_id);
} catch (Exception $e) {
    echo 'Exception when calling BookReturnAndLostOperationsApi->markBookAsLost: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book which is returned | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **user_id** | **string**| The id of user who had borrowed the book. If not provided, the recent borrower will be used as default. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **markBookAsReturned**
> markBookAsReturned($book_id, $user_id, $authorization)

Return Book

Return borrowed book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookReturnAndLostOperationsApi();
$book_id = "book_id_example"; // string | The id of book which is returned
$user_id = "user_id_example"; // string | The id of user who is returning the book. If not provided current logged in user is used
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->markBookAsReturned($book_id, $user_id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling BookReturnAndLostOperationsApi->markBookAsReturned: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book which is returned | 
 **user_id** | **string**| The id of user who is returning the book. If not provided current logged in user is used | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

