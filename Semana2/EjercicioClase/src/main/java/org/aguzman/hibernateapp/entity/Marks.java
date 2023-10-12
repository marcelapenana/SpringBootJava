package org.aguzman.hibernateapp.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="notas")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_estudiante")
    private Student estudiante;

    @ManyToOne
    @JoinColumn(name="id_materia")
    private Subject materia;

    private int nota;

    public Marks() {
    }

    public Marks(int nota) {
        this.nota = nota;
    }

    public Marks(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getEstudiante(Student estudiante){return this.estudiante;}
    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }

    public Subject getSubjet(){return materia;}
    public void setSubjet(Subject materia) {
        this.materia = materia;
    }

    public Subject getMateria() {
        return materia;
    }

    public void setMateria(Subject materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Marks  " +
                "id " + id +
                ", estudiante " + estudiante +
                ", materia " + materia  ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marks marks = (Marks) o;
        return Objects.equals(id, marks.id) && Objects.equals(estudiante, marks.estudiante) && Objects.equals(materia, marks.materia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, estudiante, materia);
    }
}