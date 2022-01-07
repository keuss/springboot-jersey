package com.example.demo.controllers;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/auth")
@Component
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "Auth")
@RequiredArgsConstructor
public class AuthController {

    private final HttpServletRequest request;

    @POST
    @Path("/user/{userId}")
    @ApiOperation(value = "auth")
    public Response authenticate(@PathParam("userId") String userId) {
        // Returns the current session associated with this request, or if the request does not have a session, creates one.
        HttpSession session = request.getSession();
        // Fake auth
        AuthResponse authResponse = new AuthResponse();
        authResponse.setAuthenticate(true);
        session.setAttribute("USER_ID", userId);
        return Response.ok(authResponse).build();
    }
}
