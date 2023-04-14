package com.qradardemo.app.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qradardemo.app.model.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    Producto findBycodigoBarras(String codigoBarras);
}
