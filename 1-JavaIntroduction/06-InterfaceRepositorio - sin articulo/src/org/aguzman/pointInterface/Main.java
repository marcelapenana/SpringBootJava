package org.aguzman.pointInterface;

import org.aguzman.pointInterface.modelo.Cliente;
import org.aguzman.pointInterface.repositorio.ClienteListRepositorio;
import org.aguzman.pointInterface.repositorio.Direccion;
import org.aguzman.pointInterface.repositorio.OrdenablePaginadelCrudRepositorio;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //No es una instanciación totalmente
        OrdenablePaginadelCrudRepositorio repo=new ClienteListRepositorio();
        repo.crear(new Cliente("jano","perez"));
        repo.crear(new Cliente("Bea","Gonzales"));
        repo.crear(new Cliente("Luci","Martinez"));
        repo.crear(new Cliente("Andres","Guzman"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("==============PAGINABLE==============");
        List<Cliente> paginable=repo.listar(1,4);
        paginable.forEach(System.out::println);

       /* List<Cliente>clienteOrdenAsc=repo.listar("apellido", Direccion.ASC);
        for (Cliente c:clienteOrdenAsc){
            System.out.println(c);
        }*/

        /*System.out.println("==============EDITAR==============");
        Cliente beaActualizar=new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea=repo.porid(2);
        System.out.println(bea);
        System.out.println("========================");
        repo.listar("Nombre: ",Direccion.ASC).forEach(System.out::println);
        System.out.println("==============ELIMINAR==============");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("==============TOTAL==============");
        System.out.println("Total Resgistros"+repo.total());*/

    }
}
