package com.universidadbackend.servicios.contratos;


import com.universidadbackend.modelo.entidades.Persona;

public interface AlumnoDAO extends PersonaDAO {

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);

}
