package com.evidencia.modulo_web.servlet;

import com.evidencia.modulo_web.model.Usuario;
import com.evidencia.modulo_web.service.UsuarioService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.stereotype.Component;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Component("/usuarios")
public class UsuarioServlet extends HttpServlet {
    @Autowired
    private UsuarioService usuarioService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Usuario usuario = objectMapper.readValue(req.getReader(), Usuario.class);
        Usuario nuevoUsuario = usuarioService.guardar(usuario);
        resp.setContentType("application/json");
        objectMapper.writeValue(resp.getWriter(), nuevoUsuario);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        usuarioService.eliminar(id);
        resp.getWriter().write("Usuario eliminado");
    }
}