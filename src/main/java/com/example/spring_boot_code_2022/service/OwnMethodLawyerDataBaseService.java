package com.example.spring_boot_code_2022.service;


import com.example.spring_boot_code_2022.model.Lawyer;
import com.example.spring_boot_code_2022.repository.OwnMethodLawyerDataBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnMethodLawyerDataBaseService {

    @Autowired
    OwnMethodLawyerDataBaseRepository repository;


    // Create Own Method
    public Lawyer findByName(String Name){

        return repository.findByName(Name);
    }

    public Lawyer findBySpeciality(String Speciality){

        return repository.findBySpeciality(Speciality);
    }

//Complex Query Method

    public Lawyer findByNameAndSpeciality(String Name,String Speciality){
        return repository.findByNameAndSpeciality(Name, Speciality);
    }
}
