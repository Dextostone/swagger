<?php
/**
 * BookSearchApi
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
/**
 *  Copyright 2016 SmartBear Software
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program. 
 * https://github.com/swagger-api/swagger-codegen 
 * Do not edit the class manually.
 */

namespace Swagger\Client\Api;

use \Swagger\Client\Configuration;
use \Swagger\Client\ApiClient;
use \Swagger\Client\ApiException;
use \Swagger\Client\ObjectSerializer;

/**
 * BookSearchApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class BookSearchApi
{

    /**
     * API Client
     * @var \Swagger\Client\ApiClient instance of the ApiClient
     */
    protected $apiClient;
  
    /**
     * Constructor
     * @param \Swagger\Client\ApiClient|null $apiClient The api client to use
     */
    function __construct($apiClient = null)
    {
        if ($apiClient == null) {
            $apiClient = new ApiClient();
            $apiClient->getConfig()->setHost('https://localhost/api');
        }
  
        $this->apiClient = $apiClient;
    }
  
    /**
     * Get API client
     * @return \Swagger\Client\ApiClient get the API client
     */
    public function getApiClient()
    {
        return $this->apiClient;
    }
  
    /**
     * Set the API client
     * @param \Swagger\Client\ApiClient $apiClient set the API client
     * @return BookSearchApi
     */
    public function setApiClient(ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }
  
    
    /**
     * searchByAuthor
     *
     * Returns list of books written by the requested author{s}
     *
     * @param string[] $author Name of the author by which books can be searched (required)
     * @param int $limit Number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books (optional)
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchByAuthor($author, $limit = null, $page = null)
    {
        list($response, $statusCode, $httpHeader) = $this->searchByAuthorWithHttpInfo ($author, $limit, $page);
        return $response; 
    }


    /**
     * searchByAuthorWithHttpInfo
     *
     * Returns list of books written by the requested author{s}
     *
     * @param string[] $author Name of the author by which books can be searched (required)
     * @param int $limit Number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books (optional)
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchByAuthorWithHttpInfo($author, $limit = null, $page = null)
    {
        
        // verify the required parameter 'author' is set
        if ($author === null) {
            throw new \InvalidArgumentException('Missing the required parameter $author when calling searchByAuthor');
        }
  
        // parse inputs
        $resourcePath = "/book/search/by-author";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = ApiClient::selectHeaderAccept(array());
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());
  
        // query params
        
        if ($limit !== null) {
            $queryParams['limit'] = $this->apiClient->getSerializer()->toQueryValue($limit);
        }// query params
        
        if ($page !== null) {
            $queryParams['page'] = $this->apiClient->getSerializer()->toQueryValue($page);
        }// query params
        
        if (is_array($author)) {
            $author = $this->apiClient->getSerializer()->serializeCollection($author, 'csv', true);
        }
        
        if ($author !== null) {
            $queryParams['author'] = $this->apiClient->getSerializer()->toQueryValue($author);
        }
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        
  
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath, 'GET',
                $queryParams, $httpBody,
                $headerParams
            );
            
            return array(null, $statusCode, $httpHeader);
            
        } catch (ApiException $e) {
            switch ($e->getCode()) { 
            }
  
            throw $e;
        }
    }
    
    /**
     * searchByTags
     *
     * Returns list of books having the requested tag{s}
     *
     * @param string[] $tags List of tags by which books can be searched (required)
     * @param int $limit Number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books (optional)
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchByTags($tags, $limit = null, $page = null)
    {
        list($response, $statusCode, $httpHeader) = $this->searchByTagsWithHttpInfo ($tags, $limit, $page);
        return $response; 
    }


    /**
     * searchByTagsWithHttpInfo
     *
     * Returns list of books having the requested tag{s}
     *
     * @param string[] $tags List of tags by which books can be searched (required)
     * @param int $limit Number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books (optional)
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchByTagsWithHttpInfo($tags, $limit = null, $page = null)
    {
        
        // verify the required parameter 'tags' is set
        if ($tags === null) {
            throw new \InvalidArgumentException('Missing the required parameter $tags when calling searchByTags');
        }
  
        // parse inputs
        $resourcePath = "/book/search/by-tags";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = ApiClient::selectHeaderAccept(array());
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());
  
        // query params
        
        if ($limit !== null) {
            $queryParams['limit'] = $this->apiClient->getSerializer()->toQueryValue($limit);
        }// query params
        
        if ($page !== null) {
            $queryParams['page'] = $this->apiClient->getSerializer()->toQueryValue($page);
        }// query params
        
        if (is_array($tags)) {
            $tags = $this->apiClient->getSerializer()->serializeCollection($tags, 'csv', true);
        }
        
        if ($tags !== null) {
            $queryParams['tags'] = $this->apiClient->getSerializer()->toQueryValue($tags);
        }
        
        
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        
  
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath, 'GET',
                $queryParams, $httpBody,
                $headerParams
            );
            
            return array(null, $statusCode, $httpHeader);
            
        } catch (ApiException $e) {
            switch ($e->getCode()) { 
            }
  
            throw $e;
        }
    }
    
    /**
     * searchLikeName
     *
     * Returns list of books which have similar requested name
     *
     * @param string $name Name of the book by which books can be searched (required)
     * @param int $limit Number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books (optional)
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchLikeName($name, $limit = null, $page = null)
    {
        list($response, $statusCode, $httpHeader) = $this->searchLikeNameWithHttpInfo ($name, $limit, $page);
        return $response; 
    }


    /**
     * searchLikeNameWithHttpInfo
     *
     * Returns list of books which have similar requested name
     *
     * @param string $name Name of the book by which books can be searched (required)
     * @param int $limit Number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books (optional)
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function searchLikeNameWithHttpInfo($name, $limit = null, $page = null)
    {
        
        // verify the required parameter 'name' is set
        if ($name === null) {
            throw new \InvalidArgumentException('Missing the required parameter $name when calling searchLikeName');
        }
  
        // parse inputs
        $resourcePath = "/book/search/like-name/{name}";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = ApiClient::selectHeaderAccept(array());
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());
  
        // query params
        
        if ($limit !== null) {
            $queryParams['limit'] = $this->apiClient->getSerializer()->toQueryValue($limit);
        }// query params
        
        if ($page !== null) {
            $queryParams['page'] = $this->apiClient->getSerializer()->toQueryValue($page);
        }
        
        // path params
        
        if ($name !== null) {
            $resourcePath = str_replace(
                "{" . "name" . "}",
                $this->apiClient->getSerializer()->toPathValue($name),
                $resourcePath
            );
        }
        // default format to json
        $resourcePath = str_replace("{format}", "json", $resourcePath);

        
        
  
        // for model (json/xml)
        if (isset($_tempBody)) {
            $httpBody = $_tempBody; // $_tempBody is the method argument, if present
        } elseif (count($formParams) > 0) {
            $httpBody = $formParams; // for HTTP post (form)
        }
        
        // make the API Call
        try {
            list($response, $statusCode, $httpHeader) = $this->apiClient->callApi(
                $resourcePath, 'GET',
                $queryParams, $httpBody,
                $headerParams
            );
            
            return array(null, $statusCode, $httpHeader);
            
        } catch (ApiException $e) {
            switch ($e->getCode()) { 
            }
  
            throw $e;
        }
    }
    
}
