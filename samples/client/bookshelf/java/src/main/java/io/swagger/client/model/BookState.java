package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Book;
import io.swagger.client.model.NewBookState;
import io.swagger.client.model.ResponseUser;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class BookState extends NewBookState  {
  
  private Book book = null;
  private String currentStatus = null;
  private ResponseUser uploadedBy = null;
  private ResponseUser lentBy = null;
  private ResponseUser lostBy = null;
  private ResponseUser returnedBy = null;
  private List<ResponseUser> requestedBy = new ArrayList<ResponseUser>();
  private Date createdAt = null;
  private Date updatedAt = null;

  
  /**
   **/
  public BookState book(Book book) {
    this.book = book;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("book")
  public Book getBook() {
    return book;
  }
  public void setBook(Book book) {
    this.book = book;
  }

  
  /**
   **/
  public BookState currentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("currentStatus")
  public String getCurrentStatus() {
    return currentStatus;
  }
  public void setCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
  }

  
  /**
   **/
  public BookState uploadedBy(ResponseUser uploadedBy) {
    this.uploadedBy = uploadedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("uploadedBy")
  public ResponseUser getUploadedBy() {
    return uploadedBy;
  }
  public void setUploadedBy(ResponseUser uploadedBy) {
    this.uploadedBy = uploadedBy;
  }

  
  /**
   **/
  public BookState lentBy(ResponseUser lentBy) {
    this.lentBy = lentBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lentBy")
  public ResponseUser getLentBy() {
    return lentBy;
  }
  public void setLentBy(ResponseUser lentBy) {
    this.lentBy = lentBy;
  }

  
  /**
   **/
  public BookState lostBy(ResponseUser lostBy) {
    this.lostBy = lostBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lostBy")
  public ResponseUser getLostBy() {
    return lostBy;
  }
  public void setLostBy(ResponseUser lostBy) {
    this.lostBy = lostBy;
  }

  
  /**
   **/
  public BookState returnedBy(ResponseUser returnedBy) {
    this.returnedBy = returnedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("returnedBy")
  public ResponseUser getReturnedBy() {
    return returnedBy;
  }
  public void setReturnedBy(ResponseUser returnedBy) {
    this.returnedBy = returnedBy;
  }

  
  /**
   **/
  public BookState requestedBy(List<ResponseUser> requestedBy) {
    this.requestedBy = requestedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestedBy")
  public List<ResponseUser> getRequestedBy() {
    return requestedBy;
  }
  public void setRequestedBy(List<ResponseUser> requestedBy) {
    this.requestedBy = requestedBy;
  }

  
  /**
   **/
  public BookState createdAt(Date createdAt) {
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
  public BookState updatedAt(Date updatedAt) {
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
    BookState bookState = (BookState) o;
    return Objects.equals(this.book, bookState.book) &&
        Objects.equals(this.currentStatus, bookState.currentStatus) &&
        Objects.equals(this.uploadedBy, bookState.uploadedBy) &&
        Objects.equals(this.lentBy, bookState.lentBy) &&
        Objects.equals(this.lostBy, bookState.lostBy) &&
        Objects.equals(this.returnedBy, bookState.returnedBy) &&
        Objects.equals(this.requestedBy, bookState.requestedBy) &&
        Objects.equals(this.createdAt, bookState.createdAt) &&
        Objects.equals(this.updatedAt, bookState.updatedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(book, currentStatus, uploadedBy, lentBy, lostBy, returnedBy, requestedBy, createdAt, updatedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookState {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    lentBy: ").append(toIndentedString(lentBy)).append("\n");
    sb.append("    lostBy: ").append(toIndentedString(lostBy)).append("\n");
    sb.append("    returnedBy: ").append(toIndentedString(returnedBy)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
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

