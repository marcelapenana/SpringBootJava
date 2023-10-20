package com.springbootwebb.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
//notacion es propiedad  va estar relacionada con la clase identificador regex validador (enlazandola)
@Constraint(validatedBy = IdentificadorRegexValidador.class)
@Retention(RUNTIME)//como se va ejecutar
@Target({ FIELD, METHOD })//ruta donde se implementara
public @interface IdentificadorRegex {
    String message() default "Identificador inválido";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
