# SwaggerClient::AuthenticateApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**forgot_password**](AuthenticateApi.md#forgot_password) | **POST** /authenticate/forgot-password/{username} | Sends an email with the link to reset password
[**login**](AuthenticateApi.md#login) | **POST** /authenticate/login | Authenticates requested user, with valid credentials
[**logout**](AuthenticateApi.md#logout) | **POST** /authenticate/logout | Logout current logged-in user
[**reset_password**](AuthenticateApi.md#reset_password) | **GET** /authenticate/reset-password/{token} | Randomely generates the password and sets the password for user identified by token
[**revoke_token**](AuthenticateApi.md#revoke_token) | **PUT** /authenticate/revoke-token/{token} | Revokes the requested token


# **forgot_password**
> forgot_password(username)

Sends an email with the link to reset password

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthenticateApi.new

username = "username_example" # String | Name of the user


begin
  #Sends an email with the link to reset password
  api_instance.forgot_password(username)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthenticateApi->forgot_password: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Name of the user | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **login**
> login(body)

Authenticates requested user, with valid credentials

Authenticates requested user, with valid credentials

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthenticateApi.new

body = SwaggerClient::RequestUser.new # RequestUser | The user object with username and password, which needs to signed-in


begin
  #Authenticates requested user, with valid credentials
  api_instance.login(body)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthenticateApi->login: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestUser**](RequestUser.md)| The user object with username and password, which needs to signed-in | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **logout**
> logout(authorization)

Logout current logged-in user

Logout current logged-in user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthenticateApi.new

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Logout current logged-in user
  api_instance.logout(authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthenticateApi->logout: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **reset_password**
> reset_password(token)

Randomely generates the password and sets the password for user identified by token

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthenticateApi.new

token = "token_example" # String | Token to identify the user


begin
  #Randomely generates the password and sets the password for user identified by token
  api_instance.reset_password(token)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthenticateApi->reset_password: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token to identify the user | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **revoke_token**
> revoke_token(token, authorization)

Revokes the requested token

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::AuthenticateApi.new

token = "token_example" # String | Token which needs to be revoked

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Revokes the requested token
  api_instance.revoke_token(token, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AuthenticateApi->revoke_token: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Token which needs to be revoked | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



