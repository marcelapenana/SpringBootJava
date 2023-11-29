package com.inscripcion.universidad.servicios.implementaciones;


import com.inscripcion.universidad.modelo.entidades.Persona;
import com.inscripcion.universidad.repositorios.PersonaRepository;
import com.inscripcion.universidad.servicios.contratos.PersonaDAO;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository> implements PersonaDAO {

    public PersonaDAOImpl(PersonaRepository repository) {
        super(repository);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorNombre(String nombre) {
        return repository.buscarPorNombre(nombre);}

    @Override
    @Transactional(readOnly = true)
    public Optional<Persona> buscarPorDui(String dui) {
        return repository.buscarPorDui(dui);
    }


}
