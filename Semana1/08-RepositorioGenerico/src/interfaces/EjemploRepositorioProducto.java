package interfaces;

import interfaces.modelo.Cliente;
import interfaces.modelo.Producto;
import interfaces.repositorio.AbstractaListRepositorio;
import interfaces.repositorio.Direccion;
import interfaces.repositorio.OrdenablePaginableCrudRepositorio;
import interfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {

        public static void main(String[] args) {
            OrdenablePaginableCrudRepositorio repo = new ProductoListRepositorio();
            repo.crear(new Producto( "mesa", 1.2));
            repo.crear(new Producto( "silla", 12));
            repo.crear(new Producto( "lampara", 10));
            repo.crear(new Producto( "jani", 11));


            List<Producto> Productos = repo.listar();
            Productos.forEach(System.out::println);

            System.out.println("==========Paginable================");
            List<Producto> paginable = repo.listar(1,4);
            paginable.forEach(System.out::println);

            System.out.println("=========Ordenar===================");
            List<Producto> ProductoOrdenASC = repo.listar("descripcion", Direccion.ASC);
            for(Producto c: ProductoOrdenASC){
                System.out.println(c);
            }


        System.out.println("===========Editar=====================");
        Producto lamparaActualizar = new Producto("lampara escritorio", 22);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);
        Producto lampara= (Producto)repo.porId(3);
        System.out.println(lampara);
        System.out.println("================================");
        repo.listar("precio", Direccion.ASC).forEach(System.out::println);




        System.out.println("======================Eliminar==================");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("======================total================");
        System.out.println("Total registros" + repo.total());

        }
    }
