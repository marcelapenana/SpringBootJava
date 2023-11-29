package modelo;

public class Visitante extends AdminBaseEntity {
    private String nombre;

    public Visitante(String nombre) {
        super();
        this.nombre = nombre;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                "Id: " + id+
                ",  Nombre: " + nombre+ ("\n")+
                ""
                 ;
    }
}
