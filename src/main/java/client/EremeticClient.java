package client;

import com.mashape.unirest.http.exceptions.UnirestException;
import eremetic.request.EremeticRequest;
import eremetic.response.Task;

/**
 * Created by Fabian Rivera on 8/28/17.
 */
public interface EremeticClient {

  String createTask(EremeticRequest eremeticRequest) throws UnirestException;

  Task getTaskSatus(String taskId) throws UnirestException;

  void setHost(String host, int port);

}
