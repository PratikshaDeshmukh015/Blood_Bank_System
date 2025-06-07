package com.Spring.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.BloodReceived;
import com.Spring.repositroy.BloodReceivedRepo;
import com.Spring.service.BloodReceivedService;

import java.util.List;

@Service
public class BloodReceivedServiceImp implements BloodReceivedService {

    @Autowired
    private BloodReceivedRepo bloodUnitRepository;

    @Override
    public List<BloodReceived> getAllUnits() {
        return bloodUnitRepository.findAll();
    }
}

