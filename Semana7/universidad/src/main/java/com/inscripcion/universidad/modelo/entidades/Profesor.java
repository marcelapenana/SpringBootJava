package com.inscripcion.universidad.modelo.entidades;

import java.io.Serializable;
import java.math.BigDecimal;

public class Profesor extends Persona {

    private BigDecimal Sueldo;

    public Profesor() {
    }

    public Profesor(Integer id, String nombre, String apellido, String dni, String direccion) {
        super(id, nombre, apellido, dni, direccion);
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
