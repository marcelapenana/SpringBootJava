package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String dni, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
    }
}
