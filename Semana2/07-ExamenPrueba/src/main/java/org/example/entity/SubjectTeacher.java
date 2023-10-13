package org.example.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="MateriasMaestros")
public class SubjectTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private Group grupo;

    @ManyToOne
    @JoinColumn(name="id_materia")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name="id_maestro")
    private Teacher teacher;

    public SubjectTeacher() {
    }

    public SubjectTeacher(Group grupo, Subject subject, Teacher teacher) {
        this();
        this.grupo = grupo;
        this.subject = subject;
        this.teacher = teacher;
    }

    public SubjectTeacher(Long id, Group grupo, Subject subject, Teacher teacher) {
        this();
        this.id = id;
        this.grupo = grupo;
        this.subject = subject;
        this.teacher = teacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGrupo() {
        return grupo;
    }

    public void setGrupo(Group grupo) {
        this.grupo = grupo;
    }

    public Subject getSubject(Subject materia) {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectTeacher that = (SubjectTeacher) o;
        return Objects.equals(id, that.id) && Objects.equals(grupo, that.grupo) && Objects.equals(subject, that.subject) && Objects.equals(teacher, that.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, grupo, subject, teacher);
    }

    @Override
    public String toString() {
        return "SubjectTeacher{" +
                "id=" + id +
                ", grupo=" + grupo +
                ", subject=" + subject +
                ", teacher=" + teacher +
                '}';
    }

}
