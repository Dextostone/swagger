=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require "uri"

module SwaggerClient
  class AuthenticateApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Sends an email with the link to reset password
    # 
    # @param username Name of the user
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def forgot_password(username, opts = {})
      forgot_password_with_http_info(username, opts)
      return nil
    end

    # Sends an email with the link to reset password
    # 
    # @param username Name of the user
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def forgot_password_with_http_info(username, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthenticateApi#forgot_password ..."
      end
      
      # verify the required parameter 'username' is set
      fail "Missing the required parameter 'username' when calling forgot_password" if username.nil?
      
      # resource path
      local_var_path = "/authenticate/forgot-password/{username}".sub('{format}','json').sub('{' + 'username' + '}', username.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = []
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = []
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthenticateApi#forgot_password\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Authenticates requested user, with valid credentials
    # Authenticates requested user, with valid credentials
    # @param body The user object with username and password, which needs to signed-in
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def login(body, opts = {})
      login_with_http_info(body, opts)
      return nil
    end

    # Authenticates requested user, with valid credentials
    # Authenticates requested user, with valid credentials
    # @param body The user object with username and password, which needs to signed-in
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def login_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthenticateApi#login ..."
      end
      
      # verify the required parameter 'body' is set
      fail "Missing the required parameter 'body' when calling login" if body.nil?
      
      # resource path
      local_var_path = "/authenticate/login".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = []
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = []
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(body)
      
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthenticateApi#login\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Logout current logged-in user
    # Logout current logged-in user
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def logout(authorization, opts = {})
      logout_with_http_info(authorization, opts)
      return nil
    end

    # Logout current logged-in user
    # Logout current logged-in user
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def logout_with_http_info(authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthenticateApi#logout ..."
      end
      
      # verify the required parameter 'authorization' is set
      fail "Missing the required parameter 'authorization' when calling logout" if authorization.nil?
      
      # resource path
      local_var_path = "/authenticate/logout".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = []
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = []
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)
      header_params[:'Authorization'] = authorization

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthenticateApi#logout\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Randomely generates the password and sets the password for user identified by token
    # 
    # @param token Token to identify the user
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def reset_password(token, opts = {})
      reset_password_with_http_info(token, opts)
      return nil
    end

    # Randomely generates the password and sets the password for user identified by token
    # 
    # @param token Token to identify the user
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def reset_password_with_http_info(token, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthenticateApi#reset_password ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling reset_password" if token.nil?
      
      # resource path
      local_var_path = "/authenticate/reset-password/{token}".sub('{format}','json').sub('{' + 'token' + '}', token.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = []
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = []
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthenticateApi#reset_password\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Revokes the requested token
    # 
    # @param token Token which needs to be revoked
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def revoke_token(token, authorization, opts = {})
      revoke_token_with_http_info(token, authorization, opts)
      return nil
    end

    # Revokes the requested token
    # 
    # @param token Token which needs to be revoked
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def revoke_token_with_http_info(token, authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthenticateApi#revoke_token ..."
      end
      
      # verify the required parameter 'token' is set
      fail "Missing the required parameter 'token' when calling revoke_token" if token.nil?
      
      # verify the required parameter 'authorization' is set
      fail "Missing the required parameter 'authorization' when calling revoke_token" if authorization.nil?
      
      # resource path
      local_var_path = "/authenticate/revoke-token/{token}".sub('{format}','json').sub('{' + 'token' + '}', token.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}

      # HTTP header 'Accept' (if needed)
      _header_accept = []
      _header_accept_result = @api_client.select_header_accept(_header_accept) and header_params['Accept'] = _header_accept_result

      # HTTP header 'Content-Type'
      _header_content_type = []
      header_params['Content-Type'] = @api_client.select_header_content_type(_header_content_type)
      header_params[:'Authorization'] = authorization

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthenticateApi#revoke_token\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
