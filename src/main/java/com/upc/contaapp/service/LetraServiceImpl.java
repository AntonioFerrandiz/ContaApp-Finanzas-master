package com.upc.contaapp.service;

import com.upc.contaapp.model.Letra;
import com.upc.contaapp.repository.LetraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LetraServiceImpl implements LetraService{

    @Autowired
    private LetraRepository letraRepository;

    @Override
    public void save(Letra letra) {
        letraRepository.save(letra);
    }

    @Override
    public Optional<Letra> findById(Long Id) throws Exception {
        return letraRepository.findById(Id);
    }


}
