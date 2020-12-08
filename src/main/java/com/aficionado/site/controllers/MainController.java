package com.aficionado.site.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/")
    public String index() {
        return "index";
    }

    @GetMapping(value="/about")
    public String about() { return "about"; }

    @GetMapping(value="/login")
    public String login() { return "login"; }

    @GetMapping(value="/contact")
    public String contact() { return "contact"; }

    @GetMapping(value="/profile")
    public String profile() { return "profile"; }

    @GetMapping(value="/poduct")
    public String product() { return "product"; }

    @GetMapping(value="/signup")
    public String signup() { return "signup"; }

    @GetMapping(value="/confirm")
    public String confirm() { return "confirm"; }

    @GetMapping(value="/cart")
    public String cart() { return "cart"; }
}
