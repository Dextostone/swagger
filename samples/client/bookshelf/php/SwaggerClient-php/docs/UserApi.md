# Swagger\Client\UserApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](UserApi.md#addUser) | **POST** /user | Creates an user
[**deleteById**](UserApi.md#deleteById) | **DELETE** /user/id/{id} | Deletes the user which has supplied id
[**deleteByName**](UserApi.md#deleteByName) | **DELETE** /user/username/{username} | Deletes the user which has supplied username
[**getUser**](UserApi.md#getUser) | **GET** /user/id/{id} | Retrieves user details by user id
[**getUserByName**](UserApi.md#getUserByName) | **GET** /user/username/{username} | Retrieves user details by username
[**getUsers**](UserApi.md#getUsers) | **GET** /users | Retrieves list of users
[**putForId**](UserApi.md#putForId) | **PUT** /user/id/{id} | Updates user details
[**putForName**](UserApi.md#putForName) | **PUT** /user/username/{username} | Updates user details


# **addUser**
> addUser($body, $authorization)

Creates an user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$body = new \Swagger\Client\Model\NewUser(); // \Swagger\Client\Model\NewUser | User object which needs to be created.
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->addUser($body, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->addUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\NewUser**](\Swagger\Client\Model\NewUser.md)| User object which needs to be created. | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteById**
> deleteById($id, $authorization)

Deletes the user which has supplied id

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$id = "id_example"; // string | Id of user to be deleted
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->deleteById($id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->deleteById: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Id of user to be deleted | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteByName**
> deleteByName($username, $authorization)

Deletes the user which has supplied username

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$username = "username_example"; // string | Name of user to be deleted
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->deleteByName($username, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->deleteByName: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| Name of user to be deleted | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUser**
> getUser($id, $authorization)

Retrieves user details by user id

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$id = "id_example"; // string | Id of user to be retrieved
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->getUser($id, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getUser: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Id of user to be retrieved | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserByName**
> getUserByName($username, $authorization)

Retrieves user details by username

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$username = "username_example"; // string | Name of user to be retrieved
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->getUserByName($username, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getUserByName: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| Name of user to be retrieved | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUsers**
> getUsers($authorization, $limit, $page)

Retrieves list of users

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 
$limit = 56; // int | Number of users to be retrieved
$page = 56; // int | Page number from where we want to start fetching users.

try { 
    $api_instance->getUsers($authorization, $limit, $page);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getUsers: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**int**](.md)| Number of users to be retrieved | [optional] 
 **page** | [**int**](.md)| Page number from where we want to start fetching users. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **putForId**
> putForId($id, $body, $authorization)

Updates user details

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$id = "id_example"; // string | Id of user to be modified
$body = new \Swagger\Client\Model\Body(); // \Swagger\Client\Model\Body | User object details which needs to be updated
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->putForId($id, $body, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->putForId: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| Id of user to be modified | 
 **body** | [**\Swagger\Client\Model\Body**](\Swagger\Client\Model\Body.md)| User object details which needs to be updated | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **putForName**
> putForName($username, $body, $authorization)

Updates user details

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\UserApi();
$username = "username_example"; // string | Name of user to be modified
$body = new \Swagger\Client\Model\Body1(); // \Swagger\Client\Model\Body1 | User object details which needs to be updated
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->putForName($username, $body, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->putForName: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| Name of user to be modified | 
 **body** | [**\Swagger\Client\Model\Body1**](\Swagger\Client\Model\Body1.md)| User object details which needs to be updated | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

