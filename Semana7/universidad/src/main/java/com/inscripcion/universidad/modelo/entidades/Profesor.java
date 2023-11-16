package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;

public class Profesor implements Serializable {

    private  Integer id;
    private String nombre;
    private Double Sueldo;
    private int antiguedad;

    public Profesor() {
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

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double sueldo) {
        Sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Sueldo=" + Sueldo +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
