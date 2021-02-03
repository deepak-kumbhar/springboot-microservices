# springboot-microservices
This repository contains best way to implement microservices in springboot using service registry, config server, api gateway, hystrix, zipkin and microservices.

For zipkin server you need to download Jar from https://zipkin.io/ and you can simply run the server using java -jar command.

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.


## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Clone the application
```git clone https://github.com/deepak-kumbhar/springboot-microservices.git```

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.deepak.kumbhar.api.gateway.ApiGatewayApplication`
`com.deepak.kumbhar.hystrix.dashboard.HystrixDashboardApplication`
`com.deepakkumbhar.serviceregistry.ServiceRegistryApplication`
`com.deepak.kumbhar.userservice.UserServiceApplication`
`com.deepak.kumbhar.config.server.ConfigServerApplication`
`com.deepak.kumbhar.department.DepartmentServiceApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

