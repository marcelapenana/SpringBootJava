package org.aguzman.poointerdaces.modelo;

import java.util.Objects;

public class Cliente extends BaseEntity{
    private Integer id;
    private  String nombre;
    private String apellido;

    private static int ultimoId;

    public Cliente(){this.id=++ultimoId;}

    public Cliente(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente: " +"\n"+
                "id: " + id +"\n"+
                "nombre:  " + nombre + "\n" +
                "apellido: " + apellido + "\n"
                ;
    }
}
