package eremetic.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Fabian Rivera on 8/27/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Volume {

  @JsonProperty("container_path")
  private String containerPath;

  @JsonProperty("host_path")
  private String hostPath;

  public String getContainerPath() {
    return containerPath;
  }

  public void setContainerPath(String containerPath) {
    this.containerPath = containerPath;
  }

  public String getHostPath() {
    return hostPath;
  }

  public void setHostPath(String hostPath) {
    this.hostPath = hostPath;
  }

}
