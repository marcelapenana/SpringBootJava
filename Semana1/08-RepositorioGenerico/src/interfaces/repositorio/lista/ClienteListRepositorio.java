package interfaces.repositorio.lista;


import interfaces.modelo.Cliente;
import interfaces.repositorio.AbstractaListRepositorio;
import interfaces.modelo.Cliente;
import interfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class  ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    private List<Cliente> dataSource;

    public ClienteListRepositorio(){this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar(){
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id){
        Cliente resultado = null;
        for (Cliente cli: dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    public void crear (Cliente cliente){
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente){
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar (String campo, Direccion dir){
        List<Cliente> lisaOrdenada = new ArrayList<>(this.dataSource);
        lisaOrdenada.sort((a,b) ->{
            int resultado = 0;
            if (dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);

            } else if (dir == Direccion.DESC) {
                resultado = ordenar(campo, b, a);
            }
            return resultado;
        });
        return lisaOrdenada;
    }
    @Override
    public List<Cliente> listar(int desde, int hasta){
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id"->
                resultado= a.getId().compareTo(b.getId());
            case "Nombre" ->
                resultado = a.getNombre().compareTo(b.getNombre());
            case "Apellido"->
            resultado = a.getApellido().compareTo(b.getApellido());

        }
        return resultado;
    }
    @Override
    public int total(){
        return this.dataSource.size();
    }
}