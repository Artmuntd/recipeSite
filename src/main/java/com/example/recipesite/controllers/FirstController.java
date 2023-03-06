package com.example.recipesite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    public  String start() {
        return "Приложение запущено";
    }
}
