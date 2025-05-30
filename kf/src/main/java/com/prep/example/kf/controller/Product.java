package com.prep.example.kf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class Product {

    @GetMapping("/hello")
    public Map<String, String> helloWorld() {
        return Map.of("message", "Hello, World!");
    }

}
