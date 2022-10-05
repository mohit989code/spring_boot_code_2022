//TODO: Program for perform all Mathematical Operation in use for RequestParam Annotation

package com.example.spring_boot_code_2022.assignment_for_use_RequestParam_Controller_Day_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeCalculatorWithRequestParam {

    @RequestMapping("/Plus")
    public String Addition(@RequestParam int a,@RequestParam int b){

        return " ADDITION Of Value a AND b= "  +a+"+"+b+"="+(a+b);
    }

    @RequestMapping("/Minus")
    public String Subtraction(@RequestParam int a,@RequestParam int b){

        return " SUBTRACTION Of Value a AND b= "  +a+"-"+b+"="+(a-b);
    }

    @RequestMapping("/Into")
    public String Multiplication(@RequestParam int a,@RequestParam int b){

        return " MULTIPLICATION Of Value a AND b= "  +a+"*"+b+"="+(a*b);
    }

    @RequestMapping("/Divide")
    public String Division(@RequestParam double a,@RequestParam double b){

        return " DIVISION Of Value a AND b= "  +a+"/"+b+"="+(double)(a/b);
    }

    @RequestMapping("/Remainder")
    public String Modulus(@RequestParam double a,@RequestParam double b){

        return " MODULUS Of Value a AND b= "  +a+"%"+b+"="+(double)(a%b);
    }
}
