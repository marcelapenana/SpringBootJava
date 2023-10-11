package modelo;

import modelo.Genero;
import static modelo.Imprimible.TEXTO_DEFECTO;
import static modelo.Imprimible.imprimir;


public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Jonh","Doe"),"Ingeniero de sistemas", "Resumen laboral");
        cv.addExperiencia("Java").addExperiencia("Oracle DBA").addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador Fullstack").addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseños: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"), new Persona("James", "Gosling"),"Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir(){
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima!";
            }
        });
        System.out.println(TEXTO_DEFECTO);
    }
}
