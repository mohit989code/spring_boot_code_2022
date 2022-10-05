package com.example.spring_boot_code_2022.controller;


import com.example.spring_boot_code_2022.model.Lawyer;
import com.example.spring_boot_code_2022.service.OwnMethodLawyerDataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnMethodLawyerDataBaseController {

    @Autowired
    OwnMethodLawyerDataBaseService service;


    @GetMapping("/Check_Name")
    public Lawyer lawyer (@RequestParam String Name){

        return service.findByName(Name);
    }

    @GetMapping("/Check_Speciality")
    public Lawyer law (@RequestParam String Speciality){

        return service.findBySpeciality(Speciality);
    }


//Complex Query OwnMethod

    @GetMapping("/FindBy_Name_Speciality")
    public Lawyer check (@RequestParam String Name,@RequestParam String Speciality){
        return service.findByNameAndSpeciality(Name, Speciality);
    }

}
