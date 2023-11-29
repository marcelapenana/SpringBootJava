package modelo;

import java.util.Date;

public class ReservarBillete extends Pelicula{
    private int numeroEntradasDisponibles;
    private int mostrarNumero;
    public ReservarBillete(String nombreDePelicula, Date peliculaEspectaculo, String lugar, int numeroEntradasDisponibles, int mostrarNumero) {
        super(nombreDePelicula, peliculaEspectaculo, lugar);
        this.numeroEntradasDisponibles = numeroEntradasDisponibles;
        this.mostrarNumero = mostrarNumero;
    }

    public int getNumeroEntradasDisponibles() {
        return numeroEntradasDisponibles;
    }

    public void setNumeroEntradasDisponibles(int numeroEntradasDisponibles) {
        this.numeroEntradasDisponibles = numeroEntradasDisponibles;
    }

    public int getMostrarNumero() {
        return mostrarNumero;
    }

    public void setMostrarNumero(int mostrarNumero) {
        this.mostrarNumero = mostrarNumero;
    }

    @Override
    public String toString() {
        return "ReservarBillete{" +
                "numeroEntradasDisponibles=" + numeroEntradasDisponibles +
                ", mostrarNumero=" + mostrarNumero +
                ", id=" + id +
                '}';
    }
}
