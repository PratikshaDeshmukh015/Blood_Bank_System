package com.Spring.service;


import java.util.List;

import com.Spring.model.Donor;

public interface DonorService {
    Donor saveDonor(Donor donor);
    List<Donor> getAllDonors();
    Donor loginDonor(String username, String password);
}
