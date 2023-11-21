package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "materias")
public class Materia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String titular;

    @ManyToOne(
         optional = true,
         fetch =FetchType.LAZY,
          cascade ={
                 CascadeType.PERSIST,
                 CascadeType.MERGE
          }
    )
    @JoinColumn(name = "profesor_id")
    private Set<Profesor> profesor;

    public Materia() {
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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Set<Profesor> getProfesor() {
        return profesor;
    }

    public void setProfesor(Set<Profesor> profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
