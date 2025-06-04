package com.Spring.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.Requestlogin;
import com.Spring.repositroy.RequestloginRepo;
import com.Spring.service.RequestloginService;

@Service
public class RequestloginServiceImp implements RequestloginService {

    @Autowired
    private RequestloginRepo requestloginRepo;

    @Override
    public boolean validateLogin(String username, String password) {
        Requestlogin requestlogin = requestloginRepo.findByUsernameAndPassword(username, password);
        return requestlogin != null;
    }
}
