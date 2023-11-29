package org.aguzman.poointerdaces.repositorio.lista;

import org.aguzman.poointerdaces.modelo.Cliente;
import org.aguzman.poointerdaces.repositorio.AbstractaListRepositorio;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort(( a,  b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC) {
                resultado = ordenar(campo, a,b);
            } else if(dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return  resultado;
        });
        return listaOrdenada;
    }



}
