// Esta clase se encarga de llamar los métodos creados en el servicio para retornar lo que necesitemos desde la vista y los renderiza en el localhost 8080

package com.evidencia.modulo_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UsuarioController {
    @GetMapping("/")
    public String obtenerUsuarios(Model model) {
        model.addAttribute("nombre", "Usuario de Ejemplo");
        return "usuarios";
    }
}
