package com.Spring.service;

import java.util.List;

import com.Spring.model.DonarRegister;

public interface DonarRegisterService {
    DonarRegister saveDonor(DonarRegister donor);
    List<DonarRegister> getAllDonors();
    DonarRegister getDonorByCredentials(String userName, String password);
}
