package com.example.clean;

import com.example.clean.models.LoginRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthResource {

    @POST
    public Response login(LoginRequest loginRequest) {
        System.out.println("********** ********** ********** ********** ********** ********** **********");
        System.out.println("login request: email = " + loginRequest.email + ", password = " + loginRequest.password);

        if (loginRequest.email == null) {
            System.out.println("login error  : email null");
            return Response.status(400).build();
        }
        if (loginRequest.password == null) {
            System.out.println("login error  : password null");
            return Response.status(400).build();
        }
        String email = loginRequest.email.trim();
        String password = loginRequest.password.trim();
        if (email.length() == 0) {
            System.out.println("login error  : email empty");
            return Response.status(400).build();
        }
        if (password.length() == 0) {
            System.out.println("login error  : password empty");
            return Response.status(400).build();
        }
        if (!password.equals("12345678")) {
            System.out.println("login error  : wrong password");
            return Response.status(404).build();
        }
        if (email.equals("success@mail.com")) {
            System.out.println("login successful");
            return Response.ok().build();
        }
        switch (email) {
            case "401@mail.com": {
                System.out.println("login error  : returning error code 401");
                return Response.status(401).build();
            }
            case "403@mail.com": {
                System.out.println("login error  : returning error code 403");
                return Response.status(403).build();
            }
            case "404@mail.com": {
                System.out.println("login error  : returning error code 404");
                return Response.status(404).build();
            }
            case "500@mail.com": {
                System.out.println("login error  : returning error code 500");
                return Response.status(500).build();
            }
        }
        System.out.println("login error  : returning error code 500");
        return Response.status(500).build();
    }
}
