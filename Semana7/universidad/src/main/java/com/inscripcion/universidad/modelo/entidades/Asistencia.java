package com.inscripcion.universidad.modelo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name = "asistencias")
public class Asistencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime fecha;

    public Asistencia() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "id=" + id +
                ", fecha=" + fecha +
                '}';
    }
}
