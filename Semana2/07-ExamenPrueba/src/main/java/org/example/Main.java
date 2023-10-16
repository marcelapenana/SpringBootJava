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

            //creas maestro
            Teacher maestro1=new Teacher("Juan", "Jaramillo");
            SubjectTeacher mateMaestro1=new SubjectTeacher();
            mateMaestro1.setGrupo(grupo1);
            mateMaestro1.setSubject(materia1);
            mateMaestro1.setTeacher(maestro1);
            //agregas datos a la lista
            maestro1.add(mateMaestro1);
            //guardamos maestro
            em.persist(maestro1);

            Teacher maestro2=new Teacher("Morgan", "Jaramillo");
            em.persist(maestro2);

            //PRI DATA BASE
            System.out.println(nota1);

            em.getTransaction().commit();

            em.getTransaction().begin();
            Teacher update=em.find(Teacher.class,1L);

            update.setNombre("Marcela");
            update.setApellido("Najera");
            em.merge(update);
    /*      Teacher t3 = em.find(Teacher.class , 1L);
             em.remove(t3);*/

            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}