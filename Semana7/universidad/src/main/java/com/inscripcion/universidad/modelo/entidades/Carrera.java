package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Carrera implements Serializable {

    private Integer id;
    private String nombre;

    private Integer cantidadAnos;
    private String Facultad;

    public Carrera() {
    }

    public Carrera(Integer id, String nombre, Integer cantidadAnos, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadAnos = cantidadAnos;
        Facultad = facultad;
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

    public Integer getCantidadAnos() {
        return cantidadAnos;
    }

    public void setCantidadAnos(Integer cantidadAnos) {
        this.cantidadAnos = cantidadAnos;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String facultad) {
        Facultad = facultad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrera carrera = (Carrera) o;
        return Objects.equals(id, carrera.id) && Objects.equals(nombre, carrera.nombre) && Objects.equals(cantidadAnos, carrera.cantidadAnos) && Objects.equals(Facultad, carrera.Facultad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, cantidadAnos, Facultad);
    }
}
