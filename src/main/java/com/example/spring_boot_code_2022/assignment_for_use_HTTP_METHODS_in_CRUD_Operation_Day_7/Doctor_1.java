//TODO: Program for How to perform CRUD Operation in DOCTOR Model Class Use RequestBody Annotation in SPRING FRAMEWORK

package com.example.spring_boot_code_2022.assignment_for_use_HTTP_METHODS_in_CRUD_Operation_Day_7;

import com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Doctor_1 {

    ArrayList<Doctor> doctorArrayList=new ArrayList<>();

                                                                                                                                                                 //Print Object Name in Use of RequestBody Annotation

    @RequestMapping(value ="/Object_Doctor",method = RequestMethod.POST)                                                                                                  //Add HTTP METHOD in SPRING FRAMEWORK Annotation
    public String Object(@RequestBody Doctor doctor){

        doctorArrayList.add(doctor);

        return "Successfully Added JSON Operation Using RequestBody.....";
    }

// C- Create or Add end point

    @RequestMapping( "/Doctor_Create/{Name}/{Speciality}/{Experience}/{Salary}")
    public String Create(@PathVariable String Name, @PathVariable String Speciality, @PathVariable int Experience, @PathVariable double Salary){

        Doctor doctor=new Doctor(Name,Speciality,Experience,Salary);
        doctorArrayList.add(doctor);

        return "Successfully Create Doctor Data.....";
    }

// R- Read or Get end point

    @RequestMapping(value = "/Doctor_Read",method = RequestMethod.GET)                                                                                                                                   //Add HTTP METHOD in SPRING FRAMEWORK Annotation
    public ArrayList<Doctor>getDoctorArrayList(){

        return doctorArrayList;
    }

// U- Update end point

    @RequestMapping(value = "/Doctor_Update/{Name}/{Speciality}/{Experience}/{Salary}/{Index}", method = RequestMethod.PUT)                                                                                                                                 //Add HTTP METHOD in SPRING FRAMEWORK Annotation
    public String Update(@PathVariable String Name,@PathVariable String Speciality,@PathVariable int Experience,@PathVariable double Salary, @PathVariable int Index){

        Doctor doctor=doctorArrayList.get(Index);
        doctor.setName(Name);
        doctor.setSpeciality(Speciality);
        doctor.setExperience(Experience);
        doctor.setSalary(Salary);

        return "Successfully Update Doctor Data.....";
    }

// D- Delete end point

    @RequestMapping(value = "/Doctor_Delete/{Index}",method = RequestMethod.DELETE)                                                                                                               //Add HTTP METHOD in SPRING FRAMEWORK Annotation
    public String Delete(@PathVariable int Index){

        doctorArrayList.remove(Index);

        return "Successfully Delete Doctor Data.....";
    }


}


