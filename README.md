# springboot-jersey

 - Spring Boot v2.5.5, Spring v5.3.10
 - java 11
 - jersey starter (jersey 2.33)
 - log4j2 starter
 - lombok
 
## Build & test

 - `mvn clean package`
 - `java -jar target/demo-0.0.1-SNAPSHOT.jar`
 - Sample REST service at http://localhost:8080/api/demo

## Links

 - [Spring MVC vs JAX-RS API](https://www.baeldung.com/rest-api-jax-rs-vs-spring)
 - https://developer.okta.com/blog/2019/12/30/java-jersey-jaxrs

For `exception is org.glassfish.jersey.server.internal.scanning.ResourceFinderException: java.io.FileNotFoundException` :

 - https://stackoverflow.com/questions/42194680/spring-boot-application-wont-run-when-trying-to-run-from-the-jar-file
 - https://github.com/spring-projects/spring-boot/issues/7496
 - https://www.ivankrizsan.se/2016/12/06/jersey-and-spring-boot-standalone-jar-files/

## Libs at runtime

 - aopalliance-repackaged-2.6.1.jar
 - asm-7.1.jar
 - asm-analysis-7.1.jar
 - asm-commons-7.1.jar
 - asm-tree-7.1.jar
 - asm-util-7.1.jar
 - class-model-2.6.1.jar
 - classmate-1.5.1.jar
 - hibernate-validator-6.2.0.Final.jar
 - hk2-2.6.1.jar
 - hk2-api-2.6.1.jar
 - hk2-core-2.6.1.jar
 - hk2-locator-2.6.1.jar
 - hk2-runlevel-2.6.1.jar
 - hk2-utils-2.6.1.jar
 - jackson-annotations-2.12.5.jar
 - jackson-core-2.12.5.jar
 - jackson-databind-2.12.5.jar
 - jackson-datatype-jdk8-2.12.5.jar
 - jackson-datatype-jsr310-2.12.5.jar
 - jackson-module-jaxb-annotations-2.12.5.jar
 - jackson-module-parameter-names-2.12.5.jar
 - jakarta.activation-api-1.2.2.jar
 - jakarta.annotation-api-1.3.5.jar
 - jakarta.inject-2.6.1.jar
 - jakarta.validation-api-2.0.2.jar
 - jakarta.ws.rs-api-2.1.6.jar
 - jakarta.xml.bind-api-2.3.3.jar
 - javassist-3.25.0-GA.jar
 - jboss-logging-3.4.2.Final.jar
 - jersey-bean-validation-2.33.jar
 - jersey-client-2.33.jar
 - jersey-common-2.33.jar
 - jersey-container-servlet-2.33.jar
 - jersey-container-servlet-core-2.33.jar
 - jersey-entity-filtering-2.33.jar
 - jersey-hk2-2.33.jar
 - jersey-media-json-jackson-2.33.jar
 - jersey-server-2.33.jar
 - jersey-spring5-2.33.jar
 - jul-to-slf4j-1.7.32.jar
 - log4j-api-2.14.1.jar
 - log4j-core-2.14.1.jar
 - log4j-jul-2.14.1.jar
 - log4j-slf4j-impl-2.14.1.jar
 - lombok-1.18.16.jar
 - osgi-resource-locator-1.0.3.jar
 - slf4j-api-1.7.32.jar
 - snakeyaml-1.28.jar
 - spring-aop-5.3.10.jar
 - spring-beans-5.3.10.jar
 - spring-boot-2.5.5.jar
 - spring-boot-autoconfigure-2.5.5.jar
 - spring-boot-jarmode-layertools-2.5.5.jar
 - spring-bridge-2.6.1.jar
 - spring-context-5.3.10.jar
 - spring-core-5.3.10.jar
 - spring-expression-5.3.10.jar
 - spring-jcl-5.3.10.jar
 - spring-web-5.3.10.jar
 - spring-webmvc-5.3.10.jar
 - tomcat-embed-core-9.0.53.jar
 - tomcat-embed-el-9.0.53.jar
 - tomcat-embed-websocket-9.0.53.jar
