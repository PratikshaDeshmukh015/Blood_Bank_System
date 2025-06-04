package com.Spring.repositroy;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.model.Requestlogin;

public interface RequestloginRepo extends JpaRepository<Requestlogin, Integer> {
    Requestlogin findByUsernameAndPassword(String username, String password);

}


