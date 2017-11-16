package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Name
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class Name   {
  private String prefixTitle = null;

  private String fullName = null;

  private String firstName = null;

  private String middleName = null;

  private String lastName = null;

  public Name prefixTitle(String prefixTitle) {
    this.prefixTitle = prefixTitle;
    return this;
  }

   /**
   * prefix title
   * @return prefixTitle
  **/
  @ApiModelProperty(value = "prefix title")
  public String getPrefixTitle() {
    return prefixTitle;
  }

  public void setPrefixTitle(String prefixTitle) {
    this.prefixTitle = prefixTitle;
  }

  public Name fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * fullname
   * @return fullName
  **/
  @ApiModelProperty(value = "fullname")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Name firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Name middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "middleName")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public Name lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.prefixTitle, name.prefixTitle) &&
        Objects.equals(this.fullName, name.fullName) &&
        Objects.equals(this.firstName, name.firstName) &&
        Objects.equals(this.middleName, name.middleName) &&
        Objects.equals(this.lastName, name.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixTitle, fullName, firstName, middleName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("    prefixTitle: ").append(toIndentedString(prefixTitle)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

