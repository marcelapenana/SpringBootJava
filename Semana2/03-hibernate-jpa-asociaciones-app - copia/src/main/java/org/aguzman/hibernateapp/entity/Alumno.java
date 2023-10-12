package org.aguzman.hibernateapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="alumnos")
public class Alumno {
    //511
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "tbl_alumnos_cursos", joinColumns = @JoinColumn(name="alumno_id"),
    inverseJoinColumns = @JoinColumn(name = "curso_id"),
    uniqueConstraints = @UniqueConstraint(columnNames = {"alumno_id", "curso_id"}))
    private List<Curso> cursos;

    //Le estamos aplicando manyTomany y es donde esta la relación
    //Para ello generamos la tabla intermedia tbl_alumnos cursos
    //Alumnos y cursos son entidades independientes , direccional de alumnos a cursos
    //Cursos a alumnos,
    //Un alumno puede tener muvhos cuersos y en un curso pueden haber muchos alumnos
    //
    public Alumno() {
        this.cursos = new ArrayList<>();
    }

    public Alumno(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
        curso.getAlumnos().add(this);
    }

    public void removeCurso(Curso curso) {
        this.cursos.remove(curso);
        curso.getAlumnos().remove(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(id, alumno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  "\n"+
                "id " + id + "\n"+
                "nombre" + nombre + "\n" +
                "apellido " + apellido + "\n" +
                "cursos " + cursos
                ;
    }
}
