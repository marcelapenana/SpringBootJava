package org.aguzman.modelo;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;
    public Comics() {
    }

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    @Override
    public String ImprimirLibro() {
        return
                "Precio: $"+getPrecio()+("\n")+
                        "Fecha de publicación: "+ getFechaPublicacion()+("\n")+
                        "Autor: "+getAutor()+("\n")+
                        "Titulo:"+getTitulo()+("\n")+
                        "Editorial: "+getEditorial()+("\n")+
                        "Personaje: "+personaje+("\n")+
                        "***************************";
    }
    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
}
