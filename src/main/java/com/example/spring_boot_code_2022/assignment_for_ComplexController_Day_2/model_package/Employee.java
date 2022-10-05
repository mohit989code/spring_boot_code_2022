//TODO: Make a ModelClass in Reference to Employee Print Browser

package com.example.spring_boot_code_2022.assignment_for_ComplexController_Day_2.model_package;

public class Employee {

    String Emp_Name;
    int Emp_Age;
    double Emp_Salary;

    //Parameterize Constructor

    public Employee(String emp_Name, int emp_Age, double emp_Salary) {
        Emp_Name = emp_Name;
        Emp_Age = emp_Age;
        Emp_Salary = emp_Salary;
    }

//Getter and Setter

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public int getEmp_Age() {
        return Emp_Age;
    }

    public void setEmp_Age(int emp_Age) {
        Emp_Age = emp_Age;
    }

    public double getEmp_Salary() {
        return Emp_Salary;
    }

    public void setEmp_Salary(double emp_Salary) {
        Emp_Salary = emp_Salary;
    }
}
