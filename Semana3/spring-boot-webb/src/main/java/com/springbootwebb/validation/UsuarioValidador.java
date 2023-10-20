package com.springbootwebb.validation;

import com.springbootwebb.models.domain.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//esta clase se usa a partir de la prueba 3
@Component
public class UsuarioValidador implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
       Usuario usuario= (Usuario) target;
       ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Nombre", "Requerido usuario nombre");

        if (!usuario.getIdentificador().matches("[0-9]{2}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")){
              errors.rejectValue("identificador", "pattern.usuario.identificador");
        }
    }
}
