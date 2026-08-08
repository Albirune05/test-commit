package com.visium.democommit.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autre")
public class autreMessage {
    @RequestMapping("/message")
    public String message() {
        return "Bonjour tout le monde !";
    }
}
