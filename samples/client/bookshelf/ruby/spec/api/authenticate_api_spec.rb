=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::AuthenticateApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AuthenticateApi' do
  before do
    # run before each test
    @instance = SwaggerClient::AuthenticateApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AuthenticateApi' do
    it 'should create an instact of AuthenticateApi' do
      @instance.should be_a(SwaggerClient::AuthenticateApi)
    end
  end

  # unit tests for forgot_password
  # Sends an email with the link to reset password
  # 
  # @param username Name of the user
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'forgot_password test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for login
  # Authenticates requested user, with valid credentials
  # Authenticates requested user, with valid credentials
  # @param body The user object with username and password, which needs to signed-in
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'login test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for logout
  # Logout current logged-in user
  # Logout current logged-in user
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'logout test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for reset_password
  # Randomely generates the password and sets the password for user identified by token
  # 
  # @param token Token to identify the user
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'reset_password test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for revoke_token
  # Revokes the requested token
  # 
  # @param token Token which needs to be revoked
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'revoke_token test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

end
