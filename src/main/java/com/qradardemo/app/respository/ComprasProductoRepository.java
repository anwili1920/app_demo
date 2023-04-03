package com.qradardemo.app.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.qradardemo.app.model.ComprasProducto;
import com.qradardemo.app.model.ComprasproductoPK;
public interface ComprasProductoRepository extends JpaRepository<ComprasProducto,ComprasproductoPK> {
    
}
