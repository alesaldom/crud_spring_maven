package com.evidencia.modulo_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

//@RequestMapping("/usuario")

public class UsuarioController {
//    @GetMapping("/")
//    public String mostrarInicio() {
//        return "index";
//    }
    @GetMapping("/")
    public String obtenerUsuarios(Model model) {
        model.addAttribute("nombre", "Usuario de Ejemplo");
        return "usuarios";
    }
}
