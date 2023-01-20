package com.dtors.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class Product {

    @GetMapping(value = "all", produces = "application/json")
    public String getProduct(){
        return  "getProduct";
    }
}
