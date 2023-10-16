package com.bolsadeideas.springboot.di.app.models.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

//componestes son clases y tienen un funcion principal, servira para almacenar propiedades de un objeto
//ejmp un obj factura necesita información de otro componente
//Request
@Component
@RequestScope
public class Cliente {
    @Value("${cliente.nombre}")
    private String nombre;
    @Value("${cliente.apellido}")
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
