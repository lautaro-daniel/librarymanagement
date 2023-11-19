package com.gestionlibrosyautores.autorapi.service;

import com.gestionlibrosyautores.autorapi.model.Autor;

import java.util.List;

public interface IAutorService {
    public List<Autor> getAutores();
    public void saveAutor(Autor autor);
    public List<Autor> findAutorByLibro(Long idLibro);
}
