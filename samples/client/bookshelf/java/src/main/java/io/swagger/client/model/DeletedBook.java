package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Book;
import io.swagger.client.model.Comment;
import io.swagger.client.model.NewPublisher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class DeletedBook extends Book  {
  
  private String name = null;
  private List<String> authors = new ArrayList<String>();
  private List<Comment> comments = new ArrayList<Comment>();
  private NewPublisher publisher = null;
  private Date publishedOn = null;
  private String isbn13 = null;
  private String isbn10 = null;
  private List<String> tags = new ArrayList<String>();
  private String id = null;
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   **/
  public DeletedBook name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "My new book", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public DeletedBook authors(List<String> authors) {
    this.authors = authors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("authors")
  public List<String> getAuthors() {
    return authors;
  }
  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  
  /**
   **/
  public DeletedBook comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comments")
  public List<Comment> getComments() {
    return comments;
  }
  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  
  /**
   **/
  public DeletedBook publisher(NewPublisher publisher) {
    this.publisher = publisher;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("publisher")
  public NewPublisher getPublisher() {
    return publisher;
  }
  public void setPublisher(NewPublisher publisher) {
    this.publisher = publisher;
  }

  
  /**
   **/
  public DeletedBook publishedOn(Date publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("publishedOn")
  public Date getPublishedOn() {
    return publishedOn;
  }
  public void setPublishedOn(Date publishedOn) {
    this.publishedOn = publishedOn;
  }

  
  /**
   **/
  public DeletedBook isbn13(String isbn13) {
    this.isbn13 = isbn13;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isbn13")
  public String getIsbn13() {
    return isbn13;
  }
  public void setIsbn13(String isbn13) {
    this.isbn13 = isbn13;
  }

  
  /**
   **/
  public DeletedBook isbn10(String isbn10) {
    this.isbn10 = isbn10;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isbn10")
  public String getIsbn10() {
    return isbn10;
  }
  public void setIsbn10(String isbn10) {
    this.isbn10 = isbn10;
  }

  
  /**
   **/
  public DeletedBook tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   **/
  public DeletedBook id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("_id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public DeletedBook createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   **/
  public DeletedBook updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedBook deletedBook = (DeletedBook) o;
    return Objects.equals(this.name, deletedBook.name) &&
        Objects.equals(this.authors, deletedBook.authors) &&
        Objects.equals(this.comments, deletedBook.comments) &&
        Objects.equals(this.publisher, deletedBook.publisher) &&
        Objects.equals(this.publishedOn, deletedBook.publishedOn) &&
        Objects.equals(this.isbn13, deletedBook.isbn13) &&
        Objects.equals(this.isbn10, deletedBook.isbn10) &&
        Objects.equals(this.tags, deletedBook.tags) &&
        Objects.equals(this.id, deletedBook.id) &&
        Objects.equals(this.createdAt, deletedBook.createdAt) &&
        Objects.equals(this.updatedAt, deletedBook.updatedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authors, comments, publisher, publishedOn, isbn13, isbn10, tags, id, createdAt, updatedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedBook {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    isbn13: ").append(toIndentedString(isbn13)).append("\n");
    sb.append("    isbn10: ").append(toIndentedString(isbn10)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

