package repositorio;

import modelo.AdminBaseEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio <T extends AdminBaseEntity> implements AplicandoTodasInterfaces<T>{
    protected List<T> dataSource;
    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    @Override
    public List<T> listar() {
        return dataSource;
    }
    @Override
    public T porId(Integer id) {
       T resultado=null;
      for(T vip:dataSource){
        if (vip.getId() !=null && vip.getId().equals(id)){
          resultado=vip;
          break;
        }
      }
        return resultado;
    }

    @Override
    public void AñadirRegistro(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void ActualizarRegistros(T t) {

    }

    @Override
    public void eliminarRegistros(Integer id) {
         this.dataSource.remove(this.porId(id));
    }
}
