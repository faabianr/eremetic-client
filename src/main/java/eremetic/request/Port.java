package eremetic.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Fabian Rivera on 8/27/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Port {

  @JsonProperty("container_port")
  private Long containerPort;

  @JsonProperty("protocol")
  private String protocol;

  public Long getContainerPort() {
    return containerPort;
  }

  public void setContainerPort(Long containerPort) {
    this.containerPort = containerPort;
  }

  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

}
