//TODO: This is a Controller Class and it is part of Architecture of Any Application

package com.example.spring_boot_code_2022.controller;

import com.example.spring_boot_code_2022.service.AppFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppFlowController {

    @Autowired   //This Annotation is used for Call the Method from Another Class
    AppFlowService service;    //Syntax: Class_name  Variable_name

    @GetMapping("/Flow")
    public String Controller_Class(){

        return service.Services_Class();
    }
}
