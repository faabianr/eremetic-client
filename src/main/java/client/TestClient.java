package client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import eremetic.request.EremeticRequest;
import eremetic.request.EremeticRequestBuilder;
import eremetic.response.Task;

/**
 * Created by Fabian Rivera on 8/29/17.
 */
public class TestClient {

  public static void main(String args[]) {

    // Building the eremetic client
    EremeticClient client = new EremeticClientBuilder(EremeticClientBuilder.ClientType.HTTP)
        .setHost("http://localhost")
        .setPort(8080)
        .build();

    // Building the request
    EremeticRequest request = new EremeticRequestBuilder()
        .setTaskCpus(1.0f)
        .setTaskMem(2048.0f)
        .setDockerImage("here goes the docker image")
        .setForcePullImage(false)
        .setCommand("echo \"Hello World!!\"")
        .addVolume("/container/path", "/host/path")
        .addEnv("environment", "dev")
        .build();

    try {

      // Sending the request to the eremetic framework and
      // retrieving the task id
      String taskId = client.createTask(request);
      System.out.println("TaskId=" + taskId);

      Thread.sleep(2000);

      // Getting the task status using the task id
      Task task = client.getTaskSatus(taskId);

      // Printing the task
      System.out.println(new ObjectMapper().writeValueAsString(task));

    } catch (UnirestException e) {
      e.printStackTrace();
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }

}
