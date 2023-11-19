package com.gestionlibrosyautores.autorapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAutor;
    private String nombreCompleto;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    private String nacionalidad;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Long> lista_libros;
}
