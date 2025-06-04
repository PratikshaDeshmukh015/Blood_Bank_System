package com.Spring.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Spring.model.Donarlogin;

public interface DonarloginRepo extends JpaRepository<Donarlogin, Integer> {
    Donarlogin findByUsernameAndPassword(String username, String password);
}
