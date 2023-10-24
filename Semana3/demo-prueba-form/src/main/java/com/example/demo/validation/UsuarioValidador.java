package com.example.demo.validation;

import com.example.demo.models.domain.Cliente;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class UsuarioValidador implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Cliente.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Cliente cliente = (Cliente) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "requerido.cliente.nombre");

        if(!cliente.getIdentificador().matches("[0-9]{3}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")) {
            errors.rejectValue("identificador", "pattern.cliente.identificador");
        }//definimos el patron

    }
}
