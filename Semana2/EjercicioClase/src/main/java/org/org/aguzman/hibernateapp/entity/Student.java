package org.org.aguzman.hibernateapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="estudiantes")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "estudiante")
    private List<Marks> notas;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "estudiante")
    private List<Group> grupos;

    public Student() {
       notas=new ArrayList<>();
       grupos=new ArrayList<>();
    }

    public Student(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Student(Long id, String nombre, String apellido) {
        this();
        this.id = id;
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

    public List<Group> getGrupo() {
        return grupos;
    }

    public void setGrupo(List<Group> grupo) {
        this.grupos = grupo;
    }

    public Student addGrupo(Group grupo){
        this.grupos.add(grupo);

       // grupo.setStudent(null);
        return this;
    }
    public void removeGrupo(Group grupo){
        this.grupos.remove(grupo);
       // grupo.setStudent(null);
    }

    @Override
    public String toString() {
        return "Student  " +
                "id " + id +
                ", nombre " + nombre + '\'' +
                ", apellido " + apellido + '\'' +
                ", notas " + notas +
                ", grupo " + grupos
                 ;
    }
}
