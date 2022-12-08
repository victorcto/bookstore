package com.bookstore.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StoreController {
    
    @GetMapping
    public String test() {
        return "teste.a";
    }

}
