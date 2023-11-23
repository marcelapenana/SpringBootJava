package com.inscripcion.universidad;

import com.inscripcion.universidad.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AlumnosCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("alumnoDAOImpl")
    private PersonaDAO personaDAO;


    @Override
    public void run(String... args) throws Exception {

    }
}
