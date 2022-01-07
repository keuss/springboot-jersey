package com.example.demo;

import com.example.demo.controllers.ApiError;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Provider
public class RequestFilter implements ContainerRequestFilter {

    private final List<String> methodsNotProtected = Arrays.asList("OPTIONS", "HEAD");
    private final List<String> urlNotProtectedBySession = Arrays.asList(
            "swagger.json",
            "swagger.yaml",
            "template"
    );

    // TODO API key value check should be externalized
    private static final String API_KEY = "DEMO_API_KEY";

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {

        String method = containerRequestContext.getMethod();
        String path = containerRequestContext.getUriInfo().getPath();

        if (methodsNotProtected.contains(method)) {
            return;
        }

        if (urlNotProtectedBySession.contains(path)) {
            return;
        }

        String apiKey = containerRequestContext.getHeaderString("MY-API-KEY");
        if (!API_KEY.equals(apiKey)) {
            ApiError msg = new ApiError();
            msg.setMessage("Unauthorized API key");
            containerRequestContext.abortWith(Response.status(Response.Status.FORBIDDEN).entity(msg)
                    .type(MediaType.APPLICATION_JSON).build());
        }
    }
}
