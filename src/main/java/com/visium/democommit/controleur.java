package com.visium.democommit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controleur {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
