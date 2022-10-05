//TODO: Program for How to perform CRUD Operation in EMPLOYEE Model Class

package com.example.spring_boot_code_2022.assignment_for_use_CRUD_Operation_Day_5;

import com.example.spring_boot_code_2022.assignment_for_ComplexController_Day_2.model_package.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employee_CRUD_Operation {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

// C- Create or Add end point
    @RequestMapping("/Create_Employee/{Name}/{Age}/{Salary}")
    public String Create(@PathVariable String Name,@PathVariable int Age,@PathVariable double Salary){

        Employee employee=new Employee(Name,Age,Salary);
        employeeArrayList.add(employee);

        return "Successfully Create Employee Data.....";
    }

// R- Read or Get end point

    @RequestMapping("/Read_Employee")
        public ArrayList<Employee>getEmployeeArrayList(){

        return employeeArrayList;
        }

// U- Update end point

    @RequestMapping("/Update_Employee")
    public String Update(@RequestParam String Name, @RequestParam int Index){

        Employee employee=employeeArrayList.get(Index);
        employee.setEmp_Name(Name);

        return "Successfully Update Employee Data.....";
    }

// D- Delete end point

    @RequestMapping("/Delete_Employee")
    public String Delete(@RequestParam  int Index){

        employeeArrayList.remove(Index);

        return "Successfully Delete Employee Data.....";

    }

    }



