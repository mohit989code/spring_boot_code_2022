//TODO: Program for How to Check Number is Even And Odd in any NUMBER Series

package com.example.spring_boot_code_2022.assignment_for_use_PathVariable_Day_3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckEvenAndOddNumber {

    @RequestMapping("/Digit/{n}")
    public String CheckNumber(@PathVariable int n){

        if (n%2==0){
            return " Enter number in your address bar is EVEN : " +n ;
        }
        else {
            return " Enter number in your address bar is ODD : " +n ;

        }
    }

}
