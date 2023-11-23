package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Aula;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AulaRepository extends CrudRepository<Aula, Integer> {

    Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
    Iterable<Aula> findAulasByPabellon_Nombre(String nombre);
    Optional<Aula> findAulaByNroAula(Integer nroAula);

}
