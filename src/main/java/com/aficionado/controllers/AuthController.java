 package com.aficionado.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.aficionado.models.User;

import com.aficionado.sevice.UserService;


 @Controller
 public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String login() {
        System.out.print("User logged in.");
        return "login";
    }

    @GetMapping(value = "/signup")
    public String registration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }

    @PostMapping(value = "/signup")
    public String createNewUser(@Valid User user, BindingResult bindingResult, Model model) {
        User userExists = userService.findByUsername(user.getUsername());
        if (userExists != null) {
            System.out.print("errors");
            bindingResult.rejectValue("username", "error.user", "Username is already taken");
        }

        if (!bindingResult.hasErrors()) {
            userService.saveNewUser(user);
            System.out.print(user);
            model.addAttribute("success", "Sign up successful");
            model.addAttribute("user", new User());
        }

        return "profile";
    }

}
