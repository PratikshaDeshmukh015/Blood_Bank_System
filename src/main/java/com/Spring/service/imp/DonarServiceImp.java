package com.Spring.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.DonarModel;
import com.Spring.repositroy.DonarRepo;
import com.Spring.service.DonarService;


@Service
public class DonarServiceImp implements DonarService {

    @Autowired
    private DonarRepo donorRepository;

    @Override
    public DonarModel saveDonor(DonarModel donor) {
        return donorRepository.save(donor);
    }
    
    @Override
    public List<DonarModel> getAllDonors() {
        return donorRepository.findAll();
    }
    
   
}
