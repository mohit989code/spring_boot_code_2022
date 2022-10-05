//TODO: Program for How to Make a SQUARE in any NUMBER

package com.example.spring_boot_code_2022.assignment_for_use_PathVariable_Day_3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeSquare {

    @RequestMapping("/CheckIn/{n}")
    public String SquareOfNumber(@PathVariable int n){

        int number=n*n;
        return "Square of " +n +"=" +number;
    }
}
