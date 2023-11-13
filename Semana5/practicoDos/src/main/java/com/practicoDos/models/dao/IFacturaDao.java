package com.practicoDos.models.dao;


import com.practicoDos.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}