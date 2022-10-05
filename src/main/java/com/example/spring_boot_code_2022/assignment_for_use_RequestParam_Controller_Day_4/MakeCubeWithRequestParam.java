//TODO: Program for How to  Make a CUBE in any NUMBER Use RequestParam Annotation

package com.example.spring_boot_code_2022.assignment_for_use_RequestParam_Controller_Day_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MakeCubeWithRequestParam {

    @RequestMapping("/Cube")
    public String MakeCube(@RequestParam int num){

        int cube=num*num*num;
        return " Cube Of " +num+"="+cube;
    }
}
