package com.example.demo;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.models.Swagger;
import io.swagger.models.auth.ApiKeyAuthDefinition;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;

@Configuration
@Slf4j
public class SwaggerConfig implements ServletContextAware {

    @Value("${spring.jersey.application-path:/api}")
    private String apiPath;

    @Value("${server.servlet.context-path:/my-backend}")
    private String contextPath;

    private ServletContext servletContext;

    @Bean
    public BeanConfig config() {
        // see http://localhost:8080/my-backend/swagger-ui.html
        BeanConfig config = new BeanConfig();
        config.setConfigId("springboot-jersey");
        config.setTitle("API SpringBoot Jersey");
        config.setVersion("1.0.0");
        config.setResourcePackage("com.example.demo.controllers");
        config.setPrettyPrint(true);
        config.setBasePath(this.contextPath + this.apiPath);
        config.setScan(true);

        // ADD API-KEY, KO with UI >= 3.x, use last 2 version
        // https://github.com/swagger-api/swagger-ui/releases/tag/v2.2.8
        Swagger swagger = config.getSwagger();
        ApiKeyAuthDefinition ssd = new ApiKeyAuthDefinition();
        ssd.setType("apiKey");
        ssd.setName("MY-API-KEY");
        ssd.setIn(In.HEADER);
        ssd.setDescription("API KEY");
        // OR api_key ?
        swagger.addSecurityDefinition("api_key", ssd);
        // to get Authorize in UI
        servletContext.setAttribute("swagger", swagger);

        return config;
    }

    @PostConstruct
    public void init() {
        log.info("Swagger config done");
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
