package com.example.webbutveckling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebbutvecklingApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebbutvecklingApplication.class, args);
    }

}

@RestController
@RequestMapping("/")
class HelloController {

    @GetMapping("/hello")
    public String name(@PathVariable("/{hello") String name){
        return "hello" + name;
    }

}
