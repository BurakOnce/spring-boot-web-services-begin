package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/Service")
    public String hello(@RequestParam(value = "name", defaultValue = "Service") String name) {
        return String.format("RESTful Web %s", name);
    }
}
