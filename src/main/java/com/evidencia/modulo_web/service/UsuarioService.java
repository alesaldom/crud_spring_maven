package com.evidencia.modulo_web.service;

import com.evidencia.modulo_web.model.Usuario;
import com.evidencia.modulo_web.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}