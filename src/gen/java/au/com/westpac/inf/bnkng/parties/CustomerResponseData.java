package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import au.com.westpac.inf.bnkng.parties.Address;
import au.com.westpac.inf.bnkng.parties.Identification;
import au.com.westpac.inf.bnkng.parties.Name;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * CustomerResponseData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerResponseData   {
  private List<Identification> keys = new ArrayList<Identification>();

  private String customerType = null;

  private String ABN = null;

  private String ACN = null;

  private Name name = null;

  private String dateOfBirth = null;

  private String legalEntityType = null;

  private List<Address> addresses = new ArrayList<Address>();

  public CustomerResponseData keys(List<Identification> keys) {
    this.keys = keys;
    return this;
  }

  public CustomerResponseData addKeysItem(Identification keysItem) {
    this.keys.add(keysItem);
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(value = "")
  public List<Identification> getKeys() {
    return keys;
  }

  public void setKeys(List<Identification> keys) {
    this.keys = keys;
  }

  public CustomerResponseData customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

   /**
   * Type of the customer eg:Organisation/Individual
   * @return customerType
  **/
  @ApiModelProperty(value = "Type of the customer eg:Organisation/Individual")
  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public CustomerResponseData ABN(String ABN) {
    this.ABN = ABN;
    return this;
  }

   /**
   * ABN#
   * @return ABN
  **/
  @ApiModelProperty(value = "ABN#")
  public String getABN() {
    return ABN;
  }

  public void setABN(String ABN) {
    this.ABN = ABN;
  }

  public CustomerResponseData ACN(String ACN) {
    this.ACN = ACN;
    return this;
  }

   /**
   * ACN#
   * @return ACN
  **/
  @ApiModelProperty(value = "ACN#")
  public String getACN() {
    return ACN;
  }

  public void setACN(String ACN) {
    this.ACN = ACN;
  }

  public CustomerResponseData name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public CustomerResponseData dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * date of birth(YYYY-MM-DD)
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "date of birth(YYYY-MM-DD)")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public CustomerResponseData legalEntityType(String legalEntityType) {
    this.legalEntityType = legalEntityType;
    return this;
  }

   /**
   * LegalEntityType as SoleTrader,Partnerships,PrivateCompany,Association,PublicCompany,Government,LimitedPartnership,Miscellaneous,Trust
   * @return legalEntityType
  **/
  @ApiModelProperty(value = "LegalEntityType as SoleTrader,Partnerships,PrivateCompany,Association,PublicCompany,Government,LimitedPartnership,Miscellaneous,Trust")
  public String getLegalEntityType() {
    return legalEntityType;
  }

  public void setLegalEntityType(String legalEntityType) {
    this.legalEntityType = legalEntityType;
  }

  public CustomerResponseData addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public CustomerResponseData addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(value = "")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerResponseData customerResponseData = (CustomerResponseData) o;
    return Objects.equals(this.keys, customerResponseData.keys) &&
        Objects.equals(this.customerType, customerResponseData.customerType) &&
        Objects.equals(this.ABN, customerResponseData.ABN) &&
        Objects.equals(this.ACN, customerResponseData.ACN) &&
        Objects.equals(this.name, customerResponseData.name) &&
        Objects.equals(this.dateOfBirth, customerResponseData.dateOfBirth) &&
        Objects.equals(this.legalEntityType, customerResponseData.legalEntityType) &&
        Objects.equals(this.addresses, customerResponseData.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, customerType, ABN, ACN, name, dateOfBirth, legalEntityType, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerResponseData {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    ACN: ").append(toIndentedString(ACN)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    legalEntityType: ").append(toIndentedString(legalEntityType)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

