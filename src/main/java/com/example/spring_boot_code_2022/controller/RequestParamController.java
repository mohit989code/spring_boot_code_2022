//TODO: Program for How to use RequestParam Annotation

package com.example.spring_boot_code_2022.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/Info")
    public String information(@RequestParam String name){

        return "This is a Spring Boot Application with Request Param:" +name;
    }

    @RequestMapping("/checkStatus")
    public String Update(@RequestParam String name,@RequestParam String hobbies){

        return " This is " +name  +"and Its Hobby is :" +hobbies;
    }
    @RequestMapping("/CheckStatus")
    public String Updates(@RequestParam String name,@RequestParam String hobbies){

        return " This is and Its Hobby is :" +name  +"\t"  +hobbies;
    }

}
