package interfaces.modelo;

public class Producto extends BaseEntity{

    private String descripcion;
    private Double precio;
    public Producto(String descripcion, double precio){
        super();
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public String getDescipcion() {
        return descripcion;
    }

    public void setDescipcion(String descipcion) {
        this.descripcion = descipcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", id=" + id +
                '}';
    }
}
