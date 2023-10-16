package com.bolsadeideas.springboot.di.app.service;

import org.springframework.stereotype.Component;

//@Component("MiServicioSimple")
public class MiServicio implements IServicio {

    @Override
    public String operacion() {
        return "Ejecutando un problema simple";
    }
}
