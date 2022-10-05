//TODO: Make a ModelClass in Reference to Engineer Print in POSTMAN

package com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1;

public class Engineer {

    String Name;
    String Designation;
    int Experience;
    double Salary;

// Parameterize Constructor

    public Engineer(String name, String designation, int experience, double salary) {
        Name = name;
        Designation = designation;
        Experience = experience;
        Salary = salary;
    }

// Getter and Setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
