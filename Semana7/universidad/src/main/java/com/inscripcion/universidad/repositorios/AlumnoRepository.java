package com.inscripcion.universidad.repositorios;

import com.inscripcion.universidad.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("repositorioAlumnos")
public interface AlumnoRepository extends PersonaRepository {

    @Query("select a from Alumno a join fetch a.materia c where c.nombre = ?1")
    Iterable<Persona> buscarAlumnosPorNombreMateria(String nombre);

}
