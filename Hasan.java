package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component
public class Hasan {
    private final Rahim rahim;
    public Hasan (Rahim rahim){
        System.out.println("I am object H");
        this.rahim = rahim;
    }
}