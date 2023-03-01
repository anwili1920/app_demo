package com.qradardemo.app.respository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qradardemo.app.model.Usuario;

@Repository
public class UsuarioRepository{
    public Usuario findByEmail(String email){

        return null;
    }
}

/*
 public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    Optional<Usuario> findByEmail(String email);
 */