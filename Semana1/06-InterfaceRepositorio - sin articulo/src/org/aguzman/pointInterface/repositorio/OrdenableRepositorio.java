package org.aguzman.pointInterface.repositorio;

import org.aguzman.pointInterface.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
