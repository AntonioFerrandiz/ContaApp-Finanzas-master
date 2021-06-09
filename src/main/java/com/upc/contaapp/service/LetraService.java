package com.upc.contaapp.service;

import com.upc.contaapp.model.Letra;

import java.util.Optional;

public interface LetraService {
    void save(Letra letra);
    public Optional<Letra> findById(Long Id) throws Exception;
}
