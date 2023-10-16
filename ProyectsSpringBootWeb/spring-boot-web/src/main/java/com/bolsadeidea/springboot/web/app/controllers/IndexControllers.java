package com.bolsadeidea.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/app")
public class IndexControllers {
     //metodos de accion y manejaa una peticion http
     //Controlador encaragado manejar peticiones del usuario
	 //Muestra la pagina con los datos que el usuario a solicitado ejm.
	//metodo publico retorna string y tendra el nombre de la vista que va retornar o cargar 
	//SE puede indicar el tipo de metodo de peticion como post, put, get , delete...
	//@PostMapping
	//value=parametro por defecto
	//podemos omitir el value (value="/index")

	//pasar datos del controlador a la vista usando model, por el metodo del controlador
	//mediante llave y valor 
	
	/*@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
	model.addAttribute("titulo", "Hola spring usando model!");	
		//Nombre de la vista 
		return "index";
	}*/
	//modelMap no es diferente de model =ModelMap
	
	@GetMapping({"/index", "/", "/home"})
	public String index(ModelMap model) {
	model.addAttribute("titulo", "Hola spring usando model!");	
		
	//Nombre de la vista 
		return "index";
	}
	
	//Model es una interfaz que contiene met abstractos y se pasa por agrgumento para pasar datos a la vista
	
}
