//TODO: Program for Perform all Calculation Operation

package com.example.spring_boot_code_2022.assignment_for_use_PathVariable_Day_3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeCalculator {

    @RequestMapping("/sum/{a}/{b}")

    public String ADDITION(@PathVariable int a,@PathVariable int b){

        return "Addition of two number is :" +(a+b);
    }

    @RequestMapping("/sub/{a}/{b}")

    public String SUBTRACTION(@PathVariable int a,@PathVariable int b){

        return "Subtraction of two number is :" +(a-b);
    }

    @RequestMapping("/mul/{a}/{b}")

    public String MULTIPLICATION(@PathVariable int a,@PathVariable int b){

        return "Multiplication of two number is :" +(a*b);
    }

    @RequestMapping("/div/{a}/{b}")

    public String DIVISION(@PathVariable double a,@PathVariable double b){

        return "Division of two number is :" +((double)a/b);
    }

    @RequestMapping("/mod/{a}/{b}")

    public String MODULUS(@PathVariable double a,@PathVariable double b){

        return "Modulus of two number is :" +((double)a%b);
    }


}
