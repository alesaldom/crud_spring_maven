package com.evidencia.modulo_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class DatabaseController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/test-db")
    public String testDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            return "✅ Conexión exitosa a la base de datos!";
        } catch (Exception e) {
            return "❌ Error de conexión: " + e.getMessage();
        }
    }
}
