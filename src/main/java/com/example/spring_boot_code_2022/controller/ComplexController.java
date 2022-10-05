//TODO: Program for How to use REST_CONTROLLER and REQUEST_MAPPING  NOTATION in Complex Controller

package com.example.spring_boot_code_2022.controller;

import com.example.spring_boot_code_2022.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ComplexController {

     @RequestMapping("/CourseList")
    public ArrayList<String> getCoursePackage(){

         //Collection <DATATYPE> objName= new Collection();

      ArrayList<String> CourseList=new ArrayList<>();

        CourseList.add("PYTHON");
        CourseList.add("JAVA");
        CourseList.add("C");
        CourseList.add("C++");
        CourseList.add("RUBY");

        return CourseList;

    }

    @RequestMapping("/StudentsData")
    public Student studentsData(){

         Student Data=new Student("Rohan" , 22,99.7);

        return Data;


    }
}
