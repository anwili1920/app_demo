package com.qradardemo.app.respository;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.qradardemo.app.dao.StoreDAO;
import com.qradardemo.app.dto.ItemDTO;
import com.qradardemo.app.dto.ResponseBuyList;
import com.qradardemo.app.dto.buyProductsDTO;
import com.qradardemo.app.model.Cliente;
import com.qradardemo.app.model.Compra;
import com.qradardemo.app.model.ComprasProducto; 
import com.qradardemo.app.model.Producto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StoreImpl implements StoreDAO {
    private JdbcTemplate template;
    private CompraRepository compras;
    private ProductoRepository productos;
    private ComprasProductoRepository comprasxproductosrepo;
    private ClienteRepository clientes;
    @Override
    public ResponseBuyList realizarCompra(buyProductsDTO carrito){
        //INSERT INTO BASE_DATOS.COMPRAS(fid_cliente,fecha,medio_pago,comentario) VALUES (3,TO_DATE('2022-12-11', 'YYYY-MM-DD'),'T','RECOJO EN TIENDA');
        Compra nuevacompra= new Compra();
        Cliente clientecompra=  clientes.findByDni(carrito.getCliente().getDni());
        if(clientecompra==null){
            clientes.save(carrito.getCliente());
            clientecompra=  clientes.findByDni(carrito.getCliente().getDni());
        }
        //clientes.findOne(); //carrito.getCliente().getDni()
        
        nuevacompra.setComentario("Esta es un intento de compra");
        nuevacompra.setEstado(1);
        nuevacompra.setMedioPago("T");
        nuevacompra.setFecha(LocalDateTime.now());
        //nuevacompra.setIdCliente(clientecompra.getIdCliente());
        
        compras.save(nuevacompra);
        List<ItemDTO> productosSelect= carrito.getCarrito();
        List<ComprasProducto> items= new ArrayList<ComprasProducto>();
        for(ItemDTO item: productosSelect){
            ComprasProducto it=new ComprasProducto();
            nuevacompra.setCliente(clientecompra);
            it.setCantidad(item.getCantidad());
            Producto producto = infoProducto(item);
            it.setProducto(producto);
            it.setCompra(nuevacompra);

            //it.setId(new ComprasproductoPK(nuevacompra.getIdCompra(),producto.getIdProducto()));
            it.setTotal(it.getCantidad()*it.getProducto().getPrecioVenta());
            items.add(it);
        }
        nuevacompra.setProductos(items);
        compras.save(nuevacompra);
        //Compra resultado = compras.getReferenceById(nuevacompra.getIdCompra());
        ResponseBuyList resultado = new ResponseBuyList();
        Cliente clienteaux = new Cliente();
        clientecompra.setCompras(null);// en este caso porquqe el servicio no lo necesita
        nuevacompra.setCliente(null);
        resultado.setCliente(clientecompra);
        resultado.setCompra(nuevacompra);
        return resultado;
    }
    @Override
    public Producto infoProducto(ItemDTO item) {
        List<Producto> listado= new ArrayList<Producto>();
        String query="SELECT ID_PRODUCTO,NOMBRE,FID_CATEGORIA,CODIGO_BARRAS,PRECIO_VENTA,CANTIDAD_STOCK FROM BASE_DATOS.PRODUCTOS";
        listado= template.query(query,new BeanPropertyRowMapper<Producto>(Producto.class)); 
        for(Producto p: listado){
            if(p.getCodigoBarras().equals(item.getCodigoBarras())){
                return p;
            }
        }
        return null;
    }
    
}
