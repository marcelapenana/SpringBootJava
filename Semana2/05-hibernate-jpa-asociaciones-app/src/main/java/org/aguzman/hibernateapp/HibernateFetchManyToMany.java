package org.aguzman.hibernateapp;

import jakarta.persistence.EntityManager;
import org.aguzman.hibernateapp.entity.Alumno;
import org.aguzman.hibernateapp.entity.Cliente;
import org.aguzman.hibernateapp.util.JpaUtil;

import java.util.List;

public class HibernateFetchManyToMany {
    public static void main(String[] args) {
        EntityManager em= JpaUtil.getEntityManager();
        List<Alumno> alumnos=em.createQuery("Select distinct a from Alumno "
                +"a left outer join fetch a.cursos", Alumno.class).getResultList();
        alumnos.forEach(c -> System.out.println(c.getNombre()+ ", cursos: "));
        em.close();
    }
}
