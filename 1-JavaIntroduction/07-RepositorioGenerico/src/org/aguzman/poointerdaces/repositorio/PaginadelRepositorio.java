package org.aguzman.poointerdaces.repositorio;

import org.aguzman.poointerdaces.modelo.Cliente;

import java.util.List;

public interface PaginadelRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
