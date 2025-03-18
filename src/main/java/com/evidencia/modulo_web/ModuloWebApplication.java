package com.evidencia.modulo_web;

import com.evidencia.modulo_web.service.UsuarioService;
import com.evidencia.modulo_web.model.Usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ModuloWebApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ModuloWebApplication.class, args);

		UsuarioService usuarioService = context.getBean(UsuarioService.class);
		usuarioService.guardar(new Usuario());
	}
}
