package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * OrganisationCustomer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class OrganisationCustomer   {
  private String fullName = null;

  private String ABN = null;

  private String ACN = null;

  private String ARBN = null;

  public OrganisationCustomer fullName(String fullName) {
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

  public OrganisationCustomer ABN(String ABN) {
    this.ABN = ABN;
    return this;
  }

   /**
   * ABN e.g. 25303090246
   * @return ABN
  **/
  @ApiModelProperty(value = "ABN e.g. 25303090246")
  public String getABN() {
    return ABN;
  }

  public void setABN(String ABN) {
    this.ABN = ABN;
  }

  public OrganisationCustomer ACN(String ACN) {
    this.ACN = ACN;
    return this;
  }

   /**
   * ACN e.g. 222456622
   * @return ACN
  **/
  @ApiModelProperty(value = "ACN e.g. 222456622")
  public String getACN() {
    return ACN;
  }

  public void setACN(String ACN) {
    this.ACN = ACN;
  }

  public OrganisationCustomer ARBN(String ARBN) {
    this.ARBN = ARBN;
    return this;
  }

   /**
   * ARBN
   * @return ARBN
  **/
  @ApiModelProperty(value = "ARBN")
  public String getARBN() {
    return ARBN;
  }

  public void setARBN(String ARBN) {
    this.ARBN = ARBN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationCustomer organisationCustomer = (OrganisationCustomer) o;
    return Objects.equals(this.fullName, organisationCustomer.fullName) &&
        Objects.equals(this.ABN, organisationCustomer.ABN) &&
        Objects.equals(this.ACN, organisationCustomer.ACN) &&
        Objects.equals(this.ARBN, organisationCustomer.ARBN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, ABN, ACN, ARBN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganisationCustomer {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    ABN: ").append(toIndentedString(ABN)).append("\n");
    sb.append("    ACN: ").append(toIndentedString(ACN)).append("\n");
    sb.append("    ARBN: ").append(toIndentedString(ARBN)).append("\n");
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

