package com.inscripcion.universidad.repositorios;

import com.inscripcion.universidad.modelo.entidades.Persona;
import com.inscripcion.universidad.modelo.entidades.Profesor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
    @Query("select p from Persona p where p.nombre = ?1 ")
    Optional<Persona> buscarPorNombre(String nombre);
}
