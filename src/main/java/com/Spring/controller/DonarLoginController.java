//package com.Spring.controller;
//
//import com.Spring.service.DonarloginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Map;
//
//@RestController // NOTE: Use @RestController to return JSON
//public class DonarLoginController {
//
//    @Autowired
//    private DonarloginService donorLoginService;
//
//    @PostMapping("/login")
//    public ResponseEntity<?> processLogin(@RequestBody Map<String, String> loginData) {
//        String username = loginData.get("username");
//        String password = loginData.get("password");
//
//        boolean isValid = donorLoginService.validateLogin(username, password);
//
//        if (isValid) {
//            return ResponseEntity.ok(Map.of("message", "Login successful!"));
//        } else {
//            return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
//        }
//    }
//}



package com.Spring.controller;

import com.Spring.model.Donarlogin;
import com.Spring.service.DonarloginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class DonarLoginController {

    @Autowired
    private DonarloginService donorService;

    @PostMapping("/register")
    public ResponseEntity<?> registerDonor(@RequestBody Donarlogin donor) {
        boolean success = donorService.registerDonor(donor);
        if (success) {
            return ResponseEntity.ok(Map.of("message", "Registration successful"));
        } else {
            return ResponseEntity.badRequest().body(Map.of("error", "Username already exists"));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginDonor(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        boolean valid = donorService.validateLogin(username, password);
        if (valid) {
            return ResponseEntity.ok(Map.of("message", "Login successful"));
        } else {
            return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
        }
    }
    
    @PostMapping("/login1")
    public ResponseEntity<?> loginDonor1(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        boolean valid = donorService.validateLogin(username, password);
        if (valid) {
            return ResponseEntity.ok(Map.of("message", "Login successful"));
        } else {
            return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
        }
    
}
}
