package facturacliente.models.dao;

import facturacliente.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {
    public List<Cliente> findAll();

    public void save(Cliente cliente);

    public Cliente findOne(Long id);

    public void delete(Long id);
}
