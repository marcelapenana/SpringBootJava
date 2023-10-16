package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    @Qualifier("miServicioCompleto")//se utiliza para evitar anbiguedad de nombre de metodo
    //Qualifier para diferenciar cada una de las implementaciones
    private IServicio servicio;

    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("objeto",servicio.operacion() );
                return "index";
    }
}
