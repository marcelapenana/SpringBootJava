public class Tigre extends Felino{
    protected String especieTigre;

    public Tigre() {
    }

    public Tigre(String habitad, float altura, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitad, altura, largo, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

   //*****************


    @Override
    public String toString() {
        return "Tigre:" +
                "\n" +"Especie de tigre: " + especieTigre +
                "\n" +"Tamaño de garras: " + tamanoGarras +
                "\n" +"Velocidad: " + velocidad +
                "\n" +"Habitad: "+ habitad +
                "\n" +"Altura: " + altura +
                "\n" +"Largo: " + largo +
                "\n" +"Nombre cientifico: " + nombreCientifico
             ;
    }
}
