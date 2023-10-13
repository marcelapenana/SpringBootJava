package com.springbootweb.springbootweb.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EjemploParams {
    @GetMapping("/")
    public String index(){
        return "params/index";
    }
    @GetMapping
    public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model){
        model.addAttribute("resultado", "EL saludo enviado es:");
        return "params/ver";
    }
}
