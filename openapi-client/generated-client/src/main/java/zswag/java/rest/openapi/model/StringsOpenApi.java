package zswag.java.rest.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import zswag.java.rest.openapi.model.StringArrayOpenApi;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StringsOpenApi
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-10T15:52:10.810561900+02:00[Europe/Berlin]")


public class StringsOpenApi   {
  @JsonProperty("values")
  private StringArrayOpenApi values = null;

  public StringsOpenApi values(StringArrayOpenApi values) {
    this.values = values;
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public StringArrayOpenApi getValues() {
    return values;
  }

  public void setValues(StringArrayOpenApi values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringsOpenApi strings = (StringsOpenApi) o;
    return Objects.equals(this.values, strings.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringsOpenApi {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
