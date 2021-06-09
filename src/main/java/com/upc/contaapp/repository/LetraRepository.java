package com.upc.contaapp.repository;

import com.upc.contaapp.model.Letra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LetraRepository extends JpaRepository<Letra,Long> {
    public Optional<Letra> findById(Long Id);
}
