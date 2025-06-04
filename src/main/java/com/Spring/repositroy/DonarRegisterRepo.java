package com.Spring.repositroy;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.model.DonarRegister;

@Repository
public interface DonarRegisterRepo extends JpaRepository<DonarRegister, Long> {
    // You can add custom queries here if needed
    DonarRegister findByUsernameAndPassword(String username, String password);

}
