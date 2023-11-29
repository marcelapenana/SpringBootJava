package interfaces.repositorio;

import interfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> listar(int desde, int hasta);
}
