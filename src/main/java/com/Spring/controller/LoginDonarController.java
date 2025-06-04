package com.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Spring.model.DonarRegister;
import com.Spring.repositroy.DonarRegisterRepo;


@RestController
@CrossOrigin(origins = "*")
public class LoginDonarController {

    @Autowired
    private DonarRegisterRepo registerRepo;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
        DonarRegister donor = registerRepo.findByUsernameAndPassword(request.getUsername(), request.getPassword());

        if (donor != null) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }

    // Inner class to receive login data
    static class LoginRequest {
        private String username;
        private String password;

        // Getters and Setters
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }

        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}
