package com.gestionlibrosyautores.librosapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

    private Long idAutor;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private List<Long> lista_libros;
}
