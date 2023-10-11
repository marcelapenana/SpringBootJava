
 public class Canino extends  Mamifero{
    protected String color;
    protected float tamanoColnios;

    public Canino() {
    }

    public Canino(String habitad, float altura, float largo, String nombreCientifico, String color, float tamanoColnios) {
        super(habitad, altura, largo, nombreCientifico);
        this.color = color;
        this.tamanoColnios = tamanoColnios;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanoColnios() {
        return tamanoColnios;
    }

    public void setTamanoColnios(float tamanoColnios) {
        this.tamanoColnios = tamanoColnios;
    }


}
