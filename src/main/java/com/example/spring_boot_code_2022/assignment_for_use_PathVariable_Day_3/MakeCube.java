//TODO: Program for How to  Make a CUBE in any NUMBER

package com.example.spring_boot_code_2022.assignment_for_use_PathVariable_Day_3;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeCube {

    @RequestMapping("/check/{a}")
    public String CubeOfNumber(@PathVariable int a){

       int SOL=a*a*a;
       return "Cube Of " +a +"=" +SOL;
    }
}
