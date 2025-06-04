package com.Spring.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.Donarlogin;
import com.Spring.repositroy.DonarloginRepo;
import com.Spring.service.DonarloginService;

@Service
public class DonarloginServiceImp implements DonarloginService {

    @Autowired
    private DonarloginRepo donorLoginRepository;

    @Override
    public boolean validateLogin(String username, String password) {
        Donarlogin donor = donorLoginRepository.findByUsernameAndPassword(username, password);
        return donor != null;
    }
}
