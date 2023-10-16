package com.bolsadeideas.springboot.di.app.models.domain;

public class Producto {
    //la capa domain tiene que ver con la bd y tiene comunicación con la vista
    //component permite interactuar con otro componente y
    //producto se usara como
    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
