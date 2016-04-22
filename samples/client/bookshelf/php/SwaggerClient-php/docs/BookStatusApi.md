# Swagger\Client\BookStatusApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currentStatusOfBook**](BookStatusApi.md#currentStatusOfBook) | **GET** /book/status/{bookId} | Current status of the book


# **currentStatusOfBook**
> currentStatusOfBook($book_id, $authorization, $fields)

Current status of the book

Returns current status of the book

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookStatusApi();
$book_id = "book_id_example"; // string | The id of book which is requested.
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 
$fields = array("fields_example"); // string[] | List of fields which you want as part of response instead of complete status

try { 
    $api_instance->currentStatusOfBook($book_id, $authorization, $fields);
} catch (Exception $e) {
    echo 'Exception when calling BookStatusApi->currentStatusOfBook: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **string**| The id of book which is requested. | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **fields** | [**string[]**](string.md)| List of fields which you want as part of response instead of complete status | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

