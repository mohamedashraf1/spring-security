package com.example.ss_2022_c2_e1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hi")
    public String demo(){
        return "demo";
    }
}
