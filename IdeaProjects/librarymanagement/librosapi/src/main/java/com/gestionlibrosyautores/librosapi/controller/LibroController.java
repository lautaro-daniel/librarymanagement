package com.gestionlibrosyautores.librosapi.controller;

import com.gestionlibrosyautores.librosapi.model.Libro;
import com.gestionlibrosyautores.librosapi.service.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/libros")
public class LibroController {
    @Autowired
    private ILibroService iLibroService;
    @GetMapping("/traer")
    public List<Libro> getLibroInfo(){
        return iLibroService.getLibros();
    }

    @PostMapping("/crear")
    public String crearLibro(@RequestBody Libro libro){
        iLibroService.saveLibro(libro);

        return "Libro creado correctamente";
    }
}
