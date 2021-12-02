package com.example.demo;

import com.example.demo.controllers.DemoController;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Slf4j
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        // Error java -jar ...
        // (nested exception is org.glassfish.jersey.server.internal.scanning.ResourceFinderException: java.io.FileNotFoundException)
        // Since Jersey's scanning step is what's failing, another way to work around it is to explicitly register each resource
        register(DemoController.class);
        //super.packages("com.example.demo.controllers");

        //Providers
        register(RequestFilter.class);
        // Swagger (Resource & Provider)
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        // for static content with jersey JAX-RS
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }

    @PostConstruct
    public void init() {
        log.info("Register the REST endpoints done");
    }
}
