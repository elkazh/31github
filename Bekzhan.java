package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component
public class Bekzhan {
    private final Rahim rahim;
    public Bekzhan (Rahim rahim){
        System.out.println("I am object B");
        this.rahim = rahim;
        }
}
