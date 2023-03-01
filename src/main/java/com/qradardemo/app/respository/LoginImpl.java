package com.qradardemo.app.respository;

import java.util.HashMap;
import java.util.Map;

import com.qradardemo.app.dto.LoginInputDTO;
import com.qradardemo.app.dto.LoginResponseDTO;
import com.qradardemo.app.model.Usuario;
import com.qradardemo.app.utils.Hasher;
import com.qradardemo.app.utils.JWTUtils;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LoginImpl {
    UsuarioRepository usuarioRepository;
    
    Hasher hasher; 

    public LoginResponseDTO ejecutar(LoginInputDTO loginInputDTO){
        Usuario usuario = usuarioRepository.findByEmail(loginInputDTO.getEmail()); 
        if(usuario == null || !hasher.compare(loginInputDTO.getPassword(), usuario.getPassword())){
            return new LoginResponseDTO(null); 
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sub", usuario.getId());
        map.put("correo", usuario.getEmail());
        long exp = 3600; 
        return new LoginResponseDTO(JWTUtils.build(exp, map, "123"));
    } 
}
