package com.example.spring_boot_code_2022.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //This Annotation is used for Make a Controller Class
public class DemoController {

    // SYNTAX: access_specifier  return_type  method_name() {CODE}

    @RequestMapping("/hello")  //This Annotation is used for Call the END Point
    public void hello(){

        System.out.println("This is a new method...........");
    }

    @RequestMapping("/welcome")
    public String welcome(){

        String welcome="Welcome to Spring Boot......";

        return welcome;
    }
}

