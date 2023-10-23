package com.springbootwebb.controllers;

import com.springbootwebb.editors.NombreMayusculaEditor;
import com.springbootwebb.editors.PaisPropertyEditor;
import com.springbootwebb.editors.RolesEditor;
import com.springbootwebb.models.domain.Pais;
import com.springbootwebb.models.domain.Role;
import com.springbootwebb.models.domain.Usuario;
import com.springbootwebb.services.PaisService;
import com.springbootwebb.services.RoleService;
import com.springbootwebb.validation.UsuarioValidador;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.*;

/* MVC, debe saber que el controlador se utiliza para procesar la solicitud web y representar la respuesta a la Vista.
*  Initbinder entra en escena si desea personalizar la solicitud que se envía al controlador. Se define en el controlador y ayuda a controlar y formatear todas y cada una de las solicitudes que le llegan. Esta anotación se utiliza con los métodos que inicializan WebDataBinder y funciona como preprocesador para cada solicitud que llega al controlador.*/
@Controller
@SessionAttributes("usuario")//Se usa apartir de prueba 2--almacenar atributos del modelo en la sesión del servlet HTTP entre solicitudes
public class FormController {//declara los atributos de sesión utilizados por un controlador específico.
    //paso 3 propiedades
    @Autowired
    private UsuarioValidador validador;

    @Autowired
    private PaisService paisService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PaisPropertyEditor paisEditor;//estos vienen de paquete editors

    @Autowired
    private RolesEditor roleEditor;

    //paso 4 validaciones de errores
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validador);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, "fechaNacimiento", new CustomDateEditor(dateFormat, true));

        binder.registerCustomEditor(String.class, "nombre", new NombreMayusculaEditor());
        binder.registerCustomEditor(String.class, "apellido", new NombreMayusculaEditor());

        binder.registerCustomEditor(Pais.class, "pais", paisEditor);
        binder.registerCustomEditor(Role.class, "roles", roleEditor);
    }
    //paso 5 metodos de listar
    @ModelAttribute("genero")
    public List<String> genero(){
        return Arrays.asList("Hombre", "Mujer");
    }

    @ModelAttribute("listaRoles")
    public List<Role> listaRoles(){
        return this.roleService.listar();
    }

    @ModelAttribute("listaPaises")
    public List<Pais> listaPaises() {
        return paisService.listar();
    }

    @ModelAttribute("listaRolesString")
    public List<String> listaRolesString(){
        List<String> roles = new ArrayList<>();
        roles.add("ROLE_ADMIN");
        roles.add("ROLE_USER");
        roles.add("ROLE_MODERATOR");
        return roles;
    }

    @ModelAttribute("listaRolesMap")
    public Map<String, String> listaRolesMap() {
        Map<String, String> roles = new HashMap<String, String>();
        roles.put("ROLE_ADMIN", "Administrador");
        roles.put("ROLE_USER", "Usuario");
        roles.put("ROLE_MODERATOR", "Moderador");

        return roles;
    }

    //creo la lista primero al iniciar parte 4
    @ModelAttribute("paises")//define que paises sera un atributo
    public List<String> paises() {
        return Arrays.asList("España", "México", "Chile", "Argentina", "Perú", "Colombia", "Venezuela");
    }

    @ModelAttribute("paisesMap")//nombre que usamos para pasar los datos el atribute
    public Map<String, String> paisesMap() {
        Map<String, String> paises = new HashMap<String, String>();
        paises.put("ES", "España");
        paises.put("MX", "México");
        paises.put("CL", "Chile");
        paises.put("AR", "Argentina");
        paises.put("PE", "Perú");
        paises.put("CO", "Colombia");
        paises.put("VE", "Venezuela");
        return paises;
    }
    //paso 5
    @GetMapping("/form")
    public String form(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("John");
        usuario.setApellido("Doe");
        usuario.setIdentificador("123.456.789-K");
        usuario.setHabilitar(true);
        usuario.setValorSecreto("Algún valor secreto ****");
        usuario.setPais(new Pais(3, "CL", "Chile"));
        usuario.setRoles(Arrays.asList(new Role(2, "Usuario", "ROLE_USER")));

        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("usuario", usuario);
        return "form";
    }


    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model) {

        // validador.validate(usuario, result);

        if (result.hasErrors()) {
            model.addAttribute("titulo", "Resultado form");
            return "form";
        }

        return "redirect:/ver";
    }

    @GetMapping("/ver")
    public String ver(@SessionAttribute(name="usuario", required = false) Usuario usuario, Model model, SessionStatus status) {

        if(usuario == null) {
            return "redirect:/form";
        }

        model.addAttribute("titulo", "Resultado form");

        status.setComplete();
        return "resultado";
    }


}

    //uso para prueba 2

    /*
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
    */

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

//prueba 3

/*
    @Autowired
    private UsuarioValidador validador;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validador);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, "fechaNacimiento", new CustomDateEditor(dateFormat, true));

        binder.registerCustomEditor(String.class, "nombre", new NombreMayusculaEditor());
        binder.registerCustomEditor(String.class, "apellido", new NombreMayusculaEditor());
    }

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

    @PostMapping("/form")//binding result representa el resultado de la validación
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
*/

