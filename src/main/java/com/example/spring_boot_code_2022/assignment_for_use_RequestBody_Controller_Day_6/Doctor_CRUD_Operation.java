//TODO: Program for How to perform CRUD Operation in DOCTOR Model Class Use RequestBody Annotation

package com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6;

import com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1.Doctor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Doctor_CRUD_Operation {

ArrayList<Doctor> doctorArrayList=new ArrayList<>();

//Print Object Name in Use of RequestBody Annotation

   @RequestMapping("/Doctor_Object")
   public String Object(@RequestBody Doctor doctor){

       doctorArrayList.add(doctor);

       return "Successfully Added JSON Operation Using RequestBody.....";
   }

// C- Create or Add end point

@RequestMapping("/Create_Doctor/{Name}/{Speciality}/{Experience}/{Salary}")
public String Create(@PathVariable String Name,@PathVariable String Speciality,@PathVariable int Experience,@PathVariable double Salary){

    Doctor doctor=new Doctor(Name,Speciality,Experience,Salary);
    doctorArrayList.add(doctor);

    return "Successfully Create Doctor Data.....";
}

// R- Read or Get end point

    @RequestMapping("/Read_Doctor")
    public ArrayList<Doctor>getDoctorArrayList(){

        return doctorArrayList;
    }

// U- Update end point

@RequestMapping("/Update_Doctor/{Name}/{Speciality}/{Experience}/{Salary}/{Index}")
public String Update(@PathVariable String Name,@PathVariable String Speciality,@PathVariable int Experience,@PathVariable double Salary,@PathVariable int Index){

    Doctor doctor=doctorArrayList.get(Index);
    doctor.setName(Name);
    doctor.setSpeciality(Speciality);
    doctor.setExperience(Experience);
    doctor.setSalary(Salary);

    return "Successfully Update Doctor Data.....";
}

// D- Delete end point

@RequestMapping("/Delete_Doctor/{Index}")
 public String Delete(@PathVariable int Index){

    doctorArrayList.remove(Index);

    return "Successfully Delete Doctor Data.....";
}


}
