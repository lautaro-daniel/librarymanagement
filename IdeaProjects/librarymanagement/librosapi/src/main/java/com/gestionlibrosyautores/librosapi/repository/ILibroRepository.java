package com.gestionlibrosyautores.librosapi.repository;

import com.gestionlibrosyautores.librosapi.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {
}
