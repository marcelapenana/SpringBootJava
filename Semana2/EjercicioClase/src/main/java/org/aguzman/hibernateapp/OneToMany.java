package org.aguzman.hibernateapp;
import org.aguzman.hibernateapp.entity.Marks;
import org.aguzman.hibernateapp.entity.Student;
import org.aguzman.hibernateapp.util.JpaUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;

public class OneToMany {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Student estudiante = new Student( "Marcela", "Najera");
            em.persist(estudiante);

            Marks notas=new Marks(1);
            notas.getEstudiante(estudiante);
            em.persist(notas);


            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }

    }
}
