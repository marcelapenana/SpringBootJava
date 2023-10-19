package com.bolsadeideas.springboot.form.app.controllers;

import com.bolsadeideas.springboot.form.app.validation.UsuarioValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@SessionAttributes("usuario")
public class FormController {
	
	/*@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Formulario usuarios");
		return "form";
	}*/
	
	/*Forma 1, solo con class usuario
	@PostMapping("/form")
	public String procesar(Model model, //con el name manda a llamar el texto del formulario
			@RequestParam(name="username") String username,
			@RequestParam String password,
			@RequestParam String email) {
		
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setEmail(email);
		usuario.setPassword(password);
		
		model.addAttribute("titulo", "Resultado form");
		model.addAttribute("usuario", usuario);

		
		return "resultado";
	}*/

	@Autowired
	private UsuarioValidador validador;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(validador);
	}
	/*
	form 2
	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Formulario usuarios");
		model.addAttribute("usuario", usuario);
		return "form";
	}

	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {

		model.addAttribute("titulo", "Resultado form");

		if(result.hasErrors()) {
			Map<String, String> errores = new HashMap<>();//condicion por id y objeto
			result.getFieldErrors().forEach(err ->{//foreach que ejecuta una funcion por cada uno de los campos
				errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
			});//si hay error lo alamacena y lo muestra
			model.addAttribute("error", errores);//trasladamos como una lista de errores
			return "form";
		}

		model.addAttribute("usuario", usuario);

		return "resultado";
	}*/

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("John");
		usuario.setApellido("Doe");
		usuario.setIdentificador("123.456.789-K");
		model.addAttribute("titulo", "Formulario usuarios");
		model.addAttribute("usuario", usuario);
		return "form";
	}

	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {

		// validador.validate(usuario, result);

		model.addAttribute("titulo", "Resultado form");

		if(result.hasErrors()) {

			return "form";
		}

		model.addAttribute("usuario", usuario);
		status.setComplete();
		return "resultado";
	}

}
