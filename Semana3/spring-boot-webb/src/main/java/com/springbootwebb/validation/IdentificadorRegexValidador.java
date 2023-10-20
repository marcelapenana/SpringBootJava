package com.springbootwebb.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class IdentificadorRegexValidador implements ConstraintValidator<IdentificadorRegex, String>{

    @Override     //este metodo recibe el valor del campo valida si sera verdadero o falso
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value.matches("[0-9]{3}[.][\\d]{3}[.][\\d]{3}[-][A-Z]{1}")) {
            return true;
        }
        return false;
    }

}

