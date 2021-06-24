package com.upc.contaapp.web;

import com.upc.contaapp.model.Letra;
import com.upc.contaapp.model.User;
import com.upc.contaapp.service.LetraService;
import com.upc.contaapp.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LetraController {
    @Autowired
    private LetraService letraService;
    @Autowired
    private SecurityService securityService;
    @Autowired
    private LetraValidator letraValidator;

    /*@GetMapping("inicio")
    public String letraForm(Model model){
        model.addAttribute("letra", new Letra());
        return "letra";
    }*/

    @PostMapping("/inicio")
    public String letraSubmit(@ModelAttribute("letra") Letra letra, Model model, BindingResult bindingResult){
        letraValidator.validate(letra, bindingResult);
        model.addAttribute("letra", letra);
        letraService.save(letra);
        return "inicio";
    }

}
