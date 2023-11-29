public enum Color {
    ROJO("Rojo"),

    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris Oscuro"),

    NARANJO("Naranja");

    private final String color;
    Color(String color){this.color=color;}

    @Override
    public String toString() {
        return this.color;
    }
}
