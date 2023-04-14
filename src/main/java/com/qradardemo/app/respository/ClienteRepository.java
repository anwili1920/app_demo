package com.qradardemo.app.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qradardemo.app.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer>{
    Cliente findByDni(Integer dni);
}
