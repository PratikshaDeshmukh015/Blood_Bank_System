package com.Spring.service.imp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.DonarRegister;
import com.Spring.repositroy.DonarRegisterRepo;
import com.Spring.service.DonarRegisterService;

@Service
public class DonarRegisterServiceImp implements DonarRegisterService {

    @Autowired
    private DonarRegisterRepo donorRepository;

    @Override
    public DonarRegister saveDonor(DonarRegister donor) {
        return donorRepository.save(donor);
    }

    @Override
    public List<DonarRegister> getAllDonors() {
        return donorRepository.findAll();
    }
    
    @Override
    public DonarRegister getDonorByCredentials(String userName, String password) {
        return donorRepository.findByUsernameAndPassword(userName, password);
    }
}
