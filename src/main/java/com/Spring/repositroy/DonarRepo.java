package com.Spring.repositroy;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Spring.model.DonarModel;


public interface DonarRepo extends JpaRepository<DonarModel, Integer> {

	
	
	}
