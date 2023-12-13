package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component
public class Elvira {
    private final Rahim rahim;
    public Elvira (Rahim rahim){
        System.out.println("I am object E");
        this.rahim = rahim;
    }
}
