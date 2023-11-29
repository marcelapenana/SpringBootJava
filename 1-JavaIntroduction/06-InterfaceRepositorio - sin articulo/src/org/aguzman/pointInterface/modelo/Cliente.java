package org.aguzman.pointInterface.modelo;

import java.util.Objects;

public class Cliente {
    private Integer id;
    private  String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente(){this.id=++ultimoId;}

    public Cliente( String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        Cliente.ultimoId = ultimoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id)
                && Objects.equals(nombre, cliente.nombre)
                && Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido);
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
