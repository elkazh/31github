package com.example.mvc.mvc;

import org.springframework.stereotype.Component;

@Component
public class Controller {
    private final Model model;
    public Controller(Model model){
        System.out.println("I am Controller object" + this);
        this.model = model;
    }
}
