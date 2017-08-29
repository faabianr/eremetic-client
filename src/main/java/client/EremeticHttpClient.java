package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import eremetic.request.EremeticRequest;
import eremetic.response.Task;

import java.io.IOException;

/**
 * Created by Fabian Rivera on 8/28/17.
 */
public class EremeticHttpClient implements EremeticClient {

  static {
    Unirest.setObjectMapper(new ObjectMapper() {
      private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
          = new com.fasterxml.jackson.databind.ObjectMapper();

      public <T> T readValue(String value, Class<T> valueType) {
        try {
          return jacksonObjectMapper.readValue(value, valueType);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      public String writeValue(Object value) {
        try {
          return jacksonObjectMapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
          throw new RuntimeException(e);
        }
      }
    });
  }

  /**
   * Eremetic's framework host:port
   */
  private String host;

  private String calculateStatusUrl(String taskId) {
    return calculateBaseRequestUrl() + "/" + taskId;
  }

  private String calculateBaseRequestUrl() {
    return host + "/task";
  }

  public String getHost() {
    return host;
  }

  @Override
  public String createTask(EremeticRequest eremeticRequest) throws UnirestException {

    HttpResponse<String> response = Unirest.post(calculateBaseRequestUrl())
        .header("accept", "application/json")
        .body(eremeticRequest)
        .asString();

    return sanitizeTaskId(response.getBody());
  }

  @Override
  public Task getTaskSatus(String taskId) throws UnirestException {

    HttpResponse<Task> response = Unirest.get(calculateStatusUrl(sanitizeTaskId(taskId)))
        .header("accept", "application/json")
        .asObject(Task.class);

    return response.getBody();

  }

  private String sanitizeTaskId(String taskId) {
    return taskId.replace("\"", "");
  }

  @Override
  public void setHost(String host, int port) {
    this.host = host + ":" + port;
  }

}
