package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {
    @GetMapping
    public @ResponseBody String GetDogs() {
        return "Hello, World";
    }
}
