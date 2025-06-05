package com.Spring.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.Donor;
import com.Spring.repositroy.DonorRepositroy;
import com.Spring.service.DonorService;

import java.util.List;

@Service
public class DonorServiceImpl implements DonorService {

    @Autowired
    private DonorRepositroy donorRepository;

    @Override
    public Donor saveDonor(Donor donor) {
        return donorRepository.save(donor);
    }

    @Override
    public List<Donor> getAllDonors() {
        return donorRepository.findAll();
    }

    @Override
    public Donor loginDonor(String username, String password) {
        return donorRepository.findByUsernameAndPassword(username, password);
    }
}
