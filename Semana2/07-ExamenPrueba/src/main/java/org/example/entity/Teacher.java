package org.example.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="maestros")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    public Teacher() {

    }

    public Teacher(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Teacher(Long id, String nombre, String apellido) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(id, teacher.id) && Objects.equals(nombre, teacher.nombre) && Objects.equals(apellido, teacher.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido
                ;
    }
}
