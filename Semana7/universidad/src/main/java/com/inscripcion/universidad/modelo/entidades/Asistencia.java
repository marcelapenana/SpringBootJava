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

    @ManyToOne(
            optional = true,
            fetch =FetchType.LAZY,
            cascade ={CascadeType.PERSIST,
                    CascadeType.MERGE}
    )
    @JoinColumn(name="materia_id")
    private  Materia materia;

    public Asistencia() {
    }

    public Asistencia(Integer id, Materia materia) {
        this.id = id;
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "id=" + id +
                '}';
    }
}
