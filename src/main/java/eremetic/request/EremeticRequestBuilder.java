package eremetic.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Fabian Rivera on 8/27/17.
 */
public class EremeticRequestBuilder {

  private EremeticRequest eremeticRequest;

  private Float taskCpus;
  private Float taskMem;
  private String dockerImage;
  private Boolean forcePullImage;
  private Boolean privileged;
  private String command;
  private List<String> args;
  private List<Volume> volumes;
  private String network;
  private String dns;
  private List<Port> ports;
  private Map<String, String> env;
  private Map<String, String> maskedEnv;
  private List<String> uris;
  private List<FetchElement> fetch;
  private List<SlaveConstraint> slaveConstraints;
  private String callbackUri;

  public EremeticRequestBuilder setTaskCpus(Float taskCpus) {
    this.taskCpus = taskCpus;
    return this;
  }

  public EremeticRequestBuilder setTaskMem(Float taskMem) {
    this.taskMem = taskMem;
    return this;
  }

  public EremeticRequestBuilder setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

  public EremeticRequestBuilder setForcePullImage(Boolean forcePullImage) {
    this.forcePullImage = forcePullImage;
    return this;
  }

  public EremeticRequestBuilder setPrivileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  public EremeticRequestBuilder setCommand(String command) {
    this.command = command;
    return this;
  }

  public EremeticRequestBuilder setArgs(List<String> args) {
    this.args = args;
    return this;
  }

  public EremeticRequestBuilder setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public EremeticRequestBuilder setNetwork(String network) {
    this.network = network;
    return this;
  }

  public EremeticRequestBuilder setDns(String dns) {
    this.dns = dns;
    return this;
  }

  public EremeticRequestBuilder setPorts(List<Port> ports) {
    this.ports = ports;
    return this;
  }

  public EremeticRequestBuilder setEnv(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public EremeticRequestBuilder setMaskedEnv(Map<String, String> maskedEnv) {
    this.maskedEnv = maskedEnv;
    return this;
  }

  public EremeticRequestBuilder setUris(List<String> uris) {
    this.uris = uris;
    return this;
  }

  public EremeticRequestBuilder setFetch(List<FetchElement> fetch) {
    this.fetch = fetch;
    return this;
  }

  public EremeticRequestBuilder setSlaveConstraints(List<SlaveConstraint> slaveConstraints) {
    this.slaveConstraints = slaveConstraints;
    return this;
  }

  public EremeticRequestBuilder setCallbackUri(String callbackUri) {
    this.callbackUri = callbackUri;
    return this;
  }

  public EremeticRequestBuilder addEnv(String key, String value) {

    if (env == null) {
      env = new HashMap<>();
    }

    env.putIfAbsent(key, value);

    return this;
  }

  public EremeticRequestBuilder addMaskedEnv(String key, String value) {

    if (maskedEnv == null) {
      maskedEnv = new HashMap<>();
    }

    maskedEnv.putIfAbsent(key, value);

    return this;
  }

  public EremeticRequestBuilder addPort(Port port) {
    if (ports == null) {
      ports = new ArrayList<>();
    }

    ports.add(port);

    return this;
  }

  public EremeticRequestBuilder addSlaveConstraint(SlaveConstraint slaveConstraint) {
    if (slaveConstraints == null) {
      slaveConstraints = new ArrayList<>();
    }

    slaveConstraints.add(slaveConstraint);

    return this;
  }

  public EremeticRequestBuilder addFetcElement(FetchElement fetchElement) {
    if (fetch == null) {
      fetch = new ArrayList<>();
    }

    fetch.add(fetchElement);

    return this;
  }

  public EremeticRequestBuilder addVolume(Volume volume) {
    if (volumes == null) {
      volumes = new ArrayList<>();
    }

    volumes.add(volume);

    return this;
  }

  public EremeticRequestBuilder addUri(String uri) {
    if (uris == null) {
      uris = new ArrayList<>();
    }

    uris.add(uri);

    return this;
  }

  public EremeticRequestBuilder addArg(String arg) {
    if (args == null) {
      args = new ArrayList<>();
    }

    args.add(arg);

    return this;
  }

  public EremeticRequestBuilder addVolume(String containerPath, String hostPath) {
    Volume volume = new Volume();
    volume.setContainerPath(containerPath);
    volume.setHostPath(hostPath);

    addVolume(volume);

    return this;
  }

  public EremeticRequest build() {
    eremeticRequest = new EremeticRequest();

    //Setting the values
    copyValues(this, eremeticRequest);

    return eremeticRequest;
  }

  private void copyValues(EremeticRequestBuilder builder, EremeticRequest eremeticRequest) {
    eremeticRequest.setTaskCpus(builder.taskCpus);
    eremeticRequest.setTaskMem(builder.taskMem);
    eremeticRequest.setDockerImage(builder.dockerImage);
    eremeticRequest.setForcePullImage(builder.forcePullImage);
    eremeticRequest.setPrivileged(builder.privileged);
    eremeticRequest.setCommand(builder.command);
    eremeticRequest.setArgs(builder.args);
    eremeticRequest.setVolumes(builder.volumes);
    eremeticRequest.setNetwork(builder.network);
    eremeticRequest.setDns(builder.dns);
    eremeticRequest.setPorts(builder.ports);
    eremeticRequest.setEnv(builder.env);
    eremeticRequest.setMaskedEnv(builder.maskedEnv);
    eremeticRequest.setUris(builder.uris);
    eremeticRequest.setFetch(builder.fetch);
    eremeticRequest.setSlaveConstraints(builder.slaveConstraints);
    eremeticRequest.setCallbackUri(builder.callbackUri);
  }

}
