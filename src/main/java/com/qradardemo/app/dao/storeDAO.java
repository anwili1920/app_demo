package com.qradardemo.app.dao; 

import java.util.List;

import com.qradardemo.app.dto.ItemDTO;
import com.qradardemo.app.dto.buyProductsDTO;
import com.qradardemo.app.model.Compra;
import com.qradardemo.app.model.Producto; 

public interface storeDAO {
    public Compra realizarCompra(buyProductsDTO carrito);
    public Producto infoProducto(ItemDTO item);
}
