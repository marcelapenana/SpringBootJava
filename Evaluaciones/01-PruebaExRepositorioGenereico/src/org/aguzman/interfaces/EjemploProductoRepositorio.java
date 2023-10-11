package org.aguzman.interfaces;

import org.aguzman.interfaces.modelo.Producto;
import org.aguzman.interfaces.repositorio.AbstractaListRepositorio;
import org.aguzman.interfaces.repositorio.Direccion;
import org.aguzman.interfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploProductoRepositorio {
    public static void main(String[] args) {

        AbstractaListRepositorio repo=new ProductoListRepositorio();
        repo.crear(new Producto("Silla", 12.5));
        repo.crear(new Producto("Lampara", 24.6));

        List<Producto> productos=repo.listar();
        productos.forEach(System.out::println);

        System.out.println("PAGINABLE");
        List<Producto> paginable=repo.listar(0,2);
        paginable.forEach(System.out::println);

        System.out.println("ORDENAR");
        List<Producto> productoOrdenAsc=repo.listar("Descripcion", Direccion.DESC);
        for (Producto c: productoOrdenAsc){
            System.out.println(c);
        }

        System.out.println("EDITAR");
        Producto lamparaEditada=new Producto("Lampara de noche", 23.3);
        lamparaEditada.setId(1);
        repo.editar(lamparaEditada);
        Producto lampara=(Producto)repo.porId(1);
        System.out.println(lampara);

        repo.listar("precio", Direccion.ASC).forEach(System.out::println);

        System.out.println("ELIMINAR");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("TOTAL");


    }
}
