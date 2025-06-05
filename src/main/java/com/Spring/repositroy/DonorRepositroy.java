package com.Spring.repositroy;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.model.Donor;


public interface DonorRepositroy extends JpaRepository<Donor, Long> {
    Donor findByUsernameAndPassword(String username, String password);
}

