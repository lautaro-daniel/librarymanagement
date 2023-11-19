package com.gestionlibrosyautores.librosapi.service;

import com.gestionlibrosyautores.librosapi.model.Libro;

import java.util.List;

public interface ILibroService {
    public List<Libro> getLibros();
    public void saveLibro(Libro libro);

}
