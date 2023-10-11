package interfaces.repositorio.lista;

import interfaces.modelo.Producto;
import interfaces.repositorio.AbstractaListRepositorio;
import interfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    public void editar(Producto producto) {
        Producto p = porId(producto.getId());
        p.setDescipcion(producto.getDescipcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> lisaOrdenada = new ArrayList<>(this.dataSource);
        lisaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC) {
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return lisaOrdenada;
    }

    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "Nombre" -> resultado = a.getDescipcion().compareTo(b.getDescipcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());

        }
        return resultado;
    }
}
