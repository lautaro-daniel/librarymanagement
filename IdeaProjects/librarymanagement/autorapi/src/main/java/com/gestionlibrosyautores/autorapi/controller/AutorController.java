package com.gestionlibrosyautores.autorapi.controller;

import com.gestionlibrosyautores.autorapi.model.Autor;
import com.gestionlibrosyautores.autorapi.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {

    @Autowired
    private IAutorService iAutorService;

    @GetMapping("/{idAutor}")
    public List<Autor> getAutores(){
        return iAutorService.getAutores();
    }

    @PostMapping("/crear")
    public String saveAutor(@RequestBody Autor autor){
        iAutorService.saveAutor(autor);

        return "Autor guardado correctamente.";
    }

    @GetMapping("/autorporlibro/{idLibro}")
    public List<Autor> getAutorByLibro(@PathVariable("idLibro") Long idLibro){
        return iAutorService.findAutorByLibro(idLibro);
    }
}
