=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::BookStatusApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BookStatusApi' do
  before do
    # run before each test
    @instance = SwaggerClient::BookStatusApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BookStatusApi' do
    it 'should create an instact of BookStatusApi' do
      @instance.should be_a(SwaggerClient::BookStatusApi)
    end
  end

  # unit tests for current_status_of_book
  # Current status of the book
  # Returns current status of the book
  # @param book_id The id of book which is requested.
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @option opts [Array<String>] :fields List of fields which you want as part of response instead of complete status
  # @return [nil]
  describe 'current_status_of_book test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

end
