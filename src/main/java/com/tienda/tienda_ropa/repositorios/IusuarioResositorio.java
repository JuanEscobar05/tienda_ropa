package com.tienda.tienda_ropa.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.tienda_ropa.modelos.Usuario;

@Repository
public interface IusuarioResositorio extends JpaRepository<Usuario, Integer>{
    
}
