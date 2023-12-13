package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component
public class Diana {
    private final Elvira elvira;

    public Diana (Elvira elvira){
        System.out.println("I am object D");
        this.elvira = elvira;
    }
}
