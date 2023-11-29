package com.inscripcion.universidad.repositorios;

import com.inscripcion.universidad.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

@NoRepositoryBean
public interface PersonaRepository extends CrudRepository<Persona, Integer> {

    @Query("select p from Persona p where p.nombre = ?1 ")
    Optional<Persona> buscarPorNombre(String nombre);
    @Query("select p from Persona p where p.dui = ?1")
    Optional<Persona> buscarPorDui(String dui);

}
