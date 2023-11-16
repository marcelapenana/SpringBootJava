package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;

public class Carrera implements Serializable {

    private Integer id;
    private String Carrera;
    private String Facultad;

    public Carrera() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String facultad) {
        Facultad = facultad;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id=" + id +
                ", Carrera='" + Carrera + '\'' +
                ", Facultad='" + Facultad + '\'' +
                '}';
    }
}
