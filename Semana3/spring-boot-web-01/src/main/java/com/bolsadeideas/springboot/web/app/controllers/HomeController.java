package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //el metodo redirige a indexcontroller
	@GetMapping("/")
	public String home(){
		return "forward:/app/index";//ruta para redirecionar al metodo index que esta en
		//indexconreoller con ruta app
	}
}
