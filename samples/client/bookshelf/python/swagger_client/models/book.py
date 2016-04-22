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


class Book(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        Book - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'name': 'str',
            'authors': 'list[Author]',
            'comments': 'list[Comment]',
            'publisher': 'NewPublisher',
            'published_on': 'datetime',
            'isbn13': 'str',
            'isbn10': 'str',
            'tags': 'list[str]',
            'id': 'str',
            'created_at': 'datetime',
            'updated_at': 'datetime'
        }

        self.attribute_map = {
            'name': 'name',
            'authors': 'authors',
            'comments': 'comments',
            'publisher': 'publisher',
            'published_on': 'publishedOn',
            'isbn13': 'isbn13',
            'isbn10': 'isbn10',
            'tags': 'tags',
            'id': '_id',
            'created_at': 'createdAt',
            'updated_at': 'updatedAt'
        }

        self._name = None
        self._authors = None
        self._comments = None
        self._publisher = None
        self._published_on = None
        self._isbn13 = None
        self._isbn10 = None
        self._tags = None
        self._id = None
        self._created_at = None
        self._updated_at = None

    @property
    def name(self):
        """
        Gets the name of this Book.


        :return: The name of this Book.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this Book.


        :param name: The name of this Book.
        :type: str
        """
        self._name = name

    @property
    def authors(self):
        """
        Gets the authors of this Book.


        :return: The authors of this Book.
        :rtype: list[Author]
        """
        return self._authors

    @authors.setter
    def authors(self, authors):
        """
        Sets the authors of this Book.


        :param authors: The authors of this Book.
        :type: list[Author]
        """
        self._authors = authors

    @property
    def comments(self):
        """
        Gets the comments of this Book.


        :return: The comments of this Book.
        :rtype: list[Comment]
        """
        return self._comments

    @comments.setter
    def comments(self, comments):
        """
        Sets the comments of this Book.


        :param comments: The comments of this Book.
        :type: list[Comment]
        """
        self._comments = comments

    @property
    def publisher(self):
        """
        Gets the publisher of this Book.


        :return: The publisher of this Book.
        :rtype: NewPublisher
        """
        return self._publisher

    @publisher.setter
    def publisher(self, publisher):
        """
        Sets the publisher of this Book.


        :param publisher: The publisher of this Book.
        :type: NewPublisher
        """
        self._publisher = publisher

    @property
    def published_on(self):
        """
        Gets the published_on of this Book.


        :return: The published_on of this Book.
        :rtype: datetime
        """
        return self._published_on

    @published_on.setter
    def published_on(self, published_on):
        """
        Sets the published_on of this Book.


        :param published_on: The published_on of this Book.
        :type: datetime
        """
        self._published_on = published_on

    @property
    def isbn13(self):
        """
        Gets the isbn13 of this Book.


        :return: The isbn13 of this Book.
        :rtype: str
        """
        return self._isbn13

    @isbn13.setter
    def isbn13(self, isbn13):
        """
        Sets the isbn13 of this Book.


        :param isbn13: The isbn13 of this Book.
        :type: str
        """
        self._isbn13 = isbn13

    @property
    def isbn10(self):
        """
        Gets the isbn10 of this Book.


        :return: The isbn10 of this Book.
        :rtype: str
        """
        return self._isbn10

    @isbn10.setter
    def isbn10(self, isbn10):
        """
        Sets the isbn10 of this Book.


        :param isbn10: The isbn10 of this Book.
        :type: str
        """
        self._isbn10 = isbn10

    @property
    def tags(self):
        """
        Gets the tags of this Book.


        :return: The tags of this Book.
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this Book.


        :param tags: The tags of this Book.
        :type: list[str]
        """
        self._tags = tags

    @property
    def id(self):
        """
        Gets the id of this Book.


        :return: The id of this Book.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this Book.


        :param id: The id of this Book.
        :type: str
        """
        self._id = id

    @property
    def created_at(self):
        """
        Gets the created_at of this Book.


        :return: The created_at of this Book.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """
        Sets the created_at of this Book.


        :param created_at: The created_at of this Book.
        :type: datetime
        """
        self._created_at = created_at

    @property
    def updated_at(self):
        """
        Gets the updated_at of this Book.


        :return: The updated_at of this Book.
        :rtype: datetime
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at):
        """
        Sets the updated_at of this Book.


        :param updated_at: The updated_at of this Book.
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

