package com.example.spring_boot_code_2022.service;

import com.example.spring_boot_code_2022.model.Lawyer;
import com.example.spring_boot_code_2022.repository.LawyerDataBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawyerDataBaseService {

    @Autowired
    LawyerDataBaseRepository repository;

//Create Method
    public String add(Lawyer lawyer){

        repository.save(lawyer);    //it will insert data in DATABASE

        return "Student added successfully in DataBase";
    }

//Read Method
    public List<Lawyer> getAllLawyer(){

        return repository.findAll();     //get all the data from table
    }

//Update Method
    public String update (long Id , String Name){

        // Step 1: find out record
         Lawyer lawyer=repository.getById(Id);   //fetch lawyer data from database

        // Step 2: update the value and save to database
        lawyer.setName(Name);

        repository.save(lawyer);

        return "Successfully Updated Name" +Name;
    }

//Delete Method
     public String delete(long Id){

        repository.deleteById(Id);  //it will delete record
         return "Successfully Deleted Data From DataBase";
     }
}
