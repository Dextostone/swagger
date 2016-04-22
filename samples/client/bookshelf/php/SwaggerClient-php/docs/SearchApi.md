# Swagger\Client\SearchApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search | Returns list of entities matching the searched query string


# **search**
> search($q, $authorization, $limit, $page)

Returns list of entities matching the searched query string

Returns list of entities matching the searched query string

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\SearchApi();
$q = "q_example"; // string | Search string
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 
$limit = 56; // int | Number of searched records to be retrieved
$page = 56; // int | Page number from where we want to start fetching searched  records

try { 
    $api_instance->search($q, $authorization, $limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->search: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **string**| Search string | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**int**](.md)| Number of searched records to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching searched  records | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

