package org.aguzman.interfaces;

import org.aguzman.interfaces.modelo.Cliente;
import org.aguzman.interfaces.repositorio.AbstractaListRepositorio;
import org.aguzman.interfaces.repositorio.Direccion;
import org.aguzman.interfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploClienteRepositorio {
    public static void main(String[] args) {
        AbstractaListRepositorio repo=new ClienteListRepositorio();
        repo.crear(new Cliente("Marcos", "Mendez"));
        repo.crear(new Cliente("Marcela", "Peña"));

        List<Cliente> clientes=repo.listar();
        clientes.forEach(System.out::println);

        /* System.out.println("PAGINABLE");
        List<Cliente> paginable=repo.listar(0,2);
        paginable.forEach(System.out::println);*/

        /*System.out.println("ORDENAR");
        repo.listar("Nombre", Direccion.ASC).forEach(System.out::println);*/

        /*System.out.println("EDITAR");
        Cliente actualizar=new Cliente("Oscar", "Najera");
        actualizar.setId(1);
        repo.editar(actualizar);
        Cliente oscar=(Cliente)repo.porId(1);
        System.out.println(oscar);*/

        /*System.out.println("ELIMINAR");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);*/

        /*System.out.println("TOTAL");
        System.out.println("Total Registros"+repo.total());*/
    }
}
