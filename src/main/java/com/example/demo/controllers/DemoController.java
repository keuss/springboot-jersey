package com.example.demo.controllers;


import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("demo")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DemoController {

    @GET
    public Response demo() {
        // see http://localhost:8080/api/demo
        return Response.ok(new DemoPojo())
                .build();
    }

}
