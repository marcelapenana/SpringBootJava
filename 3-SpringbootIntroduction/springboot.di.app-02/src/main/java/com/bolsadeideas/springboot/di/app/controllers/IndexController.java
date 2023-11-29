package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    //con qualifaer llamo mi servicio complejo
    //se utiliza para evitar anbiguedad de nombre de metodo
    //Qualifier para diferenciar cada una de las implementaciones


    //inyeccion de dependencias, no instanciamos al objeto si noque
    //el contenedor de spring a trvez de los beans, nos llama al controlador y nos inyecta la instancia
    //pasamos el dato que buscamos mediante servis a la vista para imprimir

    @Autowired//para inyectar un objeto registrado en el contenedor de spring  de tipo mi servicio
    @Qualifier("miServicioComplejo")
    private IServicio servicio;
    //usamos interfaz en lugar de clase concreta
    //podriamos crear otra clase para implementar la inerfaz y asi inyectar  si quisieramos

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {

        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
}
