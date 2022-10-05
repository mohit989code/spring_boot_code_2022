//TODO: Program for How to Check Number is Even And Odd in any NUMBER Series Use RequestParam Annotation

package com.example.spring_boot_code_2022.assignment_for_use_RequestParam_Controller_Day_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckEvenAndOddNumberWithRequestParam {

    @RequestMapping("/CheckNumber")
    public String Number (@RequestParam int n){

        if (n%2==0){

            return "Number is EVEN....." +n;
        }
        else {

            return "Number is ODD....." +n;
        }
    }
}
