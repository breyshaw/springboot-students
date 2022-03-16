//Repository is the naming convention for anything that accesses the database, specifically when working with JPA
package com.breyshaw.demo.student;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository 
extends JpaRepository<Student, Long>{
  
  
}
