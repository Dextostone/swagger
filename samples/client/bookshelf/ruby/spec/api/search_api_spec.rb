=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::SearchApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'SearchApi' do
  before do
    # run before each test
    @instance = SwaggerClient::SearchApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of SearchApi' do
    it 'should create an instact of SearchApi' do
      @instance.should be_a(SwaggerClient::SearchApi)
    end
  end

  # unit tests for search
  # Returns list of entities matching the searched query string
  # Returns list of entities matching the searched query string
  # @param q Search string
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit Number of searched records to be retrieved
  # @option opts [Integer] :page Page number from where we want to start fetching searched  records
  # @return [nil]
  describe 'search test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

end
