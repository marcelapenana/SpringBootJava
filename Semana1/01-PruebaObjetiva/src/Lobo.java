public class Lobo extends Canino{
   protected Integer numCamada;
    protected String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitad, float altura, float largo, String nombreCientifico, String color, float tamanoColnios, Integer numCamada, String especieLobo) {
        super(habitad, altura, largo, nombreCientifico, color, tamanoColnios);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String toString() {
        return "Lobo:" +

                "\n" +"Tamaño de colmios: " + tamanoColnios +
                "\n" +"Color: " + color +
                "\n" +"Habitad: "+ habitad +
                "\n" +"Altura: " + altura +
                "\n" +"Largo: " + largo +
                "\n" +"Nombre cientifico: " + nombreCientifico
                ;
    }

}
