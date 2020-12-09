package com.aficionado.controllers;


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


}
