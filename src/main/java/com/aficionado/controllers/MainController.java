package com.aficionado.controllers;


import com.aficionado.models.User;
import com.aficionado.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping(value="/")
    public String index() {
        return "index";
    }

    @GetMapping(value="/about")
    public String about() { return "about"; }

    @GetMapping(value="/contact")
    public String contact() { return "contact"; }

    @GetMapping(value="/poduct")
    public String product() { return "product"; }

    @GetMapping(value="/confirm")
    public String confirm() { return "confirm"; }

    @GetMapping(value="/cart")
    public String cart() { return "cart"; }

    @GetMapping(value="/collection")
    public String collection() { return "collection"; }

    @Autowired
    private UserRepository userRepository;

    //get routes
    @GetMapping(value="/signup")
    public String signUp() {
        return "signup";
    }

    @GetMapping(value="/login")
    public String login() {
        return "login";
    }

    @GetMapping(value="/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping(value="/test")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "test";
    }

    @PostMapping("/newuser")
    public String submitForm(User user, Model model) {
        userRepository.save(user);
        System.out.println(user);
        return "profile";
    }


}
