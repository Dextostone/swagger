=begin
Book Sharing API

This is a backend for distributed library application

OpenAPI spec version: 1.0.0

Generated by: https://github.com/swagger-api/swagger-codegen.git


=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::BookApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'BookApi' do
  before do
    # run before each test
    @instance = SwaggerClient::BookApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BookApi' do
    it 'should create an instact of BookApi' do
      @instance.should be_a(SwaggerClient::BookApi)
    end
  end

  # unit tests for add_book
  # Creates a book
  # 
  # @param body Book object which needs to be added to the library
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'add_book test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for delete
  # Deletes book details
  # 
  # @param book_id Id of the book to be modified
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_book_by_id
  # Retrieves a book
  # Retrieves book details by id
  # @param book_id The id of book to be retrieved
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'get_book_by_id test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for get_books
  # Retrieves list of books
  # 
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit Number of books to be retrieved
  # @option opts [Integer] :page Page number from where we want to start fetching books.
  # @return [nil]
  describe 'get_books test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

  # unit tests for put
  # Updates book details
  # 
  # @param book_id Id of the book to be modified
  # @param body Book object details which needs to be updated
  # @param authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot; 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'put test' do
    it "should work" do
      # assertion here
      # should be_a()
      # should be_nil
      # should ==
      # should_not ==
    end
  end

end
