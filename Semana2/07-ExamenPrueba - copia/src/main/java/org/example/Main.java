package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.*;
import org.example.util.JpaUtil;

public class Main {
    public static void main(String[] args) {

        EntityManager em= JpaUtil.getEntityManager();


        try {
            em.getTransaction().begin();
            //*******

            Group grupo1=new Group("Grupo Analisis de datos");
            em.persist(grupo1);


            Subject materia1=new Subject("Matematica");
            em.persist(materia1);

            Student estudiante1=new Student("Marcela", "Peña");
            estudiante1.setGrupo(grupo1);
            em.persist(estudiante1);

            Marks nota1=new Marks(1);
            nota1.setEstudiante(estudiante1);
            nota1.setMateria(materia1);
            em.persist(nota1);

            Teacher maestro1=new Teacher("Juan", "Jaramillo");
            em.persist(maestro1);

            SubjectTeacher mateMaestro1=new SubjectTeacher();
            mateMaestro1.setGrupo(grupo1);
            mateMaestro1.setSubject(materia1);
            mateMaestro1.setTeacher(maestro1);
            em.persist(mateMaestro1);

            //PRI DATA BASE
            System.out.println(nota1);

            //*******
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}