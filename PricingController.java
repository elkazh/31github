package com.example.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pricing")
public class PricingController {
    @GetMapping
    public String getTrainers(){
        return "pricing";
    }
}
