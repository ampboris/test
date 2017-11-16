package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Address
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class Address   {
  private String status = null;

  private String addressType = null;

  private String unitNumber = null;

  private String streetNumber = null;

  private String streetName = null;

  private String streetType = null;

  private String buildingName = null;

  private String addressLine1 = null;

  private String addressLine2 = null;

  private String addressLine3 = null;

  private String suburb = null;

  private String city = null;

  private String state = null;

  private String country = null;

  private String postCode = null;

  public Address status(String status) {
    this.status = status;
    return this;
  }

   /**
   * active/inactive
   * @return status
  **/
  @ApiModelProperty(value = "active/inactive")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Address addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Type of address e.g. Residential / Mailing
   * @return addressType
  **/
  @ApiModelProperty(value = "Type of address e.g. Residential / Mailing")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public Address unitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
    return this;
  }

   /**
   * UnitNumber
   * @return unitNumber
  **/
  @ApiModelProperty(value = "UnitNumber")
  public String getUnitNumber() {
    return unitNumber;
  }

  public void setUnitNumber(String unitNumber) {
    this.unitNumber = unitNumber;
  }

  public Address streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * StreetNumber
   * @return streetNumber
  **/
  @ApiModelProperty(value = "StreetNumber")
  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public Address streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * StreetName
   * @return streetName
  **/
  @ApiModelProperty(value = "StreetName")
  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public Address streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

   /**
   * streetType
   * @return streetType
  **/
  @ApiModelProperty(value = "streetType")
  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public Address buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

   /**
   * buildingName
   * @return buildingName
  **/
  @ApiModelProperty(value = "buildingName")
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * addressLine1
   * @return addressLine1
  **/
  @ApiModelProperty(value = "addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * addressLine2
   * @return addressLine2
  **/
  @ApiModelProperty(value = "addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public Address addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * addressLine3
   * @return addressLine3
  **/
  @ApiModelProperty(value = "addressLine3")
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * subrub
   * @return suburb
  **/
  @ApiModelProperty(value = "subrub")
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * city
   * @return city
  **/
  @ApiModelProperty(value = "city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * state
   * @return state
  **/
  @ApiModelProperty(value = "state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * country
   * @return country
  **/
  @ApiModelProperty(value = "country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * postCode
   * @return postCode
  **/
  @ApiModelProperty(value = "postCode")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.status, address.status) &&
        Objects.equals(this.addressType, address.addressType) &&
        Objects.equals(this.unitNumber, address.unitNumber) &&
        Objects.equals(this.streetNumber, address.streetNumber) &&
        Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetType, address.streetType) &&
        Objects.equals(this.buildingName, address.buildingName) &&
        Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.addressLine3, address.addressLine3) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.postCode, address.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, addressType, unitNumber, streetNumber, streetName, streetType, buildingName, addressLine1, addressLine2, addressLine3, suburb, city, state, country, postCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    unitNumber: ").append(toIndentedString(unitNumber)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
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

