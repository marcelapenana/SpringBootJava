package org.aguzman.poointerdaces.repositorio;

import org.aguzman.poointerdaces.modelo.BaseEntity;
import org.aguzman.poointerdaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio <T extends BaseEntity> implements OrdenablePaginadelCrudRepositorio<T>{
    protected List<T> dataSource;

    public AbstractaListRepositorio(){
        this.dataSource=new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }
    @Override
    public T porId(Integer Id) {
        return null;
    }
    @Override
    public void crear(T t) {
    this.dataSource.add(t);
    }
    @Override
    public void editar(T cliente) {

    }
    @Override
    public void eliminar(Integer id) {
   this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return  dataSource.subList(desde,hasta);
    }
    @Override
    public int total() {
        return this.dataSource.size();
    }

}
