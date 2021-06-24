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
        /*
        Letra letra = (Letra) o;
        //Valor Nominal
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "valorN", "NotEmpty");
        if(letra.getValorN() <= 0){
            errors.rejectValue("valorN", "value.letraForm.valorN");
        }
        //Tasa Efectiva
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tasaefectiva", "NotEmpty");
        if(letra.getValorN() <= 0){
            errors.rejectValue("tasaefectiva", "value.letraForm.tasaefectiva");
        }
        //Retención
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "retencion", "NotEmpty");
        if(letra.getValorN() <= 0){
            errors.rejectValue("retencion", "value.letraForm.retencion");
        }
        //Gastos Costos Iniciales
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gastoscostosi", "NotEmpty");
        if(letra.getValorN() <= 0){
            errors.rejectValue("gastoscostosi", "value.letraForm.gastoscostosi");
        }
        //Gastos Costos Finales
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gastoscostosf", "NotEmpty");
        if(letra.getValorN() <= 0){
            errors.rejectValue("gastoscostosf", "value.letraForm.gastoscostosf");
        }*/
    }

}
