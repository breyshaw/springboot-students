package com.breyshaw.demo.student;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;
import org.springframework.stereotype.Service;

//Adding the "service layer" here. The service layer is mainly responsible for business logic. 
@Service //This allows the studentservice to be instantiated on the StudentController. It shows the controller where to find the bean. Can also use @component here but @Service makes more sense. 
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
