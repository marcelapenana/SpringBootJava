package org.aguzman.poointerdaces.repositorio;

public interface OrdenablePaginadelCrudRepositorio<T> extends  OrdenableRepositorio<T>,
        PaginadelRepositorio<T>,
        CrudRepositorio<T>,
        ContableRepositorio{


}
