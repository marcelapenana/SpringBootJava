package com.example.demo.validation;

import com.example.demo.models.domain.Cliente;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class ClienteValidador implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Cliente.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Usuario usuario = (Usuario)target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "requerido.usuario.nombre");

		/* if(!usuario.getIdentificador().matches("[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")) {
			errors.rejectValue("identificador", "pattern.usuario.identificador");*/
    }
}