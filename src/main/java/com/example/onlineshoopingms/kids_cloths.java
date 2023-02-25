package com.example.onlineshoopingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class kids_cloths {
    @GetMapping("/kids_cloths")
    public String getData() {
        return "Please purchase cloths online helo";
    }
}
