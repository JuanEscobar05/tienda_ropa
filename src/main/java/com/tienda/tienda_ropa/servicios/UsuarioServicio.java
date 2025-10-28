package com.tienda.tienda_ropa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.tienda_ropa.modelos.Usuario;
import com.tienda.tienda_ropa.repositorios.IusuarioResositorio;


@Service
public class UsuarioServicio {
    
    @Autowired
    IusuarioResositorio resositorio;

    //Guardar
    public boolean guardarUsuario (Usuario datos)throws Exception{
        try {
            this.resositorio.save(datos);
            return true;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    //Buscar Todos
    public List<Usuario> buscarUsuarios()throws Exception{
        try {
            return this.resositorio.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
