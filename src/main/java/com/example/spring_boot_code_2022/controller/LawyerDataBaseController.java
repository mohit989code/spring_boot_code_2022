package com.example.spring_boot_code_2022.controller;

import com.example.spring_boot_code_2022.model.Lawyer;
import com.example.spring_boot_code_2022.service.LawyerDataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LawyerDataBaseController {

    @Autowired
    LawyerDataBaseService service;

//Print Object Name in Use of RequestBody Annotation

    // C- Create or Add end point

    @PostMapping("/New_Lawyer")  //Add HTTP METHOD in SPRING BOOT Annotation
    public String Controller(@RequestBody Lawyer lawyer) {

        return service.add(lawyer);
    }

    // R- Read or Get end point

    @GetMapping("/Lawyer_Read")   //Add HTTP METHOD in SPRING BOOT Annotation
    public List<Lawyer> getLawyerArrayList(){

        return service.getAllLawyer();
    }

    // U- Update end point

    @PutMapping("/Lawyer_Update")   //Add HTTP METHOD in SPRING BOOT Annotation
    public String update(@PathVariable long Id,@PathVariable String Name){

        return service.update(Id,Name);
    }

    // D- Delete end point

    @DeleteMapping("/Lawyer_Delete")
    public String delete(@PathVariable long Id){

        return service.delete(Id);
    }
}


