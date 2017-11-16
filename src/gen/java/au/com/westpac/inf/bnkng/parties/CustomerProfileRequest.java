package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import au.com.westpac.inf.bnkng.parties.Identification;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Customer profile
 **/

/**
 * Customer profile
 */
@ApiModel(description = "Customer profile")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerProfileRequest   {
  private Identification keys = null;

  private String customerType = null;

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

  public CustomerProfileRequest keys(Identification keys) {
    this.keys = keys;
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(required = true, value = "")
  public Identification getKeys() {
    return keys;
  }

  public void setKeys(Identification keys) {
    this.keys = keys;
  }

  public CustomerProfileRequest customerType(String customerType) {
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

  public CustomerProfileRequest brandSilo(BrandSiloEnum brandSilo) {
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
    CustomerProfileRequest customerProfileRequest = (CustomerProfileRequest) o;
    return Objects.equals(this.keys, customerProfileRequest.keys) &&
        Objects.equals(this.customerType, customerProfileRequest.customerType) &&
        Objects.equals(this.brandSilo, customerProfileRequest.brandSilo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, customerType, brandSilo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProfileRequest {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
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

