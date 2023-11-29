package interfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends OrdenableRepositorio<T>, PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio{
}

//se pueden heredar muchas interaces se llama multiherencia solo con interface
//Esta interfaz reune las demas interfaces
//PAra usar todas accedemos por medio de esta
