package org.aguzman.pointInterface.repositorio;

import org.aguzman.pointInterface.modelo.Articulo;
import org.aguzman.pointInterface.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    //Metodos
    List<Cliente> listar();
    Cliente porId(Integer Id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(Integer id);


}
