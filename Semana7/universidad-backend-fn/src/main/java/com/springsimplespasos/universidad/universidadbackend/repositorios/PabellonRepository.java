package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Pabellon;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PabellonRepository extends CrudRepository<Pabellon, Integer> {

    Iterable<Pabellon> findPabellonsByDireccion_Localidad(String localidad);
    Optional<Pabellon> findPabellonByNombreIgnoreCase(String nombre);
    Iterable<Pabellon> findPabellonsByFechaAltaBetween(LocalDateTime desde, LocalDateTime hasta);

}
