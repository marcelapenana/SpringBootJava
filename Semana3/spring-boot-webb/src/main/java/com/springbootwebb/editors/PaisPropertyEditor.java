package com.springbootwebb.editors;

import com.springbootwebb.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;
//desde prueba 4
@Component
public class PaisPropertyEditor extends PropertyEditorSupport {

	@Autowired
	private PaisService service;

	@Override
	public void setAsText(String idString) throws IllegalArgumentException {

		try {
			Integer id = Integer.parseInt(idString);
			this.setValue(service.obtenerPorId(id));//seteamos el valor
		} catch (NumberFormatException e) {
			setValue(null);
		}

	}

}
