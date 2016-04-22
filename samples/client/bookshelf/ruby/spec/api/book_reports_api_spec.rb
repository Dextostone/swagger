=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::BookReportsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BookReportsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::BookReportsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BookReportsApi' do
    it 'should create an instact of BookReportsApi' do
      @instance.should be_a(SwaggerClient::BookReportsApi)
    end
  end

  # unit tests for get_most_read_book
  # Returns most read book
  # Returns most read book
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit Number of books to be retrieved per page
  # @option opts [Integer] :number_of_books Total number of books to be retrieved
  # @option opts [Integer] :page Page number from where we want to start fetching books.
  # @return [nil]
  describe 'get_most_read_book test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_recently_added_book
  # Returns recently added book
  # Returns recently added book
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'get_recently_added_book test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

end
