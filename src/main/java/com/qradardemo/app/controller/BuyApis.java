package com.qradardemo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qradardemo.app.dao.StoreDAO;
import com.qradardemo.app.dto.ResponseBuyList;
import com.qradardemo.app.dto.buyProductsDTO;
import com.qradardemo.app.model.Compra;
import com.qradardemo.app.respository.StoreImpl;
import com.qradardemo.app.respository.ClienteRepository;
import com.qradardemo.app.respository.CompraRepository;
import com.qradardemo.app.respository.ComprasProductoRepository;
import com.qradardemo.app.respository.ProductoRepository;
@RestController
public class BuyApis {
    @Autowired
    private JdbcTemplate template; 
    @Autowired
    private CompraRepository compras;
    @Autowired
    private ProductoRepository productos;
    @Autowired
    private ComprasProductoRepository comprasxproductosrepo;
    @Autowired
    private ClienteRepository clientes;
    //new ResponseEntity<List<JSONObject>>(entities, HttpStatus.OK);
    @PostMapping("/buyproducts")
    public ResponseBuyList comprarProductos(@RequestBody buyProductsDTO carrito){  
        StoreDAO comprar = new StoreImpl(template,compras,productos,comprasxproductosrepo,clientes);
        ResponseBuyList comprarealizada=  comprar.realizarCompra(carrito), resultado;
        //ResponseEntity<Compra> resultado= new ResponseEntity<Compra>(comprarealizada, HttpStatus.OK);

        return  comprarealizada;
    }
}
