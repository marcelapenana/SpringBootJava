package com.example.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy =IdentificadorRegexValidador.class)
@Retention(RUNTIME)//como se va ejecutar
@Target({ FIELD, METHOD })//ruta donde se implementara
public @interface IdentificadorRegex {
    String message() default "Identificador inválido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}