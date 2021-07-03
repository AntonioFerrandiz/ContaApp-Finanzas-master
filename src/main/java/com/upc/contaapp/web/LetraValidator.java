package com.upc.contaapp.web;

import com.upc.contaapp.model.Letra;
import com.upc.contaapp.service.LetraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class LetraValidator implements Validator{

    @Autowired
    private LetraService letraService;
    @Override
    public boolean supports(Class<?> aClass){ return Letra.class.equals(aClass);}

    @Override
    public void validate(Object o, Errors errors) {
       Letra letra = (Letra) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "valorN", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tea", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "retencion", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cgi", "NotEmpty");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cff", "NotEmpty");


    }

}
