package com.qradardemo.app.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qradardemo.app.dto.LoginInputDTO;
import com.qradardemo.app.dto.LoginResponseDTO;
import com.qradardemo.app.respository.LoginImpl;
import com.qradardemo.app.respository.UsuarioRepository;
import com.qradardemo.app.utils.Hasher; 

@RestController
public class Login {
    @Autowired
    private UsuarioRepository usuarioRepository; 

    @Autowired
    private Hasher hasher; 
    
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginInputDTO loginInputDTO){
        LoginImpl login = new LoginImpl(usuarioRepository, hasher);  
        return new ResponseEntity<LoginResponseDTO>(login.ejecutar(loginInputDTO), HttpStatus.OK); 
    }
    
   
}
