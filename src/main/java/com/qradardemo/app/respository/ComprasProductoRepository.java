package com.qradardemo.app.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qradardemo.app.model.ComprasProducto; 
@Repository
public interface ComprasProductoRepository extends JpaRepository<ComprasProducto,Integer> {
    
}
