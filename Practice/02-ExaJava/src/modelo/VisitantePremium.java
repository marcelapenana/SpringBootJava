package modelo;

public class VisitantePremium extends Visitante implements Comparable<VisitantePremium>{
    public VisitantePremium(String nombre) {
        super(nombre);
    }

    @Override
    public int compareTo(VisitantePremium o) {
        return 0;
    }
}
