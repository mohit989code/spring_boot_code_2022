//TODO: Program for How to perform CRUD Operation in ENGINEER Model Class Use RequestBody Annotation

package com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6;

import com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1.Engineer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Engineer_CRUD_Operation {

    ArrayList<Engineer> engineerArrayList=new ArrayList<>();

//Perform JSON Operation

@RequestMapping("/Engineer_Object")
public String Engineer(@RequestBody Engineer engineer){

    engineerArrayList.add(engineer);

    return "Successfully Added JSON Operation Using RequestBody.....";
}

    //Perform CRUD Operation

// C- Create/Add/Post end point

    @RequestMapping("/Create_Engineer")
    public String Create(@RequestParam String Name,@RequestParam String Designation,@RequestParam int Experience,@RequestParam double Salary){

    Engineer engineer=new Engineer(Name,Designation,Experience,Salary);
    engineerArrayList.add(engineer);

    return "Successfully Create Engineer Data";
}
// R- Read/Get end point

    @RequestMapping("/Read_Engineer")
    public ArrayList<Engineer>engineerArrayList(){

   return engineerArrayList;
}
// U- Update/Put end point

    @RequestMapping("/Update_Engineer")
    public String Update(@RequestParam String Name,@RequestParam String Designation,@RequestParam int Experience,@RequestParam double Salary,@RequestParam int Index){

   Engineer engineer= engineerArrayList.get(Index);
   engineer.setName(Name);
   engineer.setDesignation(Designation);
   engineer.setExperience(Experience);
   engineer.setSalary(Salary);

        return "Successfully Update Engineer Data";
}
// D- Delete/Del end point

    @RequestMapping("/Delete_Engineer")
    public String Delete(@RequestParam int Index){

    engineerArrayList.remove(Index);

        return "Successfully Delete Engineer Data";
}


}
