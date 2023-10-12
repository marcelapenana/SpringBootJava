package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="materias")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Teacher> maestros =new ArrayList<>();


    public Subject() {
        maestros =new ArrayList<>();
    }

    public Subject(String titulo) {
        this();
        this.titulo = titulo;
    }

    public Subject(Long id, String titulo) {
        this();
        this.id = id;
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Teacher> getMaestros() {
        return maestros;
    }

    public void setMaestros(List<Teacher> maestros) {
        this.maestros = maestros;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", maestros=" + maestros +
                '}';
    }
}
