public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station wagon", "Auto grande", 5),

    HATHBACK("hathback", "Auto compacto", 5),

    PICKUP("pickup","Camioneta",5),

    COUPE("Coupe", "Auto pequeño", 2),

    CONVERTIBLE("convertible", "auto deportivo",2),

    FURGON("Furgon","Auto utilitario",3),

    SUV("SUV","TODO TERRENO DEPORTIVO",6);

    private final String nombre;
    private String descripcion;
    private final int numPuerta;


    TipoAutomovil(String nombre, String descripcion, int numPuerta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPuerta = numPuerta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumPuerta() {
        return numPuerta;
    }
}
