package com.Spring.repositroy;



import org.springframework.data.jpa.repository.JpaRepository;
import com.Spring.model.Request;

public interface RequestRepo extends JpaRepository<Request, Long> {
}

