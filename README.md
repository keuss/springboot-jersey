# springboot-jersey

 - Spring Boot v2.5.5, Spring v5.3.10
 - java 11
 - jersey starter
 - log4j2 starter
 - lombok
 
## Build & test

 - `mvn clean package`
 - `java -jar target/demo-0.0.1-SNAPSHOT.jar`
 - Sample REST service at http://localhost:8080/rest/demo

## Links

 - [Spring MVC vs JAX-RS API](https://www.baeldung.com/rest-api-jax-rs-vs-spring)
 - https://developer.okta.com/blog/2019/12/30/java-jersey-jaxrs

For `exception is org.glassfish.jersey.server.internal.scanning.ResourceFinderException: java.io.FileNotFoundException` :

 - https://stackoverflow.com/questions/42194680/spring-boot-application-wont-run-when-trying-to-run-from-the-jar-file
 - https://github.com/spring-projects/spring-boot/issues/7496
 - https://www.ivankrizsan.se/2016/12/06/jersey-and-spring-boot-standalone-jar-files/
