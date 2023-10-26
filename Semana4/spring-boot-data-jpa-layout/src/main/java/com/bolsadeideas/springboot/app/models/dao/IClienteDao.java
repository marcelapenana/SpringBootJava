package com.bolsadeideas.springboot.app.models.dao;


import com.bolsadeideas.springboot.app.models.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{


}
