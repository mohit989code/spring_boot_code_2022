//TODO: Program for CALCULATOR  in Complex Controller

package com.example.spring_boot_code_2022.assignment_for_ComplexController_Day_2;

import com.example.spring_boot_code_2022.assignment_for_ComplexController_Day_2.model_package.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CalculatorComplexController {

    @RequestMapping ("/sum")
public String addition(){

    int a=23;
    int b=34;

    return "Addition of two number is:" +(a+b);
    }
    @RequestMapping("/sub")
    public String subtraction(){

        int a=23;
        int b=34;

        return "Subtraction of two number is:" +(a-b);
    }
    @RequestMapping("/mul")
    public String multiplication(){

        int a=23;
        int b=34;

        return "Multiplication of two number is:" +(a*b);
    }
    @RequestMapping("/div")
    public String division(){

        double a=23;
        double b=34;

        return "Division of two number is:" +(double)(a/b);

    }
    @RequestMapping("/mod")
    public String modulus(){

        int a=23;
        int b=34;

        return "Modulus of two number is:" +((double)a%b);

    }


}
