# coding: utf-8

"""
BookRequestApi.py
Copyright 2016 SmartBear Software

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
"""

from __future__ import absolute_import

import sys
import os

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class BookRequestApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def approve_book_request(self, book_id, user_id, authorization, **kwargs):
        """
        Lend a book
        Approve the request for borrowing book

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.approve_book_request(book_id, user_id, authorization, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str book_id: The id of book which is requested. (required)
        :param str user_id: The id of user whose request needs to be approved. (required)
        :param str authorization: Token which needs to be sent as \"Authorization: Bearer XXXXXX\"  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['book_id', 'user_id', 'authorization']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method approve_book_request" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'book_id' is set
        if ('book_id' not in params) or (params['book_id'] is None):
            raise ValueError("Missing the required parameter `book_id` when calling `approve_book_request`")
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params) or (params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `approve_book_request`")
        # verify the required parameter 'authorization' is set
        if ('authorization' not in params) or (params['authorization'] is None):
            raise ValueError("Missing the required parameter `authorization` when calling `approve_book_request`")

        resource_path = '/book/request/approve/{bookId}/{userId}'.replace('{format}', 'json')
        path_params = {}
        if 'book_id' in params:
            path_params['bookId'] = params['book_id']
        if 'user_id' in params:
            path_params['userId'] = params['user_id']

        query_params = {}

        header_params = {}
        if 'authorization' in params:
            header_params['Authorization'] = params['authorization']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept([])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'PUT',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def reject_book_request(self, book_id, user_id, authorization, **kwargs):
        """
        Reject the request for borrowing a book
        Reject the request for borrowing book

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.reject_book_request(book_id, user_id, authorization, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str book_id: The id of book whose request needs to be rejected. (required)
        :param str user_id: The id of user whose request needs to be rejected. (required)
        :param str authorization: Token which needs to be sent as \"Authorization: Bearer XXXXXX\"  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['book_id', 'user_id', 'authorization']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method reject_book_request" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'book_id' is set
        if ('book_id' not in params) or (params['book_id'] is None):
            raise ValueError("Missing the required parameter `book_id` when calling `reject_book_request`")
        # verify the required parameter 'user_id' is set
        if ('user_id' not in params) or (params['user_id'] is None):
            raise ValueError("Missing the required parameter `user_id` when calling `reject_book_request`")
        # verify the required parameter 'authorization' is set
        if ('authorization' not in params) or (params['authorization'] is None):
            raise ValueError("Missing the required parameter `authorization` when calling `reject_book_request`")

        resource_path = '/book/request/reject/{bookId}/{userId}'.replace('{format}', 'json')
        path_params = {}
        if 'book_id' in params:
            path_params['bookId'] = params['book_id']
        if 'user_id' in params:
            path_params['userId'] = params['user_id']

        query_params = {}

        header_params = {}
        if 'authorization' in params:
            header_params['Authorization'] = params['authorization']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept([])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'PUT',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def request_book(self, book_id, authorization, **kwargs):
        """
        Borrow a book
        Send a request to borrow a book

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.request_book(book_id, authorization, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str book_id: The id of book which is requested. (required)
        :param str authorization: Token which needs to be sent as \"Authorization: Bearer XXXXXX\"  (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['book_id', 'authorization']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method request_book" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'book_id' is set
        if ('book_id' not in params) or (params['book_id'] is None):
            raise ValueError("Missing the required parameter `book_id` when calling `request_book`")
        # verify the required parameter 'authorization' is set
        if ('authorization' not in params) or (params['authorization'] is None):
            raise ValueError("Missing the required parameter `authorization` when calling `request_book`")

        resource_path = '/book/request/{bookId}'.replace('{format}', 'json')
        path_params = {}
        if 'book_id' in params:
            path_params['bookId'] = params['book_id']

        query_params = {}

        header_params = {}
        if 'authorization' in params:
            header_params['Authorization'] = params['authorization']

        form_params = []
        local_var_files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept([])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type([])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, 'PUT',
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=local_var_files,
                                            response_type=None,
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response