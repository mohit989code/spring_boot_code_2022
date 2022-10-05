//TODO: This is a Services Class and it is part of Architecture of Any Application

package com.example.spring_boot_code_2022.service;

import com.example.spring_boot_code_2022.repository.AppFlowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //This Annotation show it is a SERVICE class and it Include Only for (Business Logic)
public class AppFlowService {

    @Autowired
    AppFlowRepository repository;
    public String Services_Class(){

        return repository.Repository_Class();
    }
}
