package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "carreras")
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 60)
    private String nombre;
    @Column(name = "cantidad_anios")
    private Integer cantidadAnos;
    @Column(nullable = false, length = 60)
    private String Facultad;

    /*alumno*/
  /*  @OneToMany(mappedBy = "carrera",
              fetch = FetchType.LAZY
              )
    private Set<Alumno> alumnos;*/

    public Carrera() {
    }

    public Carrera(Integer id, String nombre, Integer cantidadAnos, String facultad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadAnos = cantidadAnos;
        Facultad = facultad;
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

    public Integer getCantidadAnos() {
        return cantidadAnos;
    }

    public void setCantidadAnos(Integer cantidadAnos) {
        this.cantidadAnos = cantidadAnos;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String facultad) {
        Facultad = facultad;
    }

  /*  public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carrera carrera = (Carrera) o;
        return Objects.equals(id, carrera.id) && Objects.equals(nombre, carrera.nombre) && Objects.equals(cantidadAnos, carrera.cantidadAnos) && Objects.equals(Facultad, carrera.Facultad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, cantidadAnos, Facultad);
    }
}
