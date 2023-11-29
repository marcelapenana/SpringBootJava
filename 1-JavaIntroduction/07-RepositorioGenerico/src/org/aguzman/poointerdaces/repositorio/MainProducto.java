package org.aguzman.poointerdaces.repositorio;

import org.aguzman.poointerdaces.modelo.Producto;
import org.aguzman.poointerdaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class MainProducto {
    public static void main(String[] args) {
        OrdenablePaginadelCrudRepositorio<Producto>repo=new ProductoListRepositorio();
        repo.crear(new Producto("mesa",50.56));
        repo.crear(new Producto("mesa",50.56));
        repo.crear(new Producto("mesa",50.56));
        repo.crear(new Producto("mesa",50.56));

        List<Producto> productos=repo.listar();
        productos.forEach(System.out::println);

        System.out.println("PAGINABLE");
        List<Producto> paginable=repo.listar(1,4);
        for (Producto c : paginable) {
            System.out.println(c);
        }
///
        System.out.println("ORDENAR");
        List<Producto> productosOrdenAsc=repo.listar("descripcion", Direccion.ASC);
        for (Producto c : productosOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("EDITAR");
        Producto lamparaActualizar=new Producto("Lampara Escritorio", 23);
        lamparaActualizar.setId(3);

        System.out.println("==============EDITAR==============");
        Cliente beaActualizar=new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea=repo.porId(2);
        System.out.println(bea);

    }
}
