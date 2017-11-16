package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import au.com.westpac.inf.bnkng.parties.Customer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;




/**
 * CustomersResponseData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomersResponseData   {
  private List<Customer> searchResults = new ArrayList<Customer>();

  public CustomersResponseData searchResults(List<Customer> searchResults) {
    this.searchResults = searchResults;
    return this;
  }

  public CustomersResponseData addSearchResultsItem(Customer searchResultsItem) {
    this.searchResults.add(searchResultsItem);
    return this;
  }

   /**
   * Get searchResults
   * @return searchResults
  **/
  @ApiModelProperty(value = "")
  public List<Customer> getSearchResults() {
    return searchResults;
  }

  public void setSearchResults(List<Customer> searchResults) {
    this.searchResults = searchResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomersResponseData customersResponseData = (CustomersResponseData) o;
    return Objects.equals(this.searchResults, customersResponseData.searchResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomersResponseData {\n");
    
    sb.append("    searchResults: ").append(toIndentedString(searchResults)).append("\n");
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

