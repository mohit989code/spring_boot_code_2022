//TODO: Program for How to Input a Data in a PathVariable

package com.example.spring_boot_code_2022.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    // SYNTAX :   "/endpointName/{varName}"

    @RequestMapping("/msg/{name}")

    public String message(@PathVariable String name){

        return "Welcome to Coding World:" +name;
    }

    // SYNTAX :   "/endpointName/{varName-1}/{varName-2}.............../{varName-N}"

    @RequestMapping("/vote/{name}/{age}")
    public String Eligibility(@PathVariable String name,@PathVariable int age){

        if (age>18){
            return name+ " Is Eligible For Voting...."  ;
        }
        else {
            return name+ " Is Not Eligible For Voting....";

        }

    }


}
