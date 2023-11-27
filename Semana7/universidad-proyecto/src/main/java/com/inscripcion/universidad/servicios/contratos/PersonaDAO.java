package com.inscripcion.universidad.servicios.contratos;

import com.inscripcion.universidad.modelo.entidades.Persona;

import java.util.Optional;

public interface PersonaDAO extends GenericoDAO<Persona> {

    Optional<Persona> buscarPorNombre(String nombre);
    Optional<Persona> buscarPorDui(String dui);


}
