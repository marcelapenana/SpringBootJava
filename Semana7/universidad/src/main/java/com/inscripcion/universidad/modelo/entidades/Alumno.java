package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;

public class Alumno  extends Persona {

    private String carnet;

    public Alumno() {
    }

    public Alumno(Integer id, String nombre, String apellido, String dni, String direccion, String carnet) {
        super(id, nombre, apellido, dni, direccion);
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carnet='" + carnet + '\'' +
                '}';
    }
}
