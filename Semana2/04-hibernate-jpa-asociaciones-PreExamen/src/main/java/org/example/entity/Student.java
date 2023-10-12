package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="estudiantes")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @ManyToOne
    @JoinColumn(name="id_grupo")
    private Group grupo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "estudiante")
    private List<Marks> notas;

    public Student() {
       notas=new ArrayList<>();

    }

    public Student(String nombre, String apellido) {
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

    public List<Marks> getNotas() {
        return notas;
    }

    public void setNotas(List<Marks> notas) {
        this.notas = notas;
    }

    public Group getGrupo() {
        return grupo;
    }

    public void setGrupo(Group grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Student  " +
                "id " + id +
                ", nombre " + nombre + '\'' +
                ", apellido " + apellido + '\'' +
                ", notas " + notas
                 ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(nombre, student.nombre) && Objects.equals(apellido, student.apellido) && Objects.equals(grupo, student.grupo) && Objects.equals(notas, student.notas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, grupo, notas);
    }
}
