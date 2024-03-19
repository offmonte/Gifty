package br.com.fiap.giffty.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class TipoListaValidator implements ConstraintValidator<TipoLista, String> {

    @Override

    public boolean isValid (String value, ConstraintValidatorContext context){
        return value.equals("ENTRADA") || value.equals("SAIDA");
    }
    
}
