package com.Spring.service;

import java.util.List;

import com.Spring.model.DonarModel;

public interface DonarService {
    DonarModel saveDonor(DonarModel donor);
    List<DonarModel> getAllDonors();
   
    

   

}


