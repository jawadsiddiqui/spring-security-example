package com.dtors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class Home {

    @GetMapping(value = "all")
    public String getProduct(){
        return "getProduct";
    }
}
