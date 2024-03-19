package br.com.fiap.giffty.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = TipoListaValidator.class)
public @interface TipoLista {
    String message() default "Tipo inválido. Tipo deve ser ENTRADA ou SAIDA.";
    
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
