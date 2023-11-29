package org.aguzman.modelo;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;
    public Libro() {
    }

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }
    @Override
    public String ImprimirLibro() {
        return
                "Precio: $"+getPrecio()+("\n")+
                "Fecha de publicación: "+ fechaPublicacion+("\n")+
                "Autor: "+autor+("\n")+
                "Titulo:"+titulo+("\n")+
                "Editorial: "+editorial+("\n")+
                "***************************";
    }
    @Override
    public String ImprimirProducto() {
        return null;
    }
    @Override
    public int precio() {
        return precio();
    }
    @Override
    public double precioVenta() {

        return 0;
    }


    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}
