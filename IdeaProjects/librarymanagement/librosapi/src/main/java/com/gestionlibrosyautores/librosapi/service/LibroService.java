package com.gestionlibrosyautores.librosapi.service;

import com.gestionlibrosyautores.librosapi.dto.AutorDTO;
import com.gestionlibrosyautores.librosapi.model.Autor;
import com.gestionlibrosyautores.librosapi.model.Libro;
import com.gestionlibrosyautores.librosapi.repository.ILibroRepository;
import com.gestionlibrosyautores.librosapi.repository.AutorAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService implements ILibroService {

    @Autowired
    private ILibroRepository iLibroRepository;

    @Autowired
    private AutorAPI autorApi;
    @Override
    public List<Libro> getLibros() {
        return iLibroRepository.findAll();
    }

    @Override
    public void saveLibro(Libro libro) {
        AutorDTO autorDTO = new AutorDTO();
        List<AutorDTO> listaAutorDTO = new ArrayList<>();
        List<Autor> listaAutores = autorApi.getAutorByLibro(libro.getIdLibro());

        for (Autor autor : listaAutores ){
            autorDTO.setNombreCompleto(autor.getNombreCompleto());
            autorDTO.setNacionalidad(autor.getNacionalidad());
            listaAutorDTO.add(autorDTO);
        }

        libro.setAutores(listaAutorDTO);
        iLibroRepository.save(libro);

    }
}
