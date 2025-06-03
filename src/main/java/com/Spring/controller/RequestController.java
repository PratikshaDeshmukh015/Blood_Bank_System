package com.Spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}

