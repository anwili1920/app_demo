package com.qradardemo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qradardemo.app.dto.buyProductsDTO;

@RestController
public class BuyApis {
    @Autowired
    private JdbcTemplate template; 
    @PostMapping("/buyproducts")
    public String createUser(@RequestBody buyProductsDTO carrito){  
        
        return  null;
    }
}
