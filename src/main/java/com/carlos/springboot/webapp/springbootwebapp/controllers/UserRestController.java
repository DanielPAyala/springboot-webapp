package com.carlos.springboot.webapp.springbootwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsRest")
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("name", "Carlos");
        body.put("lastName", "Ayala");
        return body;
    }
}
