package org.aguzman.pointInterface.repositorio;

import org.aguzman.pointInterface.modelo.Cliente;

import java.util.List;

public interface PaginadelRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
