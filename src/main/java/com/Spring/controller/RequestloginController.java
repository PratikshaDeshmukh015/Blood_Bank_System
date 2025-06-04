package com.Spring.controller;


import com.Spring.service.RequestloginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // NOTE: Use @RestController to return JSON
public class RequestloginController {

    @Autowired
    private RequestloginService donorLoginService;

    @PostMapping("/request-login")
    public ResponseEntity<?> processLogin(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        boolean isValid = donorLoginService.validateLogin(username, password);

        if (isValid) {
            return ResponseEntity.ok(Map.of("message", "Login successful!"));
        } else {
            return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
        }
    }
}


