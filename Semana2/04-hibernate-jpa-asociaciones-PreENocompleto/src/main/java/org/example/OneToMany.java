package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Marks;
import org.example.entity.Subject;
import org.example.entity.Teacher;
import org.example.util.JpaUtil;

public class OneToMany {
    public static void main(String[] args) {
        EntityManager em= JpaUtil.getEntityManager();
        try {
        em.getTransaction().begin();
        //creamos materia y asignamos maestro

            Teacher maestro=new Teacher("Sandra","Montes");
            Teacher maestro2=new Teacher("Sandra","Montes");
            Subject materia=new Subject("Matematicas");
            Subject materia2=new Subject("Ciencias");


            //Asignamos maestro a la materia
            materia.getMaestros().add(maestro);
            em.persist(materia);

        em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
           em.close();
        }
    }
}
