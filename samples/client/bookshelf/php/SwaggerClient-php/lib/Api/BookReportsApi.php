<?php
/**
 * BookReportsApi
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
 * BookReportsApi Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class BookReportsApi
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
     * @return BookReportsApi
     */
    public function setApiClient(ApiClient $apiClient)
    {
        $this->apiClient = $apiClient;
        return $this;
    }
  
    
    /**
     * getMostReadBook
     *
     * Returns most read book
     *
     * @param string $authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
     * @param int $limit Number of books to be retrieved per page (optional)
     * @param int $number_of_books Total number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books. (optional)
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function getMostReadBook($authorization, $limit = null, $number_of_books = null, $page = null)
    {
        list($response, $statusCode, $httpHeader) = $this->getMostReadBookWithHttpInfo ($authorization, $limit, $number_of_books, $page);
        return $response; 
    }


    /**
     * getMostReadBookWithHttpInfo
     *
     * Returns most read book
     *
     * @param string $authorization Token which needs to be sent as \&quot;Authorization: Bearer XXXXXX\&quot;  (required)
     * @param int $limit Number of books to be retrieved per page (optional)
     * @param int $number_of_books Total number of books to be retrieved (optional)
     * @param int $page Page number from where we want to start fetching books. (optional)
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function getMostReadBookWithHttpInfo($authorization, $limit = null, $number_of_books = null, $page = null)
    {
        
        // verify the required parameter 'authorization' is set
        if ($authorization === null) {
            throw new \InvalidArgumentException('Missing the required parameter $authorization when calling getMostReadBook');
        }
  
        // parse inputs
        $resourcePath = "/book/reports/most-read";
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
        
        if ($number_of_books !== null) {
            $queryParams['numberOfBooks'] = $this->apiClient->getSerializer()->toQueryValue($number_of_books);
        }// query params
        
        if ($page !== null) {
            $queryParams['page'] = $this->apiClient->getSerializer()->toQueryValue($page);
        }
        // header params
        
        if ($authorization !== null) {
            $headerParams['Authorization'] = $this->apiClient->getSerializer()->toHeaderValue($authorization);
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
     * getRecentlyAddedBook
     *
     * Returns recently added book
     *
     * @return void
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function getRecentlyAddedBook()
    {
        list($response, $statusCode, $httpHeader) = $this->getRecentlyAddedBookWithHttpInfo ();
        return $response; 
    }


    /**
     * getRecentlyAddedBookWithHttpInfo
     *
     * Returns recently added book
     *
     * @return Array of null, HTTP status code, HTTP response headers (array of strings)
     * @throws \Swagger\Client\ApiException on non-2xx response
     */
    public function getRecentlyAddedBookWithHttpInfo()
    {
        
  
        // parse inputs
        $resourcePath = "/book/reports/recently-added";
        $httpBody = '';
        $queryParams = array();
        $headerParams = array();
        $formParams = array();
        $_header_accept = ApiClient::selectHeaderAccept(array());
        if (!is_null($_header_accept)) {
            $headerParams['Accept'] = $_header_accept;
        }
        $headerParams['Content-Type'] = ApiClient::selectHeaderContentType(array());
  
        
        
        
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