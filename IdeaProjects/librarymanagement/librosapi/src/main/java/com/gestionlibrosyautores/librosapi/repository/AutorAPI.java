package com.gestionlibrosyautores.librosapi.repository;

import com.gestionlibrosyautores.librosapi.model.Autor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "autorapi", url = "http://localhost:9006/autor")
public interface AutorAPI {

    @GetMapping("/autorporlibro/{idLibro}")
    public List<Autor> getAutorByLibro(@PathVariable("idLibro") int idLibro);
}
