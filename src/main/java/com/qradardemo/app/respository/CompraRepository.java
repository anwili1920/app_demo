package com.qradardemo.app.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qradardemo.app.model.Compra;

public interface CompraRepository extends JpaRepository<Compra,Integer>{
    
}
