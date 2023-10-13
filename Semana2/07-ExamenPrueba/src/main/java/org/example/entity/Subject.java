package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="materias")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    public Subject() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(id, subject.id) && Objects.equals(titulo, subject.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +

                '}';
    }
}
