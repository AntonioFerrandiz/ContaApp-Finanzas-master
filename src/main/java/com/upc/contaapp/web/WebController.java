package com.upc.contaapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
    @RequestMapping(value = "/nosotros", method = RequestMethod.GET) public String nosotros(){
        return "nosotros";
    }

    @RequestMapping(value = "/preguntas", method = RequestMethod.GET) public String preguntas(){
        return "preguntas";
    }

    @RequestMapping(value = "/reportes", method = RequestMethod.GET) public String reportes() {return "reportes";}
}
