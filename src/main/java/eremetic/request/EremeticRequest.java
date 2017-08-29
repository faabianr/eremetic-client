package eremetic.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Created by Fabian Rivera on 8/27/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EremeticRequest {

  @JsonProperty("task_cpus")
  private Float taskCpus;

  @JsonProperty("task_mem")
  private Float taskMem;

  @JsonProperty("docker_image")
  private String dockerImage;

  @JsonProperty("force_pull_image")
  private Boolean forcePullImage;

  @JsonProperty("privileged")
  private Boolean privileged;

  @JsonProperty("command")
  private String command;

  @JsonProperty("args")
  private List<String> args;

  @JsonProperty("volumes")
  private List<Volume> volumes;

  @JsonProperty("network")
  private String network;

  @JsonProperty("dns")
  private String dns;

  @JsonProperty("ports")
  private List<Port> ports;

  @JsonProperty("env")
  private Map<String, String> env;

  @JsonProperty("masked_env")
  private Map<String, String> maskedEnv;

  @JsonProperty("uris")
  private List<String> uris;

  @JsonProperty("fetch")
  private List<FetchElement> fetch;

  @JsonProperty("slave_constraints")
  private List<SlaveConstraint> slaveConstraints;

  @JsonProperty("callback_uri")
  private String callbackUri;

  protected EremeticRequest() {
  }

  public Float getTaskCpus() {
    return taskCpus;
  }

  public void setTaskCpus(Float taskCpus) {
    this.taskCpus = taskCpus;
  }

  public Float getTaskMemMem() {
    return taskMem;
  }

  public void setTaskMem(Float taskMem) {
    this.taskMem = taskMem;
  }

  public String getDockerImage() {
    return dockerImage;
  }

  public void setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
  }

  public Boolean getForcePullImage() {
    return forcePullImage;
  }

  public void setForcePullImage(Boolean forcePullImage) {
    this.forcePullImage = forcePullImage;
  }

  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }

  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public String getDns() {
    return dns;
  }

  public void setDns(String dns) {
    this.dns = dns;
  }

  public List<Port> getPorts() {
    return ports;
  }

  public void setPorts(List<Port> ports) {
    this.ports = ports;
  }

  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public Map<String, String> getMaskedEnv() {
    return maskedEnv;
  }

  public void setMaskedEnv(Map<String, String> maskedEnv) {
    this.maskedEnv = maskedEnv;
  }

  public List<String> getUris() {
    return uris;
  }

  public void setUris(List<String> uris) {
    this.uris = uris;
  }

  public List<FetchElement> getFetch() {
    return fetch;
  }

  public void setFetch(List<FetchElement> fetch) {
    this.fetch = fetch;
  }

  public List<SlaveConstraint> getSlaveConstraints() {
    return slaveConstraints;
  }

  public void setSlaveConstraints(List<SlaveConstraint> slaveConstraints) {
    this.slaveConstraints = slaveConstraints;
  }

  public String getCallbackUri() {
    return callbackUri;
  }

  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

}
