package com.upc.contaapp.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
