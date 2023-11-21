package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "profesores")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Profesor extends Persona {

    private BigDecimal Sueldo;

    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name= "profesor_carrera",
            joinColumns =@JoinColumn(name = "profsor_id"),
            inverseJoinColumns =@JoinColumn(name = "carrera_id")

    )
    private Set<Carrera> carreras;

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

    public Set<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(Set<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "Sueldo=" + Sueldo +
                '}';
    }
}
