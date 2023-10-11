package repositorio.lista;

import modelo.Pelicula;
import modelo.Visitante;
import repositorio.AbstractaListRepositorio;

import java.util.ArrayList;
import java.util.List;

public class PeliculaListRepositorio extends AbstractaListRepositorio<Pelicula> {
    private List<Pelicula> dataSource;

    public PeliculaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Pelicula> listar() {
        return this.dataSource;
    }

    @Override
    public Pelicula porId(Integer id) {
        Pelicula resultado=null;
        for (Pelicula peli: dataSource){
            if (peli.getId() !=null && peli.getId().equals(id)){
                resultado=peli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void AñadirRegistro(Pelicula pelicula) {
        this.dataSource.add(pelicula);
    }

    @Override
    public void ActualizarRegistros(Pelicula pelicula) {
        Pelicula v=this.porId(pelicula.getId());
        v.setNombreDePelicula(pelicula.getNombreDePelicula());
        v.setPeliculaEspectaculo(pelicula.getPeliculaEspectaculo());
        v.setLugar(pelicula.getLugar());

    }

    @Override
    public void eliminarRegistros(Integer id) {
        this.dataSource.remove(this.porId(id));
    }
}
