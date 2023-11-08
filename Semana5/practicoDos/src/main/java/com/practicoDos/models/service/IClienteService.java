package com.practicoDos.models.service;


import com.practicoDos.models.entity.Carrito;
import com.practicoDos.models.entity.Cliente;
import com.practicoDos.models.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);

    public List<Producto> findByNombre(String term);

    public void saveFactura(Carrito factura);

    public Producto findProductoById(Long id);
}
