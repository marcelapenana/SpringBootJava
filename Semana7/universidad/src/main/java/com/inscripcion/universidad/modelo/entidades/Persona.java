package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "personas")
@Inheritance(strategy =
)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(dni, persona.dni) && Objects.equals(direccion, persona.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, dni, direccion);
    }
}
