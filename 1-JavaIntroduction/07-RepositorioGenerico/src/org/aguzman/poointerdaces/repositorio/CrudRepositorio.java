package org.aguzman.poointerdaces.repositorio;

import org.aguzman.poointerdaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T>{
    //Metodos
    List<T> listar();
    T porId(Integer Id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);


}
