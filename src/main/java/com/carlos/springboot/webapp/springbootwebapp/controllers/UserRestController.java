package com.carlos.springboot.webapp.springbootwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.springboot.webapp.springbootwebapp.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/detailsRest")
    public Map<String, Object> details() {
        User user = new User("Carlos", "Porras");

        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
        return body;
    }
}
