package com.example.demo_rest.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_rest.entity.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long> {
    
}
