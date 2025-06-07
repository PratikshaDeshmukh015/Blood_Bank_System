package com.Spring.repositroy;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Spring.model.Request;

public interface RequestRepo extends JpaRepository<Request, Long> {
	@Query("SELECT r.bloodGroup, SUM(r.units) FROM Request r GROUP BY r.bloodGroup")
    List<Object[]> getTotalRequestedUnits();
}

