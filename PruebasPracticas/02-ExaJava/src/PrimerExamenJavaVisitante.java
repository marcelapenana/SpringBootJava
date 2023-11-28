import modelo.Visitante;
import repositorio.AbstractaListRepositorio;
import repositorio.lista.VisistanteListRespositorio;

import java.util.ArrayList;
import java.util.List;

public class PrimerExamenJavaVisitante {
    public static void main(String[] args) {
        System.out.println("--------------LISTAR--------------");

        AbstractaListRepositorio repo=new VisistanteListRespositorio();
        repo.AñadirRegistro(new Visitante("Juana Molina Perez"));
        repo.AñadirRegistro(new Visitante("Maria Duran Ramos"));
        repo.AñadirRegistro(new Visitante("Martin Lobos"));
        repo.AñadirRegistro(new Visitante("Sindi Molina"));
        repo.AñadirRegistro(new Visitante("Morgan Smit Law"));
        repo.AñadirRegistro(new Visitante("Susan Laura Martir"));


        List<Visitante> visitantes=repo.listar();
        visitantes.forEach(System.out::println);

        System.out.println("--------------EDITAR--------------");
        Visitante actualizar=new Visitante("Maria Areli Santos");
        actualizar.setId(1);
        repo.ActualizarRegistros(actualizar);
        Visitante maria=(Visitante)repo.porId(1);
        System.out.println(maria);

        System.out.println("--------------ELIMINAR--------------");
        repo.eliminarRegistros(1);
        repo.listar().forEach(System.out::println);

    }
}