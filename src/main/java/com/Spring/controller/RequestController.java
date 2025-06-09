package com.Spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Spring.model.Request;
import com.Spring.service.RequestService;

@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow CORS for frontend to connect
@RestController
@RequestMapping("/api/requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping("/save")
    public Request submitBloodRequest(@RequestBody Request request) {
        return requestService.saveRequest(request);
    }
    
    @GetMapping("/all")
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }
    
    @PutMapping("/update/{number}")
    public Request updateBloodRequest(@PathVariable Long number, @RequestBody Request updatedRequest) {
        return requestService.updateRequest(number, updatedRequest);
    }

    // Delete request by number
    @DeleteMapping("/delete/{number}")
    public ResponseEntity<?> deleteBloodRequest(@PathVariable Long number) {
        boolean deleted = requestService.deleteRequest(number);
        if (deleted) {
            return ResponseEntity.ok().body("Request deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Request not found with number: " + number);
        }
    }
}

