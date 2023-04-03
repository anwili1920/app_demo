package com.qradardemo.app.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.qradardemo.app.model.Producto;
public interface ProductoRepository extends JpaRepository<Producto,Integer>{
    Producto findBycodigoBarras(String codigoBarras);
}
