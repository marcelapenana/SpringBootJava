package org.example;

import jakarta.persistence.EntityManager;
import org.example.entity.Marks;
import org.example.entity.Student;
import org.example.util.JpaUtil;

public class ManyToOne {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();

            Student estudiante = new Student( "Marcela", "Najera");
            em.persist(estudiante);

            Marks notas=new Marks(1);
            notas.setEstudiante(estudiante);
            em.persist(notas);

            System.out.println(notas);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }

    }
}
