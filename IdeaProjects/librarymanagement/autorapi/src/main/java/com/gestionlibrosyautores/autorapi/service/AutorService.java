package com.gestionlibrosyautores.autorapi.service;

import com.gestionlibrosyautores.autorapi.model.Autor;
import com.gestionlibrosyautores.autorapi.repository.IAutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService implements IAutorService{

    @Autowired
    private IAutorRepository iAutorRepository;

    @Override
    public List<Autor> getAutores() {
        return iAutorRepository.findAll();
    }

    @Override
    public void saveAutor(Autor autor) {
        iAutorRepository.save(autor);
    }

    @Override
    public List<Autor> findAutorByLibro(Long idLibro) {
        return iAutorRepository.findAutorByLibro(idLibro);
    }
}
