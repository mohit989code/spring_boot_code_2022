package com.example.spring_boot_code_2022.repository;

import com.example.spring_boot_code_2022.model.Lawyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//Syntax: < ModelClass_name  ID_Datatype >
@Repository
public interface OwnMethodLawyerDataBaseRepository extends JpaRepository<Lawyer,Long> {
    @Query(value = "SELECT * FROM Lawyer  WHERE Name = :Name ", nativeQuery = true)
     Lawyer findByName (@Param("Name") String Name);

    @Query(value = "SELECT * FROM Lawyer  WHERE   Speciality= :Speciality", nativeQuery = true)
     Lawyer findBySpeciality (@Param("Speciality") String Speciality);

//Complex Query

    @Query(value = "SELECT * FROM Lawyer  WHERE Name = :Name and Speciality= :Speciality", nativeQuery = true)
    public Lawyer findByNameAndSpeciality(@Param("Name") String Name, @Param("Speciality") String Speciality);
}
