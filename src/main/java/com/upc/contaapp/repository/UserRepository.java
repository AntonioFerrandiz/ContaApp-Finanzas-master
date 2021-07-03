package com.upc.contaapp.repository;

import com.upc.contaapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    User findByDni(String dni);
    User findByCompanyruc(String companyruc);
}
