package org.aguzman.interfaces.repositorio;

import java.util.List;

public interface OrdenableRespositorio <T>{
    List<T> listar(String campo, Direccion dir);
}
