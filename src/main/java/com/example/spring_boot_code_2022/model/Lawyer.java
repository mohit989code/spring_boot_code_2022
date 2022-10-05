//TODO: Make a ModelClass and MODEL_CLASS convert into DATABASE_TABLE

package com.example.spring_boot_code_2022.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name ="Lawyer_table")     //this Annotation is used for MODEL_CLASS convert into DATABASE_TABLE and If you Change CLASS name then we add on--> (name="model_class_name")
public class Lawyer {

    @Id //This Annotation Make a Primary Key
    @GeneratedValue  //This Annotation is Create ID Column/Primary key in Database and AUTO Increment
    long Id; //This is primary key of a table(we can create a unique Information Detail) like 1,2,3,............so on

    String Name;
    String Speciality;
    String Designation;
    int Experience;

    @Column(name = "Payment")  //This Annotation is used for (if you want to rename any Column)
    double Salary;

    //Default Constructor

    public Lawyer() {
    }

    //Parameterize Constructor

    public Lawyer( String name, String speciality, String designation, int experience, double salary) {
        Name = name;
        Speciality = speciality;
        Designation=designation;
        Experience = experience;
        Salary = salary;
    }

    //Getter and Setter


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

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

    public String getDesignation(String designation){return Designation;}

    public void setDesignation(String designation){Designation=designation;}

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
