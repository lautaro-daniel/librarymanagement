package com.gestionlibrosyautores.librosapi.model;

import com.gestionlibrosyautores.librosapi.dto.AutorDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;
    private String titulo;
    @Temporal(TemporalType.DATE)
    private LocalDate anioPublicacion;
    private String descripcion;
    @JdbcTypeCode(SqlTypes.JSON)
    @ElementCollection(fetch = FetchType.EAGER)
    private List<AutorDTO> autores;

}
