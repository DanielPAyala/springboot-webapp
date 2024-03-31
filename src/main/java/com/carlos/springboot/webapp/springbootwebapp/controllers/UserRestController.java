package com.carlos.springboot.webapp.springbootwebapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.springboot.webapp.springbootwebapp.models.User;
import com.carlos.springboot.webapp.springbootwebapp.models.DTOS.UserDTO;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public UserDTO details() {
        UserDTO userDto = new UserDTO();
        userDto.setUser(new User("Andres", "Guzman"));
        userDto.setTitle("Hola Mundo desde Spring Boot");
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Carlos", "Porras");

        Map<String, Object> body = new HashMap<>();
        body.put("user", user);
        return body;
    }
}
