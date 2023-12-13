package com.example.task1.task1;

import org.springframework.stereotype.Component;

@Component

public class Nurzhamal {
    private final Bekzhan bekzhan;
    public Nurzhamal (Bekzhan bekzhan){
        System.out.println("I am object N");
        this.bekzhan = bekzhan;
    }
}