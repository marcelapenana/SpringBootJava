package modelo;

import java.util.Date;

public class Pelicula extends AdminBaseEntity {
    private String nombreDePelicula;
    private Date PeliculaEspectaculo;
    private String lugar;

    public Pelicula(String nombreDePelicula, Date peliculaEspectaculo, String lugar) {
        this.nombreDePelicula = nombreDePelicula;
        PeliculaEspectaculo = peliculaEspectaculo;
        this.lugar = lugar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDePelicula() {
        return nombreDePelicula;
    }

    public void setNombreDePelicula(String nombreDePelicula) {
        this.nombreDePelicula = nombreDePelicula;
    }

    public Date getPeliculaEspectaculo() {
        return PeliculaEspectaculo;
    }

    public void setPeliculaEspectaculo(Date peliculaEspectaculo) {
        PeliculaEspectaculo = peliculaEspectaculo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return  "Id: " + id+
                ", Nombre De La Pelicula: " + nombreDePelicula +
                ", Fecha de estreno: " + PeliculaEspectaculo +
                ", Lugar: " + lugar
                ;
    }
}
