package org.aguzman.poointerdaces.repositorio;

import org.aguzman.poointerdaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
