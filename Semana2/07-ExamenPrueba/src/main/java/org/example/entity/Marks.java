package org.example.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="notas")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int nota;
    @ManyToOne
    @JoinColumn(name = "id_estudiante")
    private Student estudiante;
    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Subject materia;

    public Marks() {
    }

    public Marks( int nota) {
        this();
        this.nota = nota;

    }

    public Marks(Long id, int nota, Student estudiante, Subject materia) {
        this();
        this.id = id;
        this.nota = nota;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Student getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }

    public Subject getMateria() {
        return materia;
    }

    public void setMateria(Subject materia) {
        this.materia = materia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marks marks = (Marks) o;
        return nota == marks.nota && Objects.equals(id, marks.id) && Objects.equals(estudiante, marks.estudiante) && Objects.equals(materia, marks.materia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nota, estudiante, materia);
    }

    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", nota=" + nota +
                ", estudiante=" + estudiante +
                ", materia=" + materia +
                '}';
    }
}
