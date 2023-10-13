package com.springbootweb.springbootweb.controllers;

import com.springbootweb.springbootweb.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexControllers {
    @GetMapping({"/index", "/","/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring framework");
        return "index";
    }
   //busqueda a traves de  @RequestMapping("/app") = http://localhost:8080/app/index
   //El getMapping busqueda para el index.
    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario=new Usuario();
        usuario.setNombre("Carlos");
        usuario.setApellido("Gonzales");

        model.addAttribute("usuario", usuario);
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model){
        //instanciación de  una vez
        //List<Usuario> usuarios=new ArrayList<>();
        //instanciación de  una vez para agregar usuarios
        //usuarios.add(new Usuario("Marcela", "Peña","marcela@gmail.com"));
        model.addAttribute("titulo", "Listado de usuarios");
        //model.addAttribute("usuarios", usuarios);
        return "listar";
    }
    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios(){
        List<Usuario> usuarios=new ArrayList<>();
        usuarios.add(new Usuario("Nombre1", "Apellido1", "correo1"));
        usuarios.add(new Usuario("Nombre2", "Apellido2", "correo2"));
        usuarios.add(new Usuario("Nombre3", "Apellido3", "correo3"));
        usuarios.add(new Usuario("Nombre4", "Apellido4", "correo4"));
        return  usuarios;
    }

}
