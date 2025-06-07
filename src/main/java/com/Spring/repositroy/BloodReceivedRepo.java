package com.Spring.repositroy;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.model.BloodReceived;

public interface BloodReceivedRepo extends JpaRepository<BloodReceived, Long> {
}
