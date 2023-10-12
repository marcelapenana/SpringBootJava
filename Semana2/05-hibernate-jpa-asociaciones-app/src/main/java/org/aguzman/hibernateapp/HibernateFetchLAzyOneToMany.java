package org.aguzman.hibernateapp;

import jakarta.persistence.EntityManager;
import org.aguzman.hibernateapp.entity.Cliente;
import org.aguzman.hibernateapp.util.JpaUtil;

public class HibernateFetchLAzyOneToMany {
    public static void main(String[] args) {

        //FetchType.LAZY para OneToMany y ManyToMany por defecto
        //FechType.EAGER para ManyToOne OneToOne por defecto
        EntityManager em= JpaUtil.getEntityManager();
        Cliente cliente=em.find(Cliente.class, 1L);
        System.out.println(cliente.getNombre()+"direcciones: "+cliente.getDirecciones());
        em.close();
    }
}
