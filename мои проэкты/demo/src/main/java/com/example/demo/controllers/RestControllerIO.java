package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerIO {

    @GetMapping("/add")
    public String tr() {
        return "{\n" +
                "\"query\": \"Виктор Иван\",\n" +
                "\"count\": 7,\n" +
                "\"parts\": [\"NAME\", \"SURNAME\"]\n" +
                "}";
    }


    @PostMapping("/post")
    public String trasd(@RequestBody String name) {
        return "{\n" +
                "\"query\": \""+name+"\",\n" +
                "}";
    }

}
