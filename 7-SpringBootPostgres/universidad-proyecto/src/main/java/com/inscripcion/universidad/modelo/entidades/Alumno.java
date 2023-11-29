package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "persona_id")
public class Alumno  extends Persona {

    private String carnet;
    /*Materia */
    @ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "alumno_materia",
            joinColumns = @JoinColumn(name = "alumno_id"),
            inverseJoinColumns = @JoinColumn(name = "materia_id")
    )
    private Set<Materia> materias;

    /*Asistencia*/

   @ManyToOne(
            optional = true,
            fetch =FetchType.LAZY,
            cascade ={CascadeType.PERSIST,
                      CascadeType.MERGE}
    )
    @JoinColumn(name="asistencia_id")
    private  Asistencia asistencia;

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

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "carnet='" + carnet + '\'' +
                '}';
    }
}
