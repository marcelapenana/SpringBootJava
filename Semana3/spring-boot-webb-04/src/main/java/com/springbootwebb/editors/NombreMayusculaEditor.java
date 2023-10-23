package com.springbootwebb.editors;

import java.beans.PropertyEditorSupport;
//prueba lo uso en prueba 3 en la cuarta no se modifica
public class NombreMayusculaEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		setValue(text.toUpperCase().trim());
	}
	
	

}
