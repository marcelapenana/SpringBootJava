package com.inscripcion.universidad;

import com.inscripcion.universidad.modelo.entidades.Alumno;
import com.inscripcion.universidad.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AlumnosCommandos implements CommandLineRunner {


    @Autowired
    private PersonaDAO servicio;
    @Override
    public void run(String... args) throws Exception {
        Alumno a1=new Alumno(null, "Juan Carlos","Morales", "06509815-6", "Santo Tomás","043495");

        servicio.save(a1);
    }
}
