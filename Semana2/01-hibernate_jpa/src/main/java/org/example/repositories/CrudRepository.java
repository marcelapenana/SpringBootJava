package org.example.repositories;

import java.util.List;

public interface CrudRepository<T> {
    //Estan de manera generica y en el servis no
    //Comun por tablas y se puede definir otra interfaz para definir otros metodos como buscar por id, como reportes
    //puede ser solicitudes independientes
    List<T> listar();
    T porId(Long id);
    void guardar(T t);
    void eliminar(Long id);
}
