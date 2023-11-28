package repositorio;

import java.util.List;

public interface CrudRepositorio <T>{
    List<T> listar();
    T porId(Integer id);
    void AñadirRegistro(T t);
    void ActualizarRegistros(T t);
    void eliminarRegistros(Integer id);

}
