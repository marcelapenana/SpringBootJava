package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "alumnos")
//@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno  extends Persona {

    private String carnet;

    /*carrera*/

   /* @ManyToOne(
            optional = true,
            fetch =FetchType.LAZY,
            cascade ={CascadeType.PERSIST,
                      CascadeType.MERGE}
    )
    @JoinColumn(name="carrera_id")
    private  Carrera carrera;*/

    public Alumno() {
    }

    public Alumno(Integer id, String nombre, String apellido, String dui, String direccion, String carnet) {
        super(id, nombre, apellido, dui, direccion);
        this.carnet = carnet;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

   /* public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }*/

    @Override
    public String toString() {
        return "Alumno{" +
                "carnet='" + carnet + '\'' +
                '}';
    }
}
