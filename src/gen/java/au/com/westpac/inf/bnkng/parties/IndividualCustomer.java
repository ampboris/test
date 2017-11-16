package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * IndividualCustomer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class IndividualCustomer   {
  private String firstName = null;

  private String middleName = null;

  private String lastName = null;

  private String fullName = null;

  private String dateOfBirth = null;

  private String gender = null;

  private String drivingLicence = null;

  public IndividualCustomer firstName(String firstName) {
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

  public IndividualCustomer middleName(String middleName) {
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

  public IndividualCustomer lastName(String lastName) {
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

  public IndividualCustomer fullName(String fullName) {
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

  public IndividualCustomer dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * date of birth(yyyy-mm-dd)
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "date of birth(yyyy-mm-dd)")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public IndividualCustomer gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * gender
   * @return gender
  **/
  @ApiModelProperty(value = "gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public IndividualCustomer drivingLicence(String drivingLicence) {
    this.drivingLicence = drivingLicence;
    return this;
  }

   /**
   * drivingLicence
   * @return drivingLicence
  **/
  @ApiModelProperty(value = "drivingLicence")
  public String getDrivingLicence() {
    return drivingLicence;
  }

  public void setDrivingLicence(String drivingLicence) {
    this.drivingLicence = drivingLicence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualCustomer individualCustomer = (IndividualCustomer) o;
    return Objects.equals(this.firstName, individualCustomer.firstName) &&
        Objects.equals(this.middleName, individualCustomer.middleName) &&
        Objects.equals(this.lastName, individualCustomer.lastName) &&
        Objects.equals(this.fullName, individualCustomer.fullName) &&
        Objects.equals(this.dateOfBirth, individualCustomer.dateOfBirth) &&
        Objects.equals(this.gender, individualCustomer.gender) &&
        Objects.equals(this.drivingLicence, individualCustomer.drivingLicence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName, fullName, dateOfBirth, gender, drivingLicence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualCustomer {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    drivingLicence: ").append(toIndentedString(drivingLicence)).append("\n");
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

