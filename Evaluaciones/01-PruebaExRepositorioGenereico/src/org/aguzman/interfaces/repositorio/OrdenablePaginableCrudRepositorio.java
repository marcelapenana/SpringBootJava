package org.aguzman.interfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRespositorio<T>, PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {

}
