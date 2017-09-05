# Eremetic Java Client
Simple client for Eremetic Framework. It lets you create one shot tasks and retrieve its status by calling the Eremetic Framework API.

## Getting started

Creating the client
```java
EremeticClient client = new EremeticClientBuilder(EremeticClientBuilder.ClientType.HTTP)
        .setHost("http://localhost")
        .setPort(8080)
        .build();
```

Building the request
```java
EremeticRequest request = new EremeticRequestBuilder()
        .setTaskCpus(1.0f)
        .setTaskMem(2048.0f)
        .setDockerImage("here goes the docker image")
        .setForcePullImage(false)
        .setCommand("echo \"Hello World!!\"")
        .addVolume("/container/path", "/host/path")
        .addEnv("environment", "dev")
        .build();
```

Sending the request to the eremetic framework and retrieving the task id
```java
String taskId = client.createTask(request);
System.out.println("TaskId=" + taskId);

// Getting the task status using the task id
Task task = client.getTaskSatus(taskId);

// Printing the task
System.out.println(new ObjectMapper().writeValueAsString(task));
```
