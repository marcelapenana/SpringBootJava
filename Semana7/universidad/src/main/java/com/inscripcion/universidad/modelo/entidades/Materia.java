package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;

public class Materia implements Serializable {

    private Integer id;
    private String nombre;
    private String titular;

    public Materia() {
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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
