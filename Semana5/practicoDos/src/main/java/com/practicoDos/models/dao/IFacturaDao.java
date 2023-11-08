package com.practicoDos.models.dao;


import com.practicoDos.models.entity.Carrito;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Carrito, Long>{

}