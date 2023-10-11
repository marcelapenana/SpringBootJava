package org.aguzman.poointerdaces.modelo;

public class Producto extends  BaseEntity{
    private String descripcion;
    private Double precio;

    public Producto(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: " +("\n")+
                "descripcion: " + descripcion +("\n")+
                ", precio: " + precio +("\n")+
                ", id: " + id
                ;
    }
}
