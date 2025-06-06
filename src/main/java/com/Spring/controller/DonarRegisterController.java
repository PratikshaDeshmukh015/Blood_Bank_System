package com.Spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Spring.model.DonarRegister;
import com.Spring.service.DonarRegisterService;

@RestController
@RequestMapping("/donors")
@CrossOrigin(origins = "*")  // enable CORS for frontend requests
public class DonarRegisterController {

    @Autowired
    private DonarRegisterService donorService;

    @PostMapping("/register")
    public ResponseEntity<?> registerDonor(@RequestBody DonarRegister donor) {
        try {
            DonarRegister savedDonor = donorService.saveDonor(donor);
            return ResponseEntity.ok().body("Donor registered successfully with ID: " + savedDonor.getId());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to register donor: " + e.getMessage());
        }
    }

    // NEW: View all donors
    @GetMapping("/view")
    public ResponseEntity<?> viewAllDonors() {
        try {
            return ResponseEntity.ok(donorService.getAllDonors());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Failed to fetch donors: " + e.getMessage());
        }
    }



    
@PostMapping("/login")
public ResponseEntity<?> loginDonor(@RequestBody DonarRegister loginRequest) {
    try {
        DonarRegister donor = donorService.getDonorByCredentials(
            loginRequest.getUsername(),
            loginRequest.getPassword()
        );

        if (donor != null) {
            return ResponseEntity.ok(donor);  // Return only this donor's data
        } else {
            return ResponseEntity.status(401).body("Invalid username or password.");
        }

    } catch (Exception e) {
        return ResponseEntity.status(500).body("Login failed: " + e.getMessage());
    }
}

@PutMapping("/update")
public ResponseEntity<?> updateDonor(@RequestBody DonarRegister donorUpdate) {
    try {
        DonarRegister updatedDonor = donorService.updateDonor(donorUpdate);
        return ResponseEntity.ok(updatedDonor);
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Failed to update donor: " + e.getMessage());
    }
}
}


