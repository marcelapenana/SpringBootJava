package org.example.services;

import jakarta.persistence.EntityManager;
import org.example.entity.Cliente;
import org.example.repositories.ClienteRepository;
import org.example.repositories.CrudRepository;

import java.util.List;
import java.util.Optional;

public class ClienteServiceImpl implements ClienteService{

    private EntityManager em;
    //Creamos un objeto de crud repository y usamos el metodo para nvocar los metodos del repositorio
    private CrudRepository<Cliente> repository;

    //Para comunicarnos con la base de datos usamos entity manager
    public ClienteServiceImpl(EntityManager em) {
        this.em = em;
        this.repository = new ClienteRepository(em);
    }

    @Override
    public List<Cliente> listar() {
        return repository.listar();
    }

    @Override
    public Optional<Cliente> porId(Long id) {
        return Optional.ofNullable(repository.porId(id));
    }
  //En guardar y eliminar usamos metodo get getTransaction() por la base de datos
    @Override
    public void guardar(Cliente cliente) {
        try {//Generamos o manejamos control de error para saber si se hizo la tracsacion

            em.getTransaction().begin();
            repository.guardar(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Long id) {
        try {
            em.getTransaction().begin();
            repository.eliminar(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();//imprime linea de donde viene error
        }
    }
}
