package com.upgrad.patterns.Authentication;

import com.upgrad.patterns.Middleware.AuthenticationProcessor;
import com.upgrad.patterns.Middleware.BasicAuthProcessor;
import com.upgrad.patterns.Middleware.JwtAuthProcessor;

import javax.servlet.http.HttpServletRequest;

public class Authenticator {
	
    //create a public static method GetAuthProcessor of the return type AuthenticationProcessor
    public static AuthenticationProcessor GetAuthProcessor() { 
	    // create an object of type JwtAuthProcessor
        // Chain Authentication processors, first JWT processor is to be used first and then basic auth processor
        AuthenticationProcessor basicAuthProcessor = new BasicAuthProcessor(null);
        AuthenticationProcessor jwtAuthProcessor = new JwtAuthProcessor(basicAuthProcessor);

	    // return the object
        return jwtAuthProcessor;
    }

    public static AuthenticationProvider GetAuthProvider(HttpServletRequest request)
    {
        if(request.getHeader("Authorization") != null)
            return new JwtAuthProvider(request.getHeader("Authorization"));
        return new BasicAuthProvider(request.getHeader("Username"), request.getHeader("Password"));
    }
}
