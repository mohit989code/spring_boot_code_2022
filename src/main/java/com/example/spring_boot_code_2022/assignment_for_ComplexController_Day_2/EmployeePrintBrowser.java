//TODO:Program for print Data in a Browser

package com.example.spring_boot_code_2022.assignment_for_ComplexController_Day_2;

import com.example.spring_boot_code_2022.assignment_for_ComplexController_Day_2.model_package.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeePrintBrowser {

    //Return Employee

    @RequestMapping("/Employee")
    public Employee getEmployee(){

        Employee obj=new Employee("Rohan",22,3222455.4);
        return obj;
    }

//Return List Of

    @RequestMapping("/ListEmp")

    public ArrayList<String> getListEmp(){

        ArrayList<String> List=new ArrayList<>();

        List.add("Employee-1 is a DATA SCIENTIST in our Company... ");
        System.out.println( "\n");

        List.add("Employee-2 is a DATA ENGINEER in our Company... " );
        System.out.println( "\n");

        List.add("Employee-3 is a DATA ANALYST in our Company... " );
        System.out.println( "\n");

        List.add("Employee-4 is a  PROJECT MANAGER in our Company... ");
        System.out.println( "\n");

        List.add("Employee-5 is a PROJECT LEAD in our Company... " );
        System.out.println( "\n");


        return List;

    }
//USE MODEL CLASS:(Return First Employee Of The List)

    @RequestMapping("/EMP")
    public Employee EmployeeData(){

        ArrayList<Employee> employees=new ArrayList<>();

        Employee Emp1=new Employee("ROHAN",32,965773.3);
        Employee Emp2=new Employee("SOHAN",35,865573.3);
        Employee Emp3=new Employee("MOHAN",33,655773.3);
        Employee Emp4=new Employee("RAVI",34,245773.3);
        Employee Emp5=new Employee("RAKESH",56,822773.3);

        employees.add(Emp1);
        employees.add(Emp2);
        employees.add(Emp3);
        employees.add(Emp4);
        employees.add(Emp5);

        return employees.get(0);
    }

}
