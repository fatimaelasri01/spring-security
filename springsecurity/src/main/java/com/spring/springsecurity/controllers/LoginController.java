package com.spring.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("/student")
    public String studentPage() {
        return "student";
    }

    @GetMapping("/professor")
    public String professorPage() {
        return "professor";
    }
}