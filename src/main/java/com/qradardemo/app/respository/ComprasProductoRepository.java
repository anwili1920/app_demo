package com.qradardemo.app.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qradardemo.app.model.ComprasProducto;
import com.qradardemo.app.model.ComprasproductoPK;
@Repository
public interface ComprasProductoRepository extends JpaRepository<ComprasProducto,ComprasproductoPK> {
    
}
