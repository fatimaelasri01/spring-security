package com.spring.springsecurity.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

import com.spring.springsecurity.models.User;
import com.spring.springsecurity.services.CustomUserDetailsService;

@Controller
public class RegistrationController {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        user.setRoles(Set.of("STUDENT"));
        userDetailsService.saveUser(user);
        return "redirect:/login";
    }
}
