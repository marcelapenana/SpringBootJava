package com.bolsadeideas.springboot.di.app.service;

import org.springframework.stereotype.Component;

//@Component("MiServicioCompleto")
public class MiServicioComplejo implements IServicio{
    //implementa el metodo
    @Override
    public String operacion() {
        return "ejecutando algún proceso importante complicado...";
    }
}
