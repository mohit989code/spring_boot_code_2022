//TODO: Program for How to Make a SQUARE in any NUMBER Use RequestParam Annotation

package com.example.spring_boot_code_2022.assignment_for_use_RequestParam_Controller_Day_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeSquareWithRequestParam {

    @RequestMapping("/Square")
    public String MakeSquare(@RequestParam int sq){

        int square=sq*sq;
        return " Square Of " +sq+"="+square;
    }
}
