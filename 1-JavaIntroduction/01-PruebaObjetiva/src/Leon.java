public class Leon extends Felino{
    private Integer numManada;

    private float potencialRugidoDecibel;

    public Leon() {
    }

    public Leon(String habitad, float altura, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad, Integer numManada, float potencialRugidoDecibel) {
        super(habitad, altura, largo, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potencialRugidoDecibel = potencialRugidoDecibel;
    }
}
