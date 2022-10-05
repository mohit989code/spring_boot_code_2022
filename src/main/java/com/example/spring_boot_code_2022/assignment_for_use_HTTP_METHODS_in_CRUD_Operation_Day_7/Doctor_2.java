//TODO: Program for How to perform CRUD Operation in DOCTOR Model Class Use RequestBody Annotation in SPRING BOOT

package com.example.spring_boot_code_2022.assignment_for_use_HTTP_METHODS_in_CRUD_Operation_Day_7;

import com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Doctor_2 {

    ArrayList<Doctor> doctorArrayList=new ArrayList<>();

//Print Object Name in Use of RequestBody Annotation

    @PostMapping("/NEWObject_Doctor")  //Add HTTP METHOD in SPRING BOOT Annotation
    public String Object(@RequestBody Doctor doctor){

        doctorArrayList.add(doctor);

        return "Successfully Added JSON Operation Using RequestBody.....";
    }

// C- Create or Add end point

    @RequestMapping("/NEWDoctor_Create/{Name}/{Speciality}/{Experience}/{Salary}")
    public String Create(@PathVariable String Name, @PathVariable String Speciality, @PathVariable int Experience, @PathVariable double Salary){

        Doctor doctor=new Doctor(Name,Speciality,Experience,Salary);
        doctorArrayList.add(doctor);

        return "Successfully Create Doctor Data.....";
    }

// R- Read or Get end point

    @GetMapping("/NEWDoctor_Read")   //Add HTTP METHOD in SPRING BOOT Annotation
    public ArrayList<Doctor>getDoctorArrayList(){

        return doctorArrayList;
    }

// U- Update end point

    @PutMapping("/NEWDoctor_Update")   //Add HTTP METHOD in SPRING BOOT Annotation
    public String Update(@PathVariable String Name,@PathVariable String Speciality,@PathVariable int Experience ,@PathVariable double Salary,@PathVariable int Index){

        Doctor doctor=doctorArrayList.get(Index);
        doctor.setName(Name);
        doctor.setSpeciality(Speciality);
        doctor.setExperience(Experience);
        doctor.setSalary(Salary);

        return "Successfully Update Doctor Data.....";
    }

// D- Delete end point

    @DeleteMapping("/NEWDoctor_Delete")     //Add HTTP METHOD in  SPRING BOOT Annotation
    public String Delete(@PathVariable int Index){

        doctorArrayList.remove(Index);

        return "Successfully Delete Doctor Data.....";
    }
}
