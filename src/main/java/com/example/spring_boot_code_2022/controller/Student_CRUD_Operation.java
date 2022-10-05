//TODO: Program for How to perform CRUD Operation in STUDENT Model Class

package com.example.spring_boot_code_2022.controller;

import com.example.spring_boot_code_2022.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Student_CRUD_Operation {

    //CRUD Operation

    ArrayList<Student> studentArrayList=new ArrayList<>();

// C- CREATE or ADD end point

    @RequestMapping("/Create_Student/{Name}/{Age}/{Percentage}")
    public String add(@PathVariable String Name,@PathVariable int Age, @PathVariable double Percentage){

  // Create Object of Student Class
     Student student=new Student(Name,Age,Percentage);
     studentArrayList.add(student);

     return "Student Added Successfully..........";
    }

// R- READ or GET end point

    @RequestMapping("/Read_Student")
    public ArrayList<Student> getStudentArrayList(){

        return studentArrayList;
    }

// U- UPDATE end point

    @RequestMapping("/Update_Student")
    public String update (@RequestParam String Name,@RequestParam int Age,@RequestParam int Index){
        Student student=studentArrayList.get(Index);
        student.setName(Name);
        student.setAge(Age);

        return "Student Updated Successfully..........";
    }

// D- DELETE end point

    @RequestMapping("/Delete_Student")
    public String delete(@RequestParam int Index){

        studentArrayList.remove(Index);

        return "Student Delete Successfully..........";
    }

}
