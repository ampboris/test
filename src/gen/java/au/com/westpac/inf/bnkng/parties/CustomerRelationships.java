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
 * CustomerRelationships
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerRelationships   {
  private List<Identification> keys = new ArrayList<Identification>();

  private Name name = null;

  private String relationshipDirection = null;

  private String relatedType = null;

  private String relationshipType = null;

  private String relationshipStatus = null;

  private String dateOfBirth = null;

  private List<Address> addresses = new ArrayList<Address>();

  public CustomerRelationships keys(List<Identification> keys) {
    this.keys = keys;
    return this;
  }

  public CustomerRelationships addKeysItem(Identification keysItem) {
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

  public CustomerRelationships name(Name name) {
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

  public CustomerRelationships relationshipDirection(String relationshipDirection) {
    this.relationshipDirection = relationshipDirection;
    return this;
  }

   /**
   * Customer related To or From e.g. From
   * @return relationshipDirection
  **/
  @ApiModelProperty(value = "Customer related To or From e.g. From")
  public String getRelationshipDirection() {
    return relationshipDirection;
  }

  public void setRelationshipDirection(String relationshipDirection) {
    this.relationshipDirection = relationshipDirection;
  }

  public CustomerRelationships relatedType(String relatedType) {
    this.relatedType = relatedType;
    return this;
  }

   /**
   * related customer type e.g. Individual/Organisation/Group
   * @return relatedType
  **/
  @ApiModelProperty(value = "related customer type e.g. Individual/Organisation/Group")
  public String getRelatedType() {
    return relatedType;
  }

  public void setRelatedType(String relatedType) {
    this.relatedType = relatedType;
  }

  public CustomerRelationships relationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
    return this;
  }

   /**
   * relationshipType for the given customer e.g. Director/Signatory
   * @return relationshipType
  **/
  @ApiModelProperty(value = "relationshipType for the given customer e.g. Director/Signatory")
  public String getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(String relationshipType) {
    this.relationshipType = relationshipType;
  }

  public CustomerRelationships relationshipStatus(String relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
    return this;
  }

   /**
   * active/inactive
   * @return relationshipStatus
  **/
  @ApiModelProperty(value = "active/inactive")
  public String getRelationshipStatus() {
    return relationshipStatus;
  }

  public void setRelationshipStatus(String relationshipStatus) {
    this.relationshipStatus = relationshipStatus;
  }

  public CustomerRelationships dateOfBirth(String dateOfBirth) {
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

  public CustomerRelationships addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public CustomerRelationships addAddressesItem(Address addressesItem) {
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
    CustomerRelationships customerRelationships = (CustomerRelationships) o;
    return Objects.equals(this.keys, customerRelationships.keys) &&
        Objects.equals(this.name, customerRelationships.name) &&
        Objects.equals(this.relationshipDirection, customerRelationships.relationshipDirection) &&
        Objects.equals(this.relatedType, customerRelationships.relatedType) &&
        Objects.equals(this.relationshipType, customerRelationships.relationshipType) &&
        Objects.equals(this.relationshipStatus, customerRelationships.relationshipStatus) &&
        Objects.equals(this.dateOfBirth, customerRelationships.dateOfBirth) &&
        Objects.equals(this.addresses, customerRelationships.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys, name, relationshipDirection, relatedType, relationshipType, relationshipStatus, dateOfBirth, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerRelationships {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relationshipDirection: ").append(toIndentedString(relationshipDirection)).append("\n");
    sb.append("    relatedType: ").append(toIndentedString(relatedType)).append("\n");
    sb.append("    relationshipType: ").append(toIndentedString(relationshipType)).append("\n");
    sb.append("    relationshipStatus: ").append(toIndentedString(relationshipStatus)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

