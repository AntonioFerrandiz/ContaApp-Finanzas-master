package com.upc.contaapp.service;

import com.upc.contaapp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
    User findByEmail(String email);

    User findByDni(String dni);
    User findByCompanyruc(String companyruc);
}
