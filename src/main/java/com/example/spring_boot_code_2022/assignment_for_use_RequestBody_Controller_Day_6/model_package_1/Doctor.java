//TODO: Make a ModelClass in Reference to Doctor Print in POSTMAN

package com.example.spring_boot_code_2022.assignment_for_use_RequestBody_Controller_Day_6.model_package_1;

public class Doctor {

    String Name;
    String Speciality;
    int Experience;
    double Salary;

// Parameterize Constructor


    public Doctor(String name, String speciality, int experience, double salary) {
        Name = name;
        Speciality = speciality;
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

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
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
