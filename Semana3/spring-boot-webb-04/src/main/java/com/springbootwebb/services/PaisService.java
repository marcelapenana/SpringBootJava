package com.springbootwebb.services;

import com.springbootwebb.models.domain.Pais;

import java.util.List;
//El paquete se services desde parte 4
public interface PaisService {
	//definir metodos
	public List<Pais> listar();
	public Pais obtenerPorId(Integer id);

}
