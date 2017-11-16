package au.com.westpac.inf.bnkng.parties;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Identification
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class Identification   {
  private String idScheme = null;

  private String id = null;

  public Identification idScheme(String idScheme) {
    this.idScheme = idScheme;
    return this;
  }

   /**
   * Scheme of the Id eg:CISKey/CustomerId/GCISKey
   * @return idScheme
  **/
  @ApiModelProperty(value = "Scheme of the Id eg:CISKey/CustomerId/GCISKey")
  public String getIdScheme() {
    return idScheme;
  }

  public void setIdScheme(String idScheme) {
    this.idScheme = idScheme;
  }

  public Identification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * CustomerId/CISKey/GCISKey e.g. 12345678
   * @return id
  **/
  @ApiModelProperty(value = "CustomerId/CISKey/GCISKey e.g. 12345678")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identification identification = (Identification) o;
    return Objects.equals(this.idScheme, identification.idScheme) &&
        Objects.equals(this.id, identification.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idScheme, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identification {\n");
    
    sb.append("    idScheme: ").append(toIndentedString(idScheme)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

