//TODO: Make a ModelClass in Reference to Student Print Browser

package com.example.spring_boot_code_2022.model;

public class Student {

    String Name;
    int Age;
    double Percentage;

//Parameterize Constructor

    public Student(String name, int age, double percentage) {
        Name = name;
        Age = age;
        Percentage = percentage;
    }

//Getter and Setter


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }
}
