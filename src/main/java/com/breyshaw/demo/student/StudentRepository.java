package com.breyshaw.demo.student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
//Repository is the naming convention for anything that accesses the database, specifically when working with JPA

@Repository
public interface StudentRepository 
extends JpaRepository<Student, Long>{
  //custom function that finds user by email
  @Query("SELECT s FROM Student s WHERE s.email = ?1") //s is an alias, this is jpql
  Optional<Student> findStudentByEmail(String email);
}
