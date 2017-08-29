package eremetic.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import eremetic.request.FetchElement;
import eremetic.request.Port;
import eremetic.request.SlaveConstraint;
import eremetic.request.Volume;

import java.util.List;
import java.util.Map;

/**
 * Created by Fabian Rivera on 8/28/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {

  @JsonProperty("task_cpus")
  private Float taskCpus;

  @JsonProperty("task_mem")
  private Float taskMem;

  @JsonProperty("command")
  private String command;

  @JsonProperty("args")
  private List<String> args;

  @JsonProperty("user")
  private String user;

  @JsonProperty("env")
  private Map<String, String> env;

  @JsonProperty("masked_env")
  private Map<String, String> maskedEnv;

  @JsonProperty("image")
  private String image;

  @JsonProperty("volumes")
  private List<Volume> volumes;

  @JsonProperty("ports")
  private List<Port> ports;

  @JsonProperty("status")
  private List<TaskStatus> status;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("network")
  private String network;

  @JsonProperty("dns")
  private String dns;

  @JsonProperty("framework_id")
  private String frameworkId;

  @JsonProperty("slave_id")
  private String slaveId;

  @JsonProperty("slave_constraints")
  private List<SlaveConstraint> slaveConstraints;

  @JsonProperty("hostname")
  private String hostname;

  @JsonProperty("retry")
  private Long retry;

  @JsonProperty("callback_uri")
  private String callbackUri;

  @JsonProperty("sandbox_path")
  private String sandboxPath;

  @JsonProperty("agent_ip")
  private String agentIp;

  @JsonProperty("agent_port")
  private Long agentPort;

  @JsonProperty("force_pull_image")
  private Boolean forcePullImage;

  @JsonProperty("fetch")
  private List<FetchElement> fetch;

  public Float getTaskCpus() {
    return taskCpus;
  }

  public void setTaskCpus(Float taskCpus) {
    this.taskCpus = taskCpus;
  }

  public Float getTaskMem() {
    return taskMem;
  }

  public void setTaskMem(Float taskMem) {
    this.taskMem = taskMem;
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

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
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

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }

  public List<Port> getPorts() {
    return ports;
  }

  public void setPorts(List<Port> ports) {
    this.ports = ports;
  }

  public List<TaskStatus> getStatus() {
    return status;
  }

  public void setStatus(List<TaskStatus> status) {
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getFrameworkId() {
    return frameworkId;
  }

  public void setFrameworkId(String frameworkId) {
    this.frameworkId = frameworkId;
  }

  public String getSlaveId() {
    return slaveId;
  }

  public void setSlaveId(String slaveId) {
    this.slaveId = slaveId;
  }

  public List<SlaveConstraint> getSlaveConstraints() {
    return slaveConstraints;
  }

  public void setSlaveConstraints(List<SlaveConstraint> slaveConstraints) {
    this.slaveConstraints = slaveConstraints;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public Long getRetry() {
    return retry;
  }

  public void setRetry(Long retry) {
    this.retry = retry;
  }

  public String getCallbackUri() {
    return callbackUri;
  }

  public void setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
  }

  public String getSandboxPath() {
    return sandboxPath;
  }

  public void setSandboxPath(String sandboxPath) {
    this.sandboxPath = sandboxPath;
  }

  public String getAgentIp() {
    return agentIp;
  }

  public void setAgentIp(String agentIp) {
    this.agentIp = agentIp;
  }

  public Long getAgentPort() {
    return agentPort;
  }

  public void setAgentPort(Long agentPort) {
    this.agentPort = agentPort;
  }

  public Boolean getForcePullImage() {
    return forcePullImage;
  }

  public void setForcePullImage(Boolean forcePullImage) {
    this.forcePullImage = forcePullImage;
  }

  public List<FetchElement> getFetch() {
    return fetch;
  }

  public void setFetch(List<FetchElement> fetch) {
    this.fetch = fetch;
  }

}
