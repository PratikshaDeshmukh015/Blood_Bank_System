package com.Spring.repositroy;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.model.LoginDonar;


public interface LoginDonarRepo extends JpaRepository<LoginDonar, Long> {
	LoginDonar findByUsernameAndPassword(String username, String password);
}

