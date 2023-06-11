package com.springboot.project.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBoot {

    @GetMapping("/welcome")
    public String hello() {
        return "welcome to your application";
    }
    
    @PostMapping("/access")
    public String access() {
        // Implement your application's access functionality here
        return "Access granted to your application!";
    }
}
