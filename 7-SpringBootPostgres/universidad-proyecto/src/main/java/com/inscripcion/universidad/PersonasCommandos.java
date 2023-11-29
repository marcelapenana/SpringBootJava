package com.inscripcion.universidad;

import com.inscripcion.universidad.modelo.entidades.*;
import com.inscripcion.universidad.repositorios.AsistenciaRepository;
import com.inscripcion.universidad.repositorios.CarreraRepository;
import com.inscripcion.universidad.repositorios.MateriaRepository;
import com.inscripcion.universidad.repositorios.ProfesorRepository;
import com.inscripcion.universidad.servicios.contratos.AsistenciaDAO;
import com.inscripcion.universidad.servicios.contratos.CarreraDAO;
import com.inscripcion.universidad.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonasCommandos implements CommandLineRunner {


    @Autowired
    private PersonaDAO servicio;
    @Autowired
    private CarreraRepository carreraServicio;
    @Autowired
    private AsistenciaRepository asistenciaServicio;
    @Autowired
    private MateriaRepository materiaServicio;
    @Autowired
    private ProfesorRepository profesorServicio;
    @Override
    public void run(String... args) throws Exception {
     /*   Alumno a1=new Alumno(null, "Juan Carlos","Morales", "06509815-6", "Santo Tomás","043495");
        Alumno a2=new Alumno(null, "Marcela","Najera", "16509815-8", "San Marcos","042345");
        Alumno a3=new Alumno(null, "Javier","Duran", "26509815-6", "Santo Tomás","043499");

        servicio.save(a1);
        servicio.save(a2);
        servicio.save(a3);*/

      /*  Carrera c1 =new Carrera(null, "Sistemas informaticos", 5,"Ciencias de la computación");
        Carrera c2 =new Carrera(null, "Desarrollo de software", 5,"Ciencias de la computación");
        Carrera c3 =new Carrera(null, "Redes informaticas", 5,"Ciencias de la computación");
        carreraServicio.save(c1);
        carreraServicio.save(c2);
        carreraServicio.save(c3);*/

       /* Materia m1=new Materia(null, "Estadistica", "30167", null);
        materiaServicio.save(m1);
        Materia m2=new Materia(null, "Fisica", "10167", null);
        materiaServicio.save(m2);*/

       /* Asistencia As1=new Asistencia(null, null);
        asistenciaServicio.save(As1);
        Asistencia As2=new Asistencia(null, null);
        asistenciaServicio.save(As2);
        Asistencia As3=new Asistencia(null, null);
        asistenciaServicio.save(As3);*/

        /*Profesor p1=new Profesor(null, "Marcela", "Nájera","5686735-6","Mexicanos",700.00);
        profesorServicio.save(p1);
        Profesor p2=new Profesor(null, "Juan", "Guzmán","3326735-6","Alta vista ",700.00);
        profesorServicio.save(p2);
        Profesor p3=new Profesor(null, "Maria", "Morgan","6726735-6","Alta vista ",700.00);
        profesorServicio.save(p3);*/

    }
}
