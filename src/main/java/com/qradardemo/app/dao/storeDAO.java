package com.qradardemo.app.dao; 

import com.qradardemo.app.dto.buyProductsDTO;
import com.qradardemo.app.model.Compra; 

public interface storeDAO {
    public Compra realizarCompra(buyProductsDTO carrito);
}
