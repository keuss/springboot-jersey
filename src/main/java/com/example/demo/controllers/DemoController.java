package com.example.demo.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("demo")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "Demo")
@RequiredArgsConstructor
public class DemoController {

    private final HttpServletRequest request;

    @GET
    @ApiOperation(value = "demo")
    public Response demo() {
        // see http://localhost:8080/my-backend/api/demo
        return Response.ok(new DemoPojo())
                .build();
    }

    @GET
    @Path("demo-auth")
    @ApiOperation(value = "demo-auth")
    public Response demoSession() {
        HttpSession session = request.getSession();
        // Fake auth
        session.setAttribute("USER_ID", "keuss");
        return Response.ok(new DemoPojo())
                .build();
    }

}
