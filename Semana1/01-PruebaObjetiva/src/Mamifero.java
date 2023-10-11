public class Mamifero {
    protected String habitad;
    protected float altura;
    protected float  largo;
    protected String nombreCientifico;

    public Mamifero() {
    }

    public Mamifero(String habitad, float altura, float largo, String nombreCientifico) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }


    @Override
    public String toString() {
        return "\n" +"Habitad: "+ habitad +
                " \n" +"Altura: " + altura +
                "\n"  +"Largo: " + largo +
                "\n"  +"Nombre cientifico: " + nombreCientifico
                ;
    }
}

