package com.qradardemo.app.respository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.qradardemo.app.dao.storeDAO;
import com.qradardemo.app.dto.ItemDTO;
import com.qradardemo.app.dto.buyProductsDTO;
import com.qradardemo.app.model.Compra;
import com.qradardemo.app.model.ComprasProducto;
import com.qradardemo.app.model.Producto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class storeImpl implements storeDAO {
    private JdbcTemplate template;
    private CompraRepository compras;
    private ProductoRepository productos;
    // private ComprasProductoRepository comprasxproductosrepo;
    @Override
    public Compra realizarCompra(buyProductsDTO carrito){
        //INSERT INTO BASE_DATOS.COMPRAS(fid_cliente,fecha,medio_pago,comentario) VALUES (3,TO_DATE('2022-12-11', 'YYYY-MM-DD'),'T','RECOJO EN TIENDA');
        Compra nuevacompra= new Compra();

        nuevacompra.setCliente(carrito.getCliente());
        List<ItemDTO> productosSelect= carrito.getCarrito();
        List<ComprasProducto> items= new ArrayList<ComprasProducto>();
        for(ItemDTO item: productosSelect){
            ComprasProducto it=new ComprasProducto();
            it.setCantidad(item.getCantidad());
            Producto producto = infoProducto(item);
             it.setTotal(it.getCantidad()*it.getProducto().getPrecioVenta());
            items.add(it);
        }
        nuevacompra.setProductos(items);
        // String query="SELECT ID_COMPRA,FID_CLIENTE,FECHA,MEDIO_PAGO,COMENTARIO FROM BASE_DATOS.COMPRAS";
        // listado= template.query(query,new BeanPropertyRowMapper<Compra>(Compra.class)); 
        compras.save(nuevacompra);
        // for(ComprasProducto compraxproducto: items){
        //     comprasxproductosrepo.save(compraxproducto);
        // }
        return nuevacompra;
    }
    @Override
    public Producto infoProducto(ItemDTO item) {
        Producto producto = new Producto();
        List<Producto> listado= new ArrayList<Producto>();
        String query="SELECT ID_PRODUCTO,NOMBRE,FID_CATEGORIA,CODIGO_BARRAS,PRECIO_VENTA,CANTIDAD_STOCK FROM BASE_DATOS.PRODUCTOS";
        listado= template.query(query,new BeanPropertyRowMapper<Producto>(Producto.class)); 
        for(Producto p: listado){
            if(p.getCodigoBarras().equals(item.getCodigoBarras())){
                producto=p;
            }
        }
        
        return producto;
    }
    
}
