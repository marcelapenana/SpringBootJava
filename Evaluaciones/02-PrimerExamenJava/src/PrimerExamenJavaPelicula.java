import modelo.Pelicula;
import repositorio.AbstractaListRepositorio;
import repositorio.lista.PeliculaListRepositorio;

import java.util.Date;
import java.util.List;

public class PrimerExamenJavaPelicula {
    public static void main(String[] args) {
        System.out.println("--------------LISTAR--------------");
        Date dt=new Date();
        AbstractaListRepositorio repo=new PeliculaListRepositorio();
        repo.AñadirRegistro(new Pelicula("Barbie", dt, "Cine Mark"));
        repo.AñadirRegistro(new Pelicula("Popeye", null, "Cinepolis"));
        repo.AñadirRegistro(new Pelicula("Mario Bros", null, "La gran via"));
        repo.AñadirRegistro(new Pelicula("Tiguron", null, "Cinepolis"));
        repo.AñadirRegistro(new Pelicula("Flash", null, "Cine Mark"));
        repo.AñadirRegistro(new Pelicula("Pepa pig", null, "Cinepolis"));
        repo.AñadirRegistro(new Pelicula("Los heroes del mañana", null, "Cinepolis"));

        List<Pelicula> pelicula=repo.listar();
        pelicula.forEach(System.out::println);

        System.out.println("--------------EDITAR--------------");
        Pelicula actualizar=new Pelicula("Barbie y sus amigos", null, "Multi Plaza");
        actualizar.setId(1);
        repo.ActualizarRegistros(actualizar);
        Pelicula bar=(Pelicula)repo.porId(1);
        System.out.println(bar);

        System.out.println("--------------ELIMINAR--------------");
        repo.eliminarRegistros(1);
        repo.listar().forEach(System.out::println);
    }
}
