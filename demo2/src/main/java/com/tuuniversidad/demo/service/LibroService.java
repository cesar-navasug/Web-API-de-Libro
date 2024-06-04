package com.tuuniversidad.demo.service;

import com.tuuniversidad.demo.models.Libro;
import com.tuuniversidad.demo.repository.LibroRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    private final LibroRepository libroRepository;
    public LibroService() {
        this.libroRepository = new LibroRepository();
    }
    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.obtenerTodosLosLibros();
    }
    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libroRepository.obtenerLibroPorId(id);
    }
    public void agregarLibro(Libro libro) {
        libroRepository.agregarLibro(libro);
    }
}