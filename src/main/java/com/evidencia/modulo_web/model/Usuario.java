package com.evidencia.modulo_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;

//    public Usuario() {
//    }
//
//    public Usuario(String nombre, String email) {
//        this.nombre = nombre;
//        this.email = email;
//    }
//
//    public Usuario(Long id, String nombre, String email) {
//        this.id = id;
//        this.nombre = nombre;
//        this.email = email;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

