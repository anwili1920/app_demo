package com.qradardemo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qradardemo.app.dao.CreateUserDAO;
import com.qradardemo.app.dto.CreateInputDTO;
import com.qradardemo.app.respository.CreateUserImpl;
import com.qradardemo.app.utils.Hasher;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class CreateUser {
    @Autowired
    private JdbcTemplate template;
    @Autowired
    Hasher hasher;
    @PostMapping("/createUser")
    public String createUser(@RequestBody CreateInputDTO newUser){ 
        CreateUserDAO crear=new  CreateUserImpl(template,hasher);

        return crear.crearUsuario(newUser); 
    }
}
