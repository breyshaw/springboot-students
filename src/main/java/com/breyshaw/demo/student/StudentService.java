package com.breyshaw.demo.student;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;

//Adding the "service layer" here. The service layer is mainly responsible for business logic. 
public class StudentService {

  public List<Student> getStudents() {
    
		return List.of(
				new Student(
						1L,
						"Mariam",
						"mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21));
	}
}
