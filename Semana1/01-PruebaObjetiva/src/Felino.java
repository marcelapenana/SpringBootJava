public class Felino extends Mamifero{
    protected float tamanoGarras;
    protected Integer velocidad;

    public Felino() {
    }

    public Felino(String habitad, float altura, float largo, String nombreCientifico, float tamanoGarras, Integer velocidad) {
        super(habitad, altura, largo, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }


}
