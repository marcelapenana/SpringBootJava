package org.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="MateriasMaestros")
public class SubjectTeacher {

    @ManyToOne
    @JoinColumn(name="id_materia")
    private Subject materia;

    @ManyToOne
    @JoinColumn(name="id_nota")
    private Marks nota;

    @ManyToOne
    @JoinColumn(name="id_grupo")
    private Group grupo;

    public SubjectTeacher(Subject materia, Marks nota, Group grupo) {
        this.materia = materia;
        this.nota = nota;
        this.grupo = grupo;
    }

    public Subject getMateria() {
        return materia;
    }

    public void setMateria(Subject materia) {
        this.materia = materia;
    }

    public Marks getNota() {
        return nota;
    }

    public void setNota(Marks nota) {
        this.nota = nota;
    }

    public Group getGrupo() {
        return grupo;
    }

    public void setGrupo(Group grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectTeacher that = (SubjectTeacher) o;
        return Objects.equals(materia, that.materia) && Objects.equals(nota, that.nota) && Objects.equals(grupo, that.grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materia, nota, grupo);
    }
}
