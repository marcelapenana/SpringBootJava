package com.bolsadeideas.springboot.form.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;

@Controller
public class FormController {
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Formulario usuarios");
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(Usuario usuario, Model model) {
		
		model.addAttribute("titulo", "Resultado form");
		model.addAttribute("usuario", usuario);

		
		return "resultado";
	}

}
