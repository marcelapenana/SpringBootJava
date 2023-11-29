package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Profesor extends Persona {

    private Double Sueldo;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String dui, String direccion, Double sueldo) {
        super(id, nombre, apellido, dui, direccion);
        Sueldo = sueldo;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double sueldo) {
        Sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "Sueldo=" + Sueldo +
                '}';
    }
}
