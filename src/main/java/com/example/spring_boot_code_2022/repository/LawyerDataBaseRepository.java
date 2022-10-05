//TODO:This is Interface and it is Extends a JpaRepository Class

package com.example.spring_boot_code_2022.repository;

import com.example.spring_boot_code_2022.model.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;

//Syntax: < ModelClass_name  ID_Datatype >
public interface LawyerDataBaseRepository extends JpaRepository<Lawyer,Long> {

}
