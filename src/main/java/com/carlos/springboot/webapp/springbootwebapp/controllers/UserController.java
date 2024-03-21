package com.carlos.springboot.webapp.springbootwebapp.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model, Map<String, Object> model1) {
        model.addAttribute("title", "Hola desde Spring Boot");
        model.addAttribute("name", "Carlos");
        model1.put("lastname", "Ayala");
        return "details";
    }
}
