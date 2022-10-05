//TODO: Program for How to use REST_CONTROLLER and REQUEST_MAPPING  NOTATION

package com.example.spring_boot_code_2022.assignment_for_use_RestController_AND_RequestMapping_Notation_Day_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPoint_Initialize {

//That Data Print in Console
    @RequestMapping("/M1")
    public void M1(){
        System.out.println("My Name is RAKESH......");
    }

    @RequestMapping("/M2")
    public void M2(){
        System.out.println("My Fathers name is Mr.ROHAN......");
    }

    @RequestMapping("/M3")
    public void M3(){
        System.out.println("My Mothers name is Mrs.Sonali......");
    }

    @RequestMapping("/M4")
    public void M4(){
        System.out.println("My Brothers name is MOHAN......");
    }

    @RequestMapping("/M5")
    public void M5(){
        System.out.println("My Sister name is Priya......");
    }


//That Data Print in Browser
    @RequestMapping("/M6")
    public String M6(){

        String M6="Welcome to Python Project....";
        return M6;
    }
    @RequestMapping("/M7")
    public String M(){

        String M7="Welcome to Java Project....";
        return M7;

    }@RequestMapping("/M8")
    public String M8(){

        String M8="Welcome to C Project....";
        return M8;

    }@RequestMapping("/M9")
    public String M9(){

        String M9="Welcome to C++ Project....";
        return M9;

    }@RequestMapping("/M10")
    public String M10(){

        String M10="Welcome to Html Project....";
        return M10;
    }

}
