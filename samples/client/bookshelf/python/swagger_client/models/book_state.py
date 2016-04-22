# coding: utf-8

"""
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

    Ref: https://github.com/swagger-api/swagger-codegen
"""

from pprint import pformat
from six import iteritems


class BookState(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        BookState - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'book': 'Book',
            'current_status': 'str',
            'uploaded_by': 'ResponseUser',
            'lent_by': 'ResponseUser',
            'lost_by': 'ResponseUser',
            'returned_by': 'ResponseUser',
            'requested_by': 'list[ResponseUser]',
            'created_at': 'datetime',
            'updated_at': 'datetime'
        }

        self.attribute_map = {
            'book': 'book',
            'current_status': 'currentStatus',
            'uploaded_by': 'uploadedBy',
            'lent_by': 'lentBy',
            'lost_by': 'lostBy',
            'returned_by': 'returnedBy',
            'requested_by': 'requestedBy',
            'created_at': 'createdAt',
            'updated_at': 'updatedAt'
        }

        self._book = None
        self._current_status = None
        self._uploaded_by = None
        self._lent_by = None
        self._lost_by = None
        self._returned_by = None
        self._requested_by = None
        self._created_at = None
        self._updated_at = None

    @property
    def book(self):
        """
        Gets the book of this BookState.


        :return: The book of this BookState.
        :rtype: Book
        """
        return self._book

    @book.setter
    def book(self, book):
        """
        Sets the book of this BookState.


        :param book: The book of this BookState.
        :type: Book
        """
        self._book = book

    @property
    def current_status(self):
        """
        Gets the current_status of this BookState.


        :return: The current_status of this BookState.
        :rtype: str
        """
        return self._current_status

    @current_status.setter
    def current_status(self, current_status):
        """
        Sets the current_status of this BookState.


        :param current_status: The current_status of this BookState.
        :type: str
        """
        self._current_status = current_status

    @property
    def uploaded_by(self):
        """
        Gets the uploaded_by of this BookState.


        :return: The uploaded_by of this BookState.
        :rtype: ResponseUser
        """
        return self._uploaded_by

    @uploaded_by.setter
    def uploaded_by(self, uploaded_by):
        """
        Sets the uploaded_by of this BookState.


        :param uploaded_by: The uploaded_by of this BookState.
        :type: ResponseUser
        """
        self._uploaded_by = uploaded_by

    @property
    def lent_by(self):
        """
        Gets the lent_by of this BookState.


        :return: The lent_by of this BookState.
        :rtype: ResponseUser
        """
        return self._lent_by

    @lent_by.setter
    def lent_by(self, lent_by):
        """
        Sets the lent_by of this BookState.


        :param lent_by: The lent_by of this BookState.
        :type: ResponseUser
        """
        self._lent_by = lent_by

    @property
    def lost_by(self):
        """
        Gets the lost_by of this BookState.


        :return: The lost_by of this BookState.
        :rtype: ResponseUser
        """
        return self._lost_by

    @lost_by.setter
    def lost_by(self, lost_by):
        """
        Sets the lost_by of this BookState.


        :param lost_by: The lost_by of this BookState.
        :type: ResponseUser
        """
        self._lost_by = lost_by

    @property
    def returned_by(self):
        """
        Gets the returned_by of this BookState.


        :return: The returned_by of this BookState.
        :rtype: ResponseUser
        """
        return self._returned_by

    @returned_by.setter
    def returned_by(self, returned_by):
        """
        Sets the returned_by of this BookState.


        :param returned_by: The returned_by of this BookState.
        :type: ResponseUser
        """
        self._returned_by = returned_by

    @property
    def requested_by(self):
        """
        Gets the requested_by of this BookState.


        :return: The requested_by of this BookState.
        :rtype: list[ResponseUser]
        """
        return self._requested_by

    @requested_by.setter
    def requested_by(self, requested_by):
        """
        Sets the requested_by of this BookState.


        :param requested_by: The requested_by of this BookState.
        :type: list[ResponseUser]
        """
        self._requested_by = requested_by

    @property
    def created_at(self):
        """
        Gets the created_at of this BookState.


        :return: The created_at of this BookState.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """
        Sets the created_at of this BookState.


        :param created_at: The created_at of this BookState.
        :type: datetime
        """
        self._created_at = created_at

    @property
    def updated_at(self):
        """
        Gets the updated_at of this BookState.


        :return: The updated_at of this BookState.
        :rtype: datetime
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at):
        """
        Sets the updated_at of this BookState.


        :param updated_at: The updated_at of this BookState.
        :type: datetime
        """
        self._updated_at = updated_at

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other

