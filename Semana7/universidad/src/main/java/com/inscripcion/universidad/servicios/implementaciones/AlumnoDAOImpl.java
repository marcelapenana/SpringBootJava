package com.inscripcion.universidad.servicios.implementaciones;

import com.inscripcion.universidad.modelo.entidades.Persona;
import com.inscripcion.universidad.repositorios.AlumnoRepository;
import com.inscripcion.universidad.repositorios.PersonaRepository;
import com.inscripcion.universidad.servicios.contratos.AlumnoDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO {

    @Autowired
    public AlumnoDAOImpl(@Qualifier("repositorioAlumnos") PersonaRepository repository) {
        super(repository);
    }

}
