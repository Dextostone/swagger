package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NewPublisherAddress;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-22T16:20:10.835+05:30")
public class NewPublisher   {
  
  private String name = null;
  private List<String> url = new ArrayList<String>();
  private NewPublisherAddress address = null;

  
  /**
   **/
  public NewPublisher name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "Dummy publisher", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public NewPublisher url(List<String> url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public List<String> getUrl() {
    return url;
  }
  public void setUrl(List<String> url) {
    this.url = url;
  }

  
  /**
   **/
  public NewPublisher address(NewPublisherAddress address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public NewPublisherAddress getAddress() {
    return address;
  }
  public void setAddress(NewPublisherAddress address) {
    this.address = address;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPublisher newPublisher = (NewPublisher) o;
    return Objects.equals(this.name, newPublisher.name) &&
        Objects.equals(this.url, newPublisher.url) &&
        Objects.equals(this.address, newPublisher.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, url, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPublisher {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

