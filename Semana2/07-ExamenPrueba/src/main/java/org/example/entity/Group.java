package org.example.entity;

import jakarta.persistence.*;

import java.util.Objects;

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
        this();
        this.nombre = nombre;
    }

    public Group(Long id, String nombre) {
        this();
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(id, group.id) && Objects.equals(nombre, group.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public String toString() {
        return "Group " +
                "id " + id +
                ", nombre " + nombre
                ;
    }
}
