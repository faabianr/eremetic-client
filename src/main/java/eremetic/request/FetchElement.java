package eremetic.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Fabian Rivera on 8/27/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FetchElement {

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("extract")
  private Boolean extract;

  @JsonProperty("executable")
  private Boolean executable;

  @JsonProperty("cache")
  private Boolean cache;

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Boolean getExtract() {
    return extract;
  }

  public void setExtract(Boolean extract) {
    this.extract = extract;
  }

  public Boolean getExecutable() {
    return executable;
  }

  public void setExecutable(Boolean executable) {
    this.executable = executable;
  }

  public Boolean getCache() {
    return cache;
  }

  public void setCache(Boolean cache) {
    this.cache = cache;
  }

}
