package com.journal.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class health {

    @GetMapping("/health")
    public String healthcheck()
    {
        return "ok";
    }
    
}
