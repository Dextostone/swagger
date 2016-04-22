# Swagger\Client\AuthenticateApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forgotPassword**](AuthenticateApi.md#forgotPassword) | **POST** /authenticate/forgot-password/{username} | Sends an email with the link to reset password
[**login**](AuthenticateApi.md#login) | **POST** /authenticate/login | Authenticates requested user, with valid credentials
[**logout**](AuthenticateApi.md#logout) | **POST** /authenticate/logout | Logout current logged-in user
[**resetPassword**](AuthenticateApi.md#resetPassword) | **GET** /authenticate/reset-password/{token} | Randomely generates the password and sets the password for user identified by token
[**revokeToken**](AuthenticateApi.md#revokeToken) | **PUT** /authenticate/revoke-token/{token} | Revokes the requested token


# **forgotPassword**
> forgotPassword($username)

Sends an email with the link to reset password

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthenticateApi();
$username = "username_example"; // string | Name of the user

try { 
    $api_instance->forgotPassword($username);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticateApi->forgotPassword: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| Name of the user | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **login**
> login($body)

Authenticates requested user, with valid credentials

Authenticates requested user, with valid credentials

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthenticateApi();
$body = new \Swagger\Client\Model\RequestUser(); // \Swagger\Client\Model\RequestUser | The user object with username and password, which needs to signed-in

try { 
    $api_instance->login($body);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticateApi->login: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Swagger\Client\Model\RequestUser**](\Swagger\Client\Model\RequestUser.md)| The user object with username and password, which needs to signed-in | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **logout**
> logout($authorization)

Logout current logged-in user

Logout current logged-in user

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthenticateApi();
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->logout($authorization);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticateApi->logout: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resetPassword**
> resetPassword($token)

Randomely generates the password and sets the password for user identified by token

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthenticateApi();
$token = "token_example"; // string | Token to identify the user

try { 
    $api_instance->resetPassword($token);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticateApi->resetPassword: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token to identify the user | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **revokeToken**
> revokeToken($token, $authorization)

Revokes the requested token

### Example 
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$api_instance = new Swagger\Client\Api\AuthenticateApi();
$token = "token_example"; // string | Token which needs to be revoked
$authorization = "authorization_example"; // string | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

try { 
    $api_instance->revokeToken($token, $authorization);
} catch (Exception $e) {
    echo 'Exception when calling AuthenticateApi->revokeToken: ', $e->getMessage(), "\n";
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token which needs to be revoked | 
 **authorization** | **string**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

