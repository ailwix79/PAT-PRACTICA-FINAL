package com.main.controller;

import com.main.utility.Credentials;
import com.main.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    // Register new user
    @PostMapping(path="/register",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Boolean register(@RequestBody Credentials registerInfo) {
        return authService.registerNewUser(registerInfo);
    }

    // Login of existing user
    @PostMapping(path="/login",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Boolean login(@RequestBody Credentials credentials) {
        return authService.validateLogin(credentials);
    }
}
