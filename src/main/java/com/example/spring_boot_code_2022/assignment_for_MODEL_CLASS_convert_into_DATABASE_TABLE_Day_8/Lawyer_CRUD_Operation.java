//TODO: Program for How to perform CRUD Operation in DOCTOR Model Class Use RequestBody Annotation in SPRING BOOT

package com.example.spring_boot_code_2022.assignment_for_MODEL_CLASS_convert_into_DATABASE_TABLE_Day_8;
import com.example.spring_boot_code_2022.model.Lawyer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Lawyer_CRUD_Operation {

    ArrayList<Lawyer> lawyerArrayList=new ArrayList<>();

//Print Object Name in Use of RequestBody Annotation

    @PostMapping("/NEWObject_Lawyer")  //Add HTTP METHOD in SPRING BOOT Annotation
    public String Object(@RequestBody Lawyer lawyer){

        lawyerArrayList.add(lawyer);

        return "Successfully Added JSON Operation Using RequestBody.....";
    }

// C- Create or Add end point

    @RequestMapping("/NEWLawyer_Create/{Name}/{Speciality}/{Designation}/{Experience}/{Salary}")
    public String Create(@PathVariable String Name, @PathVariable String Speciality, @PathVariable String Designation, @PathVariable int Experience, @PathVariable double Salary){

        Lawyer lawyer=new Lawyer(Name,Speciality,Designation,Experience,Salary);
        lawyerArrayList.add(lawyer);

        return "Successfully Create Doctor Data.....";
    }

// R- Read or Get end point

    @GetMapping("/NEWLawyer_Read")   //Add HTTP METHOD in SPRING BOOT Annotation
    public ArrayList<Lawyer>getLawyerArrayList(){

        return lawyerArrayList;
    }

// U- Update end point

    @PutMapping("/NEWLawyer_Update")   //Add HTTP METHOD in SPRING BOOT Annotation
    public String Update(@PathVariable String Name,@PathVariable String Speciality,@PathVariable String Designation,@PathVariable int Experience ,@PathVariable double Salary,@PathVariable int Index){

        Lawyer lawyer=lawyerArrayList.get(Index);
        lawyer.setName(Name);
        lawyer.setSpeciality(Speciality);
        lawyer.getDesignation(Designation);
        lawyer.setExperience(Experience);
        lawyer.setSalary(Salary);

        return "Successfully Update Doctor Data.....";
    }

// D- Delete end point

    @DeleteMapping("/NEWLawyer_Delete")     //Add HTTP METHOD in  SPRING BOOT Annotation
    public String Delete(@PathVariable int Index){

        lawyerArrayList.remove(Index);

        return "Successfully Delete Doctor Data.....";
    }
}



