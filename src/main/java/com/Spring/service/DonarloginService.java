package com.Spring.service;

import com.Spring.model.Donarlogin;

public interface DonarloginService {
//    boolean validateLogin(String username, String password);
    boolean registerDonor(Donarlogin donor);
    boolean validateLogin(String username, String password);
}

