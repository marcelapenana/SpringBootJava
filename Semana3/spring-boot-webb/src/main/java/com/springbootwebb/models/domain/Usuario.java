package com.springbootwebb.models.domain;

import com.springbootwebb.validation.IdentificadorRegex;
import com.springbootwebb.validation.Requerido;
import jakarta.validation.constraints.*;

import java.util.Date;

//en la prueba 1 y 2 sin notaciones en este espacio
public class Usuario {
    //@Pattern(regexp = "[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")
    @IdentificadorRegex
    private String identificador;

    //@NotEmpty(message = "el nombre no puede ser vacio")
    private String nombre;

    //@NotEmpty
    @Requerido
    private String apellido;

    @NotBlank
    @Size(min = 3, max=8)
    private String username;

    @NotEmpty
    private String password;

    @Requerido
    @Email(message = "correo con formato incorrecto")
    private String email;

    @NotNull
    @Min(5)
    @Max(5000)
    private Integer cuenta;

    @NotNull
    @Past
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


}


    //Prueba 2
   /*
   //@Pattern(regexp = "[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")
    private String identificador;

    //@NotEmpty(message = "el nombre no puede ser vacio")
    private String nombre;

    @NotEmpty
    private String apellido;

    @NotBlank
    @Size(min = 3, max=8)
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    @Email(message = "correo con formato incorrecto")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
   */

    //En la prueba 1 solo propiedades sin notacion con su set and get

    /*private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/

