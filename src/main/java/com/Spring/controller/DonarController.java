
//admin side
package com.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Spring.model.DonarModel;
import com.Spring.service.DonarService;



@CrossOrigin(origins = "http://127.0.0.1:5500") 
@RestController
@RequestMapping("/api/donors")
public class DonarController {

    @Autowired
    private DonarService donorService;

    @PostMapping("/save")
    public DonarModel saveDonor(@RequestBody DonarModel donor) {
        return donorService.saveDonor(donor);
    }
    
    @GetMapping("/all")
    public List<DonarModel> getAllDonors() {
        return donorService.getAllDonors();
    }
    

}
