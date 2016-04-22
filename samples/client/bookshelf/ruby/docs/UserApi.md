# SwaggerClient::UserApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_user**](UserApi.md#add_user) | **POST** /user | Creates an user
[**delete_by_id**](UserApi.md#delete_by_id) | **DELETE** /user/id/{id} | Deletes the user which has supplied id
[**delete_by_name**](UserApi.md#delete_by_name) | **DELETE** /user/username/{username} | Deletes the user which has supplied username
[**get_user**](UserApi.md#get_user) | **GET** /user/id/{id} | Retrieves user details by user id
[**get_user_by_name**](UserApi.md#get_user_by_name) | **GET** /user/username/{username} | Retrieves user details by username
[**get_users**](UserApi.md#get_users) | **GET** /users | Retrieves list of users
[**put_for_id**](UserApi.md#put_for_id) | **PUT** /user/id/{id} | Updates user details
[**put_for_name**](UserApi.md#put_for_name) | **PUT** /user/username/{username} | Updates user details


# **add_user**
> add_user(body, authorization)

Creates an user

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

body = SwaggerClient::NewUser.new # NewUser | User object which needs to be created.

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Creates an user
  api_instance.add_user(body, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->add_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NewUser**](NewUser.md)| User object which needs to be created. | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_by_id**
> delete_by_id(id, authorization)

Deletes the user which has supplied id

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

id = "id_example" # String | Id of user to be deleted

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Deletes the user which has supplied id
  api_instance.delete_by_id(id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->delete_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of user to be deleted | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **delete_by_name**
> delete_by_name(username, authorization)

Deletes the user which has supplied username

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

username = "username_example" # String | Name of user to be deleted

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Deletes the user which has supplied username
  api_instance.delete_by_name(username, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->delete_by_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Name of user to be deleted | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_user**
> get_user(id, authorization)

Retrieves user details by user id

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

id = "id_example" # String | Id of user to be retrieved

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Retrieves user details by user id
  api_instance.get_user(id, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->get_user: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of user to be retrieved | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_user_by_name**
> get_user_by_name(username, authorization)

Retrieves user details by username

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

username = "username_example" # String | Name of user to be retrieved

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Retrieves user details by username
  api_instance.get_user_by_name(username, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->get_user_by_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Name of user to be retrieved | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_users**
> get_users(authorization, opts)

Retrieves list of users

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 

opts = { 
  limit: 56, # Integer | Number of users to be retrieved
  page: 56 # Integer | Page number from where we want to start fetching users.
}

begin
  #Retrieves list of users
  api_instance.get_users(authorization, opts)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->get_users: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 
 **limit** | [**Integer**](.md)| Number of users to be retrieved | [optional] 
 **page** | [**Integer**](.md)| Page number from where we want to start fetching users. | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **put_for_id**
> put_for_id(id, body, authorization)

Updates user details

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

id = "id_example" # String | Id of user to be modified

body = SwaggerClient::Body.new # Body | User object details which needs to be updated

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Updates user details
  api_instance.put_for_id(id, body, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->put_for_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of user to be modified | 
 **body** | [**Body**](Body.md)| User object details which needs to be updated | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **put_for_name**
> put_for_name(username, body, authorization)

Updates user details

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::UserApi.new

username = "username_example" # String | Name of user to be modified

body = SwaggerClient::Body1.new # Body1 | User object details which needs to be updated

authorization = "authorization_example" # String | Token which needs to be sent as \"Authorization: Bearer XXXXXX\" 


begin
  #Updates user details
  api_instance.put_for_name(username, body, authorization)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling UserApi->put_for_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| Name of user to be modified | 
 **body** | [**Body1**](Body1.md)| User object details which needs to be updated | 
 **authorization** | **String**| Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP reuqest headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



