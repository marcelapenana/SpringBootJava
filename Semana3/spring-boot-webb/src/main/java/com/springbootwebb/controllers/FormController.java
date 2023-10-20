package com.springbootwebb.controllers;

import com.springbootwebb.models.domain.Usuario;
import com.springbootwebb.validation.UsuarioValidador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.HashMap;
import java.util.Map;
/* MVC, debe saber que el controlador se utiliza para procesar la solicitud web y representar la respuesta a la Vista.
*  Initbinder entra en escena si desea personalizar la solicitud que se envía al controlador. Se define en el controlador y ayuda a controlar y formatear todas y cada una de las solicitudes que le llegan. Esta anotación se utiliza con los métodos que inicializan WebDataBinder y funciona como preprocesador para cada solicitud que llega al controlador.*/
@Controller
@SessionAttributes("usuario")//Se usa apartir de prueba 2--almacenar atributos del modelo en la sesión del servlet HTTP entre solicitudes
public class FormController {//declara los atributos de sesión utilizados por un controlador específico.
    @Autowired//habilitar la inyección automática de dependencias
    private UsuarioValidador validador;//Permite que el contenedor Spring proporcione una instancia de una dependencia requerida cuando se crea un bean
    @InitBinder//recortará los valores a Nulos si solo hay espacios en blanco, considerando la bd
    public void initBinder(WebDataBinder binder){
        binder.addValidators(validador);
    }
    @GetMapping("/form")//Mostrar los datos
    public String form(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("John");
        usuario.setApellido("Doe");
        usuario.setIdentificador("123.456.789-k");//Como no puede estar vacio enviamos propiedades
        model.addAttribute("titulo", "Formulario Usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }
    @PostMapping("/form")//pasar datos
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status){
        model.addAttribute("titulo", " Resultado form");
        if(result.hasErrors()){
            return "form";
        }
        model.addAttribute("usuario", usuario);
        status.setComplete();
        return "resultado";
    }


    //Uso para prueba 1
    /* @GetMapping("/form")
    public String form(Model model){
        Usuario usuario=new Usuario();
        model.addAttribute("titulo", "Formulario Usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }*/
    //Uso para prueba 1
       /* @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model){
        model.addAttribute("titulo", "Resultado form");

        if (result.hasErrors()){
            Map<String, String> errores=new HashMap<>();//condicion por id y objeto
            result.getFieldErrors().forEach(err ->{ {//foreach que ejecuta una funcion por cada uno de los campos
                errores.put(err.getField(), "El campo".concat(err.getField()).concat("").concat(err.getDefaultMessage()));
            });//si hay error lo alamacena y lo muestra
            model.addAttribute("error", errores);//trasladamos como una lista de errores
        }
        model.addAttribute("usuario", usuario);
        return "resultado";
    }*/
}
