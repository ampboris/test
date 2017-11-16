package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import au.com.westpac.inf.bnkng.parties.Address;
import au.com.westpac.inf.bnkng.parties.IndividualCustomer;
import au.com.westpac.inf.bnkng.parties.OrganisationCustomer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Customer search criteria
 **/

/**
 * Customer search criteria
 */
@ApiModel(description = "Customer search criteria")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class SearchRequest   {
  private IndividualCustomer individual = null;

  private OrganisationCustomer organisation = null;

  private Address address = null;

  /**
   * Brand e.g WBC, SGB
   */
  public enum BrandSiloEnum {
    WPAC("WPAC"),
    
    SGBBSA("SGBBSA"),
    
    RAMS("RAMS"),
    
    WBG("WBG");

    private String value;

    BrandSiloEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private BrandSiloEnum brandSilo = null;

  public SearchRequest individual(IndividualCustomer individual) {
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

  public SearchRequest organisation(OrganisationCustomer organisation) {
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

  public SearchRequest address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public SearchRequest brandSilo(BrandSiloEnum brandSilo) {
    this.brandSilo = brandSilo;
    return this;
  }

   /**
   * Brand e.g WBC, SGB
   * @return brandSilo
  **/
  @ApiModelProperty(required = true, value = "Brand e.g WBC, SGB")
  public BrandSiloEnum getBrandSilo() {
    return brandSilo;
  }

  public void setBrandSilo(BrandSiloEnum brandSilo) {
    this.brandSilo = brandSilo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchRequest searchRequest = (SearchRequest) o;
    return Objects.equals(this.individual, searchRequest.individual) &&
        Objects.equals(this.organisation, searchRequest.organisation) &&
        Objects.equals(this.address, searchRequest.address) &&
        Objects.equals(this.brandSilo, searchRequest.brandSilo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(individual, organisation, address, brandSilo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchRequest {\n");
    
    sb.append("    individual: ").append(toIndentedString(individual)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    brandSilo: ").append(toIndentedString(brandSilo)).append("\n");
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

