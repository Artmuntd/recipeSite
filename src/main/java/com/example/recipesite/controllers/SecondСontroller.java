package com.example.recipesite.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondСontroller {
    @GetMapping("/info")
    public String info(){
        return  "Имя ученика: Артем." + " " +
                "Название проекта : Сайт рецептов." + " " +
                "Дата: 05.03.2023. " + " " +
                "Описание проекта: Сайт для рецептов.";



    }
}
