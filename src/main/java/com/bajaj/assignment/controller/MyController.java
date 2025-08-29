package com.bajaj.assignment.controller;

import com.bajaj.assignment.dto.InputData;
import com.bajaj.assignment.dto.OutputData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @PostMapping("/bfhl")
    public OutputData bfhl(InputData data){
        String[] arr = data.getArr();

    }
}
