package com.visium.democommit.controllers;

import com.visium.democommit.model.personne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class controleur {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

@GetMapping("/personnes")
    public personne personne() {
        return new personne(UUID.randomUUID().toString(),"Ali","ali@gmail.com");



    }
}
