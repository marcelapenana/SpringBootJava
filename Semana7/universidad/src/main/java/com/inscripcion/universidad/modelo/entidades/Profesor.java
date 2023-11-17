package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name = "profesores")
public class Profesor extends Persona {

    private BigDecimal Sueldo;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String dui, String direccion) {
        super(id, nombre, apellido, dui, direccion);
    }

    public BigDecimal getSueldo() {
        return Sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        Sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "Sueldo=" + Sueldo +
                '}';
    }
}
