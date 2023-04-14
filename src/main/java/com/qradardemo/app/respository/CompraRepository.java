package com.qradardemo.app.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qradardemo.app.model.Compra;
@Repository
public interface CompraRepository extends JpaRepository<Compra,Integer>{
    
}
