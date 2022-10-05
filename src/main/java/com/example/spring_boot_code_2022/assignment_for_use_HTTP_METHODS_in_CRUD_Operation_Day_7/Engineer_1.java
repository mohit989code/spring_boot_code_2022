//TODO: Program for How to perform CRUD Operation in ENGINEER Model Class Use RequestBody Annotation in SPRING FRAMEWORK

package com.example.spring_boot_code_2022.assignment_for_use_HTTP_METHODS_in_CRUD_Operation_Day_7;

import com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1.Engineer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Engineer_1 {

    ArrayList<Engineer> engineerArrayList=new ArrayList<>();

//Perform JSON Operation

    @RequestMapping(value = "/Object_Engineer",method = RequestMethod.POST)   //Add HTTP METHOD in SPRING BOOT
    public String Engineer(@RequestBody Engineer engineer){

        engineerArrayList.add(engineer);

        return "Successfully Added JSON Operation Using RequestBody.....";
    }

    //Perform CRUD Operation

// C- Create/Add/Post end point

    @RequestMapping("/Engineer_Create")    //Add HTTP METHOD in SPRING BOOT
    public String Create(@RequestParam String Name, @RequestParam String Designation, @RequestParam int Experience, @RequestParam double Salary){

        Engineer engineer=new Engineer(Name,Designation,Experience,Salary);
        engineerArrayList.add(engineer);

        return "Successfully Create Engineer Data";
    }
// R- Read/Get end point

    @RequestMapping(value = "/Engineer_Read",method = RequestMethod.GET)     //Add HTTP METHOD in SPRING BOOT
    public ArrayList<Engineer>engineerArrayList(){

        return engineerArrayList;
    }
// U- Update/Put end point

    @RequestMapping(value = "/Engineer_Update",method = RequestMethod.PUT)     //Add HTTP METHOD in SPRING BOOT
    public String Update(@RequestParam String Name,@RequestParam String Designation,@RequestParam int Experience,@RequestParam double Salary,@RequestParam int Index){

        Engineer engineer= engineerArrayList.get(Index);
        engineer.setName(Name);
        engineer.setDesignation(Designation);
        engineer.setExperience(Experience);
        engineer.setSalary(Salary);

        return "Successfully Update Engineer Data";
    }
// D- Delete/Del end point

    @RequestMapping(value = "/Engineer_Delete",method = RequestMethod.DELETE)      //Add HTTP METHOD in SPRING BOOT
    public String Delete(@RequestParam int Index){

        engineerArrayList.remove(Index);

        return "Successfully Delete Engineer Data";
    }


}


