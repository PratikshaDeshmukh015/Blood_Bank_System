package com.Spring.repositroy;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Spring.model.DonarRegister;

public interface BloodAvailableRepo extends CrudRepository<DonarRegister, Long> {

    @Query("SELECT d.bloodGroup, SUM(d.units) FROM DonarRegister d GROUP BY d.bloodGroup")
    List<Object[]> getTotalDonatedUnits();

}

