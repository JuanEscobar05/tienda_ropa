package com.tienda.tienda_ropa.modelos;

import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
@Table(name = "usuarios")
public class Usuario {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false,unique = false)
    private String nombre;

    @Column(length = 100, nullable = false,unique = true)
    private String contraseña;

    private LocalDate fechaNacimiento;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String contraseña, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

}
