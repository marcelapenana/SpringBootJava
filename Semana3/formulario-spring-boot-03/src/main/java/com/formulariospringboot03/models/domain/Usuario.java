package com.formulariospringboot03.models.domain;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

public class Usuario {//luego de crear form controller y los html
    @IdentificadorRegex
    private String identificador;
    private String nombre;
    @Requerido
    private String apellido;
    @NotBlank
    @Size(min = 3, max = 8)
    private String username;
    @NotEmpty
    private String password;
    @Requerido
    @Email
    private String email;

    @NotNull
    @Min(5)
    @Max(5000)
    private Integer cuenta;
    @NotNull
    @Past
    private Date fechaNacimiento;
    private Pais pais;
    private List<Role> roles;

    private Boolean habilitar;

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
}
