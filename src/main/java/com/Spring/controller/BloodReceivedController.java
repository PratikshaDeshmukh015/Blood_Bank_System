package com.Spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Spring.model.BloodReceived;
import com.Spring.service.BloodReceivedService;

import java.util.List;

@RestController
@RequestMapping("/api/units-received")
@CrossOrigin(origins = "*") // allow frontend access
public class BloodReceivedController {

    @Autowired
    private BloodReceivedService bloodUnitService;

    @GetMapping
    public List<BloodReceived> getAllBloodUnits() {
        return bloodUnitService.getAllUnits();
    }
}

