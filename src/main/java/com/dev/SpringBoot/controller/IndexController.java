package com.dev.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class IndexController {
    @GetMapping("")
    public Map<String, Integer> rootGET() {
        Map<String, Integer> result = new HashMap<>();
        result.put("a", 1);
        result.put("b", 2);
        result.put("c", 3);
        result.put("d", 4);
        result.put("e", 5);
        result.put("f", 6);
        result.put("g", 7);
        return result;
    }
}
