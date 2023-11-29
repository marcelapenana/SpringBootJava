package modelo;

public class Informe extends Hoja implements Imprimible{
    private Persona autor;
    private Persona revisor;

    public Informe( Persona autor, Persona revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Informe{" + "autor=" + autor + ", revisor=" + revisor + '}';
    }

    @Override
    public String imprimir() {
        return null;
    }
}
