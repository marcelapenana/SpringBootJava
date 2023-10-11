package repositorio.lista;

import modelo.Visitante;
import repositorio.AbstractaListRepositorio;

import java.util.ArrayList;
import java.util.List;

public class VisistanteListRespositorio extends AbstractaListRepositorio<Visitante> {
    private List<Visitante> dataSource;

    public VisistanteListRespositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Visitante> listar() {
        return this.dataSource;
    }

    @Override
    public Visitante porId(Integer id) {
       Visitante resultado=null;
         for (Visitante vi: dataSource){
           if (vi.getId() !=null && vi.getId().equals(id)){
               resultado=vi;
               break;
           }
         }
        return resultado;
    }

    @Override
    public void AñadirRegistro(Visitante visitante) {
           this.dataSource.add(visitante);
    }


    @Override
    public void ActualizarRegistros(Visitante visitante) {
        Visitante v=this.porId(visitante.getId());
        v.setNombre(visitante.getNombre());
    }

    @Override
    public void eliminarRegistros(Integer id) {
        this.dataSource.remove(this.porId(id));
    }
}
