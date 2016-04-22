# Swagger\Client\BookSearchApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchByAuthor**](BookSearchApi.md#searchByAuthor) | **GET** /book/search/by-author | Returns list of books written by the requested author{s}
[**searchByTags**](BookSearchApi.md#searchByTags) | **GET** /book/search/by-tags | Returns list of books having the requested tag{s}
[**searchLikeName**](BookSearchApi.md#searchLikeName) | **GET** /book/search/like-name/{name} | Returns list of books which have similar requested name


# **searchByAuthor**
> searchByAuthor($author, $limit, $page)

Returns list of books written by the requested author{s}

Returns list of books written by the requested author{s}

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookSearchApi();
$author = array("author_example"); // string[] | Name of the author by which books can be searched
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books

try { 
    $api_instance->searchByAuthor($author, $limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling BookSearchApi->searchByAuthor: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **author** | [**string[]**](string.md)| Name of the author by which books can be searched | 
 **limit** | [**int**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchByTags**
> searchByTags($tags, $limit, $page)

Returns list of books having the requested tag{s}

Returns list of books having the requested tag{s}

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookSearchApi();
$tags = array("tags_example"); // string[] | List of tags by which books can be searched
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books

try { 
    $api_instance->searchByTags($tags, $limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling BookSearchApi->searchByTags: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**string[]**](string.md)| List of tags by which books can be searched | 
 **limit** | [**int**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **searchLikeName**
> searchLikeName($name, $limit, $page)

Returns list of books which have similar requested name

Returns list of books which have similar requested name

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\BookSearchApi();
$name = "name_example"; // string | Name of the book by which books can be searched
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books

try { 
    $api_instance->searchLikeName($name, $limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling BookSearchApi->searchLikeName: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**| Name of the book by which books can be searched | 
 **limit** | [**int**](.md)| Number of books to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching books | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

