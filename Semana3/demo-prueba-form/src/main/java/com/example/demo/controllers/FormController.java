package com.example.demo.controllers;

import com.example.demo.models.domain.Cliente;
import com.example.demo.validation.UsuarioValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;


@Controller
@SessionAttributes("cliente")
public class FormController {
//mostrar los datos
@Autowired//habilitar la inyección automática de dependencias
private UsuarioValidador validador;//Permite que el contenedor Spring proporcione una instancia de una dependencia requerida cuando se crea un bean
    @InitBinder//sirve para datos de formulario
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validador);
        //como argumento la propiedad validador y
    }//recortará los valores a Nulos si solo hay espacios en blanco, considerando la bd

    //Mostrar los datos
    @GetMapping("/form")
    public String form(Model model) {
        Cliente cliente = new Cliente();
        cliente.setNombre("John");
        cliente.setApellido("Doe");
        cliente.setIdentificador("123.456.789-K");
        model.addAttribute("titulo", "Formulario cliente");
        model.addAttribute("cliente", cliente);
        return "form";
    }
    @PostMapping("/form")
    public String procesar(@Valid Cliente cliente, BindingResult result, Model model, SessionStatus status) {
        // validador.validate(usuario, result);
        model.addAttribute("titulo", "Resultado form");
        if(result.hasErrors()) {

            return "form";
        }
        model.addAttribute("usuario", cliente);
        status.setComplete();
        return "resultado";
    }

    }
