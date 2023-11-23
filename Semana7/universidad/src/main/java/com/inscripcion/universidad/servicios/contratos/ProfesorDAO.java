package com.inscripcion.universidad.servicios.contratos;

import com.inscripcion.universidad.modelo.entidades.Persona;
import com.inscripcion.universidad.modelo.entidades.Profesor;


import java.util.Optional;

public interface ProfesorDAO extends GenericoDAO<Profesor>{

    Optional<Persona> buscarPorNombre(String nombre);
}
