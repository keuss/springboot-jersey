# springboot-jersey

 - Spring Boot v2.5.8, Spring v5.3.14
 - java 11
 - jersey starter (jersey 2.33)
 - log4j2 starter (2.17.1)
 - Docker compose
 - Redis cache for http session (spring-session)
 - Lombok
 - Swagger UI 2.2.8 + API KEY
 
## Build & test

 - `mvn clean package`
 - `docker-compose build`
 - `docker-compose up`
 - Swagger UI : http://localhost:8080/my-backend/swagger-ui.html (AIP Key value : `DEMO_API_KEY`, header `MY-API-KEY`)
 - Sample REST service at http://localhost:8080/my-backend/api/demo
 - Template : http://localhost:8080/my-backend/template (to test http session with redis)


## Redis

```
docker exec -it redis_container /bin/bash


root@67249e3c5442:/data# redis-cli keys *
1) "spring:session:expirations:1641573420000"
2) "spring:session:sessions:852f6fcc-9973-4266-8f7b-3242650d68ed"
3) "spring:session:sessions:expires:852f6fcc-9973-4266-8f7b-3242650d68ed"

root@67249e3c5442:/data# redis-cli type spring:session:sessions:852f6fcc-9973-4266-8f7b-3242650d68ed
hash

root@67249e3c5442:/data# redis-cli hgetall spring:session:sessions:852f6fcc-9973-4266-8f7b-3242650d68ed
1) "sessionAttr:USER_ID"
2) "\xac\xed\x00\x05t\x00\x05keuss"
3) "maxInactiveInterval"
4) "\xac\xed\x00\x05sr\x00\x11java.lang.Integer\x12\xe2\xa0\xa4\xf7\x81\x878\x02\x00\x01I\x00\x05valuexr\x00\x10java.lang.Number\x86\xac\x95\x1d\x0b\x94\xe0\x8b\x02\x00\x00xp\x00\x00\a\b"
5) "lastAccessedTime"
6) "\xac\xed\x00\x05sr\x00\x0ejava.lang.Long;\x8b\xe4\x90\xcc\x8f#\xdf\x02\x00\x01J\x00\x05valuexr\x00\x10java.lang.Number\x86\xac\x95\x1d\x0b\x94\xe0\x8b\x02\x00\x00xp\x00\x00\x01~5P\xd3\xcf"
7) "creationTime"
8) "\xac\xed\x00\x05sr\x00\x0ejava.lang.Long;\x8b\xe4\x90\xcc\x8f#\xdf\x02\x00\x01J\x00\x05valuexr\x00\x10java.lang.Number\x86\xac\x95\x1d\x0b\x94\xe0\x8b\x02\x00\x00xp\x00\x00\x01~5IW2"
```

## Links

Jersey :

 - https://github.com/indrabasak/spring-jersey-swagger-example
 - [Spring MVC vs JAX-RS API](https://www.baeldung.com/rest-api-jax-rs-vs-spring)
 - https://developer.okta.com/blog/2019/12/30/java-jersey-jaxrs

For `exception is org.glassfish.jersey.server.internal.scanning.ResourceFinderException: java.io.FileNotFoundException` :

 - https://stackoverflow.com/questions/42194680/spring-boot-application-wont-run-when-trying-to-run-from-the-jar-file
 - https://github.com/spring-projects/spring-boot/issues/7496
 - https://www.ivankrizsan.se/2016/12/06/jersey-and-spring-boot-standalone-jar-files/

Http Session and Redis :

 - https://www.baeldung.com/spring-session
 - https://github.com/eugenp/tutorials/tree/master/spring-security-modules/spring-session
 - https://spring.io/projects/spring-session
 - https://www.javadevjournal.com/spring/spring-session/
 - https://docs.spring.io/spring-session/docs/2.2.x/reference/html/httpsession.html
 - https://www.javainuse.com/spring/springboot_session
 - https://www.javainuse.com/spring/springboot_session_redis
 - https://stackoverflow.com/questions/37355049/persist-spring-session-without-spring-security
 - https://github.com/vpavic/javacro16-spring-session
 - https://programming.vip/docs/spring-session-redis-to-realize-distributed-session.html
 - https://stackoverflow.com/questions/51229372/unable-to-store-session-in-redis-using-java-spring-boot-session-data-redis
 - https://github.com/spring-projects/spring-session/blob/main/spring-session-core/src/main/java/org/springframework/session/FlushMode.java



