package com.gestionlibrosyautores.autorapi.repository;

import com.gestionlibrosyautores.autorapi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {

    @Query("SELECT a FROM Autor a WHERE :idLibro MEMBER OF a.lista_libros")
    List<Autor> findAutorByLibro(Long idLibro);

}
