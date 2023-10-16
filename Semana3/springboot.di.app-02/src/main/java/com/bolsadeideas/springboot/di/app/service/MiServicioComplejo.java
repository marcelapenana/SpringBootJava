package com.bolsadeideas.springboot.di.app.service;

import org.springframework.stereotype.Component;

//@Component("MiServicioCompleto")
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "Proceso import complicado";
    }
}
