package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import au.com.westpac.inf.bnkng.parties.CustomerRelationships;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * CustomerRelationshipResponseData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerRelationshipResponseData   {
  private List<CustomerRelationships> relationships = new ArrayList<CustomerRelationships>();

  public CustomerRelationshipResponseData relationships(List<CustomerRelationships> relationships) {
    this.relationships = relationships;
    return this;
  }

  public CustomerRelationshipResponseData addRelationshipsItem(CustomerRelationships relationshipsItem) {
    this.relationships.add(relationshipsItem);
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(value = "")
  public List<CustomerRelationships> getRelationships() {
    return relationships;
  }

  public void setRelationships(List<CustomerRelationships> relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerRelationshipResponseData customerRelationshipResponseData = (CustomerRelationshipResponseData) o;
    return Objects.equals(this.relationships, customerRelationshipResponseData.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRelationshipResponseData {\n");
    
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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

