package com.tuuniversidad.demo.controller;
import java.util.Optional;

import com.tuuniversidad.demo.exception.LibroException;
import com.tuuniversidad.demo.models.Libro;
import com.tuuniversidad.demo.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tuuniversidad.demo.exception.LibroException;
import com.tuuniversidad.demo.models.Libro;
import com.tuuniversidad.demo.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {
    private final LibroService libroService;
    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }
    @GetMapping
    public List<Libro> obtenerTodosLosLibros() {
        return libroService.obtenerTodosLosLibros();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerLibroPorId(@PathVariable Long id) {
        Optional<Libro> libro = libroService.obtenerLibroPorId(id);
        if (libro.isPresent()) {
            return ResponseEntity.ok(libro.get());
        } else {
            throw new LibroException("No se encontró el libro");
        }
    }

    @PostMapping
    public String crearLibro(@RequestBody Libro libro) {
        libroService.agregarLibro(libro);
        return "Libro creado exitosamente.";
    }
    @ExceptionHandler(LibroException.class)
    public ResponseEntity<String> handleLibroException(LibroException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
