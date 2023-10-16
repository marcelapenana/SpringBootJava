package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="grupos")
public class Group {

    //FetchType.LAZY para OneToMany y ManyToMany por defecto
    //FechType.EAGER para ManyToOne OneToOne por defecto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    public Group() {
    }

    public Group(String nombre) {
        this.nombre = nombre;
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


    @Override
    public String toString() {
        return "Group " +
                "id " + id +
                ", nombre " + nombre
                ;
    }
}
