# Swagger\Client\UserReportsApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBorrowedBooksByUser**](UserReportsApi.md#getBorrowedBooksByUser) | **GET** /user/reports/borrowed-books | Returns list of books borrowed by the current logged-in user or list of books user is currently reading
[**getLentBooksByUser**](UserReportsApi.md#getLentBooksByUser) | **GET** /user/reports/lent-books | Returns list of books lent by the current logged-in user.
[**getLostBooksByUser**](UserReportsApi.md#getLostBooksByUser) | **GET** /user/reports/lost-books | Returns list of books lost by the current logged-in user
[**getRequestedBooksByUser**](UserReportsApi.md#getRequestedBooksByUser) | **GET** /user/reports/requested-books | Returns list of books requested by the current logged-in user
[**getReturnedBooksByUser**](UserReportsApi.md#getReturnedBooksByUser) | **GET** /user/reports/returned-books | Returns list of books read by the current logged-in user


# **getBorrowedBooksByUser**
> getBorrowedBooksByUser($limit, $page)

Returns list of books borrowed by the current logged-in user or list of books user is currently reading

Returns list of books borrowed by the user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserReportsApi();
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books

try { 
    $api_instance->getBorrowedBooksByUser($limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling UserReportsApi->getBorrowedBooksByUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **getLentBooksByUser**
> getLentBooksByUser($limit, $page)

Returns list of books lent by the current logged-in user.

Returns list of books lent by the user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserReportsApi();
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books.

try { 
    $api_instance->getLentBooksByUser($limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling UserReportsApi->getLentBooksByUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **getLostBooksByUser**
> getLostBooksByUser($limit, $page)

Returns list of books lost by the current logged-in user

Returns list of books lost by the user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserReportsApi();
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books.

try { 
    $api_instance->getLostBooksByUser($limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling UserReportsApi->getLostBooksByUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **getRequestedBooksByUser**
> getRequestedBooksByUser($limit, $page)

Returns list of books requested by the current logged-in user

Returns list of books requested by the user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserReportsApi();
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books.

try { 
    $api_instance->getRequestedBooksByUser($limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling UserReportsApi->getRequestedBooksByUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

# **getReturnedBooksByUser**
> getReturnedBooksByUser($limit, $page)

Returns list of books read by the current logged-in user

Returns list of books read by the user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserReportsApi();
$limit = 56; // int | Number of books to be retrieved
$page = 56; // int | Page number from where we want to start fetching books.

try { 
    $api_instance->getReturnedBooksByUser($limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling UserReportsApi->getReturnedBooksByUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

