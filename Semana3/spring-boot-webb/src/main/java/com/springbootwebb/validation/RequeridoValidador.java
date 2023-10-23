package com.springbootwebb.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;
//se usa desde prueba 3
public class RequeridoValidador implements ConstraintValidator<Requerido, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || !StringUtils.hasText(value)) {
            return false;
        }
        return true;
    }

}

//prueba 3

  /*  @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value == null || !StringUtils.hasText(value)) {
            return false;
        }
        return true;
    }*/
