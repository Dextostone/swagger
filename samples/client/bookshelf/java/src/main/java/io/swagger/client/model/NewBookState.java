package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Book;
import io.swagger.client.model.ResponseUser;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class NewBookState   {
  
  private Book book = null;
  private String currentStatus = null;
  private ResponseUser uploadedBy = null;
  private ResponseUser lentBy = null;
  private ResponseUser lostBy = null;
  private ResponseUser returnedBy = null;
  private List<ResponseUser> requestedBy = new ArrayList<ResponseUser>();

  
  /**
   **/
  public NewBookState book(Book book) {
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
  public NewBookState currentStatus(String currentStatus) {
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
  public NewBookState uploadedBy(ResponseUser uploadedBy) {
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
  public NewBookState lentBy(ResponseUser lentBy) {
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
  public NewBookState lostBy(ResponseUser lostBy) {
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
  public NewBookState returnedBy(ResponseUser returnedBy) {
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
  public NewBookState requestedBy(List<ResponseUser> requestedBy) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBookState newBookState = (NewBookState) o;
    return Objects.equals(this.book, newBookState.book) &&
        Objects.equals(this.currentStatus, newBookState.currentStatus) &&
        Objects.equals(this.uploadedBy, newBookState.uploadedBy) &&
        Objects.equals(this.lentBy, newBookState.lentBy) &&
        Objects.equals(this.lostBy, newBookState.lostBy) &&
        Objects.equals(this.returnedBy, newBookState.returnedBy) &&
        Objects.equals(this.requestedBy, newBookState.requestedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(book, currentStatus, uploadedBy, lentBy, lostBy, returnedBy, requestedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBookState {\n");
    
    sb.append("    book: ").append(toIndentedString(book)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    uploadedBy: ").append(toIndentedString(uploadedBy)).append("\n");
    sb.append("    lentBy: ").append(toIndentedString(lentBy)).append("\n");
    sb.append("    lostBy: ").append(toIndentedString(lostBy)).append("\n");
    sb.append("    returnedBy: ").append(toIndentedString(returnedBy)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
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

