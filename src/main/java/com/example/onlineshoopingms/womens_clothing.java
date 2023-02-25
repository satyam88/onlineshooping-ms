package com.example.onlineshoopingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class womens_clothing {
    @GetMapping("/womens_clothing")
    public String getData(){
        return  "Please purchase cloths online";
    }
}