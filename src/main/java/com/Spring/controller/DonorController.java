package com.Spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Spring.model.Donor;
import com.Spring.service.DonorService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/donorslogin")
public class DonorController {

    @Autowired
    private DonorService donorService;

    // Register Donor
    @PostMapping("/register")
    public ResponseEntity<?> registerDonor(@RequestBody Donor donor) {
        try {
            return ResponseEntity.ok(donorService.saveDonor(donor));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Registration failed: " + e.getMessage());
        }
    }

    // Login Donor
    @PostMapping("/login")
    public ResponseEntity<?> loginDonor(@RequestBody Donor loginRequest) {
        Donor donor = donorService.loginDonor(loginRequest.getUsername(), loginRequest.getPassword());
        if (donor != null) {
            return ResponseEntity.ok(donor);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    // View All Donors
    @GetMapping("/view")
    public ResponseEntity<?> viewAllDonors() {
        try {
            List<Donor> donors = donorService.getAllDonors();
            return ResponseEntity.ok(donors);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to fetch donors: " + e.getMessage());
        }
    }
}
