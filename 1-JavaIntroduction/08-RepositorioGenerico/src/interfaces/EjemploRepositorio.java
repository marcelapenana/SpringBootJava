package interfaces;

import interfaces.modelo.Cliente;
import interfaces.repositorio.AbstractaListRepositorio;
import interfaces.repositorio.Direccion;
import interfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {
        AbstractaListRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente( "jani", "Perez"));
        repo.crear(new Cliente( "jani", "Abarca"));
        repo.crear(new Cliente( "jani", "Zelaya"));
        repo.crear(new Cliente( "jani", "Berta"));


        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);



        System.out.println("==========Paginable================");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);

      /*  System.out.println("=========Ordenar===================");
        List<Cliente> clientesOrdenAsc = repo.listar("apellido", Direccion.ASC);
        for(Cliente c: clientesOrdenAsc){
            System.out.println(c);
        }*/

        System.out.println("==============EDITAR==============");
        Cliente beaActualizar=new Cliente("Beatridx", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea= (Cliente) repo.porId(2);
        System.out.println(bea);

        System.out.println("================================");
        repo.listar("nombre", Direccion.ASC).forEach(System.out::println);

        System.out.println("======================Eliminar==================");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("======================total================");
        System.out.println("Total registros" + repo.total());

    }
}
