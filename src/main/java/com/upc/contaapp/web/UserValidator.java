package com.upc.contaapp.web;

import com.upc.contaapp.model.User;
import com.upc.contaapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        //FIRSTNAME
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "NotEmpty");
        //LASTNAME
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "NotEmpty");

        //DNI
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dni", "NotEmpty");
        if (userService.findByDni(user.getDni()) != null) {
            errors.rejectValue("dni", "Duplicate.userForm.dni");
        }

        if (user.getDni().length() != 8) {
            errors.rejectValue("dni", "Size.userForm.dni");
        }
        //EMAIL
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(user.getEmail());
        mather.find();
        if (userService.findByEmail(user.getEmail()) != null) {
            errors.rejectValue("email", "Duplicate.userForm.email");
        }

        //SOCIALREASONNAME
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "socialreasonname", "NotEmpty");


        //COMPANYRUC
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "companyruc", "NotEmpty");
        if (userService.findByCompanyruc(user.getCompanyruc()) != null) {
            errors.rejectValue("companyruc", "Duplicate.userForm.companyruc");
        }
        if (user.getCompanyruc().length() != 11) {
            errors.rejectValue("companyruc", "Size.userForm.companyruc");
        }


        //USERNAME
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (user.getUsername().length() < 6 || user.getUsername().length() > 250) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }
        //PASSWORD
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (user.getPassword().length() < 8 || user.getPassword().length() > 100) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }
}
