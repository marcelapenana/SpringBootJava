package com.formulariospringboot03.controller;

import com.formulariospringboot03.models.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControllers {
    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo", "Formulario usuario");
        return "form";
    }
    //obtiene datos del frm
    //usamos el model para mostrar la plantilla de resultado
    @PostMapping("/form")
    public String procesar(Model model ,
                           @RequestParam(name="username") String username,
                           @RequestParam String password,
                           @RequestParam String email
                           ){

        //instancia obj
        Usuario usuario=new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEmail(email);
        //pasamos estos datos a la vista resultado
        //${usuario.nombre}
        model.addAttribute("titulo", "Resultado form");
        model.addAttribute("usuario", usuario);
        //valores por medio del metodo set
        //a vista pasamos el objeto usuario
        return "resultado";
    }
}
