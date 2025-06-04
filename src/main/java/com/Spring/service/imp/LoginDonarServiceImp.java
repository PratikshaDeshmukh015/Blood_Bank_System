package com.Spring.service.imp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.LoginDonar;
import com.Spring.repositroy.LoginDonarRepo;
import com.Spring.service.LoginDonarService;



@Service
public class LoginDonarServiceImp implements LoginDonarService {

    @Autowired
    private LoginDonarRepo loginRepository;

    @Override
    public boolean validateLogin(String username, String password) {
    	LoginDonar user = loginRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
}
