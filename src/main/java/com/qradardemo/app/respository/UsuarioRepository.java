package com.qradardemo.app.respository;
 
//import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.qradardemo.app.model.Usuario;

@Service
public class UsuarioRepository{
    JdbcTemplate template;
    // public Usuario findByEmail(String email){
        
    //     String query = "SELECT id_usuario,fid_cliente,email,password,activo FROM BASE_DATOS.USUARIOS WHERE email="+email;
    //     //List<Usuario>listaUsuarios=template.query(query, new BeanPropertyRowMapper<Usuario>(Usuario.class)); 
	// 	Usuario usuario = (Usuario)template.queryForObject(query,new BeanPropertyRowMapper(Usuario.class)); 
    //     return usuario;
    // }
}

/*
 public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    Optional<Usuario> findByEmail(String email);
 */