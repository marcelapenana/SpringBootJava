package org.org.aguzman.hibernateapp.entity;

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "materia")
    private List<Marks> notas;

    public Subject() {
        notas=new ArrayList<>();
    }

    public Subject( String titulo) {
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

    public List<Marks> getNotas() {
        return notas;
    }

    public void setNotas(List<Marks> notas) {
        this.notas = notas;
    }

    //met
    public Subject addNotas(Marks nota) {
        this.notas.add(nota);
        nota.setSubjet(this);
        return this;
    }

    public void removeNotas(Marks nota) {
        this.notas.remove(nota);
    }

    @Override
    public String toString() {
        return "Subject  " +
                "id " + id +
                ", titulo " + titulo + '\'' +
                ", notas " + notas  ;
    }
}
