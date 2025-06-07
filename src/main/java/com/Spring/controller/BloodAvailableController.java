package com.Spring.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Spring.model.BloodAvailable;
import com.Spring.service.BloodAvailableService;

import java.util.List;

@RestController
@RequestMapping("/blood")
@CrossOrigin("*")
public class BloodAvailableController {

    @Autowired
    private BloodAvailableService inventoryService;

    @GetMapping("/available")
    public List<BloodAvailable> getAvailableBlood() {
        return inventoryService.getAvailableBloodUnits();
    }
}
