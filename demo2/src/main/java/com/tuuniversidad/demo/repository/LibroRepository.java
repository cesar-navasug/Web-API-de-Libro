package com.tuuniversidad.demo.repository;

import com.tuuniversidad.demo.models.Libro;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

public class LibroRepository {
    private List<Libro> libros;

    public LibroRepository() {
        libros = new ArrayList<>();
        libros.add(new Libro(1L, "A la costa", "Luis Alfredo Martínez", "Casa de la Cultura Ecuatoriana", 1904));
        libros.add(new Libro(2L, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967));
        libros.add(new Libro(3L, "La Emancipada", "Ricardo Palma", "El Conejo - Miguel Riofrio", 1864));
		libros.add(new Libro(4L, "Huasipungo", "Jorge Icaza", "Tirant Lo Blanch.", 1934));
		libros.add(new Libro(5L, "Juyungo", "Adalberto Ortiz", "Americalee", 1943));
    }
    public List<Libro> obtenerTodosLosLibros() {
        return libros;
    }
    public Optional<Libro> obtenerLibroPorId(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
