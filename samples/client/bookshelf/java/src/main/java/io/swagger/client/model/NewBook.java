package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NewAuthor;
import io.swagger.client.model.NewComment;
import io.swagger.client.model.NewPublisher;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class NewBook   {
  
  private String name = null;
  private List<NewAuthor> authors = new ArrayList<NewAuthor>();
  private List<NewComment> comments = new ArrayList<NewComment>();
  private NewPublisher publisher = null;
  private Date publishedOn = null;
  private String isbn13 = null;
  private String isbn10 = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   **/
  public NewBook name(String name) {
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
  public NewBook authors(List<NewAuthor> authors) {
    this.authors = authors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("authors")
  public List<NewAuthor> getAuthors() {
    return authors;
  }
  public void setAuthors(List<NewAuthor> authors) {
    this.authors = authors;
  }

  
  /**
   **/
  public NewBook comments(List<NewComment> comments) {
    this.comments = comments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comments")
  public List<NewComment> getComments() {
    return comments;
  }
  public void setComments(List<NewComment> comments) {
    this.comments = comments;
  }

  
  /**
   **/
  public NewBook publisher(NewPublisher publisher) {
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
  public NewBook publishedOn(Date publishedOn) {
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
  public NewBook isbn13(String isbn13) {
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
  public NewBook isbn10(String isbn10) {
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
  public NewBook tags(List<String> tags) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBook newBook = (NewBook) o;
    return Objects.equals(this.name, newBook.name) &&
        Objects.equals(this.authors, newBook.authors) &&
        Objects.equals(this.comments, newBook.comments) &&
        Objects.equals(this.publisher, newBook.publisher) &&
        Objects.equals(this.publishedOn, newBook.publishedOn) &&
        Objects.equals(this.isbn13, newBook.isbn13) &&
        Objects.equals(this.isbn10, newBook.isbn10) &&
        Objects.equals(this.tags, newBook.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authors, comments, publisher, publishedOn, isbn13, isbn10, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBook {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    isbn13: ").append(toIndentedString(isbn13)).append("\n");
    sb.append("    isbn10: ").append(toIndentedString(isbn10)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

