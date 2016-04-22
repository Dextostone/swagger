=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require "uri"

module SwaggerClient
  class BookReturnAndLostOperationsApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Mark lost book
    # Mark borrowed book as lost
    # @param book_id The id of book which is returned
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :user_id The id of user who had borrowed the book. If not provided, the recent borrower will be used as default.
    # @return [nil]
    def mark_book_as_lost(book_id, authorization, opts = {})
      mark_book_as_lost_with_http_info(book_id, authorization, opts)
      return nil
    end

    # Mark lost book
    # Mark borrowed book as lost
    # @param book_id The id of book which is returned
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :user_id The id of user who had borrowed the book. If not provided, the recent borrower will be used as default.
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def mark_book_as_lost_with_http_info(book_id, authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: BookReturnAndLostOperationsApi#mark_book_as_lost ..."
      end
      
      # verify the required parameter 'book_id' is set
      fail "Missing the required parameter 'book_id' when calling mark_book_as_lost" if book_id.nil?
      
      # verify the required parameter 'authorization' is set
      fail "Missing the required parameter 'authorization' when calling mark_book_as_lost" if authorization.nil?
      
      # resource path
      local_var_path = "/book/lost/{bookId}".sub('{format}','json').sub('{' + 'bookId' + '}', book_id.to_s)

      # query parameters
      query_params = {}
      query_params[:'userId'] = opts[:'user_id'] if opts[:'user_id']

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
        @api_client.config.logger.debug "API called: BookReturnAndLostOperationsApi#mark_book_as_lost\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Return Book
    # Return borrowed book
    # @param book_id The id of book which is returned
    # @param user_id The id of user who is returning the book. If not provided current logged in user is used
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def mark_book_as_returned(book_id, user_id, authorization, opts = {})
      mark_book_as_returned_with_http_info(book_id, user_id, authorization, opts)
      return nil
    end

    # Return Book
    # Return borrowed book
    # @param book_id The id of book which is returned
    # @param user_id The id of user who is returning the book. If not provided current logged in user is used
    # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def mark_book_as_returned_with_http_info(book_id, user_id, authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: BookReturnAndLostOperationsApi#mark_book_as_returned ..."
      end
      
      # verify the required parameter 'book_id' is set
      fail "Missing the required parameter 'book_id' when calling mark_book_as_returned" if book_id.nil?
      
      # verify the required parameter 'user_id' is set
      fail "Missing the required parameter 'user_id' when calling mark_book_as_returned" if user_id.nil?
      
      # verify the required parameter 'authorization' is set
      fail "Missing the required parameter 'authorization' when calling mark_book_as_returned" if authorization.nil?
      
      # resource path
      local_var_path = "/book/return/{bookId}/{userId}".sub('{format}','json').sub('{' + 'bookId' + '}', book_id.to_s).sub('{' + 'userId' + '}', user_id.to_s)

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
        @api_client.config.logger.debug "API called: BookReturnAndLostOperationsApi#mark_book_as_returned\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
