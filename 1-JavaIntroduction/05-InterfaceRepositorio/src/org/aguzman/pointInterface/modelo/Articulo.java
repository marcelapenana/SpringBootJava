package org.aguzman.pointInterface.modelo;

import java.util.Objects;

public class Articulo {
    private Integer id;
    private String descripcion;
    private static int ultimId;

    public Articulo() {
         this.id=++ultimId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getUltimId() {
        return ultimId;
    }

    public static void setUltimId(int ultimId) {
        Articulo.ultimId = ultimId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Articulo articulo = (Articulo) o;
        return Objects.equals(id, articulo.id) && Objects.equals(descripcion, articulo.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion);
    }

    @Override
    public String toString() {
        return "Articulo: " +("\n")+
                "id: " + id +("\n")+
                "descripcion: " + descripcion
                ;
    }
}
