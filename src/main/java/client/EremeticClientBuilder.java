package client;

/**
 * Created by Fabian Rivera on 8/28/17.
 */
public class EremeticClientBuilder {

  private String host;
  private int port;
  private ClientType clientType;

  public EremeticClientBuilder(ClientType clientType) {
    this.clientType = clientType;
  }

  public EremeticClientBuilder setHost(String host) {
    this.host = host;
    return this;
  }

  public EremeticClientBuilder setPort(int port) {
    this.port = port;
    return this;
  }

  public EremeticClient build() {

    EremeticClient eremeticClient;

    switch (clientType) {
      case HTTP:
        eremeticClient = new EremeticHttpClient();
        eremeticClient.setHost(host, port);
        break;
      default:
        eremeticClient = null;
    }

    return eremeticClient;
  }

  /**
   * Client's type used for Eremetic Calls
   */
  enum ClientType {
    HTTP
  }

}
