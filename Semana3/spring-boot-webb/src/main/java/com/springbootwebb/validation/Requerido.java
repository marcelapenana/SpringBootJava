package com.springbootwebb.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy =  RequeridoValidador.class)//vinculacion con la clase
@Retention(RUNTIME)
@Target({FIELD, METHOD})
public @interface Requerido {
    String messaje() default "el campo es requerido usando anotaciones";

    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default { };

}
