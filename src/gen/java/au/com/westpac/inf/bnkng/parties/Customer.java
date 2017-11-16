package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import au.com.westpac.inf.bnkng.parties.Address;
import au.com.westpac.inf.bnkng.parties.Identification;
import au.com.westpac.inf.bnkng.parties.IndividualCustomer;
import au.com.westpac.inf.bnkng.parties.OrganisationCustomer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * Customer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class Customer   {
  private List<Identification> keys = new ArrayList<Identification>();

  private IndividualCustomer individual = null;

  private OrganisationCustomer organisation = null;

  private String legalEntityType = null;

  private List<Address> addresses = new ArrayList<Address>();

  public Customer keys(List<Identification> keys) {
    this.keys = keys;
    return this;
  }

  public Customer addKeysItem(Identification keysItem) {
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

  public Customer individual(IndividualCustomer individual) {
    this.individual = individual;
    return this;
  }

   /**
   * Get individual
   * @return individual
  **/
  @ApiModelProperty(value = "")
  public IndividualCustomer getIndividual() {
    return individual;
  }

  public void setIndividual(IndividualCustomer individual) {
    this.individual = individual;
  }

  public Customer organisation(OrganisationCustomer organisation) {
    this.organisation = organisation;
    return this;
  }

   /**
   * Get organisation
   * @return organisation
  **/
  @ApiModelProperty(value = "")
  public OrganisationCustomer getOrganisation() {
    return organisation;
  }

  public void setOrganisation(OrganisationCustomer organisation) {
    this.organisation = organisation;
  }

  public Customer legalEntityType(String legalEntityType) {
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

  public Customer addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Customer addAddressesItem(Address addressesItem) {
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
    Customer customer = (Customer) o;
    return Objects.equals(this.keys, customer.keys) &&
        Objects.equals(this.individual, customer.individual) &&
        Objects.equals(this.organisation, customer.organisation) &&
        Objects.equals(this.legalEntityType, customer.legalEntityType) &&
        Objects.equals(this.addresses, customer.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, individual, organisation, legalEntityType, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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

