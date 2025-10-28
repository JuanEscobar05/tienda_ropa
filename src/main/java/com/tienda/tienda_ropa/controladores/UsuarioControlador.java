package com.tienda.tienda_ropa.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.tienda_ropa.modelos.Usuario;
import com.tienda.tienda_ropa.servicios.UsuarioServicio;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioControlador {

    @Autowired
    UsuarioServicio servicio;

    //Guardar
    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody Usuario datos){
        try {
            return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(this.servicio.guardarUsuario(datos));
        } catch (Exception error) {
            return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(error.getMessage());
        }
    }

    //Buscar Todos 
    @GetMapping
     public ResponseEntity<?> buscar(){
        try {
            return ResponseEntity
            .status(HttpStatus.OK)
            .body(this.servicio.buscarUsuarios());
        } catch (Exception error) {
            return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .body(error.getMessage());
        }
    }
    
}
