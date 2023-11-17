package com.inscripcion.universidad.modelo.entidades;



import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "personas")
//@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,length = 60)
    private String nombre;
    @Column(nullable = false, length = 60)
    private String apellido;
    @Column(nullable = false,unique = true,length = 10)
    private String dui;

    @Column(nullable = false,length = 60)
    private String direccion;

    public Persona() {
    }

    public Persona(Integer id, String nombre, String apellido, String dni, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dui='" + dui + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id) && dui.equals(persona.dui);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dui);
    }
}
